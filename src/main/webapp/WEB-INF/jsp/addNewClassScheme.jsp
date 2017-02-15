<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新的策划班级信息</title>
<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>

</head>
<body>
	<h1 align="center">添加新的策划班级信息</h1>
	<hr>
	<form class="sui-form form-horizontal"
		action="/TrainClass/class/cScheme/addClassScheme.do" method="post">
		<div class="control-group">
			<label class="control-label">课程产品：</label>
			<div class="controls">
				<select name="coursename">
					<option value="">请选择</option>
					<c:forEach items="${courseProductList}" var="cp">
						<option value="${cp}">${cp }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">教学点：</label>
			<div class="controls">
				<select name="locaname">
					<option value="">请选择</option>
					<c:forEach items="${teachingLocationList}" var="tl">
						<option value="${tl}">${tl }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div data-toggle="datepicker" class="control-group input-daterange">
			<label class="control-label">开课日期：</label>
			<div class="controls">
				<input type="text" class="input-medium input-date" name="starttime">
			</div>
		</div>
		<div data-toggle="datepicker" class="control-group input-daterange">
			<label class="control-label">结课日期：</label>
			<div class="controls">
				<input type="text" class="input-medium input-date" name="endtime">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">具体上课时间：</label>
			<div class="controls">
				<input type="text" class="input-large" name="schtime">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label">时间性质：</label>
			<div class="controls">
				<select name="timename">
					<option value="">请选择</option>
					<c:forEach items="${timePropertyList}" var="tp">
						<option value="${tp }">${tp }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">上课类型：</label>
			<div class="controls">
				<select name="modebfname">
					<option value="">请选择</option>
					<c:forEach items="${teachingModeList}" var="tm">
						<option value="${tm }">${tm }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">操作人：</label>
			<div class="controls">
				<input type="text" class="input-large" name="operator">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label"></label>
			<div class="controls">
				<button type="submit" class="sui-btn btn-primary">添加</button>
				<a href="/TrainClass/class/cScheme/showAll.do"
					class="sui-btn btn-bordered btn-large">返回</a>
			</div>
		</div>

	</form>
</body>
</html>