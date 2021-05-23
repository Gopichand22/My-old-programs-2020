<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Home page</title>

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



	<!-- Header section -->
	<header class="header-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="site-logo">
						<h4 class="animate__animated animate__slideInDown animate__slow"
							style="color: black; padding: 1px;">Virtual Classroom</h4>
					</div>
					<div class="nav-switch">
						<i class="fa fa-bars"></i>
					</div>
				</div>
				<div
					class="col-lg-12 col-md-12 animate__animated animate__slideInUp animate__slow"
					style="background-color: black;">
					<a href="logout" class="site-btn header-btn">Logout</a>
					<nav class="main-menu">
						<ul>
							<li>
								<a href="index.jsp">Home</a>
							</li>
							<li>
								<a href="classroom.jsp">Classroom</a>
							</li>
							<li>
								<a href="news.jsp">News</a>
							</li>
							<li>
								<a href="aboutUs.html">About us</a>
							</li>
							<li>
								<a href="contact.html">Contact Us</a>
							</li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</header>
	<!-- Header section end -->

	<div class="container" style="position: relative; top: 20%;">
		<!-- 21:9 aspect ratio -->
		<div class="mb-3">
			<label for="formFileSm" class="form-label">File input example</label>
			<input class="form-control form-control-sm" id="formFileSm"
				type="file">

		</div>
		<label>
			<marquee style="font-weight: bold">Video on topic 1</marquee>
		</label>
		<div class="embed-responsive embed-responsive-21by9"
			style="position: relative; top: 20%;">
			<iframe class="embed-responsive-item" width="972" height="547"
				src="https://www.youtube.com/embed/H15uuDMqDK0"
				title="YouTube video player" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>
		</div>
		<label>
			<marquee style="font-weight: bold">Video on topic 2</marquee>
		</label>
		<div class="embed-responsive embed-responsive-21by9">
			<iframe class="embed-responsive-item" width="972" height="547"
				src="https://www.youtube.com/embed/xYX6b1-9Coo"
				title="YouTube video player" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>
		</div>
		<label>
			<marquee style="font-weight: bold">Video on topic 3</marquee>
		</label>
		<div class="embed-responsive embed-responsive-21by9"
			style="position: relative; top: 20%;">
			<iframe class="embed-responsive-item" width="972" height="547"
				src="https://www.youtube.com/embed/vlDzYIIOYmM"
				title="YouTube video player" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>
		</div>
		<label>
			<marquee style="font-weight: bold">Video on topic 4</marquee>
		</label>
		<div class="embed-responsive embed-responsive-21by9"
			style="position: relative; top: 20%;">
			<iframe class="embed-responsive-item" width="1046" height="446"
				src="https://www.youtube.com/embed/YN6hKzzHkbw"
				title="YouTube video player" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>
		</div>
		<label>
			<marquee style="font-weight: bold">Video on topic 5</marquee>
		</label>
		<div class="embed-responsive embed-responsive-21by9"
			style="position: relative; top: 20%;">
			<iframe class="embed-responsive-item" width="972" height="547"
				src="https://www.youtube.com/embed/Ga-XNWZAxME"
				title="YouTube video player" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>
		</div>





	</div>




	<!--====== Javascripts & Jquery ======-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/circle-progress.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>


