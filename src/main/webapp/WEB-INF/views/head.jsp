<html xmlns="http://www.w3.org/1999/xhtml">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="/resources/css/layout.css">
    <!--[if IE ]><class="ie"><![endif]-->
    <sec:csrfMetaTags />
    <title>${fn:split(fn:split(pageContext.request.servletPath, '/')[fn:length(fn:split(pageContext.request.servletPath, '/')) - 1],'.')[0]}</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
</head>