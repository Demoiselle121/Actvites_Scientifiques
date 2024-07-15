<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Add axe de recherche d'une equipe |Bachelor - Bachelor Admin </title>
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
    <!-- ow
    l.carousel CSS
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
    <!-- forms CSS
		============================================ -->
    <link rel="stylesheet" href="css/form/all-type-forms.css">
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
                                 
                                 
								 <li><a href="professor-profile.jsp">Profil des chercheurs</a> </li>
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
                                                <li><a href="addAxeR.php">Ajouter un axe</a>
                                                </li>
                                                
                            </ul>
                        </li>
                        <li class="active">
                            <a class="has-arrow" href="all-courses.jsp" aria-expanded="false"><span class="educate-icon educate-department icon-wrap"></span> <span class="mini-click-non">Axe Labo</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                               <li><a href="allAxeRLabo.php">Liste des axes</a>
                                                </li>
                                                <li><a href="addAxeRLabo.php">Ajouter un axe</a>
                                                </li>
                                                <li><a href="edit-axeRLabo.jsp">Modifier un axe</a>
                                                </li>
                                                <li><a href="delete-axeRLabo.jsp">Supprimer un axe</a>
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
                                                <li><a href="addLabo.php">Ajouter un Labo</a>
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
                            <a class="has-arrow" href="mailbox.jsp" aria-expanded="false"><span class="educate-icon educate-interface icon-wrap"></span> <span class="mini-click-non">Interface</span></a>
                            <ul class="submenu-angle interface-mini-nb-dp" aria-expanded="false">
                              <li><a href="google-map.jsp">Google Map</a>
                                                </li>
                                                <li><a href="data-maps.jsp">Data Maps</a>
                                                </li>
                                                <li><a href="pdf-viewer.jsp">Pdf Viewer</a>
                                                </li>
                                                <li><a href="x-editable.jsp">X-Editable</a>
                                                </li>
                                                <li><a href="code-editor.jsp">Code Editor</a>
                                                </li>
                                                <li><a href="tree-view.jsp">Tree View</a>
                                                </li>
                                                <li><a href="preloader.jsp">Preloader</a>
                                                </li>
                                                <li><a href="images-cropper.jsp">Images Cropper</a>
                                                </li>
                            </ul>
                        </li>
                        <li>
                            <a class="has-arrow" href="mailbox.jsp" aria-expanded="false"><span class="educate-icon educate-charts icon-wrap"></span> <span class="mini-click-non">Charts</span></a>
                            <ul class="submenu-angle chart-mini-nb-dp" aria-expanded="false">
                                <li><a title="Bar Charts" href="bar-charts.jsp"><span class="mini-sub-pro">Bar Charts</span></a></li>
                                <li><a title="Line Charts" href="line-charts.jsp"><span class="mini-sub-pro">Line Charts</span></a></li>
                                <li><a title="Area Charts" href="area-charts.jsp"><span class="mini-sub-pro">Area Charts</span></a></li>
                                <li><a title="Rounded Charts" href="rounded-chart.jsp"><span class="mini-sub-pro">Rounded Charts</span></a></li>
                                <li><a title="C3 Charts" href="c3.jsp"><span class="mini-sub-pro">C3 Charts</span></a></li>
                                <li><a title="Sparkline Charts" href="sparkline.jsp"><span class="mini-sub-pro">Sparkline Charts</span></a></li>
                                <li><a title="Peity Charts" href="peity.jsp"><span class="mini-sub-pro">Peity Charts</span></a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="has-arrow" href="mailbox.jsp" aria-expanded="false"><span class="educate-icon educate-data-table icon-wrap"></span> <span class="mini-click-non">Data Tables</span></a>
                            <ul class="submenu-angle" aria-expanded="false">
                                <li><a title="Peity Charts" href="static-table.jsp"><span class="mini-sub-pro">Static Table</span></a></li>
                                <li><a title="Data Table" href="data-table.jsp"><span class="mini-sub-pro">Data Table</span></a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="has-arrow" href="mailbox.jsp" aria-expanded="false"><span class="educate-icon educate-form icon-wrap"></span> <span class="mini-click-non">Forms Elements</span></a>
                            <ul class="submenu-angle form-mini-nb-dp" aria-expanded="false">
                                <li><a title="Basic Form Elements" href="basic-form-element.jsp"><span class="mini-sub-pro">Bc Form Elements</span></a></li>
                                <li><a title="Advance Form Elements" href="advance-form-element.jsp"><span class="mini-sub-pro">Ad Form Elements</span></a></li>
                                <li><a title="Password Meter" href="password-meter.jsp"><span class="mini-sub-pro">Password Meter</span></a></li>
                                <li><a title="Multi Upload" href="multi-upload.jsp"><span class="mini-sub-pro">Multi Upload</span></a></li>
                                <li><a title="Text Editor" href="tinymc.jsp"><span class="mini-sub-pro">Text Editor</span></a></li>
                                <li><a title="Dual List Box" href="dual-list-box.jsp"><span class="mini-sub-pro">Dual List Box</span></a></li>
                            </ul>
                        </li>
                        
                        <li id="removable">
                            <a class="has-arrow" href="#" aria-expanded="false"><span class="educate-icon educate-pages icon-wrap"></span> <span class="mini-click-non">Pages</span></a>
                            <ul class="submenu-angle page-mini-nb-dp" aria-expanded="false">
                                <li><a title="Login" href="login.jsp"><span class="mini-sub-pro">Login</span></a></li>
                                <li><a title="Register" href="register.jsp"><span class="mini-sub-pro">Register</span></a></li>
                                <li><a title="Lock" href="lock.jsp"><span class="mini-sub-pro">Lock</span></a></li>
                                <li><a title="Password Recovery" href="password-recovery.jsp"><span class="mini-sub-pro">Password Recovery</span></a></li>
                                <li><a title="404 Page" href="404.jsp"><span class="mini-sub-pro">404 Page</span></a></li>
                                <li><a title="500 Page" href="500.jsp"><span class="mini-sub-pro">500 Page</span></a></li>
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
                                                        
                                                        <li><a href="#"><span class="edu-icon edu-locked author-log-ic"></span>Log Out</a>
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
                                                <li><a href="edit-professor.jsp">Mofidier un chercheur</a>
                                                </li>
                                                <li><a href="professor-profile.jsp">Profil des chercheurs</a>
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
                                                <li><a href="all-axeR.jsp">Tous les axes</a>
                                                </li>
                                                <li><a href="add-axeR.jsp">Ajouter un axe</a>
                                                </li>       
                                            </ul>
                                        </li>
                                        <li><a data-toggle="collapse" data-target="#demodepart" href="#">Axe recherche Labo <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demodepart" class="collapse dropdown-header-top">
                                                <li><a href="allAxeRLabo.php">Tous les axes</a>
                                                </li>
                                                <li><a href="addAxeRLabo.php">Ajouter un axe</a>
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
                                                <li><a href="addLabo.php">Ajouter un labo</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </li>
                                        
                                         <li><a data-toggle="collapse" data-target="#demodepart" href="#">Projet de recherche<span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="demodepart" class="collapse dropdown-header-top">
                                                <li><a href="allProjetrecherche.php">Liste des projets</a>
                                                </li>
                                              
                                            </ul>
                                        </li>
                                       
                                        <li><a data-toggle="collapse" data-target="#Miscellaneousmob" href="#">Interface <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                            <ul id="Miscellaneousmob" class="collapse dropdown-header-top">
                                                <li><a href="google-map.jsp">Google Map</a>
                                                </li>
                                                <li><a href="data-maps.jsp">Data Maps</a>
                                                </li>
                                                <li><a href="pdf-viewer.jsp">Pdf Viewer</a>
                                                </li>
                                                <li><a href="x-editable.jsp">X-Editable</a>
                                                </li>
                                                <li><a href="code-editor.jsp">Code Editor</a>
                                                </li>
                                                <li><a href="tree-view.jsp">Tree View</a>
                                                </li>
                                                <li><a href="preloader.jsp">Preloader</a>
                                                </li>
                                                <li><a href="images-cropper.jsp">Images Cropper</a>
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
                            <div class="breadcome-list single-page-breadcome">
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
                                            <li><a href="index.jsp">Home</a> <span class="bread-slash">/</span>
                                            </li>
                                            <li><span class="bread-blod">Add Department</span>
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
        <!--  ************************************************************************************************************************ -->
        <!-- Single pro tab review Start-->
        <div class="single-pro-review-area mt-t-30 mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-payment-inner-st">
                            <ul id="myTabedu1" class="tab-review-design">
                                <li class="active"><a href="#description">Ajouter axe de recherche</a></li>
                                  
                            </ul>
                            <div id="myTabContent" class="tab-content custom-product-edit">
                                <div class="product-tab-list tab-pane fade active in" id="description">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="review-content-section">
                                                
                                                    <div class="row">
                                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                           <div class="position-relative row form-group"><label for="exampleEmail" class="col-sm-2 col-form-label">annee de la publication</label>
                                                <div class="col-sm-10"><input name ="d" type="text" class="mb-2 form-control-lg form-control"></div>
                                            </div>
                                                        </div>
                                                        
                                                    </div>
                                                    <a href ="pdfPubDate.php">
                                                                    <button type="submit" class="btn btn-primary waves-effect waves-light">PDF</button>
                                                                  </a>
                                                    
                                                     <div class="row">
                                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                           <div class="position-relative row form-group"><label for="exampleEmail" class="col-sm-2 col-form-label">chercheur</label>
                                                <div class="col-sm-10"><input name ="id_chercheur type="text" class="mb-2 form-control-lg form-control"></div>
                                            </div>
                                                        </div>
                                                        
                                                    </div>
                                                   <a href ="word1.php">
                                                                    <button type="submit" class="btn btn-primary waves-effect waves-light">PDF</button>
                                                                  </a>
                                                
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="footer-copyright-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
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
    <script src="js/sparkline/jquery.sparkline.min.js"></script>
    <script src="js/sparkline/jquery.charts-sparkline.js"></script>
    <!-- calendar JS
		============================================ -->
    <script src="js/calendar/moment.min.js"></script>
    <script src="js/calendar/fullcalendar.min.js"></script>
    <script src="js/calendar/fullcalendar-active.js"></script>
    <!-- form validate JS
		============================================ -->
    <script src="js/form-validation/jquery.form.min.js"></script>
    <script src="js/form-validation/jquery.validate.min.js"></script>
    <script src="js/form-validation/form-active.js"></script>
    <!-- tab JS
		============================================ -->
    <script src="js/tab.js"></script>
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