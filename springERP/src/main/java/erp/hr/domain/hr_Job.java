package erp.hr.domain;

public class hr_Job {
	private String job_id;
	private String job_name;
	public hr_Job(String job_id, String job_name) {
		super();
		this.job_id = job_id;
		this.job_name = job_name;
	}
	public hr_Job() {
		super();
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
}
