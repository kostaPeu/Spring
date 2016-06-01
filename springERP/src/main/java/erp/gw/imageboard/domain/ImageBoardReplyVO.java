package erp.gw.imageboard.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ImageBoardReplyVO {
	@Getter @Setter private int img_reply_id;
	@Getter @Setter private String emp_id;
	@Getter @Setter private String img_reply_content;
	@Getter @Setter private Date img_reply_date;
	@Getter @Setter private int img_reply_ref;
	@Getter @Setter private int img_reply_step;
	@Getter @Setter private int img_reply_level;
	@Getter @Setter private int img_board_id;
}
