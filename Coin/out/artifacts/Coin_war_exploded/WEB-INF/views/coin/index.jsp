<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-09-09
  Time: 오후 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="item">
        <div>${item.i_num}</div>
        <div>${item.title}</div>
    </c:forEach>
    <h1>${name}</h1>

    <img id="img1" src="/res/img/이미지1.png" />

    <form id="testForm" name="testForm">
        <input type="text" id="i_num" name="i_num">
        <input type="text" id="title" name="title">
        <button type="button" id="testBtn" name="testBtn" onclick="testBtnClk()">Ajax 전송</button>
    </form>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.3.0/jquery.form.min.js" integrity="sha384-qlmct0AOBiA2VPZkMY3+2WqkHtIQ9lSdAsAn5RUJD/3vA5MKDgSGcdmIv4ycVxyn" crossorigin="anonymous"></script>
<script>

    function testBtnClk() {
        // testBtnClick();      // submit
        // testBtnClick2();  // 기본ajax
        submitAjax('#testForm', '/coin/index', test3());
    }

    function test3() {
        alert('아잗스 석ㅇ')
    }
    // == ajaxSubmit 사용 ==
    function testBtnClick() {
        $("#testForm").ajaxSubmit({
            url: '/coin/index'
            ,type: 'post'
            ,success: function(data) {
                alert('i_num : ' + data.i_num + '\n'
                    + '이름 : ' + data.title + '\n');
            }
        })
    }
    // == 기본 ajax 사용 ==
    function testBtnClick2() {
        let i_num = $("#i_num").val();
        let title = $("#title").val();
        $.ajax({
            url: '/coin/index'
            , type: 'post'
            , data: {i_num: i_num
                    , title : title
            }
            ,success: function(data) {
                alert('-i_num : ' + data.i_num + '\n'
                    + '-이름 : ' + data.title+ '\n');
            }
        })
    }
</script>
</body>
</html>
