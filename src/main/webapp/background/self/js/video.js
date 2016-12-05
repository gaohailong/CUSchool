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
                window.location.href = "/background/success.jsp";
            },
            error: function (error) {
                window.location.href = "/background/fail.jsp";
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
                    window.location.href = "/background/success.jsp";
                },
                error: function (error) {
                    window.location.href = "/background/fail.jsp";
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
                    window.location.href = "/background/success.jsp";
                },
                error: function (error) {
                    window.location.href = "/background/fail.jsp";
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

