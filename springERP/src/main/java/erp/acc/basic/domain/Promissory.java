package erp.acc.basic.domain;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Promissory implements Serializable {

	@Getter @Setter private String typelist;
	@Getter @Setter private String dept_id;
	@Getter @Setter private int proj_id;
	@Getter @Setter private String Customer_id;
	@Getter @Setter private String account_number;
	@Getter @Setter private String note_id;
	@Getter @Setter private Date ex_date;
	@Getter @Setter private Date red_date;
	@Getter @Setter private int sums;
	@Getter @Setter private String remarks;
	@Getter @Setter private String state;
}
