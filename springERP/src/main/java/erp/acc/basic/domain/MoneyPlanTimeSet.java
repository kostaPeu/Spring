package erp.acc.basic.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MoneyPlanTimeSet implements Serializable {

	@Getter @Setter private String typelist;
	@Getter @Setter private String funds_id;
	@Getter @Setter private String repeat_unit;
	@Getter @Setter private Timestamp start_date;
	@Getter @Setter private Timestamp period;
	@Getter @Setter private String dept_id;
	@Getter @Setter private int proj_id;
	@Getter @Setter private String account_number;
	@Getter @Setter private int diagnosis_number;
	@Getter @Setter private String customer_id;
	@Getter @Setter private int sums;
	@Getter @Setter private String remarks;	
}
