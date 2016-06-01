package erp.gw.projectboard.service;

import java.util.List;

import erp.gw.projectboard.domain.Criteria;
import erp.gw.projectboard.domain.ProjectsVO;
import erp.gw.projectboard.domain.SearchCriteria;

public interface ProjectBoardService {
	   public List<ProjectsVO> listAll()throws Exception;
	   public List<ProjectsVO> listCriteria(Criteria cri)throws Exception;
	   public int listCountCriteria(Criteria cri)throws Exception;
	   public List<ProjectsVO> listSearchCriteria(SearchCriteria cri)throws Exception;
	   public int listSearchCount(SearchCriteria cri) throws Exception;

}
