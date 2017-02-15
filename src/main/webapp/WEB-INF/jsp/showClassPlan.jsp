<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<title>计划班级详情</title>
<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>
</head>
<body>
	<h1 align="center">显示当前计划班级</h1>
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
				<th>教师ID</th>
				<th>教师名称</th>
				<th>班級人數</th>
				<th>备注</th>
				<th>操作人</th>
				<th>已报名人数</th>
				<th>选项</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${all}" var="cp">
				<tr>
					<td>${cp.cpId }</td>
					<td>${cp.cpSchemeno }</td>
					<td>${cp.cpName }</td>
					<td>${cp.cpCoursename }</td>
					<td>${cp.cpLocaname }</td>
					<td>${cp.cpTimename }</td>
					<td>${cp.cpModebfname }</td>
					<td>${cp.cpSchtime }</td>
					<td><fmt:formatDate value='${cp.cpStarttime }'
							pattern='yyyy-MM-dd' /></td>
					<td><fmt:formatDate value='${cp.cpEndtime }'
							pattern='yyyy-MM-dd' /></td>
					<td>${cp.cpTeacher }</td>
					<td>${cp.cpTeachername }</td>
					<td>${cp.cpStudamount }</td>
					<td>${cp.cpComment }</td>
					<td>${cp.cpOperator }</td>
					<td>${cp.cpCalculate }</td>
					<td class="center">
						<ul class="unstyled">
							<li><a
								href="/TrainClass/class/cProcess/addProcess.do?cpId=${cp.cpId}">开课</a></li>
						</ul>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>