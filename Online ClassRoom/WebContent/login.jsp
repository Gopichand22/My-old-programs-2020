<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>

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


	<marquee style="text-decoration: bold;">Login with valid
		credentials and do not use any invalid credentials</marquee>
	<!-- Hero section -->
	<section id="cover" class="min-vh-100">
		<div id="cover-caption">
			<div class="container">
				<div class="row text-white">
					<div
						class="col-xl-5 col-lg-6 col-md-8 col-sm-10 mx-auto text-center form py-1">
						<h4
							class="display-4 py-0 text-truncate animate__animated animate__fadeOut animate__infinite infinite ">Login
							Form</h4>
						<div class="px-0">
							<span style="color: green;font-weight:bold;"><%=(request.getAttribute("sucMessage") == null) ? ""
					: request.getAttribute("name") + " " + request.getAttribute("sucMessage")%></span>
							<form action="login" class="justify-content-center" method="post">
								<div class="form-group">
									<label class="sr-only">Email</label>
									<input type="email" class="form-control" name="email"
										placeholder="Enter email" required>
								</div>
								<div class="form-group">
									<label class="sr-only">Password</label>
									<input type="password" class="form-control" name="login_pass"
										placeholder="Enter password" required>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="role"
										id="flexRadioDefault1" value="admin" required>
									<label class="form-check-label" for="flexRadioDefault1">
										Admin </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="role"
										id="flexRadioDefault1" value="staff" required>
									<label class="form-check-label" for="flexRadioDefault1">
										Staff </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="role"
										id="flexRadioDefault1" value="student" required>
									<label class="form-check-label" for="flexRadioDefault1">
										Student </label>
								</div>
								<span style="color: red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span>
								<br>
								<button type="submit" class="btn btn-primary">Login</button>
								<br />
								<p>
									Not registered yet?
									<a href="register.jsp">
										<span
											style="color: aqua; text-decoration: underline; font-size: 16px;">click
											here</span>
									</a>
									to register now
								</p>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>



	<!-- footer section -->
	<footer class="footer-section spad pb-0">
		<div class="footer-top">
			<div class="footer-warp">
				<div class="row">
					<div class="widget-item">
						<h4>Contact Info</h4>
						<ul class="contact-list">
							<li>Nellore,AndhraPradesh</li>

						</ul>
					</div>
					<div class="widget-item">
						<h4>Staff List</h4>
						<ul class="contact-list">
							<li>
								<a href="">132 P Gopichand</a>
							</li>
							<li>
								<a href="">182 Suvadeep</a>
							</li>
							<li>
								<a href="">232 Bala</a>
							</li>
							<li>
								<a href="">123 Udit</a>
							</li>


						</ul>
					</div>
					<div class="widget-item">
						<h4>Website Development</h4>
						<ul class="contact-list">
							<li>P Gopichand Reddy</li>
						</ul>
					</div>
					<div class="widget-item">
						<h4>Technologies Used</h4>
						<ul class="contact-list">
							<li>
								<a href="">Java</a>
							</li>
							<li>
								<a href="">Servlets</a>
							</li>
							<li>
								<a href="">MySQL</a>
							</li>
							<li>
								<a href="">Bootstrap</a>
							</li>
							<li>
								<a href="">Jquery</a>
							</li>
						</ul>
					</div>

				</div>
			</div>
		</div>
		<div class="footer-bottom">
			<div class="footer-warp">
				<div class="copyright">Copyright &copy;2021 All rights
					reserved</div>
			</div>
		</div>
	</footer>
	<!-- footer section end -->


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