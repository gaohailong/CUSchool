/**
 * Created by gaohailong on 2016/11/22.
 */
//添加视频链接
function addVideo() {
    var desc = $("#video_des").val();
    var link = $("#video_link").val();
    if (desc == null) {
        alert("未输入描述！");
    } else if (link == null) {
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
    var desc = $("#video_des").val();
    var link = $("#video_link").val();
    if (desc == null) {
        alert("未输入描述！");
    } else if (link == null) {
        alert("未输入链接！");
    } else {
        var data = {"desc": desc, "link": link};
        $.ajax({
            type: "POST",
            url: "updateSchoolVideo.action?tid=" + id,
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

//删除视频链接
function confirmDeleteVideo(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolVideo.action?vid=' + tid;
    }
}

