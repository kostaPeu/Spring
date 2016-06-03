package erp.gw.projectboard.persistence;

import java.util.List;

import erp.common.domain.Criteria;
import erp.common.domain.SearchCriteria;
import erp.gw.projectboard.domain.ProjectsVO;

public interface ProjectBoardDao {
	  public List<ProjectsVO> listAll() throws Exception;
	  public List<ProjectsVO> listCriteria(Criteria cri) throws Exception;
	  public int countPaging(Criteria cri)throws Exception;
	  public int listSearchCount(SearchCriteria cri)throws Exception;
	  public List<ProjectsVO> listSearch(SearchCriteria cri)throws Exception;
	  public String enameGet(String emp_id) throws Exception;
	  public ProjectsVO read(int proj_id) throws Exception;
	  public void write(ProjectsVO project)throws Exception;
	  public void updateProj(ProjectsVO project)throws Exception;
	  public void deleteProj(int proj_id)throws Exception;
}