<%--
  Created by IntelliJ IDEA.
  User: 何龙
  Date: 2018/12/3
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试界面</title>
</head>
<body>
<script src="/static/js/jquery.min.js"></script>
<script>
    var list='[{"usrId":1000,"usrName":"袁强","usrPassword":"vhkpkWUQX","usrRoleId":"3","usrFlag":"1"},{"usrId":1001,"usrName":"贺磊","usrPassword":"u!ja3S^H0bQPN9gXF","usrRoleId":"5","usrFlag":"0"},{"usrId":1002,"usrName":"文秀英","usrPassword":"XX&uS[%g%PVcrz3y","usrRoleId":"4","usrFlag":"1"},{"usrId":1003,"usrName":"黎娜","usrPassword":"WK&ROj0oDM@5%","usrRoleId":"3","usrFlag":"0"},{"usrId":1004,"usrName":"邹勇","usrPassword":"$He#H7AJd","usrRoleId":"3","usrFlag":"0"},{"usrId":1005,"usrName":"姚秀英","usrPassword":"R8BEEus%bIOk","usrRoleId":"2","usrFlag":"0"},{"usrId":1006,"usrName":"廖秀英","usrPassword":"N1ptJzZ6","usrRoleId":"5","usrFlag":"1"},{"usrId":1007,"usrName":"马娜","usrPassword":"DmOuNrZ)(8jo^tPaK@0[","usrRoleId":"3","usrFlag":"0"},{"usrId":1008,"usrName":"宋刚","usrPassword":"#RmB)6kMWNbZ1gZ!tW2g","usrRoleId":"3","usrFlag":"0"},{"usrId":1009,"usrName":"贺刚","usrPassword":"D26oMD9)CCMC5","usrRoleId":"1","usrFlag":"0"},{"usrId":1010,"usrName":"熊强","usrPassword":"sAWZhxy*O","usrRoleId":"1","usrFlag":"0"},{"usrId":1011,"usrName":"袁涛","usrPassword":"@y2X!d^UNX7ceKH4v","usrRoleId":"1","usrFlag":"1"},{"usrId":1012,"usrName":"龚磊","usrPassword":"e)xU4xzQCo(pk2G5e5","usrRoleId":"2","usrFlag":"1"},{"usrId":1013,"usrName":"赵静","usrPassword":"VY$ulN*gj3QH","usrRoleId":"2","usrFlag":"1"},{"usrId":1014,"usrName":"叶秀英","usrPassword":"8l^!(1*IcPX^&2h12","usrRoleId":"1","usrFlag":"0"},{"usrId":1015,"usrName":"万霞","usrPassword":"aqB0)uQZF","usrRoleId":"3","usrFlag":"1"},{"usrId":1016,"usrName":"邵丽","usrPassword":"vPM]imj3Tj29YZs*Yn","usrRoleId":"5","usrFlag":"0"}]';
    $.ajax({
        timeout : 20000,
        type : "POST",
        url : "/sysInsert",
        data : {'list':list},
        success : function(data){
            alert(data);
        }
        //注意：这里不能加下面这行，否则数据会传不到后台
        //contentType:'application/json;charset=UTF-8',
    });

</script>
</body>
</html>
