<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="node_modules/mdi/css/materialdesignicons.min.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="css/style3.css">
<!-- endinject -->
<link rel="shortcut icon" href="images/favicon.png" />
<script async custom-element="amp-ad"
	src="https://cdn.ampproject.org/v0/amp-ad-0.1.js"></script>
</head>

<body>
	<div class="body-wrapper">
		<!-- partial:partials/_sidebar.html -->
		<aside class="mdc-persistent-drawer mdc-persistent-drawer--open">
			<nav class="mdc-persistent-drawer__drawer">
				<div class="mdc-persistent-drawer__toolbar-spacer">
					<a href="crud.jsp" class="brand-logo" style="text-decoration:none;color:purple;"> VIrtual Classroom </a>
				</div>
				<div class="mdc-list-group">
					<nav class="mdc-list mdc-drawer-menu">
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="crud.jsp"> Dashboard </a>
						</div>
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="insert.jsp"> Insert
								a Staff/Student</a>
						</div>
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="delete.jsp"> Delete
								a Staff/Student</a>
						</div>
						

						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="stafflist"> View Staff </a>
						</div>
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="studentslist"> View Student
							</a>
						</div>
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="admin.jsp"> Admin UI page
							</a>
						</div>
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="logout" style="color: red;">
								Logout </a>
						</div>
					</nav>
				</div>
			</nav>
		</aside>
		<!-- partial -->
		<!-- partial:partials/_navbar.html -->
		<header class="mdc-toolbar mdc-elevation--z4 mdc-toolbar--fixed">
			<div class="mdc-toolbar__row"></div>
		</header>
		<!-- partial -->
		<div class="page-wrapper mdc-toolbar-fixed-adjust">
			<main class="content-wrapper">
			<div class="mdc-layout-grid">
				<div class="mdc-layout-grid__inner">
					<div
						class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
						<div class="mdc-card"></div>
					</div>
					<div
						class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8">
						<div class="mdc-layout-grid__inner">
							<div
								class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
								<button class="btn btn-outlinr-primary"  href="doubts.jsp">
								<div
									class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
									<h1>Click here to post you doubts</h1>
								</div>
								</button>
							</div>
							<div
								class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
								<div
									class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
									<h1>Reddy</h1>
								</div>
							</div>
							<div
								class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
								<div
									class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
									<h1>gopi</h1>
								</div>
							</div>

						</div>
					</div>
					

					
					
				</div>
			</div>
			</main>
			
		</div>
	</div>
	<script
		src="node_modules/material-components-web/dist/material-components-web.min.js"></script>
	<script src="node_modules/jquery/dist/jquery.min.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page-->
	<script src="node_modules/chart.js/dist/Chart.min.js"></script>
	<script src="node_modules/progressbar.js/dist/progressbar.min.js"></script>
	<!-- End plugin js for this page-->
	<!-- inject:js -->
	<script src="js/misc.js"></script>
	<script src="js/material.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script src="js/dashboard.js"></script>
	<!-- End custom js for this page-->
</body>

</html>