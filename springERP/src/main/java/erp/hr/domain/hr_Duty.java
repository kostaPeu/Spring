package erp.hr.domain;

public class hr_Duty {
	private String duty_id;
	private String duty_name;
	public hr_Duty(String duty_id, String duty_name) {
		super();
		this.duty_id = duty_id;
		this.duty_name = duty_name;
	}
	public hr_Duty() {
		super();
	}
	public String getDuty_id() {
		return duty_id;
	}
	public void setDuty_id(String duty_id) {
		this.duty_id = duty_id;
	}
	public String getDuty_name() {
		return duty_name;
	}
	public void setDuty_name(String duty_name) {
		this.duty_name = duty_name;
	}
	
	
}
