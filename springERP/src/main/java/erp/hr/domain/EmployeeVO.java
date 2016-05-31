package erp.hr.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@ToString
public class EmployeeVO {
	
	@Getter @Setter private String emp_id;
	@Getter @Setter private String e_name;
	@Getter @Setter private int e_age;
	@Getter @Setter private Date e_hiredate;
	@Getter @Setter private String dept_id;
	@Getter @Setter private String e_profile_pic;
	@Getter @Setter private int e_sal;
	@Getter @Setter private String e_address;
	@Getter @Setter private String e_email;
	@Getter @Setter private String phone_number;
	@Getter @Setter private String position_id;
	@Getter @Setter private String job_id;
	@Getter @Setter private String duty_id;
	@Getter @Setter private String e_pwd;
	
	public EmployeeVO(){}
	
	public EmployeeVO(String emp_id, String e_name, int e_age, Date e_hiredate, String dept_id, String e_profile_pic,
			int e_sal, String e_address, String e_email) {
		super();
		this.emp_id = emp_id;
		this.e_name = e_name;
		this.e_age = e_age;
		this.e_hiredate = e_hiredate;
		this.dept_id = dept_id;
		this.e_profile_pic = e_profile_pic;
		this.e_sal = e_sal;
		this.e_address = e_address;
		this.e_email = e_email;
	}	
	
}
