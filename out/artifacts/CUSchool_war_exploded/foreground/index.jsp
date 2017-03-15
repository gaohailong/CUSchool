<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  isErrorPage="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>

    <meta name="keywords" content=""/>
    <meta name="description" content=""/>

    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width"/>

    <!--[if lt IE 9]>
    <script type="text/javascript" src="layout/plugins/html5.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="layout/style.css" type="text/css"/>
    <!--<link href="http://fonts.googleapis.com/css?family=PT+Sans:400,700" rel="stylesheet" type="text/css" />-->
    <!--<link href="http://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700" rel="stylesheet" type="text/css" />-->
    <!--<link href="http://fonts.googleapis.com/css?family=Droid+Serif:400,400italic" rel="stylesheet" type="text/css" />-->

    <script type="text/javascript" src="layout/js/jquery.js"></script>

    <!-- PrettyPhoto start -->
    <link rel="stylesheet" href="layout/plugins/prettyphoto/css/prettyPhoto.css" type="text/css"/>
    <script type="text/javascript" src="layout/plugins/prettyphoto/jquery.prettyPhoto.js"></script>
    <!-- PrettyPhoto end -->

    <!-- jQuery tools start -->
    <script type="text/javascript" src="layout/plugins/tools/jquery.tools.min.js"></script>
    <!-- jQuery tools end -->

    <!-- Calendar start -->
    <link rel="stylesheet" href="layout/plugins/calendar/calendar.css" type="text/css"/>
    <script type="text/javascript" src="layout/plugins/calendar/calendar.js"></script>
    <!-- Calendar end -->

    <!-- ScrollTo start -->
    <script type="text/javascript" src="layout/plugins/scrollto/jquery.scroll.to.min.js"></script>
    <!-- ScrollTo end -->

    <!-- MediaElements start -->
    <link rel="stylesheet" href="layout/plugins/video-audio/mediaelementplayer.css"/>
    <script src="layout/plugins/video-audio/mediaelement-and-player.js"></script>
    <!-- MediaElements end -->

    <!-- FlexSlider start -->
    <link rel="stylesheet" href="layout/plugins/flexslider/flexslider.css" type="text/css"/>
    <script type="text/javascript" src="layout/plugins/flexslider/jquery.flexslider-min.js"></script>
    <!-- FlexSlider end -->
    <script type="text/javascript" src="layout/js/main.js"></script>

    <script type="text/javascript">
        jQuery(function () {
        });
    </script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
<div class="wrapper sticky_footer">
    <!-- HEADER BEGIN -->
    <header>
        <div id="header">
            <section class="top">
                <div class="inner">
                    <div class="fl">
                        <div class="block_top_menu">
                            <ul>
                                <li class="current"><a href="findAllHome.action">首页</a></li>
                                <li><a href="map.jsp">地图</a></li>
                                <%--<li><a href="contact.html">联系我们</a></li>--%>
                            </ul>
                        </div>
                    </div>

                    <div class="fr">
                    </div>

                    <div class="clearboth"></div>
                </div>
            </section>

            <section class="bottom">
                <div class="inner">
                    <div id="logo_top"><a href="findAllHome.action">
                        <%--<img src="images/logo_top.png" alt="BusinessNews" title="BusinessNews"/>--%>
                        <p style=" font-size: 30px;">阳高县春雨职业学校</p>
                    </a>
                    </div>
                    <div class="block_today_date">
                        <div class="num"><p id="num_top"/></div>
                        <div class="other">
                            <p class="month_year"><span id="month_top"></span><span id="year_top"></span></p>
                            <p id="day_top" class="day"/>
                        </div>
                    </div>

                    <div class="fr">
                        <div class="block_languages">

                            <div class="clearboth"></div>
                        </div>

                        <div class="block_search_top">
                            <form action="findSearchHome.action" method="post"/>
                            <div class="field"><input type="text" name="keyword" class="w_def_text" title="请输入查询内容"/>
                            </div>
                            <input type="submit" class="button" />

                            <div class="clearboth"></div>
                            </form>
                        </div>
                    </div>

                    <div class="clearboth"></div>
                </div>
            </section>

            <section class="section_main_menu">
                <div class="inner">
                    <nav class="main_menu">
                        <ul>
                            <li class="current_page_item"><a href="findAllHome.action">首页</a>
                            </li>
                            <li class="big_dropdown"><a href="javascript:void(0)">学校概况</a>
                                <ul>
                                    <li><a href="findPreAllPrincipal.action">校长致辞</a></li>
                                    <li><a href="findAllDataLeader.action">现任领导</a></li>
                                    <li><a href="findPreAllIntroduce.action">学校简介</a></li>
                                </ul>
                            </li>
                            <li class="big_dropdown"><a href="javascript:void(0)">组织结构</a>
                                <ul>
                                    <li><a href="findAllDataAdministration.action">行政机构</a></li>
                                    <li><a href="findAllDataTeaching.action">教辅机构</a></li>
                                    <li><a href="findAllDataOther.action">直属及其他</a></li>
                                </ul>
                            </li>
                            <li class="big_dropdown"><a href="javascript:void(0)">人才培养</a>
                                <ul>
                                    <li><a href="findAllDataTeacher.action">师资服务</a></li>
                                    <li><a href="findAllDataProfessional.action">特色专业</a></li>
                                    <li><a href="findAllDataCourse.action">精品课程</a></li>
                                </ul>
                            </li>
                            <li><a href="javascript:void(0)">科研服务</a>
                                <ul>
                                    <li><a href="findAllDataSubject.action">学科建设</a></li>
                                    <li><a href="findAllDataSociety.action">社会服务</a></li>
                                </ul>
                            </li>
                            <li><a href="findAllDataWork.action">交流合作</a>
                            </li>
                            <li><a href="findAllDataRecruitment.action">招就招聘</a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </section>

            <section class="section_big_dropdown">
                <div class="inner">
                    <div class="block_big_dropdown" data-menu="business">
                        <div class="content">
                            <div class="image">
                                <a href="blog_post.html" class="pic"><img src="images/pic_big_drop_3.jpg" alt=""/></a>
                                <p><a href="blog_post.html">Embarrassing hidden in the middleany thing</a></p>
                            </div>
                            <div class="line"></div>

                            <div class="image">
                                <a href="blog_post.html" class="pic"><img src="images/pic_big_drop_4.jpg" alt=""/></a>
                                <p><a href="blog_post.html">Content of a page when looking.</a></p>
                            </div>
                            <div class="line"></div>

                            <div class="popular_posts">
                                <div class="title"><p>Popular Posts</p></div>
                                <ul>
                                    <li><a href="blog_post.html"><span>11 July, 2012</span>Established fact that a
                                        reader.</a></li>
                                    <li><a href="blog_post_w_slider.html"><span>08 July, 2012</span>Editors now use as
                                        their default model text.</a></li>
                                    <li><a href="blog_post_w_video.html"><span>05 July, 2012</span>Embarrassing hidden
                                        in the middle.</a></li>
                                    <li><a href="blog_post.html"><span>01 July, 2012</span>Anything embarrassing hidden
                                        in the middl.</a></li>
                                </ul>
                            </div>
                            <div class="line"></div>

                            <div class="more">
                                <div class="title"><p>More In Business</p></div>
                                <ul>
                                    <li><a href="#">Business</a></li>
                                    <li><a href="#">Money</a></li>
                                    <li><a href="#">Isnvestor Programs</a></li>
                                    <li><a href="#">Banks</a></li>
                                </ul>
                            </div>

                            <div class="clearboth"></div>
                        </div>
                    </div>

                    <div class="block_big_dropdown" data-menu="technology">
                        <div class="content">
                            <div class="image">
                                <a href="blog_post.html" class="pic"><img src="images/pic_big_drop_5.jpg" alt=""/></a>
                                <p><a href="blog_post.html">Simply dummy text of the printing.</a></p>
                            </div>
                            <div class="line"></div>

                            <div class="image">
                                <a href="blog_post.html" class="pic"><img src="images/pic_big_drop_6.jpg" alt=""/></a>
                                <p><a href="blog_post.html">Internet tend to repeat predefined chunks.</a></p>
                            </div>
                            <div class="line"></div>

                            <div class="popular_posts">
                                <div class="title"><p>Popular Posts</p></div>
                                <ul>
                                    <li><a href="blog_post.html"><span>11 July, 2012</span>Publishing packages and web
                                        page</a></li>
                                    <li><a href="blog_post_w_slider.html"><span>08 July, 2012</span>Generators on the
                                        Internet tend to repeat.</a></li>
                                    <li><a href="blog_post_w_video.html"><span>05 July, 2012</span>Anything embarrassing
                                        hidden in the middle.</a></li>
                                    <li><a href="blog_post.html"><span>01 July, 2012</span>Words which don't look even
                                        slightly.</a></li>
                                </ul>
                            </div>
                            <div class="line"></div>

                            <div class="more">
                                <div class="title"><p>More In Tech</p></div>
                                <ul>
                                    <li><a href="#">Web Development</a></li>
                                    <li><a href="#">Programming</a></li>
                                    <li><a href="#">Techique</a></li>
                                    <li><a href="#">Cars</a></li>
                                </ul>
                            </div>

                            <div class="clearboth"></div>
                        </div>
                    </div>

                    <div class="block_big_dropdown" data-menu="education">
                        <div class="content">
                            <div class="image">
                                <a href="blog_post.html" class="pic"><img src="images/pic_big_drop_1.jpg" alt=""/></a>
                                <p><a href="blog_post.html">Many desktop packages and web page editors.</a></p>
                            </div>
                            <div class="line"></div>

                            <div class="image">
                                <a href="blog_post.html" class="pic"><img src="images/pic_big_drop_2.jpg" alt=""/></a>
                                <p><a href="blog_post.html">There are many variations passages</a></p>
                            </div>
                            <div class="line"></div>

                            <div class="popular_posts">
                                <div class="title"><p>Popular Posts</p></div>
                                <ul>
                                    <li><a href="blog_post.html"><span>11 July, 2012</span>Many desktop publishing
                                        packages and web page</a></li>
                                    <li><a href="blog_post_w_slider.html"><span>08 July, 2012</span>Randomised words
                                        which don't look even.</a></li>
                                    <li><a href="blog_post_w_video.html"><span>05 July, 2012</span>Anything embarrassing
                                        hidden in the middle.</a></li>
                                    <li><a href="blog_post.html"><span>01 July, 2012</span>Established fact that a
                                        reader.</a></li>
                                </ul>
                            </div>
                            <div class="line"></div>

                            <div class="more">
                                <div class="title"><p>More In Education</p></div>
                                <ul>
                                    <li><a href="#">High school</a></li>
                                    <li><a href="#">Univercity</a></li>
                                    <li><a href="#">College</a></li>
                                    <li><a href="#">Students</a></li>
                                </ul>
                            </div>

                            <div class="clearboth"></div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </header>
    <!-- HEADER END -->
    <div class="inner_copyright">Collect from <a href="http://www.cssmoban.com/" target="_blank" title="网站模板">网站模板</a>
    </div>
    <!-- CONTENT BEGIN -->
    <div id="content" class="right_sidebar">
        <div class="inner">
            <div class="general_content">
                <div class="main_content">
                    <div class="separator" style="height:17px;"></div>

                    <div class="block_home_slider">
                        <div id="home_slider" class="flexslider">
                            <ul class="slides">
                                <c:forEach var="rotate" items="${rotates}">
                                    <li>
                                        <a href="findOneSchoolPreHome.action?tid=${rotate.TId}">
                                            <div class="slide">
                                                <img src="${rotate.TImage}" alt="" style="width: 610px;height: 292px;"/>
                                                <div class="caption">
                                                    <p class="title">${rotate.TName}</p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                </c:forEach>
                            </ul>
                        </div>

                        <script type="text/javascript">
                            $(function () {
                                $('#home_slider').flexslider({
                                    animation: 'slide',
                                    controlNav: true,
                                    directionNav: true,
                                    animationLoop: true,
                                    slideshow: false,
                                    useCSS: false
                                });

                            });
                        </script>
                    </div>

                    <div class="line_2" style="margin:34px 0px 28px;"></div>
                    <h4>学校要闻</h4>
                    <div class="">
                        <c:forEach var="news" items="${newss}" >
                            <div class="block_home_post">
                                <div class="text">
                                    <p class="title"><a href="findOneSchoolPreHome.action?tid=${news.TId}">${news.TName}</a></p>
                                    <div class="date"><p>${news.TDate}</p></div>
                                    <div class="icons">
                                        <ul>
                                            <li><a href="#" class="views">${news.TRead}</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="line_3" style="margin:14px 0px 17px;"></div>
                        </c:forEach>
                        <div class="clearboth"></div>
                        <a href="findPreSchoolNews.action" class="lnk_all_news fl">更多</a>
                        <div class="clearboth"></div>
                        <div class="line_3" style="margin:13px 0px 35px;"></div>
                    </div>
                    <h4>毕业风采</h4>
                    <div class="line_4" style="margin:-4px 0px 18px;"></div>

                    <div class="block_topic_news">

                        <c:forEach items="${graduations}" var="graduation">
                            <article class="block_topic_post">
                                <p class="title"><a href="findOneSchoolPreHome.action?tid=${graduation.TId}">${graduation.TName}</a></p>
                                <div class="f_pic"><a href="findOneSchoolPreHome.action?tid=${graduation.TId}" class="general_pic_hover scale">
                                    <img src="${graduation.TImage}" style="width: 256px;height: 121px;" alt=""/></a></div>
                                <div class="info">
                                    <div class="date"><p>${graduation.TDate}</p></div>
                                    <div class="r_part">
                                        <a href="#" class="views">${graduation.TRead}</a>
                                    </div>
                                </div>
                            </article>
                        </c:forEach>
                    </div>

                    <div class="line_3" style="margin:20px 0px 24px;"></div>
                    <div class="clearboth"></div>
                    <a href="findPreSchoolGraduation.action" class="lnk_all_news fl">更多</a>
                    <div class="clearboth"></div>
                    <div class="line_3" style="margin:13px 0px 35px;"></div>
                </div>

                <div class="sidebar">
                    <div class="separator" style="height:31px;"></div>

                    <div class="block_popular_posts">
                        <h4>通知公告</h4>
                        <c:forEach var="notification" items="${notifications}" >
                            <div class="article">
                                <div class="text">
                                    <p class="title"><a href="findOneSchoolPreHome.action?tid=${notification.TId}">${notification.TName}</a></p>
                                    <div class="date"><p>${notification.TDate}</p></div>
                                    <div class="icons">
                                        <ul>
                                            <li><a href="#" class="views">${notification.TRead}</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="line_3"></div>
                        </c:forEach>
                        <div class="clearboth"></div>
                        <a href="findPreNotificationTitle.action" class="lnk_all_news fl">更多</a>
                        <div class="clearboth"></div>
                        <div class="line_3" style="margin:13px 0px 35px;"></div>
                    </div>

                    <div class="separator" style="height:31px;"></div>

                    <div class="block_popular_stuff">
                        <h4>视频展示</h4>

                        <div class="content">
                          <div class="media">
                              <video width="340px" controls height="240px">
                                  <source src="${video.VLink}" type="video/mp4">
                                  <source src="${video.VLink}" type="video/ogg">
                                  <source src="${video.VLink}" type="video/webm">
                                  <object data="${video.VLink}" width="320px" height="240px">
                                      <embed src="${video.VLink}" width="320px" height="240px">
                                  </object>
                              </video>
                          <%--<a href="${video.VLink}"--%>
                                                  <%--class="general_pic_hover play no_fx" data-rel="prettyPhoto"--%>
                                                  <%--title="Popular Video"><img src="images/pic_pop_video.jpg" alt=""/></a>--%>
                                <%--<embed src="${video.VLink}"  >--%>
                            </div>
                            <p><a href="javascript:void(0)">${video.VDes}</a> <img src="images/icon_video.gif" alt=""/></p>
                            <p class="date">${video.VDate}</p>
                        </div>

                        <%--<div class="info">--%>
                            <%--<ul>--%>
                                <%--<li class="views"><a href="#">${video.VRead}</a></li>--%>
                            <%--</ul>--%>
                        <%--</div>--%>

                        <div class="clearboth"></div>

                        <div class="line_2"></div>
                    </div>

                    <div class="separator" style="height:31px;"></div>

                    <div class="block_calendar">
                        <h4>日历</h4>

                        <div class="calendar" id="calendar_sidebar">
                        </div>

                        <script type="text/javascript">
                            var today = new Date();
                            var date = today.getFullYear() + '-' + (today.getMonth() + 1) + '-' + today.getDate();
                            $('#calendar_sidebar').DatePicker({
                                flat: true,
                                date: date,
                                calendars: 1,
                                starts: 1,
                                locale: {
                                    days: ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六', '星期日'],
                                    daysShort: ['日', '一', '二', '三', '四', '五', '六', '日'],
                                    daysMin: ['日', '一', '二', '三', '四', '五', '六', '日'],
                                    months: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
                                    monthsShort: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
                                    weekMin: 'wk'
                                }
                            });
                        </script>

                        <div class="line_2"></div>
                    </div>

                    <div class="separator" style="height:31px;"></div>

                    <div class="block_popular_stuff">
                        <h4>校内图册</h4>

                        <div class="content">
                            <a href="findPrePicImage.action" class="view_all" style="color: #f24024">更多</a>
                            <div class="media"><a href="${image.ILink}"
                                                  class="general_pic_hover zoom no_fx" data-rel="prettyPhoto"
                                                  title="${image.IDes}"><img src="${image.ILink}" alt=""/></a>
                            </div>
                            <p><a href="javascript:void(0)">${image.IDes}</a> <img src="images/icon_photo.gif" alt=""/></p>
                            <%--<p class="date">${image.IDes}</p>--%>
                        </div>

                        <%--<div class="info">--%>
                            <%--<ul>--%>
                                <%--&lt;%&ndash;<li class="comments"><a href="#">100</a></li>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<li class="views"><a href="#">${image.IClick}</a></li>&ndash;%&gt;--%>
                            <%--</ul>--%>
                        <%--</div>--%>

                        <div class="clearboth"></div>

                        <div class="line_2"></div>
                    </div>

                    <div class="separator" style="height:31px;"></div>
                </div>

                <div class="clearboth"></div>
            </div>
        </div>
    </div>
    <!-- CONTENT END -->
    <div class="clearboth"></div>
    <!-- FOOTER BEGIN -->
    <footer>
        <div id="footer">
            <section class="top">
                <div class="inner">
                    <div class="block_to_top">
                        <a href="#">回到顶部</a>
                    </div>
                </div>
            </section>

            <section class="middle">
                <div class="inner">
                    <div class="line_1"></div>

                    <div class="block_footer_widgets" style="margin-left: 70px">
                        <%--<div class="" style="width: 150px;float: left;">--%>
                        <%--<img src="self/image/picture.jpg" style="height:100px;width: 100px;">--%>
                        <%--</div>--%>

                        <div style="margin-top: 30px;margin-left: 60px;">

                            <p>版权所有：阳高县春雨职业学校　地址：山西省阳高县  邮政编码：038100 非经营性互联网信息服务审批号 晋ICP备05000000号</p>
                            <p style="margin-left: 160px;">Copyright© 2016 Spring Vocational School. All Rights Reserved</p>
                        </div>
                        <div class="clearboth"></div>
                    </div>
                </div>
            </section>
        </div>
    </footer>
    <!-- FOOTER END -->
</div>

<!-- POPUP BEGIN -->
<div id="overlay"></div>
<div id="login" class="block_popup">
    <div class="popup">
        <a href="#" class="close">Close</a>

        <div class="content">
            <div class="title"><p>Enter the site</p></div>

            <div class="form">
                <form action="#"/>
                <div class="column">
                    <p class="label">登陆</p>
                    <div class="field"><input type="text"/></div>
                </div>

                <div class="column">
                    <p class="label">Password</p>
                    <div class="field"><input type="password"/></div>
                </div>

                <div class="column_2">
                    <div class="remember">
                        <div class="checkbox"><input type="checkbox"/></div>
                        <div class="remember_label"><p>Remember me</p></div>
                    </div>
                </div>

                <div class="column_2">
                    <p class="forgot_pass"><a href="#">Forgot password?</a></p>
                </div>

                <div class="column button">
                    <a href="#" class="enter"><span>Login</span></a>
                </div>

                <div class="clearboth"></div>
                </form>
            </div>

            <div class="subtitle"><p>SIGN IN AS A USER</p></div>
            <div class="text"><p>Use your account on the social network Facebook, to create a profile on
                BusinessPress</p></div>
        </div>
    </div>
</div>
<!-- POPUP END -->
</body>

</html>