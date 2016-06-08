<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/shopERP/accounting/js/main.js" type="text/javascript"></script>
<link href="/shopERP/accounting/css/card.css" rel="stylesheet">
</head>
<body>
	
	<h2 class="page_title">입출금 보고서</h2>

	<form class="form-horizontal">
		<table class="table table-bordered table-hover new" id="saleList">
			<thead>
				<tr id="abc" align="center" valign="middle">
					<th class="abcd" align="center" valign="middle"><input
						type="checkbox" disabled="disabled"></th>
					<th align="center" valign="middle"><input type="button"
						class="btn btn-default btn-sm saleListAdd" value="▼"></input></th>
					<th align="center" valign="middle" class="col-sm-12">계정코드</th>
					<th align="center" valign="middle">계좌번호</th>
					<th align="center" valign="middle">거래처</th>
					<th align="center" valign="middle">금액</th>
					<th align="center" valign="middle">수수료</th>
					<th align="center" valign="middle">부서</th>
					<th align="center" valign="middle">프로젝트</th>
					<th align="center" valign="middle">비고</th>
				</tr>
			</thead>
			<tbody>
				<tr align="center">
					<td><input type="checkbox"></td>
					<td><input type="button"
						class="btn btn-default btn-sm saleListAdd" value="▼"></input></td>
					<td class="col-sm-8"><input type="text" name="" id=""
						size="10">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search" style="width: 100%"></span>
						</button></td>
					<td><input type="text" name="" id="" size="20">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search"></span>
						</button></td>
					<td><input type="text" name="" id="" size="15">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search"></span>
						</button></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
				</tr>
				<tr align="center">
					<td><input type="checkbox"></td>
					<td><input type="button"
						class="btn btn-default btn-sm saleListAdd" value="▼"></input></td>
					<td><input type="text" name="" id="" class="col-sm-6">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search" style="width: 100%"></span>
						</button></td>
					<td><input type="text" name="" id="" size="20">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search"></span>
						</button></td>
					<td><input type="text" name="" id="" size="15">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search"></span>
						</button></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
				</tr>
				<tr align="center">
					<td><input type="checkbox"></td>
					<td><input type="button"
						class="btn btn-default btn-sm saleListAdd" value="▼"></input></td>
					<td><input type="text" name="" id="" class="col-sm-6">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search" style="width: 100%"></span>
						</button></td>
					<td><input type="text" name="" id="" size="20">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search"></span>
						</button></td>
					<td><input type="text" name="" id="" size="15">
					<button class="btn btn-default btn-sm" type="submit"
							style="margin-left: 10px;">
							<span class="fa fa-search"></span>
						</button></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
					<td><input type="text" name="" id=""></td>
				</tr>



				<tr style="text-align: center; font-size: 14px; font-weight: bold;">
					<td colspan="3">금액합계</td>
					<td colspan="2"><input type="text" name="" id="" width="100%"
						size="65" disabled="disabled"></td>
					<td colspan="2">수수료합계</td>
					<td colspan="3"><input type="text" name="" id=""
						disabled="disabled" size="65" width="20"></td>
				</tr>
			</tbody>
		</table>

		<table class="table table-bordered table-hover new">

		</table>

		<div id="footer-Group" class="footer footer-fixed"
			style="display: block;">
			<div class="wrapper-toolbar">
				<div class="buttongroup" align="right">
					<button id="btn-footer-Save" class="btn btn-xs btn-default"
						type="Submit">저장</button>
					<button id="btn-footer-Reset" class="btn btn-xs btn-default"
						value="reset" type="button">선택삭제</button>
					<button id="btn-footer-Close" class="btn btn-xs btn-default"
						type="button">닫기</button>
				</div>
			</div>
		</div>
	</form>
</body>
</html>