package erp.acc.basic.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Card {
	
	@Getter @Setter private String card_number;
	@Getter @Setter private	String card_name;
	@Getter @Setter private String account_number;
	@Getter @Setter private String type;
	@Getter @Setter private String emp_id;
	@Getter @Setter private String use_detail;
	@Getter @Setter private String use;
	@Getter @Setter private String remarks;

	
}
