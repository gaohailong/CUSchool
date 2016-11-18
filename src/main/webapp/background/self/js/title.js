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
        var data = {"notificationHead": content, "notificationContent": head};
        $.ajax({
            type: "POST",
            url: "addNotificationTitle.action",
            data: data,
            dataType: "text",
            success: function (data) {
                alert("添加成功！");
            },
            error: function (error) {
                alert("添加失败！");
            }
        });
    }
}