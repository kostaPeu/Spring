//현금 & 어음 체크하는 부분
function money() {
	document.moneyplan.action="/accounting/moneyPlan/MoneyPlan_Add";
	document.moneyplan.submit();
}

function promissory() {
	document.moneyplan.action="/accounting/moneyPlan/MoneyPlan_Add_promissory";
	document.moneyplan.submit();
}

//데이트 피커
$(function() {
	$("#datepicker").datepicker({
		 	dateFormat: 'yy-mm-dd',
		    prevText: '이전 달',
		    nextText: '다음 달',
		    monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
		    monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
		    dayNames: ['일','월','화','수','목','금','토'],
		    dayNamesShort: ['일','월','화','수','목','금','토'],
		    dayNamesMin: ['일','월','화','수','목','금','토'],
		    showMonthAfterYear: true,
		    changeMonth: true,
		    changeYear: true,
		    yearSuffix: '년',
		    currentText: '오늘 날짜', 
			closeText: '닫기'
	});
});

$(function() {
	$("#datepicker2").datepicker({
		 	dateFormat: 'yy-mm-dd',
		    prevText: '이전 달',
		    nextText: '다음 달',
		    monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
		    monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
		    dayNames: ['일','월','화','수','목','금','토'],
		    dayNamesShort: ['일','월','화','수','목','금','토'],
		    dayNamesMin: ['일','월','화','수','목','금','토'],
		    showMonthAfterYear: true,
		    changeMonth: true,
		    changeYear: true,
		    yearSuffix: '년',
		    currentText: '오늘 날짜', 
		    closeText: '닫기'
	});
});


//*********모달 검색 기능 ***********
//************부서검색 ************
$(function() {
	$('.dept_id_search').click(function() {
		$('.d_searchTable').empty();
		$('.search_dept_id').val('');
		var url = "/Search/hr/list";
		$.ajax({
			url : url,
			dataType : 'json',
			success : handler
		})
	})

	// 부서번호 사용하기
	$('.useBtn').on('click', function() {
		var deptid = $('.search_dept_id').val();
		var deptname = $('.search_dept_name').val()
		$('.dept_id').val(deptid);
		$('.dept_name').val(deptname);
	})

	// 부서 테이블 내용 클릭시
	$('.d_searchTable').on('click', '.getValue', function() {
		var deptid = $(this).find('.getdeptId').text();
		var deptname = $(this).find('.getdeptName').text();
		$('.search_dept_id').val(deptid);
		$('.search_dept_name').val(deptname);
	})

	// 부서번호 검색하기 - 사용안함 (부서 목록은 개수가 작기 때문에 불필요)
	/*
	 * $('.dept_ids').click(function() { var diagnosis_number =
	 * $('.search_dept_id').val(); var url =
	 * "/accounting/account/account_id_search?account_id="+account_id;
	 * $('.d_searchTable').empty(); $.ajax({ url : url, dateType : 'json',
	 * success: handler }); });
	 */

	// 부서번호 출력 ajax 이벤트 처리
	function handler(data) {
		var html = '<tr><th>부서번호</th><th>부서명</th></tr>';
		$.each(data, function(index, list) {
			html += '<tr class="getValue"><td class = "getdeptId">'
					+ list.dept_id + '</td>';
			html += '<td class="getdeptName">' + list.dept_name + '</td>';
			html += '</tr>';
		});
		$('.d_searchTable').append(html);
	}
})
//************부서 검색 END************

//************프로젝트 검색 Start ************
$(function() {
	$('.proj_id_search').click(function() {
		$('.p_searchTable').empty();
		$('.search_proj_id').val('');
		var url = "/Search/gw/list";
		$.ajax({
			url : url,
			dataType : 'json',
			success : handler
		})
	})

	// 프로젝트번호 사용하기
	$('.useBtn').on('click', function() {
		var projid = $('.search_proj_id').val();
		var projname = $('.search_proj_name').val()
		$('.proj_id').val(projid);
		$('.proj_name').val(projname);
	})

	// 프로젝트 테이블 내용 클릭시
	$('.p_searchTable').on('click', '.getValue', function() {
		var projid = $(this).find('.getproj_id').text();
		var projname = $(this).find('.getproj_name').text();
		$('.search_proj_id').val(projid);
		$('.search_proj_name').val(projname);
	})

	// 프로젝트 번호 검색하기
	$('.projIds').click(function() {
		var projid = $('.search_proj_id').val();
		var url = "/Search/gw/Idlist?proj_id=" + proj_id;
		$('.p_searchTable').empty();
		$.ajax({
			url : url,
			dateType : 'json',
			success : handler
		});
	});

	// 프로젝트 출력 ajax 이벤트 처리
	function handler(data) {
		var html = '<tr><th>프로젝트 번호</th><th>프로젝트 명</th><th>프로젝트 기간</th><th>프로젝트 시작일</th><th>프로젝트 종료일</th><th>직원번호</th></tr>';
		$.each(data, function(index, list) {
			html += '<tr class="getValue"><td class = "getproj_id">'
					+ list.proj_id + '</td>';
			html += '<td class="getproj_name">' + list.proj_name + '</td>';
			html += '<td>' + list.proj_period + '</td>';
			html += '<td>' + list.proj_start_date + '</td>';
			html += '<td>' + list.proj_end_date + '</td>';
			html += '<td>' + list.emp_id + '</td>';
			html += '</tr>';
		});
		$('.p_searchTable').append(html);
	}
})
//************프로젝트 검색 End************

//************거래처 검색 Start ************
$(function() {
	$('.customer_id_search').click(function() {
		$('.e_searchTable').empty();
		$('.search_customer_id').val('');
		var url = "/Search/basic/list";
		$.ajax({
			url : url,
			dataType : 'json',
			success : handler
		})
	})

	// 거래처 사용하기
	$('.useBtn').on('click', function() {
		var customerid = $('.search_customer_id').val();
		var customername = $('.search_customer_name').val()
		$('.customer_id').val(customerid);
		$('.customer_name').val(customername);
	})

	// 거래처 테이블 내용 클릭시
	$('.c_searchTable').on('click', '.getValue', function() {
		var customerid = $(this).find('.getcustomer_id').text();
		var customername = $(this).find('.getcustomer_name').text();
		$('.search_customer_id').val(customerid);
		$('.search_customer_name').val(customername);
	})

	// 거래처 번호 검색하기
	$('.customerIds').click(function() {
		var projid = $('.search_customer_id').val();
		var url = "/Search/basic/Idlist?customer_id=" + customer_id;
		$('.c_searchTable').empty();
		$.ajax({
			url : url,
			dateType : 'json',
			success : handler
		});
	});

	// 거래처 출력 ajax 이벤트 처리
	function handler(data) {
		var html = '<tr><th>거래처 번호</th><th>거래처 명</th><th>대표자 명</th><th>핸드폰 번호</th><th>이메일</th><th>담당자</th></tr>';
		$.each(data, function(index, list) {
			html += '<tr class="getValue"><td class = "getcustomer_id">'
					+ list.customer_id + '</td>';
			html += '<td class="getcustomer_name">' + list.customer_name
					+ '</td>';
			html += '<td>' + list.repre_name + '</td>';
			html += '<td>' + list.phone_number + '</td>';
			html += '<td>' + list.customer_email + '</td>';
			html += '<td>' + list.checkman + '</td>';
			html += '</tr>';
		});
		$('.c_searchTable').append(html);
	}
})
//************거래처 검색 End************

//************어음지급 검색 Start**********
$(function() {
	$('.note_id_search').click(function() {
		$('.n_searchTable').empty();
		$('.search_note_id').val('');
		var url = "/Search/promissory/list";
		$.ajax({
			url : url,
			dataType : 'json',
			success : handler
		})
	})

	// 어음지급 사용하기
	$('.useBtn').on('click', function() {
		var nodeid = $('.search_note_id').val();
		var customername = $('.search_customer_name').val()
		var sums = $('.search_sums').val()
		$('.note_id').val(nodeid);
		$('.customer_name').val(customername);
		$('.sums').val(sums);

	})

	// 어음지급 테이블 내용 클릭시
	$('.n_searchTable').on('click', '.getValue', function() {
		var nodeid = $(this).find('.getnode_id').text();
		var customername = $(this).find('.getcustomer_name').text();
		var sums = $(this).find('.getsums').text();
		$('.search_note_id').val(nodeid);
		$('.search_customer_name').val(customername);
		$('.search_sums').val(sums);
	})

	// 어음지급 번호 검색하기
	$('.noteIds').click(function() {
		var projid = $('.search_note_id').val();
		var url = "/Search/promissory/Idlist?note_id=" + note_id;
		$('.n_searchTable').empty();
		$.ajax({
			url : url,
			dateType : 'json',
			success : handler
		});
	});

	// 어음지급 출력 ajax 이벤트 처리
	function handler(data) {
		var html = '<tr><th>어음 번호</th><th>거래처 아이디</th><th>부서아이디</th><th>프로젝트</th><th>금액</th><th>비고</th></tr>';
		$.each(data, function(index, list) {
			html += '<tr class="getValue"><td class = "getnode_id">'
					+ list.note_id + '</td>';
			html += '<td class="getcustomer_name">' + list.customer_id
					+ '</td>';
			html += '<td>' + list.dept_id + '</td>';
			html += '<td>' + list.proj_id + '</td>';
			html += '<td class="getsums">' + list.sums + '</td>';
			html += '<td>' + list.remarks + '</td>';			
			html += '</tr>';
		});
		$('.n_searchTable').append(html);
	}
})
//************어음지급 검색 End************

//************계좌번호검색 ************
$(
		function() {
			$('.account_numbers_search').click(function() {
				$('.a_searchTable').empty();
				$('.search_account_number').val('');
				var url = "/Search/account/list";
				$.ajax({
					url : url,
					dataType : 'json',
					success : handler
				})
			})

			// 검색된 계좌번호 사용하기
			$('.useBtn').on('click', function() {
				var accountName = $('.search_account_number').val();
				var accountId = $('.accountHiddenid').val()
				$('.account_number').val(accountName);
				$('.accountHiddenids').val(accountId);
			})

			// 계정 테이블 내용 클릭시
			$('.a_searchTable').on('click', '.getValue', function() {
				var accountName = $(this).find('.getaccountName').text();
				var accountId = $(this).find('.getaccountId').text();
				$('.search_account_number').val(accountName);
				$('.accountHiddenid').val(accountId);
			})

			// 계좌번호 검색하기
			$('.account_numbers').click(function() {
				var diagnosis_number = $('#search_account_number').val();
				var url = "/Search/account/Idlist?account_id=" + account_id;
				$('.a_searchTable').empty();
				$.ajax({
					url : url,
					dateType : 'json',
					success : handler
				});
			});

			// 계좌번호 검색 ajax 이벤트 처리
			function handler(data) {
				var html = '<tr><th>계좌번호 아이디</th><th>계좌번호</th><th>계좌이름</th><th>계정번호</th><th>계좌내용</th><th>사용여부</th><th>비고</th></tr>';
				$.each(data, function(index, list) {
					html += '<tr class="getValue"><td class = "getaccountId">'
							+ list.account_id + '</td>';
					html += '<td class="getaccountName">' + list.account_number
							+ '</td>';
					html += '<td>' + list.account_name + '</td>';
					html += '<td>' + list.diagnosis_number + '</td>';
					html += '<td>' + list.account_detail + '</td>';
					html += '<td>' + list.use + '</td>';
					html += '<td>' + list.remarks + '</td>';
					html += '</tr>';
				});
				$('.a_searchTable').append(html);
			}
		})
//************계좌번호 검색 END************
		
		
//계정검색 
$(function() {
$('.diagnosis_number_search').click(function() {
	$('.m_searchTable').empty();
	$('.search_diagnosis_number').val('');
	var url = "/Search/diagnosis/list";
	$.ajax({
		url : url,
		dataType : 'json',
		success: handler
	})
})

//검색된 계정 사용하기
$('.useBtn').on('click', function() {
	var diagnosisName = $('.search_diagnosis_number').val();
	var diagnosisId = $('.diagnosisHiddenid').val()
	$('.diagnosis_number').val(diagnosisName);
	$('.diagnosis_name').val(diagnosisId);
})

//계정 테이블 내용 클릭시 
$('.m_searchTable').on('click', '.getValue', function() {	
	var diagnosisName = $(this).find('.getDiagnosisName').text();
	var diagnosisId = $(this).find('.getdiagnosisId').text();
	$('.search_diagnosis_number').val(diagnosisName);
	$('.diagnosisHiddenid').val(diagnosisId);
})

//계정 검색하기
$('.diagnosis_numbers').click(function() {	
	var diagnosis_number = $('.search_diagnosis_number').val();
	var url = "/Search/diagnosis/Idlist?diagnosis_number="+diagnosis_number;
	$('.m_searchTable').empty();
	$.ajax({
		url : url,
		dateType : 'json',
		success: handler	
	});
});

//계정거래 검색 ajax 이벤트 처리
function handler(data) {
	var html = '<tr><th>계정번호</th><th>계정명</th><th>사용구분</th><th>비고</th></tr>';
	$.each(data, function(index, list) {
		html += '<tr class="getValue"><td class="getDiagnosisName">'+list.diagnosis_number+'</td>';
		html += '<td class="getdiagnosisId">'+"["+list.diagnosis_number+"]"+list.diagnosis_name+'</td>';
		html += '<td>'+list.use+'</td>';
		html += '<td>'+list.remarks+'</td>';
		html += '</tr>'
	});
		$('.m_searchTable').append(html);
	}
})

