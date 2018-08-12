<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/css/signin.css" rel="stylesheet">
<style type="text/css">
#tip_message {
	z-index: 9999;
	position: fixed;
	left: 0;
	top: 40%;
	text-align: center;
	width: 100%;
}
 
#tip_message span {
	background-color: #03C440;
	opacity:0.8;
	padding: 20px 50px;
	border-radius: 5px;
	text-align: center;
	color: #fff;
	font-size: 20px;
}
 
#tip_message span.error {
	background-color: #EAA000;
}
</style>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function(){

	    //按钮单击时执行
	    $("#testAjax").click(function(){
	    	var username=$('#username').val();
			var password=$('#password').val();
			var user={
					"userName":username,"passWord":password
			}
	          //Ajax调用处理
	        $.ajax({
	           type: "POST",
	           url: "${pageContext.request.contextPath }/user/login.do",
	           dataType:"json",
               contentType : "application/json;charset=UTF-8",
	           data:JSON.stringify(user),
	           success: function(data) {
		           if(data.code==1){
	                   console.log(data);
	                   window.location.href="${pageContext.request.contextPath }/main.jsp"
	               }else{
	            	   $('#error').html(data.msg);
	                  //alert(data.msg);
	               }
               },
              
	        });
	        
	     });
	});
</script>

</head>
<body>
<div class="signin">
	<div class="signin-head"></div>
	<form class="form-signin" role="form">
		<input type="text" class="form-control" id="username" placeholder="用户名" required autofocus />
		<input type="password" class="form-control" id="password" placeholder="密码" required  />
		<label class="checkbox">
			<input type="checkbox" value="remember-me"> 记住我
			<a href="">？忘记密码</a>
		</label>
		<div id='error'></div>
		<button class="btn btn-lg btn-warning btn-block" type="button" id="testAjax">登录</button>
		<button class="btn btn-lg btn-warning btn-block" type="submit">注册</button>
	</form>
</div>
</body>
</html>