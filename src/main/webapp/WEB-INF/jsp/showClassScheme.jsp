<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<title>策划班级详情</title>
<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>
</head>
<body>
	<h1 align="center">显示当前策划班级</h1>
	<table class="sui-table table-primary">
		<thead>
			<tr>
				<th>班级ID</th>
				<th>策划编号</th>
				<th>班级全称</th>
				<th>课程全称</th>
				<th>教学点</th>
				<th>时间性质</th>
				<th>课程进行方式</th>
				<th>具体上课时间</th>
				<th>开课时间</th>
				<th>结课时间</th>
				<th>备注</th>
				<th>操作人</th>
				<th>选项</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${all}" var="cs">
				<tr>
					<td>${cs.csId }</td>
					<td>${cs.csSchemeno }</td>
					<td>${cs.csName }</td>
					<td>${cs.csCoursename }</td>
					<td>${cs.csLoacname }</td>
					<td>${cs.csTimename }</td>
					<td>${cs.csModebfname }</td>
					<td>${cs.csSchtime }</td>
					<td><fmt:formatDate value='${cs.csStarttime }'
							pattern='yyyy-MM-dd' /></td>
					<td><fmt:formatDate value='${cs.csEndtime }'
							pattern='yyyy-MM-dd' /></td>
					<td>${cs.csComment }</td>
					<td>${cs.csOperator }</td>
					<td class="center">
						<ul class="unstyled">
							<li><a href="/TrainClass/class/cScheme/toAddPlan.do?csId=${cs.csId}">转计划班级</a></li>
						</ul>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>