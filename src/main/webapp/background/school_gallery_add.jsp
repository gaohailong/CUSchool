﻿<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    request.setAttribute("basePath", basePath);
%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>添加图片</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- STYLESHEETS --><!--[if lt IE 9]>
    <script src="js/flot/excanvas.min.js"></script>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
    <link rel="stylesheet" type="text/css" href="css/cloud-admin.css">
    <link rel="stylesheet" type="text/css" href="css/responsive.css">

    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- ANIMATE -->
    <link rel="stylesheet" type="text/css" href="css/animatecss/animate.min.css"/>
    <!-- COLORBOX -->
    <link rel="stylesheet" type="text/css" href="js/colorbox/colorbox.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/cloud-admin.css" >
    <link rel="stylesheet" type="text/css"  href="css/themes/default.css" id="skin-switcher" >
    <link rel="stylesheet" type="text/css"  href="css/responsive.css" >
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- UNIFORM -->
    <link rel="stylesheet" type="text/css" href="js/uniform/css/uniform.default.min.css" />
    <!-- JQUERY UPLOAD -->
    <!-- blueimp Gallery styles -->
    <link rel="stylesheet" href="js/blueimp/gallery/blueimp-gallery.min.css">
    <!-- JQUERY -->
    <script src="js/jquery/jquery-2.0.3.min.js"></script>
</head>
<body>
<!-- HEADER -->
<header class="navbar clearfix" id="header">
    <div class="container">
        <div class="navbar-brand">
            <!-- COMPANY LOGO -->
            <a href="index.html">
                <img src="img/logo/logo.png" alt="Cloud Admin Logo" class="img-responsive">
            </a>
            <!-- /COMPANY LOGO -->
            <!-- TEAM STATUS FOR MOBILE -->
            <div class="visible-xs">
                <a href="#" class="team-status-toggle switcher btn dropdown-toggle">
                    <i class="fa fa-users"></i>
                </a>
            </div>
            <!-- /TEAM STATUS FOR MOBILE -->
            <!-- SIDEBAR COLLAPSE -->
            <div id="sidebar-collapse" class="sidebar-collapse btn">
                <i class="fa fa-bars"
                   data-icon1="fa fa-bars"
                   data-icon2="fa fa-bars"></i>
            </div>
            <!-- /SIDEBAR COLLAPSE -->
        </div>
        <!-- NAVBAR LEFT -->
        <ul class="nav navbar-nav pull-left hidden-xs" id="navbar-left">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-cog"></i>
                    <span class="name">皮肤</span>
                    <i class="fa fa-angle-down"></i>
                </a>
                <ul class="dropdown-menu skins">
                    <li class="dropdown-title">
                        <span><i class="fa fa-leaf"></i> Theme Skins</span>
                    </li>
                    <li><a href="#" data-skin="default">Subtle (default)</a></li>
                    <li><a href="#" data-skin="night">Night</a></li>
                    <li><a href="#" data-skin="earth">Earth</a></li>
                    <li><a href="#" data-skin="utopia">Utopia</a></li>
                    <li><a href="#" data-skin="nature">Nature</a></li>
                    <li><a href="#" data-skin="graphite">Graphite</a></li>
                </ul>
            </li>
        </ul>
        <!-- /NAVBAR LEFT -->
        <!-- BEGIN TOP NAVIGATION MENU -->
        <ul class="nav navbar-nav pull-right">
            <li><a href="logOutLogin.action" style="color: #fff; margin-left: 200px;">退出</a></li>
            <!-- BEGIN USER LOGIN DROPDOWN -->
            <%--<li class="dropdown user" id="header-user">--%>
                <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">--%>
                    <%--<img alt="" src="img/avatars/avatar3.jpg"/>--%>
                    <%--<span class="username">John Doe</span>--%>
                    <%--<i class="fa fa-angle-down"></i>--%>
                <%--</a>--%>
                <%--<ul class="dropdown-menu">--%>
                    <%--<li><a href="login.jsp"><i class="fa fa-power-off"></i> Log Out</a></li>--%>
                <%--</ul>--%>
            <%--</li>--%>
            <!-- END USER LOGIN DROPDOWN -->
        </ul>
        <!-- END TOP NAVIGATION MENU -->
    </div>

    <!-- TEAM STATUS -->
    <%--<div class="container team-status" id="team-status">--%>
        <%--<div id="scrollbar">--%>
            <%--<div class="handle">--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div id="teamslider">--%>
            <%--<ul class="team-list">--%>
                <%--<li class="current">--%>
                    <%--<a href="javascript:void(0);">--%>
				  <%--<span class="image">--%>
					  <%--<img src="img/avatars/avatar3.jpg" alt=""/>--%>
				  <%--</span>--%>
                        <%--<span class="title">--%>
					<%--You--%>
				  <%--</span>--%>
                        <%--<div class="progress">--%>
                            <%--<div class="progress-bar progress-bar-success" style="width: 35%">--%>
                                <%--<span class="sr-only">35% Complete (success)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-warning" style="width: 20%">--%>
                                <%--<span class="sr-only">20% Complete (warning)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-danger" style="width: 10%">--%>
                                <%--<span class="sr-only">10% Complete (danger)</span>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<span class="status">--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-green">6</span> completed--%>
							<%--<span class="pull-right fa fa-check"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-orange">3</span> in-progress--%>
							<%--<span class="pull-right fa fa-adjust"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-red">1</span> pending--%>
							<%--<span class="pull-right fa fa-list-ul"></span>--%>
						<%--</div>--%>
				    <%--</span>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="javascript:void(0);">--%>
				  <%--<span class="image">--%>
					  <%--<img src="img/avatars/avatar1.jpg" alt=""/>--%>
				  <%--</span>--%>
                        <%--<span class="title">--%>
					<%--Max Doe--%>
				  <%--</span>--%>
                        <%--<div class="progress">--%>
                            <%--<div class="progress-bar progress-bar-success" style="width: 15%">--%>
                                <%--<span class="sr-only">35% Complete (success)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-warning" style="width: 40%">--%>
                                <%--<span class="sr-only">20% Complete (warning)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-danger" style="width: 20%">--%>
                                <%--<span class="sr-only">10% Complete (danger)</span>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<span class="status">--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-green">2</span> completed--%>
							<%--<span class="pull-right fa fa-check"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-orange">8</span> in-progress--%>
							<%--<span class="pull-right fa fa-adjust"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-red">4</span> pending--%>
							<%--<span class="pull-right fa fa-list-ul"></span>--%>
						<%--</div>--%>
				    <%--</span>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="javascript:void(0);">--%>
				  <%--<span class="image">--%>
					  <%--<img src="img/avatars/avatar2.jpg" alt=""/>--%>
				  <%--</span>--%>
                        <%--<span class="title">--%>
					<%--Jane Doe--%>
				  <%--</span>--%>
                        <%--<div class="progress">--%>
                            <%--<div class="progress-bar progress-bar-success" style="width: 65%">--%>
                                <%--<span class="sr-only">35% Complete (success)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-warning" style="width: 10%">--%>
                                <%--<span class="sr-only">20% Complete (warning)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-danger" style="width: 15%">--%>
                                <%--<span class="sr-only">10% Complete (danger)</span>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<span class="status">--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-green">10</span> completed--%>
							<%--<span class="pull-right fa fa-check"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-orange">3</span> in-progress--%>
							<%--<span class="pull-right fa fa-adjust"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-red">4</span> pending--%>
							<%--<span class="pull-right fa fa-list-ul"></span>--%>
						<%--</div>--%>
				    <%--</span>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="javascript:void(0);">--%>
				  <%--<span class="image">--%>
					  <%--<img src="img/avatars/avatar4.jpg" alt=""/>--%>
				  <%--</span>--%>
                        <%--<span class="title">--%>
					<%--Ellie Doe--%>
				  <%--</span>--%>
                        <%--<div class="progress">--%>
                            <%--<div class="progress-bar progress-bar-success" style="width: 5%">--%>
                                <%--<span class="sr-only">35% Complete (success)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-warning" style="width: 48%">--%>
                                <%--<span class="sr-only">20% Complete (warning)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-danger" style="width: 27%">--%>
                                <%--<span class="sr-only">10% Complete (danger)</span>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<span class="status">--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-green">1</span> completed--%>
							<%--<span class="pull-right fa fa-check"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-orange">6</span> in-progress--%>
							<%--<span class="pull-right fa fa-adjust"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-red">2</span> pending--%>
							<%--<span class="pull-right fa fa-list-ul"></span>--%>
						<%--</div>--%>
				    <%--</span>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="javascript:void(0);">--%>
				  <%--<span class="image">--%>
					  <%--<img src="img/avatars/avatar5.jpg" alt=""/>--%>
				  <%--</span>--%>
                        <%--<span class="title">--%>
					<%--Lisa Doe--%>
				  <%--</span>--%>
                        <%--<div class="progress">--%>
                            <%--<div class="progress-bar progress-bar-success" style="width: 21%">--%>
                                <%--<span class="sr-only">35% Complete (success)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-warning" style="width: 20%">--%>
                                <%--<span class="sr-only">20% Complete (warning)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-danger" style="width: 40%">--%>
                                <%--<span class="sr-only">10% Complete (danger)</span>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<span class="status">--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-green">4</span> completed--%>
							<%--<span class="pull-right fa fa-check"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-orange">5</span> in-progress--%>
							<%--<span class="pull-right fa fa-adjust"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-red">9</span> pending--%>
							<%--<span class="pull-right fa fa-list-ul"></span>--%>
						<%--</div>--%>
				    <%--</span>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="javascript:void(0);">--%>
				  <%--<span class="image">--%>
					  <%--<img src="img/avatars/avatar6.jpg" alt=""/>--%>
				  <%--</span>--%>
                        <%--<span class="title">--%>
					<%--Kelly Doe--%>
				  <%--</span>--%>
                        <%--<div class="progress">--%>
                            <%--<div class="progress-bar progress-bar-success" style="width: 45%">--%>
                                <%--<span class="sr-only">35% Complete (success)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-warning" style="width: 21%">--%>
                                <%--<span class="sr-only">20% Complete (warning)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-danger" style="width: 10%">--%>
                                <%--<span class="sr-only">10% Complete (danger)</span>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<span class="status">--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-green">6</span> completed--%>
							<%--<span class="pull-right fa fa-check"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-orange">3</span> in-progress--%>
							<%--<span class="pull-right fa fa-adjust"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-red">1</span> pending--%>
							<%--<span class="pull-right fa fa-list-ul"></span>--%>
						<%--</div>--%>
				    <%--</span>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="javascript:void(0);">--%>
				  <%--<span class="image">--%>
					  <%--<img src="img/avatars/avatar7.jpg" alt=""/>--%>
				  <%--</span>--%>
                        <%--<span class="title">--%>
					<%--Jessy Doe--%>
				  <%--</span>--%>
                        <%--<div class="progress">--%>
                            <%--<div class="progress-bar progress-bar-success" style="width: 7%">--%>
                                <%--<span class="sr-only">35% Complete (success)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-warning" style="width: 30%">--%>
                                <%--<span class="sr-only">20% Complete (warning)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-danger" style="width: 10%">--%>
                                <%--<span class="sr-only">10% Complete (danger)</span>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<span class="status">--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-green">1</span> completed--%>
							<%--<span class="pull-right fa fa-check"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-orange">6</span> in-progress--%>
							<%--<span class="pull-right fa fa-adjust"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-red">2</span> pending--%>
							<%--<span class="pull-right fa fa-list-ul"></span>--%>
						<%--</div>--%>
				    <%--</span>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="javascript:void(0);">--%>
				  <%--<span class="image">--%>
					  <%--<img src="img/avatars/avatar8.jpg" alt=""/>--%>
				  <%--</span>--%>
                        <%--<span class="title">--%>
					<%--Debby Doe--%>
				  <%--</span>--%>
                        <%--<div class="progress">--%>
                            <%--<div class="progress-bar progress-bar-success" style="width: 70%">--%>
                                <%--<span class="sr-only">35% Complete (success)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-warning" style="width: 20%">--%>
                                <%--<span class="sr-only">20% Complete (warning)</span>--%>
                            <%--</div>--%>
                            <%--<div class="progress-bar progress-bar-danger" style="width: 5%">--%>
                                <%--<span class="sr-only">10% Complete (danger)</span>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<span class="status">--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-green">13</span> completed--%>
							<%--<span class="pull-right fa fa-check"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-orange">7</span> in-progress--%>
							<%--<span class="pull-right fa fa-adjust"></span>--%>
						<%--</div>--%>
						<%--<div class="field">--%>
							<%--<span class="badge badge-red">1</span> pending--%>
							<%--<span class="pull-right fa fa-list-ul"></span>--%>
						<%--</div>--%>
				    <%--</span>--%>
                    <%--</a>--%>
                <%--</li>--%>
            <%--</ul>--%>
        <%--</div>--%>
    <%--</div>--%>
    <!-- /TEAM STATUS -->
</header>
<!--/HEADER -->

<!-- PAGE -->
<section id="page">
    <!-- SIDEBAR -->
    <div id="sidebar" class="sidebar">
        <div class="sidebar-menu nav-collapse">
            <div class="divide-20"></div>
            <!-- SEARCH BAR -->
            <div id="search-bar">
                <input class="search" type="text" placeholder="Search"><i class="fa fa-search search-icon"></i>
            </div>
            <ul>
                <li class="active"><a class="" href="inbox.jsp"><i class="fa fa-briefcase fa-fw"></i> <span
                        class="menu-text">欢迎</span><span class="selected"></span></a></li>
                <li class="has-sub active">
                    <a href="javascript:;" class="">
                        <i class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">首页</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="findNotificationTitle.action"><span class="sub-menu-text">通知公告</span></a></li>
                        <li><a class="" href="findRotatePicture.action"><span class="sub-menu-text">首页轮播图</span></a></li>
                        <li><a class="" href="findSchoolNews.action"><span class="sub-menu-text">学校要闻</span></a></li>
                        <li><a class="" href="findSchoolVideo.action"><span class="sub-menu-text">视频展示</span></a></li>
                        <li><a class="" href="findSchoolGraduation.action"><span class="sub-menu-text">毕业风采</span></a></li>
                        <li class="current"><a class="" href="findSchoolGallery.action"><span class="sub-menu-text">校内图册</span></a></li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-th-large fa-fw"></i> <span class="menu-text">学校概况</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="findSchoolPrincipal.action"><span class="sub-menu-text">校长致辞</span></a></li>
                        <li><a class="" href="findSchoolLeader.action"><span class="sub-menu-text">现任领导</span></a></li>
                        <li><a class="" href="findSchoolIntroduce.action"><span class="sub-menu-text">学校简介</span></a></li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-columns fa-fw"></i> <span class="menu-text">组织结构</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="findSchoolAdministration.action"><span class="sub-menu-text">行政机构</span></a></li>
                        <li><a class="" href="findInstitutionsTeaching.action"><span class="sub-menu-text">教辅机构</span></a>
                        </li>
                        <li><a class="" href="findImmediateOther.action"><span class="sub-menu-text">直属及其他</span></a>
                        </li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-table fa-fw"></i> <span class="menu-text">人才培养</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="findServiceTeacher.action"><span class="sub-menu-text">师资服务</span></a></li>
                        <li><a class="" href="featuredSchoolProfessional.action"><span class="sub-menu-text">特色专业</span></a></li>
                        <li><a class="" href="findNiceCourse.action"><span class="sub-menu-text">精品课程</span></a></li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-file-text fa-fw"></i> <span class="menu-text">科研服务</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="findBuildSubject.action"><span class="sub-menu-text">学科建设</span></a></li>
                        <li><a class="" href="findServiceSociety.action"><span class="sub-menu-text">社会服务</span></a></li>
                    </ul>
                </li>
                <li class=""><a class="" href="exchangeSchoolWork.action"><i class="fa fa-envelope-o fa-fw"></i> <span
                        class="menu-text">交流合作</span><span class="selected"></span></a></li>
                <li class=""><a class="" href="findSchoolRecruitment.action"><i class="fa fa-file-text fa-fw"></i> <span
                        class="menu-text">招就招聘</span><span class="selected"></span></a></li>
            </ul>
            <!-- /SIDEBAR MENU -->
        </div>
    </div>
    <!-- /SIDEBAR -->
    <div id="main-content">
        <!-- SAMPLE BOX CONFIGURATION MODAL FORM-->
        <div class="modal fade" id="box-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Box Settings</h4>
                    </div>
                    <div class="modal-body">
                        Here goes box setting content.
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- /SAMPLE BOX CONFIGURATION MODAL FORM-->
        <div class="container">
            <div class="row">
                <div id="content" class="col-lg-12">
                    <!-- GALLERY -->
                    <div class="row">
                        <div class="col-md-12" style="margin-top:20px">
                            <!-- BOX -->
                            <div class="box">
                                <div class="box-title">
                                    <h4><i class="fa fa-bars"></i>相册</h4>
                                    <div class="tools">
                                        <%--<a href="javascript:void(0)">--%>
                                            <%--<button class="btn btn-success tip-right" onclick="javascript:ajaxFileUpload();">添加</button>--%>
                                        <%--</a>--%>
                                    </div>
                                </div>
                                <div class="box-body clearfix">
                                    <form action="addSchoolGallery.action" method="post" enctype="multipart/form-data">
                                        <textarea rows="3" cols="5" name="des" class="countable form-control" maxlength="80" data-limit="100"></textarea>
                                        ${messageDes}
                                        <div>最多输入80字</div>
                                        <input type="file" name="imagea" style="padding: 5px 10px;"/>
                                        ${messagePic}
                                        <br>
                                        <input class="btn btn-success" style="margin-top:20px;" type="submit" value="提交">
                                    </form>
                                </div>
                            </div>
                            <!-- /BOX -->
                        </div>
                    </div>
                    <!-- /GALLERY -->
                </div><!-- /CONTENT-->
            </div>
        </div>
    </div>
</section>
<!--/PAGE -->
<!-- JQUERY UI-->
<script src="js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
<!-- CUSTOM SCRIPT -->
<script src="js/script.js"></script>
<!-- SELECT2 -->
<script type="text/javascript" src="js/select2/select2.min.js"></script>
<!-- JQUERY UPLOAD -->
<!-- The Templates plugin is included to render the upload/download listings -->
<script src="js/blueimp/javascript-template/tmpl.min.js"></script>
<!-- The Load Image plugin is included for the preview images and image resizing functionality -->
<script src="js/blueimp/javascript-loadimg/load-image.min.js"></script>
<!-- The Canvas to Blob plugin is included for image resizing functionality -->
<script src="js/blueimp/javascript-canvas-to-blob/canvas-to-blob.min.js"></script>
<!-- BOOTSTRAP -->
<script src="bootstrap-dist/js/bootstrap.min.js"></script>
<!-- SLIMSCROLL -->
<script type="text/javascript" src="js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
<!-- BLOCK UI -->
<script type="text/javascript" src="js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
<!-- ISOTOPE -->
<script type="text/javascript" src="js/isotope/jquery.isotope.min.js"></script>
<script type="text/javascript" src="js/isotope/imagesloaded.pkgd.min.js"></script>
<!-- COLORBOX -->
<script type="text/javascript" src="js/colorbox/jquery.colorbox.min.js"></script>
<!-- COOKIE -->
<script type="text/javascript" src="js/jQuery-Cookie/jquery.cookie.min.js"></script>
<script>
    jQuery(document).ready(function () {
        App.setPage("gallery");  //Set current page
        App.init(); //Initialise plugins and elements
    });
</script>
<!-- /JAVASCRIPTS -->
</body>
</html>