<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String text = (String)request.getAttribute("result");
	out.println(text);
%>