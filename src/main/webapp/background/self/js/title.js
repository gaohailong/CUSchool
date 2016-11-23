/**
 * Created by gaohailong on 2016/11/16.
 */
//添加通知新闻
function addNotification() {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"notificationHead": head, "notificationContent": content};
        $.ajax({
            type: "POST",
            url: "addNotificationTitle.action",
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

//修改通知新闻
function updateNotification(id) {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    // var t_category = $("#t_category").val();
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"tid": id, "notificationHead": head, "notificationContent": content};
        $.ajax({
            type: "POST",
            url: "updateNotificationTitle.action",
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

//删除通知新闻
function confirmDelete(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteNotificationTitle.action?tid=' + tid;
    }
}


//添加轮播图
function addRotatePicture() {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    var picUrl = getPictureUrl(content);
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"notificationHead": head, "notificationContent": content, "picUrl": picUrl};
        $.ajax({
            type: "POST",
            url: "addRotatePicture.action",
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

//修改轮播图
function updateRotatePicture(tid) {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    var picUrl = getPictureUrl(content);
    // var t_category = $("#t_category").val();
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"tid": id, "notificationHead": head, "notificationContent": content};
        $.ajax({
            type: "POST",
            url: "updateSchoolRotateTitle.action",
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

//删除轮播图
function confirmRotate(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolRotatePicture.action?tid=' + tid;
    }
}

//添加学校要闻
function addSchoolNews() {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"notificationHead": head, "notificationContent": content};
        $.ajax({
            type: "POST",
            url: "addSchoolNews.action",
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

//修改学校要闻
function updateSchoolNews(id) {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"tid": id, "notificationHead": head, "notificationContent": content};
        $.ajax({
            type: "POST",
            url: "updateSchoolNews.action",
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

//删除通知新闻
function confirmDeleteNews(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolNews.action?tid=' + tid;
    }
}

//添加毕业风采
function addGraduation() {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    var picUrl = getPictureUrl(content);
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"notificationHead": head, "notificationContent": content, "picUrl": picUrl};
        $.ajax({
            type: "POST",
            url: "addSchoolGraduation.action",
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

//修改毕业风采
function updateSchoolGraduation(id) {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    var picUrl = getPictureUrl(content);
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"tid": id, "notificationHead": head, "notificationContent": content, "picUrl": picUrl};
        $.ajax({
            type: "POST",
            url: "updateSchoolGraduation.action",
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

//删除毕业风采
function confirmDeleteGraduation(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolGraduation.action?tid=' + tid;
    }
}

//添加校长致辞
function addPrincipal() {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"notificationHead": head, "notificationContent": content};
        $.ajax({
            type: "POST",
            url: "addSchoolPrincipal.action",
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

//修改校长致辞
function updatePrincipal(id) {
    var content = getContentByUeditor();
    var head = $("#t-notification").val();
    if (content == null) {
        alert("未输入任何内容！");
    } else if (head == null) {
        alert("请输入文章标题！");
    } else {
        var data = {"notificationHead": head, "notificationContent": content};
        $.ajax({
            type: "POST",
            url: "updateSchoolPrincipal.action?tid="+id,
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

//删除校长致辞
function confirmDeletePrincipal(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolPrincipal.action?tid=' + tid;
    }
}

//激活当前页
function pageActive() {

}


//格式化时间的操作
function formatDate(time) {
    var date = new Date(time);
    var year = date.getYear();
    var month = date.getMonth();
    var day = date.getDay();
    var formatTime = year + month + day;
    return formatTime
}

//获取图片的链接
function getPictureUrl(htmlStr) {
    var arraydata = new Array();
    var finalData;
    $(htmlStr).find("img").each(function (index, element) {
        var temp = element.src;
        var reg = '/upload/upload_image';
        var data = temp.match(reg);
        if (data != null) {
            arraydata[index] = temp;
        }
    });
    for (var i = 0; i < arraydata.length; i++) {
        if (arraydata != null) {
            finalData = arraydata[i];
            break;
        }
    }
    return finalData;
}


