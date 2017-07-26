<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>测试</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/plugin/easyui/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/plugin/easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/index.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/plugin/easyui/jquery.easyui.min.js"></script>
</head>

<body class="easyui-layout">
    <div data-options="region:'north',title:'${user.uUsername},您好！',split:true" style="height:120px;"></div>
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
    <div data-options="region:'east',iconCls:'icon-reload',title:'小工具',split:true" style="width:200px;">
        <div id="cc" class="easyui-calendar" style="width:180px;height:180px; margin: 10px auto"></div>
    </div>
    <div data-options="region:'west',title:'菜单列表',split:true" style="width:180px;">
        <ul id="tt" class="easyui-tree">
            <li>
                <span>主菜单</span>
                <ul class="main_menu">
                    <li>
                        <span>个人设置</span>
                        <ul>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <span>用户管理</span>
                        <ul>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <span>游戏管理</span>
                        <ul>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                            <li>
                                <span><a class="menu_a" href="#">File 11</a></span>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
    <div data-options="region:'center',title:' '" style="padding:5px;background:#eee;">
    </div>
</body>
</html>