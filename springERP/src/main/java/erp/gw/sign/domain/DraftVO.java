package erp.gw.sign.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DraftVO {
	@Getter @Setter private int draft_id;
	@Getter @Setter private String draft_title;
	@Getter @Setter private String draft_content;
	@Getter @Setter private String draft_type;
	@Getter @Setter private Date draft_dqte;
	@Getter @Setter private String emp_id;
	@Getter @Setter private String draft_state;
	@Getter @Setter private int draft_format_id;
}
