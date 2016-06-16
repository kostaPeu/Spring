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
public class Statement implements Serializable {

	@Getter @Setter private String statement_id;
	@Getter @Setter private int cash_id;
	@Getter @Setter private String note_id;
	@Getter @Setter private int card_id;
	@Getter @Setter private int sums;
	@Getter @Setter private int charge;
	@Getter @Setter private int total;
	@Getter @Setter private String state;
	@Getter @Setter private String typelist;
	@Getter @Setter private String remarks;
	
	
}
