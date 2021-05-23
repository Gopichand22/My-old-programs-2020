<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>

<meta charset="UTF-8">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800,800i"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
<!-- Stylesheets -->
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<link rel="stylesheet" href="css/owl.carousel.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/loginstyle.css" />


<!-- bootstrap cdn -->

<!-- font and icons cdn -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">

<!-- Jquery cdn -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
	integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
	crossorigin="anonymous"></script>
</head>
<body>


	<marquee style="color: red;">Register with valid proper
		details and do not use any invalid credentials</marquee>
	<!-- Hero section -->
	<section id="cover" class="min-vh-100">
		<div id="cover-caption">
			<div class="container">
				<div class="row text-white">
					<div
						class="col-xl-5 col-lg-6 col-md-8 col-sm-10 mx-auto text-center form py-1">
						<h1 class="display-4 py-0 text-truncate">Student Registration
							Form</h1>
						<div class="px-0">
							<form action="RegisterMe" class="justify-content-center"
								method="post">
								<div class="form-check">
									<input class="form-check-input" type="radio" name="role"
										id="flexRadioDefault1" value="student">
									<label class="form-check-label" for="flexRadioDefault1">
										Staff</label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="role"
										id="flexRadioDefault1" value="student">
									<label class="form-check-label" for="flexRadioDefault1">
										Student </label>
								</div>
								<div class="form-group">
									<label class="sr-only">Name</label>
									<input type="text" name="name" class="form-control"
										placeholder="Enter name" required>
								</div>
								<div class="form-group">
									<label class="sr-only">Email</label>
									<input type="email" name="email" class="form-control"
										placeholder="Enter email" required>
								</div>
								<div class="form-group">
									<label class="sr-only">password</label>
									<input type="password" name="pass" class="form-control"
										placeholder="Enter Password" required>
								</div>
								<div class="form-group">
									<label class="sr-only">Confirm password</label>
									<input type="password" name="cpass" class="form-control"
										placeholder="Enter Password again" required>
								</div>


								<p>
									<span style="color: red;"><%=(request.getAttribute("errorMessage") == null) ? "" : request.getAttribute("errMessage")%></span>
								</p>
								<button type="submit" class="btn btn-primary">Register</button>
								<a href="register_choose.html" class="btn btn-secondary"
									tabindex="-1" role="button" aria-disabled="true">Get back
									to Forms page</a>
								<br />
								<p>
									Already registered user?
									<a href="login.jsp">
										<span
											style="color: aqua; text-decoration: underline; font-size: 16px;">click
											here</span>
									</a>
									to Login now
								</p>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>




	<!--====== Javascripts & Jquery ======-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/circle-progress.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>

</body>


</body>
</html>