<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
$(function() {
	
})
</script>
</head>
<body>

	<h2 class="page_title">계정등록</h2>
	<div class="mainContents">
		<!-- 카드리스트 -->
		<div class="container-fluid">
			<div class="table-responsive">
				<table class="table table-bordered table-hover table-striped"
					id="Card">
					<thead id="diagnosisHeader">
						<tr class="mainTable">
							<th class="center" style="width: 20px"><input
								type="checkbox"></th>
							<th style="width: 375px;">[계정코드]계정명</th>
							<th style="width: 55px;">계정</th>
							<th style="width: 55px;">대차구분</th>
							<th style="width: 53px;">계정종류</th>
							<th style="width: 53px;">평가구분</th>
							<th style="width: 53px;">사용구분</th>
							<th style="width: 45px;">비고</th>
						</tr>
					</thead>

					<tbody id="diagnosisContents">
						<tr class="mainTable">
							<td class="center" style="width: 20px"></td>
							<td style="padding-left: 0px !important"><span
								style="font-weight: bolder; padding-left: 4px;"> [0000]
									최상위 </span></td>
							<td class="center font12px"><a class="list_link" onclick="fnAdd('0000','');return false;" href="#">추가</a></td>
							<td class="center font12px"></td>
							<td class="center font12px"></td>
							<td class="center font12px"></td>
							<td class="center font12px"></td>
							<td class="center font12px"><input id="remarks1" type="hidden" value="0000" name="remarks"></td>
						</tr>
						
						<tr class="mainTable">
							<td class="center" style="width: 20px"><input type="checkbox"></td>
							<td style="padding-left:15px !important"><a class="list_link" onclick="fnOpenTree('trtree1010',1);return false;" href="#">
								<span id="spntrtree1010" style="font-weight: bolder;">-</span></a>
								<a class="list_link" onclick="ClickGyeJung('1010','N');return false;" href="#">
								<span id="Span2" style="font-weight: bolder;">[1010] 자산</span></a>
							</td>
							<td class="center font12px"><a class="list_link" onclick="fnAdd('1010','N');return false;" href="#">추가</a></td>
							<td class="center font12px">차변</td>
							<td class="center font12px">자산</td>
							<td class="center font12px">해당없음</td>
							<td class="center font12px"></td>
							<td class="center font12px"><input id="remarks2"	type="hidden" value="1010" name="remarks"></td>
						</tr>

					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>