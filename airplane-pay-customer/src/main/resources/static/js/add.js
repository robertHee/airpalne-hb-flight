$("#form-horizontal").click(function() {
    var flight = new Object();
    flight.id = $.trim($("#id").val());
    flight.departureCity = $.trim($("#departureCity").val());
    flight.departureTime = $.trim($("#departureTime").val());
    flight.arrivalCity = $.trim($("#arrivalCity").val());
    flight.arrivalTime = $.trim($("#arrivalTime").val());


    if (flight.id == "" || flight.id == null) {
        $("#id").focus;
        $("#formtip").css("color", "red");
        $("#formtip").html("对不起，航班编号不能为空。");
    } else if (flight.departureCity == "" || flight.departureCity == null) {
        $("#departureCity").focus;
        $("#formtip").css("color", "red");
        $("#formtip").html("对不起，起飞城市不能为空。");
    } else if (flight.departureTime == "" || flight.departureTime == null) {
        $("#departureTime").focus;
        $("#formtip").css("color", "red");
        $("#formtip").html("对不起，起飞时间不能为空。");
    }else if (flight.arrivalCity == "" || flight.arrivalCity == null) {
        $("#arrivalCity").focus;
        $("#formtip").css("color", "red");
        $("#formtip").html("对不起，到达城市不能为空。");
    }else if (flight.arrivalTime == "" || flight.arrivalTime == null) {
        $("#arrivalTime").focus;
        $("#formtip").css("color", "red");
        $("#formtip").html("对不起，到达时间不能为空。");
    }else {
        $("#formtip").html("");

        $.ajax({
            type : 'POST',
            url : '/findByID.html',
            data : {
                flight : JSON.stringify(flight)
            },
            dataType : 'html',
            timeout : 1000,
            error : function() {
                $("#formtip").css("color", "red");
                $("#formtip").html("登录失败！请重试。");
            },
            success : function(result) {
                if (result != "" && result == "success") {// 若登录成功，跳转到"/main.html"
                    window.location.href = '/index.html';
                } else if (result == "failed") {
                    $("#formtip").css("color", "red");
                    $("#formtip").html("增加失败！请重试。");
                    $("#id").val('');
                    $("#departureCity").val('');
                    $("#departureTime").val('');
                    $("#arrivalCity").val('');
                    $("#arrivalTime").val('');
                } else if (result == "repeat") {
                    $("#formtip").css("color", "red");
                    $("#formtip").html("登录账号已存在！请重试。");
                }else if ("nodata" == result) {
                    $("#formtip").css("color", "red");
                    $("#formtip").html("对不起，没有任何数据需要处理！请重试。");
                }
            }

        });

    }

});