package erp.gw.projectboard.service;

import java.util.List;

import erp.common.domain.Criteria;
import erp.common.domain.SearchCriteria;
import erp.gw.projectboard.domain.ProjectsVO;

public interface ProjectBoardService {
	   public List<ProjectsVO> listAll()throws Exception;
	   public List<ProjectsVO> listCriteria(Criteria cri)throws Exception;
	   public int listCountCriteria(Criteria cri)throws Exception;
	   public List<ProjectsVO> listSearchCriteria(SearchCriteria cri)throws Exception;
	   public int listSearchCount(SearchCriteria cri) throws Exception;
	   public String enameGet(String emp_id) throws Exception;
	   public ProjectsVO read(int proj_id)throws Exception;
	   public void write(ProjectsVO project)throws Exception;
	   public void updateProj(ProjectsVO project)throws Exception;
	   public void deleteProj(int proj_id)throws Exception;
}