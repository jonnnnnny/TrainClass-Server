<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新的计划班级信息</title>
<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>

</head>
<body>
	<h1 align="center">添加新的计划班级信息</h1>
	<hr>
	<form class="sui-form form-horizontal"
		action="/TrainClass/class/cScheme/addPlan.do">
		<div class="control-group">
			<label class="control-label">策划班级ID：</label>
			<div class="controls">
				<input type="text" class="input-large" name="csId" value="${csId}"
					readonly="readonly">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">讲师ID：</label>
			<div class="controls">
				<input type="text" class="input-large" name="cpTeacher">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">讲师名称：</label>
			<div class="controls">
				<input type="text" class="input-large" name="cpTeachername">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">班级人数：</label>
			<div class="controls">
				<input type="text" class="input-large" name="studamount">
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