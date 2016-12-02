<%--
Created by IntelliJ IDEA.
User: gaohailong
Date: 2016/11/15
Time: 下午7:45
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>添加精品课程</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- STYLESHEETS --><!--[if lt IE 9]>
    <script src="js/flot/excanvas.min.js"></script>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
    <link rel="stylesheet" type="text/css" href="css/cloud-admin.css">
    <link rel="stylesheet" type="text/css" href="css/themes/default.css" id="skin-switcher">
    <link rel="stylesheet" type="text/css" href="css/responsive.css">

    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- DATE RANGE PICKER -->
    <link rel="stylesheet" type="text/css" href="js/bootstrap-daterangepicker/daterangepicker-bs3.css"/>
    <!-- UNIFORM -->
    <link rel="stylesheet" type="text/css" href="js/uniform/css/uniform.default.min.css"/>
    <!-- INBOX CSS -->
    <link rel="stylesheet" href="css/inbox.css">
    <!-- FONTS -->
    <!--<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>-->
    <!--ueditor-->
    <script type="text/javascript" src="<%=request.getContextPath()%>/ueditor/ueditor.config.js"></script>
    <link href="<%=request.getContextPath()%>/ueditor/themes/default/css/ueditor.css" rel="stylesheet" type="text/css"/>
    <script src="<%=request.getContextPath()%>/ueditor/ueditor.all.js" type="text/javascript"></script>
    <!-- 语言包文件(建议手动加载语言包，避免在ie下，因为加载语言失败导致编辑器加载失败) -->
    <script language="javascript" src="<%=request.getContextPath()%>/ueditor/lang/zh-cn/zh-cn.js"></script>

    <!--title-js-->
    <script language="JavaScript" src="<%=request.getContextPath()%>/background/self/js/title.js"></script>
    <script language="JavaScript" src="<%=request.getContextPath()%>/background/self/js/jquery-2.0.3.min.js"></script>
    <link href="<%=request.getContextPath()%>/background/self/css/title.css" rel="stylesheet" type="text/css"/>
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
    <div class="container team-status" id="team-status">
        <div id="scrollbar">
            <div class="handle">
            </div>
        </div>
        <div id="teamslider">
            <ul class="team-list">
                <li class="current">
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar3.jpg" alt=""/>
				  </span>
                        <span class="title">
					You
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 35%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 20%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 10%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
                        <span class="status">
						<div class="field">
							<span class="badge badge-green">6</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">3</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">1</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar1.jpg" alt=""/>
				  </span>
                        <span class="title">
					Max Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 15%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 40%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 20%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
                        <span class="status">
						<div class="field">
							<span class="badge badge-green">2</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">8</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">4</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar2.jpg" alt=""/>
				  </span>
                        <span class="title">
					Jane Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 65%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 10%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 15%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
                        <span class="status">
						<div class="field">
							<span class="badge badge-green">10</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">3</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">4</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar4.jpg" alt=""/>
				  </span>
                        <span class="title">
					Ellie Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 5%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 48%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 27%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
                        <span class="status">
						<div class="field">
							<span class="badge badge-green">1</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">6</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">2</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar5.jpg" alt=""/>
				  </span>
                        <span class="title">
					Lisa Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 21%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 20%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 40%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
                        <span class="status">
						<div class="field">
							<span class="badge badge-green">4</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">5</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">9</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar6.jpg" alt=""/>
				  </span>
                        <span class="title">
					Kelly Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 45%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 21%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 10%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
                        <span class="status">
						<div class="field">
							<span class="badge badge-green">6</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">3</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">1</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar7.jpg" alt=""/>
				  </span>
                        <span class="title">
					Jessy Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 7%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 30%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 10%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
                        <span class="status">
						<div class="field">
							<span class="badge badge-green">1</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">6</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">2</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar8.jpg" alt=""/>
				  </span>
                        <span class="title">
					Debby Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 70%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 20%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 5%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
                        <span class="status">
						<div class="field">
							<span class="badge badge-green">13</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">7</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">1</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
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
                <li class="has-sub">
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
                        <li><a class="" href="findSchoolGallery.action"><span class="sub-menu-text">校内图册</span></a></li>
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
        <div class="container">
            <div class="row">
                <div class="separator-four"></div>
                <div class="col-md-12" id="add">
                    <div class="form-group" style="margin-bottom: 60px;">
                        <label class="col-sm-1"></label>
                        <label for="t-notification" class="col-sm-1 control-label">标题</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="t-notification" placeholder="">
                        </div>
                    </div>
                    <script id="container" name="content" type="text/plain"></script>
                    <script type="text/javascript">
                        var editor = UE.getEditor('container')
                        function getContentByUeditor() {
                            return editor.getContent();
                        }
                        //addContentForEditorDoUpdate();
                    </script>
                    <div class="separator-two"></div>
                    <button class="btn btn-block btn-primary" onclick="javascript:addNiceCourse();">提交</button>
                </div>
            </div>
        </div>
    </div>
</section>
<!--/PAGE -->
<!-- JAVASCRIPTS -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- JQUERY -->
<script src="js/jquery/jquery-2.0.3.min.js"></script>
<!-- JQUERY UI-->
<script src="js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
<!-- BOOTSTRAP -->
<script src="bootstrap-dist/js/bootstrap.min.js"></script>
<!-- LESS CSS -->
<!--<script src="js/lesscss/less-1.4.1.min.js" type="text/javascript"></script>	-->
<!-- DATE RANGE PICKER -->
<script src="js/bootstrap-daterangepicker/moment.min.js"></script>
<script src="js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
<!-- SLIMSCROLL -->
<script type="text/javascript" src="js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
<!-- BLOCK UI -->
<script type="text/javascript" src="js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
<!-- UNIFORM -->
<script type="text/javascript" src="js/uniform/jquery.uniform.min.js"></script>
<!-- BOOTSTRAP WYSIWYG -->
<script type="text/javascript" src="js/bootstrap-wysiwyg/jquery.hotkeys.min.js"></script>
<script type="text/javascript" src="js/bootstrap-wysiwyg/bootstrap-wysiwyg.min.js"></script>
<!-- COOKIE -->
<script type="text/javascript" src="js/jQuery-Cookie/jquery.cookie.min.js"></script>
<!-- CUSTOM SCRIPT -->
<script src="js/script.js"></script>
<script src="js/inbox.js"></script>
<script>
    jQuery(document).ready(function () {
        App.setPage("school_notification");  //Set current page
        App.init(); //Initialise plugins and elements
//			Inbox.init();
    });
</script>
<!-- /JAVASCRIPTS -->
</body>
</html>