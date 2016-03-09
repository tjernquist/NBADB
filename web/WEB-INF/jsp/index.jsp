<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Business 2</title>

        <spring:url value="/resources/css/main.css" var="mainCss" />
        <spring:url value="/resources/css/bootstrap.css" var="boot" />
        <spring:url value="/resources/css/custom.css" var="custom" />
        <spring:url value="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" var="font" />


        <link href="${boot}" rel="stylesheet" />
        <link href="${font}" rel="stylesheet" />
        <link href="${custom}" rel="stylesheet" />

        <!-- jQuery -->
        <script type="text/javascript" src="http://localhost:8080/SpringExampleMVC/resources/js/jquery-1.11.3.min.js" /></script>
    <script type="text/javascript" src="http://localhost:8080/SpringExampleMVC/resources/js/bootstrap.min.js"/>"></script>


</head>
<body id="homepage">

    <!-- Navigation -->
    <nav id="siteNav" class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Logo and responsive toggle -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <span class="glyphicon glyphicon-fire"></span> 
                    LOGO
                </a>
            </div>
            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="navbar">
                <ul class="nav navbar-nav navbar-right">
                    <li class="active">
                        <a href="#">Home</a>
                    </li>
                    <li>
                        <a href="#">Daily Leaders</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Teams<span class="caret"></span></a>
                        <ul class="dropdown-menu" aria-labelledby="about-us">
                            <li><a href="">Todo</a></li>
                            <li><a href="#">Todo</a></li>
                            <li><a href="#">Todo</a></li>
                        </ul>
                    </li>

                </ul>

            </div><!-- /.navbar-collapse -->
        </div><!-- /.container -->
    </nav>

    <!-- Header -->
    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1>Nbadb</h1>
                <p>Prototype</p>
            </div>

        </div>

        <div class="container-fluid">
            <div class="row promo">
                <a href="http://localhost:8080/SpringExampleMVC/Player/201933">
                    <div class="col-md-4 promo-item item-1">
                        <h3>
                            Player
                            <!--</h3>-->
                    </div>
                </a>
                <a href="http://localhost:8080/SpringExampleMVC/Game/0011500001">
                    <div class="col-md-4 promo-item item-2">
                        <h3>
                            Game
                        </h3>
                    </div>
                </a>

                <a href="http://localhost:8080/SpringExampleMVC/Team/1610612742">
                    <div class="col-md-4 promo-item item-3">
                        <h3>
                            Team
                        </h3>
                    </div>
                </a>
            </div>
        </div><!-- /.container-fluid -->
    </header>



</body>
</html>