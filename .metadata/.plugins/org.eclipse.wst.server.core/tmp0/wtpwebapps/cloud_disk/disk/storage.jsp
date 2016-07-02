<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	if ( session.getAttribute("userInfo")==null ) {
		 out.print("你还未登录……"); 
		 request.getRequestDispatcher("http://localhost:8080/Local_Cloud/").forward(request, response) ;
	} else {
	}
%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="LC 云盘">
<meta name="author" content="lee">
<title>LC云盘</title>
<link rel="shortcut icon" href="https://www.fangcloud.com/favicon.ico" type="image/x-icon">
<link href="../Resources/file/bootstrap.min.css" rel="stylesheet">
<link href="../Resources/file/style.css" rel="stylesheet">
<link href="../Resources/file/sticky-footer-navbar.css" rel="stylesheet">
<link href="../Resources/file/filestyle.css" rel="stylesheet">
<link href="../Resources/file/uploadfile.css" rel="stylesheet">
<link href="../Resources/file/jquery.contextMenu.css" rel="stylesheet">
<link href="../Resources/file/MimeTypeIcon.css" rel="stylesheet">


    


  </head>

  <body class="">
    

    <!-- Wrap all page content here -->
<div id="wrap">

    

     <div class="navbar navbar-fixed-top">
      <div class="container" style="background-color:#ffffff">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        	<a id="logo_48_196" href=".." title="Lc云盘"><img src="../Resources/images/lc_meitu_1.png"/></a>
      </div>
       <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav pull-right">
        <li class="dropdown">
          <a id="drop4" role="button" data-toggle="dropdown" href="http://localhost:8080/Local_Cloud/disk/storage.jsp#"><%=request.getAttribute("username")%><b class="caret"></b></a>
          <ul id="menu1" class="dropdown-menu" role="menu" aria-labelledby="drop4">
            <li role="presentation"><a role="menuitem" tabindex="-1" href="http://localhost:8080/Local_Cloud/disk/storage.jsp#">个人信息</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="..">退出</a></li>
          </ul>
        </li>
        </ul>
      </div>
      </div>
      </div>
<div class="fileheader-fiexed-top">
    <div id="overallcontrol" class="container"> 
    <div class="span8">
        <div id="filelevel">

            <a class="btn btn-default btn-sm" href="#">全部文件</a>
            

        </div>
        <div id="uploadcontrol" class="pull-right">

            <button class="btn btn-primary" data-toggle="modal" data-target="#newFolderModal">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                新建文件夹
            </button>

            <button class="btn btn-success" data-toggle="modal" data-target="#uploadModal">
                <span class="glyphicon glyphicon-cloud-upload" aria-hidden="true"></span>
                上传
            </button>


        </div>
     </div>
    </div>

</div>
<!-- Modal -->
<div class="modal fade" id="uploadModal" tabindex="-1" role="dialog" aria-labelledby="uploadModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="uploadModalLabel">上传文件(对象)</h4>
      </div>
      <div class="modal-body">


<div class="ajax-upload-dragdrop" style="vertical-align: top; border: 2px dotted rgb(165, 165, 199);">
<div class="ajax-file-upload" style="position: relative; overflow: hidden; cursor: default;">上传
<form method="POST" action="http://storage.thucloud.com:7088/upload?current_dir=" enctype="multipart/form-data" style="margin: 0px; padding: 0px;">
<input type="file" id="ajax-upload-id-1466682962974" name="myfile[]" multiple="" style="position: absolute; cursor: pointer; top: 0px; width: 0px; height: 25px; left: 0px; z-index: 100; opacity: 0;">
</form></div></div><div id="mulitplefileuploader" style="display: none;">上传</div><div></div>

        <div id="status"></div>

      </div>
      <div class="modal-footer">
        <a type="button" class="btn btn-default" data-dismiss="modal">取消</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="downloadModal" tabindex="-1" role="dialog" aria-labelledby="downloadModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="downloadModalLabel">下载文件</h4>
      </div>
      <div class="modal-body">
          <form action="http://storage.thucloud.com:7088/download_file" method="get" id="download_window">
              <input type="hidden" id="downloadfilename" name="file_name">
              <input type="hidden" name="current_dir" value="">
              <input type="submit" class="btn btn-primary btn-large" value="下载">
          </form>
      </div>
      <div class="modal-footer">
        <a type="button" class="btn btn-default" data-dismiss="modal">取消</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

    <div class="modal fade" id="newFolderModal" tabindex="-1" role="dialog" aria-labelledby="newFolderModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="newFolderModalLabel">新建文件夹</h4>
      </div>
      <div class="modal-body">
          <form action="http://storage.thucloud.com:7088/new_folder" method="get">
              <input type="hidden" name="current_dir" value="">
              <input type="text" name="new_folder">
              <input type="submit" class="btn btn-primary btn-large" value="新建">
          </form>
      </div>
      <div class="modal-footer">
        <a type="button" class="btn btn-default" data-dismiss="modal">取消</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

    <div class="modal fade" id="shareModal" tabindex="-1" role="dialog" aria-labelledby="shareModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="shareModalLabel">分享文件</h4>
      </div>
      <div class="modal-body">
          <input type="text" name="clipboard-text" id="clipboard-text" value="its me!" style="width:300px">
          <button class="btn btn-sm btn-success" id="target-to-copy" data-clipboard-target="clipboard-text">复制链接</button>
      </div>
      <div class="modal-footer">
        <a type="button" class="btn btn-default" data-dismiss="modal">取消</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


      <!-- Begin page content -->
<div class="container">
  
<div id="filelist" class="container">

    <table class="table table-hover" id="filetable">

        <thead>
          <tr>
            <th class="listcheckbox"></th>
            <th class="listfilename"><a href="">文件名</a></th>
            <th class="allcontrol"><span id="operateonfiles">文件操作</span></th>
            <th class="listsize"><a href="">大小</a></th>
            <th class="listdate"><a href="">修改日期</a></th>
          </tr>
        </thead>
    <tbody id="filebody">
            <tr class="fileinfo">
                <td class="listcheckbox"><input type="checkbox" class="checkfile" name="checkedfile" value="test"></td>
                <td class="listfilename">
                <div class="folder-icon icon" style="float:left"></div>
                <div style="float:left" class="filename-wrapper">
                    <a href="http://storage.thucloud.com:7088/home/files?current_dir=test" class="file-name-wrapper">
                           <span class="file-name">test</span>
                    </a>
                </div>
                </td>
                <td class="filecontrol"><form action="http://storage.thucloud.com:7088/delete_file" method="post" style="float:left"><input type="hidden" name="file_name" value="test/"><input type="hidden" name="current_dir" value=""></form><a class="delete-file" href="javascript:" style="float:left">删除</a>
                    
                    <a class="share-file" onclick="share_file(&#39;test/&#39;)" data-toggle="modal" data-target="#shareModal" href="http://storage.thucloud.com:7088/home/files#" style="float:left">分享</a></td>
                <td class="listsize">##</td>
                <td class="listdate">##</td>
            </tr>
        </tbody>
    </table>
</div>


</div>
</div>
<div id="footer">

  <div class="container">
    <p class="text-muted credit text-center">软件工程 LC云盘oss开发小组 copyright ©2016<br>
    <a href="..">联系我们</a>‎‎‎
        <!--
    <script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1000075329'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s22.cnzz.com/z_stat.php%3Fid%3D1000075329%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));</script>
    -->
    </p>
  </div>

</div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
   <!-- <script src="/static/js/jquery.js"></script>
    <script src="/static/bootstrap/js/bootstrap.min.js"></script>
-->
    <script src="../Resources/file/jquery.js"></script>
    <script src="../Resources/file/bootstrap.min.js"></script>
    
    
    <script src="../Resources/file/jquery.js"></script>
    <script src="../Resources/file/jquery.uploadfile.min.js"></script>
    <script type="text/javascript" src="./Resources/file/base64.js"></script>
    <script src="../Resources/file/ZeroClipboard.js"></script>
    <script src="../Resources/file/main.js"></script>
    <div id="global-zeroclipboard-html-bridge" class="global-zeroclipboard-container" style="position: absolute; left: 0px; top: -9999px; width: 1px; height: 1px; z-index: 999999999;"><object id="global-zeroclipboard-flash-bridge" name="global-zeroclipboard-flash-bridge" width="100%" height="100%" type="application/x-shockwave-flash" data="http://storage.thucloud.com:7088/static/clipborad/ZeroClipboard.swf?noCache=1466682961897"><param name="allowScriptAccess" value="sameDomain"><param name="allowNetworking" value="all"><param name="menu" value="false"><param name="wmode" value="transparent"><param name="flashvars" value="trustedOrigins=storage.thucloud.com%3A7088%2C%2F%2Fstorage.thucloud.com%3A7088%2Chttp%3A%2F%2Fstorage.thucloud.com%3A7088&amp;swfObjectId=global-zeroclipboard-flash-bridge&amp;jsVersion=2.2.0"><div id="global-zeroclipboard-flash-bridge_fallbackContent">&nbsp;</div></object></div>
    <!--
    <script type="text/javascript" src="/static/js/jquery.contextMenu.js"></script>
    <script>
    $(function(){
    $('#filebody').contextMenu({
            selector: 'tr',
            callback: function(key, options) {
                if (key=='delete'){$(this).children(".filecontrol").children('form').submit()}
                else if (key=='rename'){
                     $current_file_name = $(this).contents('.listfilename').contents('.file-name').text()

             $(this).children('.listfilename').html("<form method='get' action='/rename_file'><input type='hidden' name='current_dir' value=''> <input type='text' value='"+ $current_file_name +"' name='new_name'/><input type='hidden' value='"+$current_file_name+"' name='old_name'/><input type='submit' class='btn btn-sm btn-danger'><a class='btn btn-sm btn-default' href='/home/files' >取消</a></form>")
                }
                else if(key == 'download'){
                    file_name = $(this).children('.listfilename').text()
                   $('#downloadfilename').val(file_name);
                    $("#download_window").submit()

                }

            },
            items: {

                "delete": {name: "删除"},
                "rename": {name: "重命名"}
            }
        });
    });
    </script>-->
    <script type="text/javascript">
    function reloadFilelist(){
        htmlobj=$.ajax({url:"/filelist?current_dir=",async:false});
        $("#filebody").html(htmlobj.responseText);
        $(".checkfile").bind('click',function(){

                    var no_checked = true
                    $(":checkbox:checked").each(function(){

                           if($(this).prop("checked")){
                               no_checked = false
                           }
                    });
                if(!no_checked){
                        $("#operateonfiles").html("<a href='javascript:' onclick='batch_download()' >批量下载</a>");
                    }
                else{
                    $("#operateonfiles").html("文件操作");
                }
                });
            $('.hash-changer').bind('click', function() {
                var hash = $(this).attr('href');
                hashchanged(hash);
            });
            $("#checkboxcontrol").click(function(){
                if($(this).prop('checked')==true){
                    $(".checkboxset").each(function(){
                      $(this).prop("checked", true);
                    })
                }
                else{
                   $(".checkboxset").each(function(){
                      $(this).prop("checked", false);
                    })
                }
            })
          $(".rename-file").bind('click',function(){
              console.log('rename');

             $current_file_name = $(this).parent().parent().contents('.listfilename').contents(".filename-wrapper").contents(".file-name-wrapper").contents(".file-name").text()
             $(this).parent().parent().children('.listfilename').html("<form method='get' action='/rename_file'> <input type='hidden' name='current_dir' value=''><input type='text' value='"+ $current_file_name +"' name='new_name'/><input type='hidden' value='"+$current_file_name+"' name='old_name'/><input type='submit' class='btn btn-sm btn-danger' value='提交'><a class='btn btn-sm btn-default' href='/home/files' >取消</a></form>")

            })
          $(".delete-file").bind('click',function(){

              $(this).parent().children('form').submit()

          })
    }
        $(document).ready(function(){
            reloadFilelist();

            var upload_settings = {
                url: "/upload"+"?current_dir="+"",
                dragDrop:true,
                fileName: "myfile",
                returnType:"json",
                showDelete:false,
                showDown:true,
                 onSuccess:function(files,data,xhr)
                {
                   // alert((data));
                    console.log(data);
                    reloadFilelist();
                }
            };
            var uploadObj = $("#mulitplefileuploader").uploadFile(upload_settings);

        });
        function handle_click_file(file_name){
                $('#downloadModalLabel').html(file_name);
                $('#downloadfilename').val(file_name);
        }
        function share_file(file_name){
            var url = '/openshare';
            var param = {}; // 组装发送参数
                param['filename']  = file_name;
                param['current_dir'] = '';
            $.get(url, param, function(sharedInfo) {
                console.log(sharedInfo)
                  $("#clipboard-text").val("http://storage.thucloud.com:7070#?code="+sharedInfo)
              });
        }
        function batch_download(){
            var all_files = '';
             $(":checkbox:checked").each(function(){
                    console.log($(this).val());
                         all_files+= $(this).val()+"#";
             }
             );
            console.log(all_files);
             var url = '/batchDownload'; // 取Form中要提交的链接
                var param = {}; // 组装发送参数
                param['files']  = all_files;
                param['current_dir'] = '';
              $.get(url, param, function(dom) {
                  location.href = '/media/buffer/batched/'+dom;
              });
        }
    </script>


  

</body></html>