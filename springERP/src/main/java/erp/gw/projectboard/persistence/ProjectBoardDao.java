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
}
