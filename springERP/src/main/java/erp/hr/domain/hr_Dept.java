package erp.hr.domain;

public class hr_Dept {
	private String dept_id;
	private String dept_name;
	public hr_Dept(String dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	
	public hr_Dept() {
		super();
	}

	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
}
