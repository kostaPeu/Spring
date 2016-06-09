package erp.acc.basic.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MoneyManagement implements Serializable {

	@Getter @Setter private String typelist;
	@Getter @Setter private String statement_id;
	@Getter @Setter private String dept_id;
	@Getter @Setter private String deal_name;
	@Getter @Setter private String proj_id;
	@Getter @Setter private String account_number;
	@Getter @Setter private String sums;
	@Getter @Setter private String charge;
	@Getter @Setter private String remarks;
	@Getter @Setter private String customer_id;
	
	
}
