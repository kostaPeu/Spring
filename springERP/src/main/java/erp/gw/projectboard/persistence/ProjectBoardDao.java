package erp.gw.projectboard.persistence;

import java.util.List;

import erp.gw.projectboard.domain.Criteria;
import erp.gw.projectboard.domain.ProjectsVO;
import erp.gw.projectboard.domain.SearchCriteria;

public interface ProjectBoardDao {
	  public List<ProjectsVO> listAll() throws Exception;
	  public List<ProjectsVO> listCriteria(Criteria cri) throws Exception;
	  public int countPaging(Criteria cri)throws Exception;
	  public int listSearchCount(SearchCriteria cri)throws Exception;
	  public List<ProjectsVO> listSearch(SearchCriteria cri)throws Exception;
}
