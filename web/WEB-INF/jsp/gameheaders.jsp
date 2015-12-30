
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<?xml version="1.0" encoding="UTF-8"?>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Business 2</title>

        <spring:url value="/resources/css/bootstrap.min.css" var="bootmin" />
        <spring:url value="/resources/css/customTeam.css" var="custom" />
        <spring:url value="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" var="font" />
        <link href="${font}" rel="stylesheet" />
        <link href="${bootmin}" rel="stylesheet" />
        <link href="${custom}" rel="stylesheet" />

        <script type="text/javascript" src="/SpringExampleMVC/resources/js/jquery-1.11.3.min.js" /></script>
    <script type="text/javascript" src="/SpringExampleMVC/resources/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.9.1/jquery.tablesorter.min.js"></script>

<script>
    $(function () {
        $("#myDummyTable").tablesorter({widgets: ['zebra']});
        $("#myDummyTable1").tablesorter({widgets: ['zebra']});
    });
</script>

</head>
<body id="team" >
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
                        <a href="http://localhost:8080/SpringExampleMVC/">Home</a>
                    </li>
                    <li>
                        <a href="#">Products</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Roster<span class="caret"></span></a>
                        <ul class="dropdown-menu" aria-labelledby="about-us">

                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Last 10 Games <span class="caret"></span></a>
                        <ul class="dropdown-menu" aria-labelledby="about-us">
                            <div class="header-content">
                                <div class="header-content-inner">
                                    <c:forEach begin="1" end= "10" items="${gameheader}" var="gameheader">
                                        <a href="http://localhost:8080/SpringExampleMVC/Game/${gameheader.gameID}">
                                            <div class="col-md-4 promo-item item-1">
                                                <h3>
                                                    ${gameheader.gamecode}
                                                </h3>
                                            </div>
                                        </a>
                                    </c:forEach>

                                </div>
                            </div>
                        </ul>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>
        </div><!-- /.container -->
    </nav>



    <!-- Header -->
    <div class="header-content">
        <div class="header-content-inner">
            <h1></h1>

            </h3>




        </div>
    </div>


</body>
</html>

