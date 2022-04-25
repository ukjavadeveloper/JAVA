<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Sign up / Login Form</title>
  <link rel="stylesheet" href="css/style.css">
  
</head>
<body>
<!-- partial:index.partial.html 
<!DOCTYPE html>
<html>-->
<head>
	<title>Slide Navbar</title>
	<link rel="stylesheet" type="text/css" href="slide navbar style.css">
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
<script type="text/javascript"> 
function ValidateName() {
   alert("hello");
	var email = document.getElementById("name").value;
    var lblError = document.getElementById("lblError_name");
    lblError.innerHTML = "";
    var expr = /^[A-Za-z]\\w{5,29}$/;
    if (!expr.test(email)) {
        lblError.innerHTML = "Invalid Name.";
    }
function ValidateEmail() {
	alert("hello...");
	var email = document.getElementById("email").value;
    var lblError = document.getElementById("lblError_email");
    lblError.innerHTML = "";
    var expr = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
    if (!expr.test(email)) {
        lblError.innerHTML = "Invalid email address.";
    }
    function ValidatePassword() {
    	alert("hello......");
    	var email = document.getElementById("pswd").value;
        var lblError = document.getElementById("lblError_pswd");
        lblError.innerHTML = "";
        var expr = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
        if (!expr.test(email)) {
            lblError.innerHTML = "Invalid Name.";
        }

</script>
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">
			<div class="signup">
				<form name="form_signup" action="register-user" method="post">
					<label for="chk" aria-hidden="true">Sign up</label>
					<input type="text" id="name" name="txt" placeholder="User name" required="" onkeyup="ValidateName()">
					<span id="lblError_name" style="color: red"></span>
					<input type="email" id="email" name="email" placeholder="Email" required="" onkeyup="ValidateEmail()" >
					<span id="lblError_email" style="color: red"></span>
					<input type="password" name="pswd" placeholder="Password" required="" onkeyup="ValidatePassword">
					<span id="lblError_pswd" style="color: red"></span>
					<button type="submit"  onclick="ValidateEmail(document.form_signup.email);CheckPassword(document.form_signup.pswd);ValidateUserName(document.form_signup.txt)">Sign up</button>
				</form>
			</div>

			<div class="login">
			<%
				String code = request.getParameter("code");
					if(code != null){
					switch(code){
					case "401" : 
						out.print("<h4 style='color:red'>Invalid user name or password</h4>");
						break;
					case "500" :
						out.print("<h4 style='color:yellow'>something went wrong please, try after some time..</h4>");
						break;
					}	
				}
			%>
				<form name="form_signin" action="auth-user" method="post">
					<label for="chk" aria-hidden="true">Login</label>
					<input type="email" name="email" placeholder="Email" required="">
					<input type="password" name="pswd" placeholder="Password" required="">
					<button type="submit" onclick="ValidateEmail(document.form_signin.email);CheckPassword(document.form_signin.pswd)">Login</button>
				</form>
			</div>
	</div>
	<script type="text/javascript">
	
	function check() {
		  var email = document.getElementById('email');
		  var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		    if (!filter.test(email.value)) {
		        alert('Please provide a valid email address');
		        email.focus;
		        return false;
		    }
		    else {
		        alert("Thanks for your intrest in us, Now you 
		        will be able to receive monthly updates from us.");
		        document.getElementById('email').value = "";
		    }
		 }
		
	function CheckPassword(inputtxt) 
	{ 
		var passw=  /^[A-Za-z]\w{7,14}$/;
		if(inputtxt.value.match(passw)) { 
			alert('Correct, try another...')
			return true;
		}
		else{ 
			alert('Wrong...!')
			return false;
		}
	}
	
	function ValidateUserName(name) 
	{
	 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myForm.emailAddr.value)){
	    return (true)
	  }
	    alert("Please enter proper name!")
	    return (false)
	}	
	</script>
</body>
</html>
<!-- partial -->	
</body>
</html>