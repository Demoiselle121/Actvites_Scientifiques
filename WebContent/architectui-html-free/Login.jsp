<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login V16</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="image_Login/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="architectui-html-free/vendor_Login/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts_Login/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts_Login/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor_Login/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendo_Login/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor_Login/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor_Login/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendo_Login/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css_Login/util.css">
	<link rel="stylesheet" type="text/css" href="css_Login/main.css">
<!--===============================================================================================-->
	</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('image_Login/OIP.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41">
					Account Login
				</span>
				<div class="login100-form validate-form p-b-33 p-t-5" >
				<form action ="login.php" method = "POST">

					<div class="wrap-input100 validate-input" data-validate = "Entrez votre nom d'utilisateur">
						<input class="input100" type="text" name="username" placeholder="nom d'utilisateur" required>
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Entrez votre mot de passe">
						<input class="input100" type="password" name="password" placeholder="mot de passe" required>
						<span class="focus-input100" data-placeholder="&#xe80f;"></span>
					</div>

					<div class="container-login100-form-btn m-t-32">
					<input type="submit" value="login"/>
						<button class="login100-form-btn">
						
							Login
						</button>
					</div>

					

				</form>
				</div>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="vendor_Login/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor_Login/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor_Login/bootstrap/js/popper.js"></script>
	<script src="vendor_Login/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor_Login/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor_Login/daterangepicker/moment.min.js"></script>
	<script src="vendor_Login/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor_Login/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js_Login/main.js"></script>

</body>
</html>