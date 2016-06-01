package erp.hr.domain;

public class hr_Position {
	private String position_id;
	private String position_name;
	public hr_Position(String position_id, String position_name) {
		super();
		this.position_id = position_id;
		this.position_name = position_name;
	}
	public hr_Position() {
		super();
	}
	public String getPosition_id() {
		return position_id;
	}
	public void setPosition_id(String position_id) {
		this.position_id = position_id;
	}
	public String getPosition_name() {
		return position_name;
	}
	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}
}
