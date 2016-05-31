package erp.hr.domain;

public class hr_basic {
	private String basic_id;
	private String basic_type;
	private String basic_name;
	public hr_basic(String basic_id, String basic_type, String basic_name) {
		super();
		this.basic_id = basic_id;
		this.basic_type = basic_type;
		this.basic_name = basic_name;
	}
	public hr_basic() {
		super();
	}
	public String getBasic_id() {
		return basic_id;
	}
	public void setBasic_id(String basic_id) {
		this.basic_id = basic_id;
	}
	public String getBasic_type() {
		return basic_type;
	}
	public void setBasic_type(String basic_type) {
		this.basic_type = basic_type;
	}
	public String getBasic_name() {
		return basic_name;
	}
	public void setBasic_name(String basic_name) {
		this.basic_name = basic_name;
	}
}
