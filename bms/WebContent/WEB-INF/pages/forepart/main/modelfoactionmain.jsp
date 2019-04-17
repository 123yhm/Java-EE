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
	font-size: 16px;
}
#loderror{
	width: 150px;
    color: #2509fb;
    float: left;
    text-align: left;
    line-height: 34px;
    font-size: 12px;
    font-weight: bold;
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
			<form  action="pwdupdate" method="post">
  				<div class="lodpwd" style="margin-top: 50px;margin-left: 30px;width: 600px;height: 34px;">
  					<label for="" style="float:left;line-height: 34px; ">旧密码：</label>
  					<input type="password"  style="width: 300px;float: left;margin-left: 80px;" class="form-control" id="loginName"name="oldpassword" value="" />
  					<div id="loderror"><span class="pwd1">*</span></div>
  				</div>
  				<div class="lodpwd" style="margin-top: 50px;margin-left: 30px;width: 600px;height: 34px;">
  					<label for="" style="float:left;line-height: 34px;color: red; ">新密码：</label>
  					<input type="password"  style="width: 300px;float: left;margin-left: 80px;" class="form-control" id="password"name="newpassword" value="" />
  					<div id="loderror"><span class="pwd2">*</span></div>
  				</div>
  				<div class="lodpwd" style="margin-top: 50px;margin-left: 30px;width:600px;height: 34px;">
  					<label for="" style="float:left;line-height: 34px;color: red; ">请再次输入新密码：</label>
  					<input type="password"  style="width: 300px;float: left;" class="form-control" id="passwords"name="password" value="" />
  					<div id="loderror"><span class="pwd3">*</span></div>
  				</div>
				<div class="form-actions">
					<input  class="btn btn-primary" type="submit" value="保 存"/>
				</div>
			</form>
				<div style="color: red;">${pwderror}</div>


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
		$(function(){
				$("#loginName").blur(function(){
					var lodpwd=$("#loginName").val();
					var garl=/^[a-z0-9_-]{6,12}$/;
					if(lodpwd==null || lodpwd==""){
						$(".pwd1").html("密码不能为空").show();
						$("#loginName").focus();
					}else{
						if(garl.test(lodpwd)){
							$(".pwd1").html("√").show();
						}else{
							$(".pwd1").html("密码只能输入6-12位的").show();
						}
						
					}
				});
				$("#password").blur(function(){
					var newpwd=$("#password").val();
					var garl=/^[a-z0-9_-]{6,12}$/;
					if(newpwd==null || newpwd==""){
						$(".pwd2").html("新密码不能为空").show();
						$("#password").focus();
					}else{
						if(garl.test(newpwd)){
							$(".pwd2").html("√").show();
						}else{
							$(".pwd2").html("新密码只能输入6-12位的").show();
						}
						
					}
				});
				$("#passwords").blur(function(){
					var newpwds=$("#passwords").val();
					var newpwd=$("#password").val();
					if(newpwds==null || newpwds==""){
						$(".pwd3").html("新密码不能为空").show();
						$("#passwords").focus();
					}else{
						if(newpwds==newpwd){
							$(".pwd3").html("√").show();
						}else{
							$(".pwd3").html("两次密码输入不一致").show();
						}
						
					}
				});
		});
	</script>
</body>
</html>