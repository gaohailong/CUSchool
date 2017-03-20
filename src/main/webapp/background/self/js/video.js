/**
 * Created by gaohailong on 2016/11/22.
 */
//添加视频链接
function addVideo() {
    var exp = null;
    var desc = $("#video_des").val();
    var link=document.getElementById("videoLink").href;
    // var link = $("#sourceLink").val();
    if (desc=="" || desc=='undefined' || desc==exp) {
        alert("未输入描述！");
    } else if (link == ""|| desc=='undefined' || desc==exp) {
        alert("未输入链接！");
    } else {
        var data = {"desc": desc, "link": link};
        $.ajax({
            type: "POST",
            url: "addSchoolVideo.action",
            data: data,
            dataType: "text",
            success: function (data) {
                window.location.href = getRootPath2()+"/success.jsp";
            },
            error: function (error) {
                window.location.href = getRootPath2()+"/fail.jsp";
            }
        });
    }
}

//更新视频链接
function updateVideo(id) {
    var exp = null;
    var desc = $("#video_des").val();
    var link_default = $("#video_link").val();
    var link=document.getElementById("videoLink").href;
    if (desc == "") {
        alert("未输入描述！");
    } else{
        //1、判断链接是否为空
        //2、如果为空，则获取默认的链接
        //3、不为空，设置链接为获取过来的链接
        if(link == ""|| desc=='undefined' || desc==exp){
            var data = {"desc": desc, "link": link_default,"vid":id};
            $.ajax({
                type: "POST",
                url: "updateSchoolVideo.action",
                data: data,
                dataType: "text",
                success: function (data) {
                    window.location.href = getRootPath2()+"/success.jsp";
                },
                error: function (error) {
                    window.location.href =getRootPath2()+ "/fail.jsp";
                }
            });
        }else {
            var default_data = {"desc": desc, "link": link,"vid":id};
            $.ajax({
                type: "POST",
                url: "updateSchoolVideo.action",
                data: default_data,
                dataType: "text",
                success: function (data) {
                    window.location.href = getRootPath2()+"/success.jsp";
                },
                error: function (error) {
                    window.location.href = getRootPath2()+"/fail.jsp";
                }
            });
        }
    }
}

//删除视频链接
function confirmDeleteVideo(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolVideo.action?vid=' + tid;
    }
}


function getRootPath2() {
    //获取当前网址，如： http://localhost:9527/zdss-web/login/login.do
    var curWwwPath = window.document.location.href;
    //   console.log("当前网址：" + curWwwPath);

    //获取主机地址之后的目录，如：zdss-web/login/login.do
    var pathName = window.document.location.pathname;
    //  console.log("当前路径：" + pathName);

    var pos = curWwwPath.indexOf(pathName);
    //   console.log("路径位置：" + pos);

    //获取主机地址，如： http://localhost:9527
    var localhostPath = curWwwPath.substring(0, pos);
    console.log("当前主机地址：" + localhostPath);

    //获取带"/"的项目名，如：/zdss-web
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    console.log("当前项目名称：" + projectName);

    return localhostPath+projectName;
}


