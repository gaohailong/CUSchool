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

//格式化时间的操作
function formatDate(time) {
    var date = new Date(time);
    var year = date.getYear();
    var month = date.getMonth();
    var day = date.getDay();
    var formatTime = year + month + day;
    return formatTime
}

//激活当前页
function pageActive() {

}

//确认删除文章
function confirmDelete(tid) {
    if (confirm("确定要删除这篇文章吗？")) {
        location.href = 'deleteNotificationTitle.action?tid=' + tid;
    }
}


