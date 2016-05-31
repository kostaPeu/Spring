package erp.gw.projectboard.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ProjectTeamVO {
	
	@Getter @Setter private int proj_id;
	@Getter @Setter private String emp_id;
	@Getter @Setter private String dept_id;
	@Getter @Setter private int proj_role;
	
	public ProjectTeamVO(){}

	public ProjectTeamVO(int proj_id, String emp_id, String dept_id, int proj_role) {
		super();
		this.proj_id = proj_id;
		this.emp_id = emp_id;
		this.dept_id = dept_id;
		this.proj_role = proj_role;
	}
	
}
