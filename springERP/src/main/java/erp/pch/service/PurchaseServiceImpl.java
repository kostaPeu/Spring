package erp.pch.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import erp.basic.domain.Product;
import erp.common.domain.Criteria;
import erp.pch.domain.GetCustomer;
import erp.pch.domain.GetWareHouse;
import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseSearch;
import erp.pch.domain.PurchaseSearchTimeSet;
import erp.pch.domain.PurchaseVO;
import erp.pch.persistence.PurchaseDAO;

@Service
public class PurchaseServiceImpl implements PurchaseService{

	@Inject
	private PurchaseDAO dao;
	
	@Override
	public void insertPch(PurchaseVO vo) throws Exception {
		dao.addPch(vo);
	}

	@Override
	public List<PurchaseListView> detailPch() throws Exception {
		return dao.readPch();
	}

	@Override
	public void delete(String buy_id) throws Exception {
		dao.removePch(buy_id);
	}

	@Override
	public List<GetCustomer> customerList(String customer_id) throws Exception {
		return dao.customerList(customer_id);
	}

	@Override
	public List<PurchaseListView> purchaseSearch(PurchaseSearch ps) throws Exception {
		PurchaseSearchTimeSet pst = new PurchaseSearchTimeSet();
		pst.setCustomer_id(ps.getCustomer_id());
		pst.setProduct_id(ps.getProduct_id());
		pst.setWarehouse_id(ps.getWarehouse_id());
		pst.setStart_date(Timestamp.valueOf(ps.getStart_date()+" 00:00:00"));
		pst.setEnd_date(Timestamp.valueOf(ps.getEnd_date()+" 23:59:59"));
		return dao.purchaseSearch(pst);
	}

	@Override
	public List<Product> productList(String product_id) throws Exception {
		return dao.productList(product_id);
	}

	@Override
	public List<GetWareHouse> warehouseList(String warehouse_id) throws Exception {
		return dao.warehouseList(warehouse_id);
	}

	@Override
	public List<PurchaseListView> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<PurchaseListView> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}

	@Override
	public void updatePurchase(PurchaseVO vo) throws Exception {
		dao.updatePurchase(vo);
	}

	@Override
	public void downloadExcel(OutputStream out,HttpServletResponse res) throws Exception {
		Map<String,Object> map=null;
		int re = 0;
		ArrayList<Map<String,Object>> excelList=new ArrayList<Map<String,Object>>();
		ArrayList<String> columnList=new ArrayList<String>();
		List<PurchaseListView> list = null;
		
		try {
			list = dao.readPch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//구매번호(PK)	거래처번호(FK)	품목번호(FK)	구매일자	창고번호(FK)	
		//지급방법	구매금액	수량	직원번호(fk)
		map = new HashMap<String,Object>();
		
		map.put("구매번호", "구매번호");
		map.put("거래처명", "거래처명");
		map.put("품목명", "품목명");
		map.put("구매일자", "구매일자");
		map.put("창고명", "창고명");
		map.put("지급유형", "지급유형");
		map.put("구매금액", "구매금액");
		map.put("수량", "수량");
		excelList.add(map);
		for(int i=0; i<list.size();i++){
			map = new HashMap<String,Object>();
			
			map.put("구매번호", list.get(i).getBuy_id());
			map.put("거래처명", list.get(i).getCustomer_name());
			map.put("품목명", list.get(i).getProduct_name());
			map.put("구매일자", list.get(i).getBuy_date());
			map.put("창고명", list.get(i).getWarehouse_name());
			map.put("지급유형", list.get(i).getPay_type());
			map.put("구매금액", list.get(i).getBuy_price());
			map.put("수량", list.get(i).getBuy_amount());
			excelList.add(map);
		}
		if(list !=null &&list.size() >0){
		    //LIST의 첫번째 데이터의 KEY값만 알면 되므로 
		    Map<String,Object> m = excelList.get(0);
		    //MAP의 KEY값을 columnList객체에 ADD 
		    for(String k : m.keySet()){
		        columnList.add(k);
		    }
		}
		//1차로 workbook을 생성 
		XSSFWorkbook workbook=new XSSFWorkbook();
		//2차는 sheet생성 
		XSSFSheet sheet=workbook.createSheet("구매 조회");
		//엑셀의 행 
		XSSFRow row = null;
		//엑셀의 셀 
		XSSFCell cell = null;
		//임의의 DB데이터 조회 
		if(list != null &&list.size() >0){
		    int i = 0;
		    for(Map<String,Object>mapobject : excelList){
		        // 시트에 하나의 행을 생성한다(i 값이 0이면 첫번째 줄에 해당) 
		        row = sheet.createRow((short)i);
		        i++;
		        if(columnList !=null &&columnList.size() >0){
		            for(int j=0;j<columnList.size();j++){
		                //생성된 row에 컬럼을 생성한다 
		                cell=row.createCell(j);
		                //map에 담긴 데이터를 가져와 cell에 add한다 
		                cell.setCellValue(String.valueOf(mapobject.get(columnList.get(j))));
		            }
		        }
		    }
		}
		
		//OutputStream fileoutputstream = null;
		String fileName = "구매현황.xlsx";
		fileName = new String ( fileName.getBytes("KSC5601"), "8859_1");
		
		res.setContentType("application/vnd.ms-excel");
		res.setHeader("Content-Disposition", "attachment; filename=" + fileName + ";");
		
		//fileoutputstream = res.getOutputStream();
		//파일을 쓴다
		try {
			workbook.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
			//필수로 닫아주어야함 
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void uploadExcel(InputStream in, HttpServletResponse res) throws Exception {
		Map<String,Object> map=null;
		int re = 0;
		ArrayList<Map<String,Object>> excelList=new ArrayList<Map<String,Object>>();
		ArrayList<String> columnList=new ArrayList<String>();
		List<PurchaseListView> list = null;
		
		try {
			list = dao.readPch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//구매번호(PK)	거래처번호(FK)	품목번호(FK)	구매일자	창고번호(FK)	
		//지급방법	구매금액	수량	직원번호(fk)
		map = new HashMap<String,Object>();
		
		map.put("구매번호", "구매번호");
		map.put("거래처명", "거래처명");
		map.put("품목명", "품목명");
		map.put("구매일자", "구매일자");
		map.put("창고명", "창고명");
		map.put("지급유형", "지급유형");
		map.put("구매금액", "구매금액");
		map.put("수량", "수량");
		excelList.add(map);
		for(int i=0; i<list.size();i++){
			map = new HashMap<String,Object>();
			
			map.put("구매번호", list.get(i).getBuy_id());
			map.put("거래처명", list.get(i).getCustomer_name());
			map.put("품목명", list.get(i).getProduct_name());
			map.put("구매일자", list.get(i).getBuy_date());
			map.put("창고명", list.get(i).getWarehouse_name());
			map.put("지급유형", list.get(i).getPay_type());
			map.put("구매금액", list.get(i).getBuy_price());
			map.put("수량", list.get(i).getBuy_amount());
			excelList.add(map);
		}
		if(list !=null &&list.size() >0){
		    //LIST의 첫번째 데이터의 KEY값만 알면 되므로 
		    Map<String,Object> m = excelList.get(0);
		    //MAP의 KEY값을 columnList객체에 ADD 
		    for(String k : m.keySet()){
		        columnList.add(k);
		    }
		}
		//1차로 workbook을 생성 
		XSSFWorkbook workbook=new XSSFWorkbook();
		//2차는 sheet생성 
		XSSFSheet sheet=workbook.createSheet("구매 조회");
		//엑셀의 행 
		XSSFRow row = null;
		//엑셀의 셀 
		XSSFCell cell = null;
		//임의의 DB데이터 조회 
		if(list != null &&list.size() >0){
		    int i = 0;
		    for(Map<String,Object>mapobject : excelList){
		        // 시트에 하나의 행을 생성한다(i 값이 0이면 첫번째 줄에 해당) 
		        row = sheet.createRow((short)i);
		        i++;
		        if(columnList !=null &&columnList.size() >0){
		            for(int j=0;j<columnList.size();j++){
		                //생성된 row에 컬럼을 생성한다 
		                cell=row.createCell(j);
		                //map에 담긴 데이터를 가져와 cell에 add한다 
		                cell.setCellValue(String.valueOf(mapobject.get(columnList.get(j))));
		            }
		        }
		    }
		}
		
		//OutputStream fileoutputstream = null;
		String fileName = "구매현황.xlsx";
		fileName = new String ( fileName.getBytes("KSC5601"), "8859_1");
		
		res.setContentType("application/vnd.ms-excel");
		res.setHeader("Content-Disposition", "attachment; filename=" + fileName + ";");
		
		//fileoutputstream = res.getOutputStream();
		//파일을 쓴다
		
			//필수로 닫아주어야함 
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
