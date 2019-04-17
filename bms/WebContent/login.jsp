<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书管理系统登录窗口</title>
<%@include file="/WEB-INF/pages/include/head.jsp"%>
<style type="text/css">


* {
  margin: 0px;
  padding: 0px;
}

a {
  text-decoration: none;
  color: #000;
}

ul, li {
  list-style: none;
}


body {
  font-size: 14px;
  font-family: "微软雅黑";
}
.header{
  height: 150px;
  background: #fdf8f8;
  font-size: 13px;
    
}
.header p{
  background: #d6e4e5;
  font-size: 20px;
}
.header p a{
	color: #000;
	font-size:20px;
	
}
.header p a:hover{
	color: red;
	font-weight:bold;
	}
#body{
	    background: #396;
    height: 500px;
    margin-top: 19px;
	}
#box{
  float: left;
}

#box1 {
  width: 400px;
  height: 420px;
  float: right;
  text-align: center;
 margin: 1px 80px;
  background: #fdf8f8;

}

#box1 #title {
  color:#325a51;
  padding-top: 20px
  
}

#box1 #textname {
  margin-top: 40px;
  padding-left: 34px;
}
#box1 #textname a{
	 color:#000;
	}
#box1 #textname a:hover{
	text-decoration: underline;
	color:#F00;
	}

#box1 #textpassowrd {
  margin-top: 10px;
}

#box1 #checkbox {
  margin-top: 10px;
  margin-left: -160px;
  font-size:10px;
}

#box1 #checkbox2 {
  margin-top: 10px;
  margin-left: -201px;
  font-size: 10px;
}

#box1 #submit {
	width: 400px;
    margin-left: 0px;
  margin-top: 10px;
  font-size: 22px;
}
.header1{
	width: 300px;
	color: #f10625;
	height: 50px;
    margin: auto;
    margin-top: 200px;
    text-align: center;
    line-height: 50px;
    font-size: 20px;
    font-weight: bold;
    margin-top: -50px;
}
#login{
	width: 50px;
    height: 30px;
    font-size: 16px;
    background-color: #dbede9;
    color: #325a51;
    margin-bottom: 10px;
	}
#reset{
	width: 50px;
    height: 30px;
    font-size: 16px;
    background-color: #dbede9;
    color: #325a51;
    margin-bottom: 10px;
    margin-left: 192px;
	}
#buttonimg{
	 margin-top: 10px;
    margin-left: 14px;
	}

</style>

</head>
<body>
<%--  --%>
<div class="header">
    <img src="<%=request.getContextPath() %>/img/login/yue1.png">
     <center><p>Copyright © 2018-2018 <a href="http://www.baidu.com" target="_blank">凡星图书商城系统</a>
      - Powered By YHM v1.0</p></center>
</div>
 
 <div id="body">
     <div id="box">
        <img src="<%=request.getContextPath() %>/img/login/yue2.png" alt="">
     </div>
          <div id="box1">
            <h2 id="title">账户登录</h2>
            <form id="loginForm" action="login" method="post">
          
              <div id="textname">
                <input type="text"
                  style="height: 30px; width: 300px; font-size: 20px; color: #325a51" id="loginname"
                  name="loginname" value="" placeholder="账户名" /> <a href="registers.jsp">注册</a>
              </div>
              <div id="textpassowrd">
                <input type="password"
                  style="height: 30px; width: 300px; font-size: 20px; color: #325a51" id="password"
                  name="password" value="" placeholder="密码" />
              </div>
              <div id="checkbox">
                <input type="checkbox" name="Management" id="checkbox1" value="管理员" checked="checked">管理员
                <input type="checkbox" name="Management" id="checkboxstu" value="学生">学生
              </div>
              
              <div id="checkbox2">
                <input type="checkbox" name="check" value="${check}" >记住我
              </div>
              <div id="submit">
                <input type="submit" id="login" value="登录" />
                <input type="reset" id="reset" value="重置" /><br>
              </div>
	              <div class="header1">
						<div id="messageBox">
							<label id="loginError">${loginErrorMsg }</label>
						</div>
				</div>
            </form>
            <div id="buttonimg">
                  <img src="<%=request.getContextPath() %>/img/login/yue3.png" alt="">
                  </div>
           </div>
           
  </div>




</body>
</html>