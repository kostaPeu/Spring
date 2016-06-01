package erp.hr.domain;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@ToString
public class Positions {
	@Getter @Setter private String position_id;
	@Getter @Setter private String position_name;
	
	public Positions(){}
	
	public Positions(String position_id, String position_name) {
		super();
		this.position_id = position_id;
		this.position_name = position_name;
	}
}
