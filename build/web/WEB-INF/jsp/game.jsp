<%@page import="java.util.Map"%>
<%@page import="nbadb.player.Player"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Business 2</title>

        <spring:url value="/resources/css/bootstrap.css" var="bootmin" />
        <spring:url value="/resources/css/custom.css" var="custom" />
        <spring:url value="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" var="font" />


        <link href="${font}" rel="stylesheet" />
        <link href="${bootmin}" rel="stylesheet" />
        <link href="${custom}" rel="stylesheet" />

        <!-- jQuery -->
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
<body id="game" >

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
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Final Scores<span class="caret"></span></a>
                        <ul class="dropdown-menu" aria-labelledby="about-us">
                            <table id="myDummyTable" class="tablesorter" >
                                <thead>
                                    <tr>
                                        <th>Team</th>
                                        <th>Q1</th>
                                        <th>Q2</th>
                                        <th>Q3</th>
                                        <th>Q4</th>
                                        <th>OT1</th>
                                        <th>OT2</th>
                                        <th>OT3</th>
                                        <th>TOT</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${gameboxscore}" var="gameboxscore">

                                        <tr>
                                            <td>${gameboxscore.teamAbbreviation}</td>
                                            <td>${gameboxscore.q1Points}</td>
                                            <td>${gameboxscore.q2Points}</td>
                                            <td>${gameboxscore.q3Points}</td>
                                            <td>${gameboxscore.q4Points}</td>
                                            <td>${gameboxscore.ot1Points}</td>
                                            <td>${gameboxscore.ot2Points}</td>
                                            <td>${gameboxscore.ot3Points}</td>
                                            <td>${gameboxscore.totalPoints}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Player Boxscores <span class="caret"></span></a>
                        <ul class="dropdown-menu" aria-labelledby="about-us">
                            <table id="myDummyTable1" class="tablesorter">
                                <thead>
                                    <tr>
                                        <th>Player Name</th>
                                        <th>Team</th>
                                        <th>Minutes Played</th>
                                        <th>FGA</th>
                                        <th>FGM</th>
                                        <th>FG%</th>
                                        <th>FG3M</th>
                                        <th>FGAM%</th>
                                        <th>FG3%</th>
                                        <th>FTM</th>
                                        <th>FTA</th>
                                        <th>FT%</th>
                                        <th>Reb</th>
                                        <th>Ast</th>
                                        <th>Stl</th>
                                        <th>Blk</th>
                                        <th>TO</th>
                                        <th>Pfs</th>
                                        <th>Pts</th>

                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${playerboxscore}" var="playerboxscore">
                                        <tr>
                                            <td> <a href="http://localhost:8080/SpringExampleMVC/Player/${playerboxscore.playerID}"/>
                                                ${playerboxscore.playerName}</td>
                                            <td>${playerboxscore.teamAbbreviation}</td>
                                            <td>${playerboxscore.minutesPlayed}</td>
                                            <td>${playerboxscore.fga}</td>
                                            <td>${playerboxscore.fgm}</td>
                                            <td>${playerboxscore.fgPct}</td>
                                            <td>${playerboxscore.fg3m}</td>
                                            <td>${playerboxscore.fg3a}</td>
                                            <td>${playerboxscore.fg3PCt}</td>
                                            <td>${playerboxscore.ftm}</td>
                                            <td>${playerboxscore.fta}</td>
                                            <td>${playerboxscore.ftPct}</td>
                                            <td>${playerboxscore.reb}</td>
                                            <td>${playerboxscore.ast}</td>
                                            <td>${playerboxscore.stl}</td>
                                            <td>${playerboxscore.blk}</td>
                                            <td>${playerboxscore.to}</td>
                                            <td>${playerboxscore.pf}</td>
                                            <td>${playerboxscore.pts}</td>

                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
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
    <header>

        <div class="header-content">
            <div class="header-content-inner">
                <h1>${gameheader.gamecode}</p></h1>
            </div>
        </div>
    </header>


</body>
</html>
