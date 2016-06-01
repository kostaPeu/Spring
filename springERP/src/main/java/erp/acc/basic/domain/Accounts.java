package erp.acc.basic.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Accounts {
	@Getter @Setter
	private String account_number;
	@Getter @Setter
	private String account_name;
	@Getter @Setter
	private int code;
	@Getter @Setter
	private String account_detail;
	@Getter @Setter
	private String use;
	@Getter @Setter
	private String remarks;

}
