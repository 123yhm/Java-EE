<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主界面</title>
<%@include file="/WEB-INF/pages/include/head.jsp"%>
<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

a {
	text-decoration: none;
	color: red;
}

ul, li {
	list-style: none;
}

body {
	font-size: 12px;
	font-family: "微软雅黑";
}

h1 {
	width: 100%;
	margin: auto;
	text-align: center;
}

#box {
	width: 1000px;
	height: 1000px;
	text-align: center;
	margin: 0px auto;
	background-color: #fff;
}

#box #top {
	width: 1000px;
	height: 200px;;
	background-image: url("img/bodyimg/a.png");
}

#box #top .exit {
	float: left;
	text-decoration: none;
	margin-top: 10px;
	color: #000;
	margin-left: 14px;
	font-size: 20px;
}

#box #top .name {
	width: 190px;
	height: 30px;
	float: right;
	text-align: left;
	line-height: 30px;
	font-size: 20px;
	font-weight: bold;
}

#box #top .time {
	width: 325px;
	float: right;
	height: 30px;
	text-align: left;
	line-height: 30px;
	font-size: 20px;
	font-weight: bold;
}

#box #top .time  #cg {
	color: red;
}

#box #top  .name {
	color: red;
}

#box #center {
	width: 1000px;
	height: 700px;
}

#box #button {
	width: 1000px;
	height: 100px;
}

#box #center #navigation {
	width: 998px;
	height: 30px;
	background-color: #000;
}

#box #center #navigation li {
	width: 122px;
	height: 30px;
	float: left;
	display: inline-block:30px;
}

#box #center #navigation li a {
	width: 122px;
	height: 30px;
	color: #FFF;
	font-weight: bold;
	line-height: 30px;
	font- size: 18px;
	text-align: center;
	cursor: pointer;
}

#box #center #navigation li a:hover {
	display: block;
	background-color: #FFF;
	color: #F00;
	font-weight: bold;
	text- decoration: none;
}

/*个人信息css  */
#boxcenter {
	width: 1000px;
	height: 671px;
	margin-top: -10px;
}

#lab-file {
	font-size: 15px;
	padding: 10px 30px;
	background: #d9eaf1;
	border: none;
	border-radius: 32px;
}

#test-upload {
	display: none;
}
</style>

</head>
<body style="background-color: #00a2dd;">

	<div id="topimg">
		<img alt="" src="<%=request.getContextPath()%>/img/bodyimg/titletop4.jpg">
		<img alt="" src="<%=request.getContextPath()%>/img/bodyimg/titletop3.jpg">
		<img alt="" src="<%=request.getContextPath()%>/img/bodyimg/titletop1.jpg">
		<img alt="" src="<%=request.getContextPath()%>/img/bodyimg/titletop2.jpg">
	</div>
	<div id="box">
		<div id="top">
			<div class="exit">
				<a href="login.jsp" style="color: #2e09f3;">注销</a>
			</div>
			<div class="time">
				当前时间:<span id="cg">0000-00-00 上午00:00:00</span>
			</div>
			<div class="name">用户名:${loginname}</div>

		</div>
		<div id="center">
			<ul id="navigation">
				<li><a href="main">首&nbsp;&nbsp;&nbsp;页</a></li>
				<li><a href="Child">少儿童书</a></li>
				<li><a href="Literary">文学小说</a></li>
				<li><a href="itbook">IT科技</a></li>
				<li><a href="message">留&nbsp;&nbsp;&nbsp;言</a></li>
				<li><a href="person">个人信息</a></li>
				<li><a href="pwdmodil">修改密码</a></li>
				<li><a href="bookshop">购物车</a></li>
			</ul>
			<div id="boxcenter">
		<c:forEach items="${listproper}" var="son">
				<form action="userupdate?bmUser.id=${son.id }" method="post" style="margin-left: 300px;">
					
						<div class="form-group"
							style="width: 400px; margin-top: 20px; margin-left: 100px;">
							<label for=""
								style="margin-left: -249px; line-height: 50px; font-size: 20px;">头像</label>
							<img alt="" src="<%=request.getContextPath()%>/img/c.png"
								style="width: 80px; height: 50px; margin-left: 59px;"
								class="img-circle"> <a href="#"><label
								for="test-upload" id="lab-file">上传图片<input type="file"
									id="test-upload" /></label></a>
						</div>
						<div class="form-group" style="width: 400px;">
							<label for="" style="line-height: 24px; font-size: 15px;">用户名</label>
							<input type="text" class="form-control"
								placeholder="请输入用户名（中文、英文）" style="width: 300px; float: right;"
								id="loginName" name="bmUser.loginName" value="${son.loginName }" />
						</div>
						<div class="form-group" style="width: 400px;">
							<label for="" style="line-height: 24px; font-size: 15px;">姓名</label>
							<input type="text" class="form-control" placeholder="请输入你的真实姓名"
								style="width: 300px; float: right;" id="nameengi"
								name="bmUser.name" value="${son.name }" />
						</div>
						<div class="form-group" style="width: 400px;">
							<label for="" style="line-height: 24px; font-size: 15px;">学生编号</label>
							<input type="text" class="form-control" placeholder="请输入4位数的学生编号"
								style="width: 300px; float: right;" id="serialnumber"
								name="bmUser.serialnumber" value="${son.serialnumber }" />
						</div>
						<div class="form-group" style="width: 400px;">
							<label for=""
								style="margin-right: 46px; line-height: 24px; font-size: 15px;">性别</label>
							
							<input type="radio" name="bmUser.sex" value="2"
								style="margin-left: 100px;" checked="checked" 
								<c:if test="${son.sex==2}"> checked="checked"</c:if> />男 <input
								type="radio" name="bmUser.sex" style="margin-left: 100px;"
								<c:if test="${son.sex==1}"> checked="checked"</c:if>
								value="1" />女


						</div>
						<div class="form-group" style="width: 400px;">
							<label for="" style="line-height: 24px; font-size: 15px;">年龄</label>
							<input type="text" class="form-control" placeholder="请输入年龄"
								style="width: 300px; float: right;" id="age" name="bmUser.age"
								value="${son.age }" />
						</div>

						<div class="form-group" style="width: 400px;">
							<label for="" style="line-height: 24px; font-size: 15px;">学校</label>
							<input type="text" class="form-control" placeholder="请输入学校"
								style="width: 300px; float: right;" id="school"
								name="bmUser.school" value="${son.school }" />
						</div>
						<div class="form-group" style="width: 400px;">
							<label for="" style="line-height: 24px; font-size: 15px;">邮箱</label>
							<input type="text" class="form-control" placeholder="请输入邮箱"
								style="width: 300px; float: right;" id="email"
								name="bmUser.email" value="${son.email }" />
						</div>
						<div class="form-group" style="width: 400px; margin-top: 20px;">
							<label for="" style="line-height: 24px;">电话</label> <input
								type="text" class="form-control" placeholder="请输入电话（7位数）"
								style="width: 300px; float: right;" id="phone"
								name="bmUser.phone" value="${son.phone }" />
						</div>
						<div class="form-group" style="width: 400px;">
							<label for="" style="line-height: 24px; font-size: 15px;">手机号</label>
							<input type="text" class="form-control"
								placeholder="请输入手机号（11位数）" style="width: 300px; float: right;"
								id="mobile" name="bmUser.mobile" value="${son.mobile }" />
						</div>
						<div class="form-group" style="width: 400px;">
							<label for="" style="line-height: 24px; font-size: 15px;">个性签名</label>
							<textarea class="form-control" placeholder="请输入个性签名（30字以内）"
								style="width: 300px; float: right;" id="selfhood"
								name="bmUser.selfhood" >${son.selfhood }</textarea>
						</div>
						<div>
							<input type="submit" class="btn btn-danger" value="编辑"
								style="margin-top: 20px; margin-left: 300px;">
						</div>

					</c:forEach>
					${error}
				</form>





			</div>


		</div>
		<div id="button">
			<p class="links" style="margin-top: 10px;">
				<a href="" target="_blank">关于我们</a><span class="mod_copyright_split">|</span>
				<a href="" target="_blank">联系我们</a><span class="mod_copyright_split">|</span>
				<a href="#" target="_blank">联系客服</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">合作招商</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">商家帮助</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">营销中心</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">图书管理</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">友情链接</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">销售联盟</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">图书社区</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">风险监测</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">隐私政策</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">图书公益</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">English
					Site</a><span class="mod_copyright_split">|</span> <a href="#"
					target="_blank">Media &amp; IR</a>
			</p>
			<span style="font-size: 20px; font-weight: bold; line-height: 80px;">湖南机电职业技术学院@<a
				href="http://ww.baidu.com">校园图书商城</a> 版权所有2018-2018 YHM
				AllRightsReserved
			</span>
		</div>

	</div>

	<script type="text/javascript">
		setInterval("cg.innerHTML=new Date().toLocaleString()", 1000);
	</script>
</body>
</html>