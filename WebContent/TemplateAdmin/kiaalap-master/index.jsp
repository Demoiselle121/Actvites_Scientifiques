<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Bachelor | Bachelor - Bachelor Admin </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- favicon
		============================================ -->
    <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
    <!-- Google Fonts
		============================================ -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <!-- owl.carousel CSS
		============================================ -->
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/owl.theme.css">
    <link rel="stylesheet" href="css/owl.transitions.css">
    <!-- animate CSS
		============================================ -->
    <link rel="stylesheet" href="css/animate.css">
    <!-- normalize CSS
		============================================ -->
    <link rel="stylesheet" href="css/normalize.css">
    <!-- meanmenu icon CSS
		============================================ -->
    <link rel="stylesheet" href="css/meanmenu.min.css">
    <!-- main CSS
		============================================ -->
    <link rel="stylesheet" href="css/main.css">
    <!-- educate icon CSS
		============================================ -->
    <link rel="stylesheet" href="css/educate-custon-icon.css">
    <!-- morrisjs CSS
		============================================ -->
    <link rel="stylesheet" href="css/morrisjs/morris.css">
    <!-- mCustomScrollbar CSS
		============================================ -->
    <link rel="stylesheet" href="css/scrollbar/jquery.mCustomScrollbar.min.css">
    <!-- metisMenu CSS
		============================================ -->
    <link rel="stylesheet" href="css/metisMenu/metisMenu.min.css">
    <link rel="stylesheet" href="css/metisMenu/metisMenu-vertical.css">
    <!-- calendar CSS
		============================================ -->
    <link rel="stylesheet" href="css/calendar/fullcalendar.min.css">
    <link rel="stylesheet" href="css/calendar/fullcalendar.print.min.css">
    <!-- style CSS
		============================================ -->
    <link rel="stylesheet" href="style.css">
    <!-- responsive CSS
		============================================ -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- modernizr JS
		============================================ -->
    <script src="js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
    <!--[if lt IE 8]>
		<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
	<![endif]-->
    <!-- Start Left menu area -->
     <div class="left-sidebar-pro">
        <nav id="sidebar" class="">
            <div class="sidebar-header">
                <a href="index.jsp"><img class="main-logo" src="img/logo/logo.png" alt="" /></a>
                <strong><a href="index.jsp"><img src="img/logo/logosn.png" alt="" /></a></strong>
            </div>
            <div class="left-custom-menu-adp-wrap comment-scrollbar">
                <nav class="sidebar-nav left-sidebar-menu-pro">
                    <ul class="metismenu" id="menu1">
                        <li>
                            <a class="" href="index.jsp">
								   <span class="educate-icon educate-home icon-wrap"></span>
								   <span class="mini-click-non">Etat</span>
								</a>
                            
                        </li>
                        <li>
                            <a title="Landing Page" href="events.jsp" aria-expanded="false"><span class="educate-icon educate-event icon-wrap sub-icon-mg" aria-hidden="true"></span> <span class="mini-click-non">Event</span></a>
                        </li>
                        <li>
                            <a class="has-arrow" href="all-professors.jsp" aria-expanded="false"><span class="educate-icon educate-professor icon-wrap"></span> <span class="mini-click-non">Chercheurs</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                                 <li>
                                 <a href="allProfessor.php">Tous les chercheurs</a> </li>
                                 <li><a href="addProfessor.php">Ajouter un chercheur</a> </li>
                            </ul>
                        </li>
                        
                       
                        <li>
                        
                            <a class="has-arrow" href="all-courses.jsp" aria-expanded="false"><span class="educate-icon educate-course icon-wrap"></span> <span class="mini-click-non">Conferences</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                                <li><a href="allConference.php">Toutes les Conferences</a>
                                                </li>
                              
                                              
                                                
                            </ul>
                        </li>
                        <li>
                            <a class="has-arrow" href="all-courses.jsp" aria-expanded="false"><span class="educate-icon educate-library icon-wrap"></span> <span class="mini-click-non">Soutenances</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                                 <li><a href="allSoutenance.php">Toutes les Soutenances</a>
                                                </li>
                                                
                                                
                            </ul>
                        </li>
                        <li class="active">
                            <a class="has-arrow" href="all-courses.jsp" aria-expanded="false"><span class="educate-icon educate-department icon-wrap"></span> <span class="mini-click-non">Encadrements</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                               <li><a href="allEncadrement.php">Tous les Encadrements</a>
                                                </li>
                                                
                            </ul>
                        </li>
                         <li>
                            <a class="has-arrow" href="allPub.php" aria-expanded="false"><span class="educate-icon educate-professor icon-wrap"></span> <span class="mini-click-non">Publications</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                                 <li>
                                 <a href="allPub.php">Toutes les publications</a> </li>
                     
                            </ul>
                        </li>
                         <li class="active">
                            <a class="has-arrow" href="all-courses.jsp" aria-expanded="false"><span class="educate-icon educate-department icon-wrap"></span> <span class="mini-click-non">Axe de recherche</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                                <li><a href="allAxeR.php">Liste des axes</a>
                                                </li>
                                                <li><a href="add-axeR.jsp">Ajouter un axe</a>
                                                </li>
                                                
                            </ul>
                        </li>
                      
                        
                       
                      
                        <li class="active">
                            <a class="has-arrow" href="all-courses.jsp" aria-expanded="false"><span class="educate-icon educate-department icon-wrap"></span> <span class="mini-click-non">Equipes</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                                <li><a href="allEquipe.php">Liste Equipes</a>
                                                </li>
                                                <li><a href="addEquipe.php">Ajouter equipe</a>
                                                </li>
                                                
                            </ul>
                        </li>
                        
                        
                        <li class="active">
                            <a class="has-arrow" href="all-courses.jsp" aria-expanded="false"><span class="educate-icon educate-department icon-wrap"></span> <span class="mini-click-non">Laboratoires</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                                <li><a href="allLabo.php">Liste des Labo</a>
                                                </li>
                                                <li><a href="add-labo.jsp">Ajouter un Labo</a>
                                                </li>
                            </ul>
                        </li>
                        <li class="active">
                            <a class="has-arrow" href="all-courses.jsp" aria-expanded="false"><span class="educate-icon educate-department icon-wrap"></span> <span class="mini-click-non">Projet recherche</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                               <li><a href="allProjetrecherche.php">Liste des Projet</a>
                                                </li>
                                               
                            </ul>
                        </li>
                        
                        <li>
                            <a class="has-arrow" href="mailbox.jsp" aria-expanded="false"><span class="educate-icon educate-interface icon-wrap"></span> <span class="mini-click-non">PDF generale</span></a>
                            <ul class="submenu-angle interface-mini-nb-dp" aria-expanded="false">
                              <li><a href="PDF.jsp">Toutes les activites</a>
                                                </li>
                                               
                            </ul>
                        </li>
                      
                      
                      <li>
                            <a class="has-arrow" href="mailbox.jsp" aria-expanded="false"><span class="educate-icon educate-interface icon-wrap"></span> <span class="mini-click-non">PDF generale</span></a>
                            <ul class="submenu-angle interface-mini-nb-dp" aria-expanded="false">
                              <li><a href="rech_act.php">Toutes les activites</a>
                                                </li>
                                               
                            </ul>
                        </li>
                      
                      
                      
                        
                      
                    </ul>
                </nav>
            </div>
        </nav>
    </div>
    <!-- End Left menu area -->
    <!-- Start Welcome area -->
    <div class="all-content-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="logo-pro">
                        <a href="index.jsp"><img class="main-logo" src="img/logo/logo.png" alt="" /></a>
                    </div>
                </div>
            </div>
        </div>
        <div class="header-advance-area">
            <div class="header-top-area">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="header-top-wraper">
                                <div class="row">
                                    <div class="col-lg-1 col-md-0 col-sm-1 col-xs-12">
                                        <div class="menu-switcher-pro">
                                            <button type="button" id="sidebarCollapse" class="btn bar-button-pro header-drl-controller-btn btn-info navbar-btn">
													<i class="educate-icon educate-nav"></i>
												</button>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-7 col-sm-6 col-xs-12">
                                        <div class="header-top-menu tabl-d-n">
                                            <ul class="nav navbar-nav mai-top-nav">
                                                <li class="nav-item"><a href="#" class="nav-link">Home</a>
                                                </li>
                                                <li class="nav-item"><a href="#" class="nav-link">About</a>
                                                </li>
                                                <li class="nav-item"><a href="#" class="nav-link">Services</a>
                                                </li>
                                                <li class="nav-item dropdown res-dis-nn">
                                                    <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">Project <span class="angle-down-topmenu"><i class="fa fa-angle-down"></i></span></a>
                                                    <div role="menu" class="dropdown-menu animated zoomIn">
                                                        <a href="#" class="dropdown-item">Documentation</a>
                                                        <a href="#" class="dropdown-item">Expert Backend</a>
                                                        <a href="#" class="dropdown-item">Expert FrontEnd</a>
                                                        <a href="#" class="dropdown-item">Contact Support</a>
                                                    </div>
                                                </li>
                                                <li class="nav-item"><a href="#" class="nav-link">Support</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                 <div class="col-lg-5 col-md-5 col-sm-12 col-xs-12">   
                                        <div class="header-right-info">
                                            <ul class="nav navbar-nav mai-top-nav header-right-menu">
                                               
                                                <li class="nav-item">
                                                    <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
															
															<span class="admin-name">${sessionScope.username}</span>
															<i class="fa fa-angle-down edu-icon edu-down-arrow"></i>
														</a>
                                                    <ul role="menu" class="dropdown-header-top author-log dropdown-menu animated zoomIn">
                                                        
                                                        <li><a href="logout.php"><span class="edu-icon edu-locked author-log-ic"></span>Log Out</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Mobile Menu start -->
            <div class="mobile-menu-area">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="mobile-menu">
                                <nav id="dropdown">
                                    <ul class="mobile-menu-nav">
                                        <li><a data-toggle="collapse" data-target="#Charts" href="#">Home <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul class="collapse dropdown-header-top">
                                                <li><a href="index.jsp">Dashboard v.1</a></li>
                                                <li><a href="analytics.jsp">Analytics</a></li>
                                                <li><a href="widgets.jsp">Widgets</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="events.jsp">Event</a></li>
                                        <li><a data-toggle="collapse" data-target="#demoevent" href="#">Chercheurs<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demoevent" class="collapse dropdown-header-top">
                                                <li><a href="allProfessor.php">Tous les Chercheurs</a>
                                                </li>
                                                <li><a href="addProfessor.php">Ajouter un chercheur</a>
                                                </li>
                                                
                                            </ul>
                                        </li>
                                       
                                        
                                        <li><a data-toggle="collapse" data-target="#demolibra" href="#">Conferences<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demolibra" class="collapse dropdown-header-top">
                                                <li><a href="allConference.php">Toutes les Conferences</a>
                                                </li>
                                                <li><a href="addConference.php">Ajouter une Conference</a>
                                                </li>
                                                
                                                <li><a href="delete-conference.jsp">Supprimer une Conference</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#demodepart" href="#">Soutenance <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demodepart" class="collapse dropdown-header-top">
                                                <li><a href="allSoutenance.php">Toutes les Soutenances</a>
                                                </li>
                                                <li><a href="addSoutenance.php">Ajouter une Soutenance</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#demodepart" href="#">Encadrement<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demodepart" class="collapse dropdown-header-top">
                                                <li><a href="allEncadrement.php">Tous les Encadrements</a>
                                                </li>
                                                
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#demoevent" href="allPub.php">Publications<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demoevent" class="collapse dropdown-header-top">
                                                <li><a href="allProfessor.php">Toutes les pub</a>
                                                </li>
                                               
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#demodepart" href="#">Axe de recherche<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demodepart" class="collapse dropdown-header-top">
                                                <li><a href="allAxeR.php">Tous les axes</a>
                                                </li>
                                                <li><a href="add-axeR.jsp">Ajouter un axe</a>
                                                </li>       
                                            </ul>
                                        </li>
                                        
                                        <li><a data-toggle="collapse" data-target="#demodepart" href="#">Equipes<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demodepart" class="collapse dropdown-header-top">
                                                <li><a href="allEquipe.php">Toutes les Equipes</a>
                                                </li>
                                                <li><a href="addEquipe.php">Ajouter une equipe</a>
                                                </li>
                                                
                                                
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#demodepart" href="#">Laboratoires<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demodepart" class="collapse dropdown-header-top">
                                                <li><a href="allLabo.php">Tous les Labo</a>
                                                </li>
                                                <li><a href="add-labo.jsp">Ajouter un labo</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </li>
                                        
                                         <li><a data-toggle="collapse" data-target="#demodepart" href="#">Projet de recherche<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demodepart" class="collapse dropdown-header-top">
                                                <li><a href="allProjetrecherche.php">Liste des projets</a>
                                                </li>
                                              
                                            </ul>
                                        </li>
                                       
                                        <li><a data-toggle="collapse" data-target="#Miscellaneousmob" href="#">PDF generale <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="Miscellaneousmob" class="collapse dropdown-header-top">
                                                <li><a href=PDF.hsp>PDF generale</a>
                                                </li>
                                                
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#Chartsmob" href="#">Charts <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="Chartsmob" class="collapse dropdown-header-top">
                                                <li><a href="bar-charts.jsp">Bar Charts</a>
                                                </li>
                                                <li><a href="line-charts.jsp">Line Charts</a>
                                                </li>
                                                <li><a href="area-charts.jsp">Area Charts</a>
                                                </li>
                                                <li><a href="rounded-chart.jsp">Rounded Charts</a>
                                                </li>
                                                <li><a href="c3.jsp">C3 Charts</a>
                                                </li>
                                                <li><a href="sparkline.jsp">Sparkline Charts</a>
                                                </li>
                                                <li><a href="peity.jsp">Peity Charts</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#Tablesmob" href="#">Tables <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="Tablesmob" class="collapse dropdown-header-top">
                                                <li><a href="static-table.jsp">Static Table</a>
                                                </li>
                                                <li><a href="data-table.jsp">Data Table</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#formsmob" href="#">Forms <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="formsmob" class="collapse dropdown-header-top">
                                                <li><a href="basic-form-element.jsp">Basic Form Elements</a>
                                                </li>
                                                <li><a href="advance-form-element.jsp">Advanced Form Elements</a>
                                                </li>
                                                <li><a href="password-meter.jsp">Password Meter</a>
                                                </li>
                                                <li><a href="multi-upload.jsp">Multi Upload</a>
                                                </li>
                                                <li><a href="tinymc.jsp">Text Editor</a>
                                                </li>
                                                <li><a href="dual-list-box.jsp">Dual List Box</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#Appviewsmob" href="#">App views <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="Appviewsmob" class="collapse dropdown-header-top">
                                                <li><a href="basic-form-element.jsp">Basic Form Elements</a>
                                                </li>
                                                <li><a href="advance-form-element.jsp">Advanced Form Elements</a>
                                                </li>
                                                <li><a href="password-meter.jsp">Password Meter</a>
                                                </li>
                                                <li><a href="multi-upload.jsp">Multi Upload</a>
                                                </li>
                                                <li><a href="tinymc.jsp">Text Editor</a>
                                                </li>
                                                <li><a href="dual-list-box.jsp">Dual List Box</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#Pagemob" href="#">Pages <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="Pagemob" class="collapse dropdown-header-top">
                                                <li><a href="login.jsp">Login</a>
                                                </li>
                                                <li><a href="register.jsp">Register</a>
                                                </li>
                                                <li><a href="lock.jsp">Lock</a>
                                                </li>
                                                <li><a href="password-recovery.jsp">Password Recovery</a>
                                                </li>
                                                <li><a href="404.jsp">404 Page</a></li>
                                                <li><a href="500.jsp">500 Page</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Mobile Menu end -->
            <div class="breadcome-area">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="breadcome-list">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="breadcome-heading">
                                            <form role="search" class="sr-input-func">
                                                <input type="text" placeholder="Search..." class="search-int form-control">
                                                <a href="#"><i class="fa fa-search"></i></a>
                                            </form>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <ul class="breadcome-menu">
                                            <li><a href="#">Home</a> <span class="bread-slash">/</span>
                                            </li>
                                            <li><span class="bread-blod">Etat</span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="analytics-sparkle-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="analytics-sparkle-line reso-mg-b-30">
                            <div class="analytics-content">
                                <h5>Computer Technologies</h5>
                                <h2>$<span class="counter">5000</span> <span class="tuition-fees">Tuition Fees</span></h2>
                                <span class="text-success">20%</span>
                                <div class="progress m-b-0">
                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:20%;"> <span class="sr-only">20% Complete</span> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="analytics-sparkle-line reso-mg-b-30">
                            <div class="analytics-content">
                                <h5>Accounting Technologies</h5>
                                <h2>$<span class="counter">3000</span> <span class="tuition-fees">Tuition Fees</span></h2>
                                <span class="text-danger">30%</span>
                                <div class="progress m-b-0">
                                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:30%;"> <span class="sr-only">230% Complete</span> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="analytics-sparkle-line reso-mg-b-30 table-mg-t-pro dk-res-t-pro-30">
                            <div class="analytics-content">
                                <h5>Electrical Engineering</h5>
                                <h2>$<span class="counter">2000</span> <span class="tuition-fees">Tuition Fees</span></h2>
                                <span class="text-info">60%</span>
                                <div class="progress m-b-0">
                                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:60%;"> <span class="sr-only">20% Complete</span> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="analytics-sparkle-line table-mg-t-pro dk-res-t-pro-30">
                            <div class="analytics-content">
                                <h5>Chemical Engineering</h5>
                                <h2>$<span class="counter">3500</span> <span class="tuition-fees">Tuition Fees</span></h2>
                                <span class="text-inverse">80%</span>
                                <div class="progress m-b-0">
                                    <div class="progress-bar progress-bar-inverse" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:80%;"> <span class="sr-only">230% Complete</span> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="product-sales-area mg-tb-30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-9 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-sales-chart">
                            <div class="portlet-title">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="caption pro-sl-hd">
                                            <span class="caption-subject"><b>University Earnings</b></span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="actions graph-rp graph-rp-dl">
                                            <p>All Earnings are in million $</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <ul class="list-inline cus-product-sl-rp">
                                <li>
                                    <h5><i class="fa fa-circle" style="color: #006DF0;"></i>CSE</h5>
                                </li>
                                <li>
                                    <h5><i class="fa fa-circle" style="color: #933EC5;"></i>Accounting</h5>
                                </li>
                                <li>
                                    <h5><i class="fa fa-circle" style="color: #65b12d;"></i>Electrical</h5>
                                </li>
                            </ul>
                            <div id="extra-area-chart" style="height: 356px;"></div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                        <div class="white-box analytics-info-cs mg-b-10 res-mg-b-30 res-mg-t-30 table-mg-t-pro-n tb-sm-res-d-n dk-res-t-d-n">
                            <h3 class="box-title">Total Visit</h3>
                            <ul class="list-inline two-part-sp">
                                <li>
                                    <div id="sparklinedash"></div>
                                </li>
                                <li class="text-right sp-cn-r"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-success">1500</span></li>
                            </ul>
                        </div>
                        <div class="white-box analytics-info-cs mg-b-10 res-mg-b-30 tb-sm-res-d-n dk-res-t-d-n">
                            <h3 class="box-title">Page Views</h3>
                            <ul class="list-inline two-part-sp">
                                <li>
                                    <div id="sparklinedash2"></div>
                                </li>
                                <li class="text-right graph-two-ctn"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-purple">3000</span></li>
                            </ul>
                        </div>
                        <div class="white-box analytics-info-cs mg-b-10 res-mg-b-30 tb-sm-res-d-n dk-res-t-d-n">
                            <h3 class="box-title">Unique Visitor</h3>
                            <ul class="list-inline two-part-sp">
                                <li>
                                    <div id="sparklinedash3"></div>
                                </li>
                                <li class="text-right graph-three-ctn"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-info">5000</span></li>
                            </ul>
                        </div>
                        <div class="white-box analytics-info-cs table-dis-n-pro tb-sm-res-d-n dk-res-t-d-n">
                            <h3 class="box-title">Bounce Rate</h3>
                            <ul class="list-inline two-part-sp">
                                <li>
                                    <div id="sparklinedash4"></div>
                                </li>
                                <li class="text-right graph-four-ctn"><i class="fa fa-level-down" aria-hidden="true"></i> <span class="text-danger"><span class="counter">18</span>%</span>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="traffic-analysis-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="social-media-edu">
                            <i class="fa fa-facebook"></i>
                            <div class="social-edu-ctn">
                                <h3>50k Likes</h3>
                                <p>You main list growing</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="social-media-edu twitter-cl res-mg-t-30 table-mg-t-pro-n">
                            <i class="fa fa-twitter"></i>
                            <div class="social-edu-ctn">
                                <h3>30k followers</h3>
                                <p>You main list growing</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="social-media-edu linkedin-cl res-mg-t-30 res-tablet-mg-t-30 dk-res-t-pro-30">
                            <i class="fa fa-linkedin"></i>
                            <div class="social-edu-ctn">
                                <h3>7k Connections</h3>
                                <p>You main list growing</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="social-media-edu youtube-cl res-mg-t-30 res-tablet-mg-t-30 dk-res-t-pro-30">
                            <i class="fa fa-youtube"></i>
                            <div class="social-edu-ctn">
                                <h3>50k Subscribers</h3>
                                <p>You main list growing</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="library-book-area mg-t-30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12">
                        <div class="single-cards-item">
                            <div class="single-product-image">
                                <a href="#"><img src="img/product/profile-bg.jpg" alt=""></a>
                            </div>
                            <div class="single-product-text">
                                <img src="img/product/pro4.jpg" alt="">
                                <h4><a class="cards-hd-dn" href="#">Angela Dominic</a></h4>
                                <h5>Web Designer & Developer</h5>
                                <p class="ctn-cards">Lorem ipsum dolor sit amet, this is a consectetur adipisicing elit</p>
                                <a class="follow-cards" href="#">Follow</a>
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="cards-dtn">
                                            <h3><span class="counter">199</span></h3>
                                            <p>Articles</p>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="cards-dtn">
                                            <h3><span class="counter">599</span></h3>
                                            <p>Like</p>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="cards-dtn">
                                            <h3><span class="counter">399</span></h3>
                                            <p>Comment</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12">
                        <div class="single-review-st-item res-mg-t-30 table-mg-t-pro-n">
                            <div class="single-review-st-hd">
                                <h2>Reviews</h2>
                            </div>
                            <div class="single-review-st-text">
                                <img src="img/notification/1.jpg" alt="">
                                <div class="review-ctn-hf">
                                    <h3>Sarah Graves</h3>
                                    <p>Highly recommend</p>
                                </div>
                                <div class="review-item-rating">
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star-half"></i>
                                </div>
                            </div>
                            <div class="single-review-st-text">
                                <img src="img/notification/2.jpg" alt="">
                                <div class="review-ctn-hf">
                                    <h3>Garbease sha</h3>
                                    <p>Awesome Pro</p>
                                </div>
                                <div class="review-item-rating">
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star-half"></i>
                                </div>
                            </div>
                            <div class="single-review-st-text">
                                <img src="img/notification/3.jpg" alt="">
                                <div class="review-ctn-hf">
                                    <h3>Gobetro pro</h3>
                                    <p>Great Website</p>
                                </div>
                                <div class="review-item-rating">
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star-half"></i>
                                </div>
                            </div>
                            <div class="single-review-st-text">
                                <img src="img/notification/4.jpg" alt="">
                                <div class="review-ctn-hf">
                                    <h3>Siam Graves</h3>
                                    <p>That's Good</p>
                                </div>
                                <div class="review-item-rating">
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star-half"></i>
                                </div>
                            </div>
                            <div class="single-review-st-text">
                                <img src="img/notification/5.jpg" alt="">
                                <div class="review-ctn-hf">
                                    <h3>Sarah Graves</h3>
                                    <p>Highly recommend</p>
                                </div>
                                <div class="review-item-rating">
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star-half"></i>
                                </div>
                            </div>
                            <div class="single-review-st-text">
                                <img src="img/notification/6.jpg" alt="">
                                <div class="review-ctn-hf">
                                    <h3>Julsha Grav</h3>
                                    <p>Sei Hoise bro</p>
                                </div>
                                <div class="review-item-rating">
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star"></i>
                                    <i class="educate-icon educate-star-half"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                        <div class="single-product-item res-mg-t-30 table-mg-t-pro-n tb-sm-res-d-n dk-res-t-d-n">
                            <div class="single-product-image">
                                <a href="#"><img src="img/product/book-4.jpg" alt=""></a>
                            </div>
                            <div class="single-product-text edu-pro-tx">
                                <h4><a href="#">Title Demo Here</a></h4>
                                <h5>Lorem ipsum dolor sit amet, this is a consec tetur adipisicing elit</h5>
                                <div class="product-price">
                                    <h3>$45</h3>
                                    <div class="single-item-rating">
                                        <i class="educate-icon educate-star"></i>
                                        <i class="educate-icon educate-star"></i>
                                        <i class="educate-icon educate-star"></i>
                                        <i class="educate-icon educate-star"></i>
                                        <i class="educate-icon educate-star-half"></i>
                                    </div>
                                </div>
                                <div class="product-buttons">
                                    <button type="button" class="button-default cart-btn">Read More</button>
                                    <button type="button" class="button-default"><i class="fa fa-heart"></i></button>
                                    <button type="button" class="button-default"><i class="fa fa-share"></i></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="product-sales-area mg-tb-30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-9 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-sales-chart">
                            <div class="portlet-title">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="caption pro-sl-hd">
                                            <span class="caption-subject"><b>Adminsion Statistic</b></span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="actions graph-rp actions-graph-rp">
                                            <a href="#" class="btn btn-dark btn-circle active tip-top" data-toggle="tooltip" title="Refresh">
													<i class="fa fa-reply" aria-hidden="true"></i>
												</a>
                                            <a href="#" class="btn btn-blue-grey btn-circle active tip-top" data-toggle="tooltip" title="Delete">
													<i class="fa fa-trash-o" aria-hidden="true"></i>
												</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <ul class="list-inline cus-product-sl-rp">
                                <li>
                                    <h5><i class="fa fa-circle" style="color: #006DF0;"></i>Python</h5>
                                </li>
                                <li>
                                    <h5><i class="fa fa-circle" style="color: #933EC5;"></i>PHP</h5>
                                </li>
                                <li>
                                    <h5><i class="fa fa-circle" style="color: #65b12d;"></i>Java</h5>
                                </li>
                            </ul>
                            <div id="morris-area-chart"></div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                        <div class="analysis-progrebar res-mg-t-30 mg-ub-10 res-mg-b-30 table-mg-t-pro-n tb-sm-res-d-n dk-res-t-d-n">
                            <div class="analysis-progrebar-content">
                                <h5>Usage</h5>
                                <h2 class="storage-right"><span class="counter">90</span>%</h2>
                                <div class="progress progress-mini ug-1">
                                    <div style="width: 68%;" class="progress-bar"></div>
                                </div>
                                <div class="m-t-sm small">
                                    <p>Server down since 1:32 pm.</p>
                                </div>
                            </div>
                        </div>
                        <div class="analysis-progrebar reso-mg-b-30 res-mg-b-30 mg-ub-10 tb-sm-res-d-n dk-res-t-d-n">
                            <div class="analysis-progrebar-content">
                                <h5>Memory</h5>
                                <h2 class="storage-right"><span class="counter">70</span>%</h2>
                                <div class="progress progress-mini ug-2">
                                    <div style="width: 78%;" class="progress-bar"></div>
                                </div>
                                <div class="m-t-sm small">
                                    <p>Server down since 12:32 pm.</p>
                                </div>
                            </div>
                        </div>
                        <div class="analysis-progrebar reso-mg-b-30 res-mg-b-30 res-mg-t-30 mg-ub-10 tb-sm-res-d-n dk-res-t-d-n">
                            <div class="analysis-progrebar-content">
                                <h5>Data</h5>
                                <h2 class="storage-right"><span class="counter">50</span>%</h2>
                                <div class="progress progress-mini ug-3">
                                    <div style="width: 38%;" class="progress-bar progress-bar-danger"></div>
                                </div>
                                <div class="m-t-sm small">
                                    <p>Server down since 8:32 pm.</p>
                                </div>
                            </div>
                        </div>
                        <div class="analysis-progrebar res-mg-t-30 table-dis-n-pro tb-sm-res-d-n dk-res-t-d-n">
                            <div class="analysis-progrebar-content">
                                <h5>Space</h5>
                                <h2 class="storage-right"><span class="counter">40</span>%</h2>
                                <div class="progress progress-mini ug-4">
                                    <div style="width: 28%;" class="progress-bar progress-bar-danger"></div>
                                </div>
                                <div class="m-t-sm small">
                                    <p>Server down since 5:32 pm.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="courses-area mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12">
                        <div class="white-box">
                            <h3 class="box-title">Browser Status</h3>
                            <ul class="basic-list">
                                <li>Google Chrome <span class="pull-right label-danger label-1 label">95.8%</span></li>
                                <li>Mozila Firefox <span class="pull-right label-purple label-2 label">85.8%</span></li>
                                <li>Apple Safari <span class="pull-right label-success label-3 label">23.8%</span></li>
                                <li>Internet Explorer <span class="pull-right label-info label-4 label">55.8%</span></li>
                                <li>Opera mini <span class="pull-right label-warning label-5 label">28.8%</span></li>
                                <li>Mozila Firefox <span class="pull-right label-purple label-6 label">26.8%</span></li>
                                <li>Safari <span class="pull-right label-purple label-7 label">31.8%</span></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12">
                        <div class="white-box res-mg-t-30 table-mg-t-pro-n">
                            <h3 class="box-title">Visits from countries</h3>
                            <ul class="country-state">
                                <li>
                                    <h2><span class="counter">1250</span></h2> <small>From Australia</small>
                                    <div class="pull-right">75% <i class="fa fa-level-up text-danger ctn-ic-1"></i></div>
                                    <div class="progress">
                                        <div class="progress-bar progress-bar-danger ctn-vs-1" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:75%;"> <span class="sr-only">75% Complete</span></div>
                                    </div>
                                </li>
                                <li>
                                    <h2><span class="counter">1050</span></h2> <small>From USA</small>
                                    <div class="pull-right">48% <i class="fa fa-level-up text-success ctn-ic-2"></i></div>
                                    <div class="progress">
                                        <div class="progress-bar progress-bar-info ctn-vs-2" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:48%;"> <span class="sr-only">48% Complete</span></div>
                                    </div>
                                </li>
                                <li>
                                    <h2><span class="counter">6350</span></h2> <small>From Canada</small>
                                    <div class="pull-right">55% <i class="fa fa-level-up text-success ctn-ic-3"></i></div>
                                    <div class="progress">
                                        <div class="progress-bar progress-bar-success ctn-vs-3" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:55%;"> <span class="sr-only">55% Complete</span></div>
                                    </div>
                                </li>
                                <li>
                                    <h2><span class="counter">950</span></h2> <small>From India</small>
                                    <div class="pull-right">33% <i class="fa fa-level-down text-success ctn-ic-4"></i></div>
                                    <div class="progress">
                                        <div class="progress-bar progress-bar-success ctn-vs-4" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:33%;"> <span class="sr-only">33% Complete</span></div>
                                    </div>
                                </li>
                                <li>
                                    <h2><span class="counter">3250</span></h2> <small>From Bangladesh</small>
                                    <div class="pull-right">60% <i class="fa fa-level-up text-success ctn-ic-5"></i></div>
                                    <div class="progress">
                                        <div class="progress-bar progress-bar-inverse ctn-vs-5" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:60%;"> <span class="sr-only">60% Complete</span></div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                        <div class="courses-inner res-mg-t-30 table-mg-t-pro-n tb-sm-res-d-n dk-res-t-d-n">
                            <div class="courses-title">
                                <a href="#"><img src="img/courses/1.jpg" alt="" /></a>
                                <h2>Apps Development</h2>
                            </div>
                            <div class="courses-alaltic">
                                <span class="cr-ic-r"><span class="course-icon"><i class="fa fa-clock"></i></span> 1 Year</span>
                                <span class="cr-ic-r"><span class="course-icon"><i class="fa fa-heart"></i></span> 50</span>
                                <span class="cr-ic-r"><span class="course-icon"><i class="fa fa-dollar"></i></span> 500</span>
                            </div>
                            <div class="course-des">
                                <p><span><i class="fa fa-clock"></i></span> <b>Duration:</b> 6 Months</p>
                                <p><span><i class="fa fa-clock"></i></span> <b>Professor:</b> Jane Doe</p>
                                <p><span><i class="fa fa-clock"></i></span> <b>Students:</b> 100+</p>
                            </div>
                            <div class="product-buttons">
                                <button type="button" class="button-default cart-btn">Read More</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-copyright-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer-copy-right">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- jquery
		============================================ -->
    <script src="js/vendor/jquery-1.12.4.min.js"></script>
    <!-- bootstrap JS
		============================================ -->
    <script src="js/bootstrap.min.js"></script>
    <!-- wow JS
		============================================ -->
    <script src="js/wow.min.js"></script>
    <!-- price-slider JS
		============================================ -->
    <script src="js/jquery-price-slider.js"></script>
    <!-- meanmenu JS
		============================================ -->
    <script src="js/jquery.meanmenu.js"></script>
    <!-- owl.carousel JS
		============================================ -->
    <script src="js/owl.carousel.min.js"></script>
    <!-- sticky JS
		============================================ -->
    <script src="js/jquery.sticky.js"></script>
    <!-- scrollUp JS
		============================================ -->
    <script src="js/jquery.scrollUp.min.js"></script>
    <!-- counterup JS
		============================================ -->
    <script src="js/counterup/jquery.counterup.min.js"></script>
    <script src="js/counterup/waypoints.min.js"></script>
    <script src="js/counterup/counterup-active.js"></script>
    <!-- mCustomScrollbar JS
		============================================ -->
    <script src="js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/scrollbar/mCustomScrollbar-active.js"></script>
    <!-- metisMenu JS
		============================================ -->
    <script src="js/metisMenu/metisMenu.min.js"></script>
    <script src="js/metisMenu/metisMenu-active.js"></script>
    <!-- morrisjs JS
		============================================ -->
    <script src="js/morrisjs/raphael-min.js"></script>
    <script src="js/morrisjs/morris.js"></script>
    <script src="js/morrisjs/morris-active.js"></script>
    <!-- morrisjs JS
		============================================ -->
    <script src="js/sparkline/jquery.sparkline.min.js"></script>
    <script src="js/sparkline/jquery.charts-sparkline.js"></script>
    <script src="js/sparkline/sparkline-active.js"></script>
    <!-- calendar JS
		============================================ -->
    <script src="js/calendar/moment.min.js"></script>
    <script src="js/calendar/fullcalendar.min.js"></script>
    <script src="js/calendar/fullcalendar-active.js"></script>
    <!-- plugins JS
		============================================ -->
    <script src="js/plugins.js"></script>
    <!-- main JS
		============================================ -->
    <script src="js/main.js"></script>
    <!-- tawk chat JS
		============================================ -->
    <script src="js/tawk-chat.js"></script>
</body>

</html>