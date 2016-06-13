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
public class ImageBoardVO {
	@Getter @Setter private int img_board_id;
	@Getter @Setter private String emp_id;
	@Getter @Setter private String imgfile_type;
	@Getter @Setter private String imgfile_name;
	@Getter @Setter private int imgfile_size;
	@Getter @Setter private Date img_board_date;
	@Getter @Setter private int imgfile_downamount;
	@Getter @Setter private String imgfile_upload;
	@Getter @Setter private String imgfile_date;
}
