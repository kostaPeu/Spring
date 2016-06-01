package erp.basic.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ListModelProduct {
	
		@Getter @Setter
	private List<ProductList> list;
	@Getter @Setter
	private int requestPage;
	@Getter @Setter
	private int totalPageCount;
	@Getter @Setter
	private int startPage;
	@Getter @Setter
	private int endPage;
	
	public ListModelProduct(List<ProductList> list, int requestPage, int totalPageCount, int startPage, int endPage) {
		super();
		this.list = list;
		this.requestPage = requestPage;
		this.totalPageCount = totalPageCount;
		this.startPage = startPage;
		this.endPage = endPage;
	}
	
	
}
