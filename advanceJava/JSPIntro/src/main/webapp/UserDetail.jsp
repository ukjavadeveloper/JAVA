<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSP_Intro </title>
		<!--<script>
			alert("Hello");
		</script>-->
		<style type="text/css">
			.parent_div{
				background: #FFFFF0;
			}
		</style>
	</head>
	<body>
		<div class="parent_div">
			<form action="preview-details">
				Enter First Name : <input type="text" name="txt_fname" placeholder="First Name"><br><br>
				Enter Middle Name : <input type="text" name="txt_mname" placeholder="Middle Name"><br><br>
				Enter Last Name : <input type="text" name="txt_lname" placeholder="Last Name"><br><br>
				Enter Contact number : <input type="text" name="txt_contact" placeholder="Contact number"><br><br>
				Enter EmailId : <input type="text" name="txt_email" placeholder="Email id"><br><br>
				Select Gender : <input type="radio" name="gender" value="M">Male
								<input type="radio" name="gender" value="F">Female
				<!--<select name="gender">
					<option value="M">Male</option>
					<option value="F">Female</option>
				</select>-->
				<br><br>
				<button type="submit">Preview</button>
			</form>
		</div>
	</body>
</html>