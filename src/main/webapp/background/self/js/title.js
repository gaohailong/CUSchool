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

//添加现任领导
function addLeader() {
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
            url: "addSchoolLeader.action",
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

//修改现任领导
function updateLeader(id) {
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
            url: "updateSchoolLeader.action?tid="+id,
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
function confirmDeleteLeader(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolLeader.action?tid=' + tid;
    }
}

//添加学校简介
function addIntroduce() {
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
            url: "addSchoolIntroduce.action",
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

//修改学校简介
function updateIntroduce(id) {
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
            url: "updateSchoolIntroduce.action?tid="+id,
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

//删除学校简介
function confirmDeleteIntroduce(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolIntroduce.action?tid=' + tid;
    }
}

//添加师资服务
function addTeacherService() {
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
            url: "addServiceTeacher.action",
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



//修改师资服务
function updateTeacherService(id) {
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
            url: "updateServiceTeacher.action?tid="+id,
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

//删除师资服务
function confirmDeleteTeacherService(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteServiceTeacher.action?tid=' + tid;
    }
}

//添加特色专业
function addFeaturedProfessional() {
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
            url: "addFeaturedProfessional.action",
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


//修改特色专业
function updateFeaturedProfessional(id) {
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
            url: "updateFeaturedProfessional.action?tid="+id,
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

//删除特色专业
function confirmDeleteFeaturedProfessional(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteFeaturedProfessional.action?tid=' + tid;
    }
}

//添加精品课程
function addNiceCourse() {
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
            url: "addNiceCourse.action",
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


//修改精品课程
function updateNiceCourse(id) {
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
            url: "updateNiceCourse.action?tid="+id,
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

//删除精品课程
function confirmDeleteNiceCourse(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteNiceCourse.action?tid=' + tid;
    }
}

//添加学科建设
function addBuildSubject() {
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
            url: "addBuildSubject.action",
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

//修改学科建设
function updateBuildSubject(id) {
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
            url: "updateBuildSubject.action?tid="+id,
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

//删除学科建设
function confirmDeleteBuildSubject(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteBuildSubject.action?tid=' + tid;
    }
}

//添加交流合作
function addExchange() {
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
            url: "addExchangeWork.action",
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

//修改交流合作
function updateExchangeWork(id) {
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
            url: "updateExchangeWork.action?tid="+id,
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

//删除交流合作
function confirmDeleteExchangeWork(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteServiceExchangeWork.action?tid=' + tid;
    }
}

//添加招就招聘
function addRecruitment() {
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
            url: "addSchoolRecruitment.action",
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

//修改招就招聘
function updateRecruitment(id) {
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
            url: "updateSchoolRecruitment.action?tid="+id,
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

//删除招就招聘
function confirmDeleteRecruitment(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteSchoolRecruitment.action?tid=' + tid;
    }
}

//激活当前页(分页)
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


