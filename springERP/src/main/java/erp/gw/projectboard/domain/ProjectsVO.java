package erp.gw.projectboard.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ProjectsVO {
	
	@Getter
	@Setter
	private int proj_id;
	
	@Getter
	@Setter
	private String proj_name;
	
	@Getter
	@Setter
	private String proj_content;
	
	@Getter
	@Setter
	private int proj_period;
	
	@Getter
	@Setter
	private Date proj_start_date;
	
	@Getter
	@Setter
	private Date proj_end_date;
	
	@Getter
	@Setter
	private String emp_id;
	
	public ProjectsVO(){}

	public ProjectsVO(int proj_id, String proj_name, String proj_content, int proj_period, Date proj_start_date,
			Date proj_end_date, String emp_id) {
		super();
		this.proj_id = proj_id;
		this.proj_name = proj_name;
		this.proj_content = proj_content;
		this.proj_period = proj_period;
		this.proj_start_date = proj_start_date;
		this.proj_end_date = proj_end_date;
		this.emp_id = emp_id;
	}
	
}
