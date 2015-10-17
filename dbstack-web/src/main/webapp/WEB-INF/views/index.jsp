<html>
<head>
    <meta charset="UTF-8">
    <title>DBStack v1.0</title>
    <link rel="stylesheet" type="text/css" href="res/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="res/jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="res/jquery-easyui-1.4.1/demo.css">
    <script type="text/javascript" src="res/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="res/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
<div data-options="region:'north',border:false" style="height:60px;background:maroon;padding:10px"></div>
<div data-options="region:'west',split:true,title:'Databases'" style="width:250px;padding:10px;">
    <div class="easyui-panel" style="padding:5px">
        <ul class="easyui-tree" data-options="url:'tree_data1.json',method:'get',animate:true,lines:true,border:false"></ul>
    </div>
</div>
<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region
</div>
<div data-options="region:'south',split:true,collapsed:false,title:'Log'"
     style="height:120px;background:#A9FACD;padding:10px;">
     日志输出区域
</div>
<div data-options="region:'center',title:'Center'"></div>
</body>
</html>