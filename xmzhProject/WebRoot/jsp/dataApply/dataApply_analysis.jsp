<%@page pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%@include file="/common/skins/skin0/component.jsp"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<h:css href="/css/style1/style-custom.css" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="/css/fileDown.css">
<script type="text/javascript" src="/common/gotop/jquery.min.js"></script>
<script type="text/javascript" src="/js/fileDown.js"></script>
<script type="text/javascript" src="/js/jquery.form.js"></script>
<script type="text/javascript" src="/js/commonUtil.js"></script>
<title>新增数据使用申请单</title>
</head>
  
  <body>
  <%-- <w:panel title="数据使用申请"> --%>
    <h:form id="applyDataForm" name="applyDataForm" action="" method="post" enctype="multipart/form-data">
<table align="center" border="0" width="100%" class="form_table">
       <tr>
         <td  colspan="4" style="text-align: center;font-weight:bold;font-size:12pt;height:50px" >数据申请
        	<h:hidden id="executionId" name="processInstanceId" property="taskAssgineeDto/executionId"/>
        	<h:hidden id="taskId" name="taskId" property="taskAssgineeDto/nextTaskId"/>
        	<h:hidden id="taskAssingee" name="taskAssingee" property="taskAssgineeDto/taskAssingee"/>
        	<h:hidden id="resourceId" name="resourceId" property="applyData.daId" />
        	<h:hidden id="isC" name="isC" property="taskAssgineeDto/isC"/>
        	 <h:hidden id="businessType" name="businessType" property="taskAssgineeDto/businessType"/> </td>
      </tr>
      <tr>
      	<td class="form_label" align="right">
       <nobr>  标　　　 题： </nobr>       </td>
        <td colspan="3">
          <b:write property="applyData.daTitle"/></td>
      </tr>
      <tr>
        <td class="form_label" align="right" style="width:14%">
         <nobr> 申　 请　人：</nobr>        </td>
        <td colspan="1" style="width:36%">
        	<b:write property="applyData.empName" />        </td>
        <td class="form_label" align="right" style="width:14%">
        <nobr> 联  系  电  话：</nobr>        </td>
        <td colspan="1" style="width:36%">
        	<b:write property="applyData.phoneNo"/></td>
      </tr>
      <tr>
         <td class="form_label" align="right">
        <nobr>  申 请 部 门：      </nobr>  </td>
        <td>
         <b:write property="applyData.orgName" scope="session" />        </td>
        <td class="form_label" align="right"><nobr>是否涉及客户敏感数据：</nobr></td>
        <td><d:write dictTypeId="ZHPT_SENSITIVE_DATA" property="applyData.isSdata"/></td>
      </tr>
	   <tr>
       <td class="form_label" align="right"><nobr>申 请 事 项：</nobr></td>
     	<td colspan="3">
     		<b:write property="applyData.daMatter"/></td>
     </tr>
      <tr>
       <td class="form_label" align="right"><nobr>申 请 内 容：</nobr></td>
     	<td colspan="3">
     		<b:write property="applyData.daContent"/></td>
     </tr>
	  <%-- <tr>
       <td class="form_label" align="right">申 请 原 因：</td>
     	<td colspan="3">
     		<b:write property="applyData.daReason"/></td>
     </tr> --%>
	  <tr>
       <td class="form_label" align="right"><nobr>提 取 时 限：</nobr></td>
     	<td colspan="1">
     		<w:date id="daTlimit" property="applyData.daTlimit" submitFormat="yyyyMMdd" format="yyyy-MM-dd"/>
     	</td>
		<td class="form_label" align="right"><nobr>提 取 频 度：</nobr></td>
     	<td colspan="1">
     	<l:equal property="applyData.daFreq" targetValue="01">
     		<d:write dictTypeId="ZHPT_FREQUENCY_EXT" property="applyData.daFreq"/>
     	</l:equal>
     	<l:notEqual property="applyData.daFreq" targetValue="01">
     		<b:write property="applyData.freqNo"/>次/<d:write dictTypeId="ZHPT_FREQUENCY_TYPE" property="applyData.freqType"/>
     	</l:notEqual>
     	</td>
     </tr>
	 <tr>
	 <td class="form_label" align="right"><nobr>提 取 范 围：</nobr></td>
     	<td colspan="3">
     		<b:write property="applyData.daRange"/>
     	</td>
	</tr>
     <tr>
     <td class="form_label" align="right"><nobr>数据使用人员：</nobr></td>
     	<td colspan="3">
     		<b:write property="applyData.username"/>
     		<h:hidden id="dataUser" name="applyData.dataUser" property="applyData.dataUser" />
     	</td>
     </tr>
	  <tr>
     <td class="form_label" align="right"><nobr>数据主管部门：</nobr></td>
     	<td colspan="1">
     		<b:write property="applyData.orgName"/>
     	</td>
     	<td class="form_label" align="right"><nobr>数据使主管人员：</nobr></td>
     	<td colspan="1">
     		<b:write property="applyData.eEmpName"/>
     	</td>
     </tr>
	  <tr>
     <td class="form_label" align="right"><nobr>数据使用期限：</nobr></td>
     	<td colspan="3">
     	<b:write property="applyData.useTlimit" formatPattern="yyyy-MM-dd" /></td>
     </tr>
     <tr>
     	<td class="form_label" align="right"><nobr>附　　　 件：</nobr></td>
	     <td colspan="3">
	     	<div id="tag"></div>
     	</td>
     </tr>
     <tbody style="display:none" id="rdiv">
	     <tr>
	     	<td class="form_label" align="right"><nobr>风险评估人：</nobr></td>
	     	<td colspan="3">
	     		<b:write property="applyData.rEmpName"/>
	     	</td>
	     </tr>
	     <tr>
	     	<td class="form_label" align="right"><nobr>风 险 评 估：</nobr></td>
	     	<td colspan="3">
	     		<b:write property="applyData.risk"/>
	     	</td>
	     </tr>
	     <tr>
	     	<td class="form_label" align="right"><nobr>风险管理部领导：</nobr></td>
	     	<td colspan="3">
	     		<b:write property="applyData.rleader"/>
	     	</td>
	     </tr>
	     <tr>
	     	<td class="form_label" align="right"><nobr>领导意见：</nobr></td>
	     	<td colspan="3">
	     		<b:write property="applyData.ropin"/>
	     	</td>
	     </tr>
	  </tbody>
      <tr id="analysisTr">
     	<td class="form_label" align="right"><nobr>可行性分析：</nobr></td>
     	<td colspan="3">
	     	<h:textarea  extAttr="class='h80' "  rows="5" cols="" style="width:90%" validateAttr="maxLength=512;allowNull=false" id="opinion" name="analysisReport"/>
	     	<font style="color: red">*</font>
     	</td>
     </tr>
     	<%@include file="/jsp/util/default_opinionUtil.jsp" %>
     <tr class="form_bottom">
       <td colspan="4">
         <input type="button" value="提交" id="pass" class="button" onclick="doSubmit();">
         <input type="button" value="回退" id="pass2" class="button" onclick="doSubmit2();">
         <input type="button" value="查看流程" onclick="doflowpic();" class="button" id="flowpic" />
        </td>
     </tr>
     <tr>
     	<td class="form_label" align="right">流 程 列 表：</td>
     <td colspan="3">
     <%@include file="/jsp/util/opinionUtil.jsp"%>
		</td>
     </tr>
    </table>
    </h:form>
    <%-- </w:panel> --%>
    <iframe name="hiframe" style="display:none"></iframe>
  </body>
  <script type="text/javascript">
		$(document).ready(function(){
			var isView = '${isView}';
			if(isView!=''){
				$("#pass").hide();
				$("#analysisTr").hide();}

			if('${taskAssgineeDto.isC}'){
				$("#pass").hide();
			}else{
				$("#pass2").hide();
				}
			
			$.ajax({
		        url: '/file/tFileResourceTableAction_queryFileList.action',
		        async: false,
		        type: 'post',
		        data: "resourceType=05&resourceId=<b:write property="applyData.daId" />",
		        dataType: 'json',
		        timeout: 60000,
		        success: function (files) {
			        if(files!=null){
			         	$.each(files,function( i,item ){
			    	        $("#tag").fileDown({filename:item.fileName,filevalue:item.fileId});
			          		});	
			        }
		        }
	      });
		      
		      if('${applyData.rleader}'!='' && '${sessionScope.login_user.positionId[0]}'!='8')
			      $("#rdiv").show();
		});

		function initPlanCell20(){
			var queryCond="";
				queryCond += "<resourceId>${applyData.daId}</resourceId>";
				queryCond += "<resourceType>05</resourceType>";
				return queryCond;
		}
		
		function doSubmit(){
			if(checkForm($id("applyDataForm"))){
				var strUrl = "/jbpm/jbpmDemoAction_toNextTaskConfig.action?taskAssgineeDto.executionId="+$id("executionId").value+"&taskAssgineeDto.beginOrg=<b:write property="taskAssgineeDto.beginOrg" />"+"&taskAssgineeDto.beginAssingee=<b:write property="taskAssgineeDto.beginAssingee" />";
	    		showModalCenter(strUrl, null, taskAssigneeCallBack, 700, 400, '节点选择');
			}
		}

		function doSubmit2(){
			if(checkForm($id("applyDataForm"))){
				var strUrl = "/jbpm/jbpmDemoAction_toNextTaskConfig2.action?taskAssgineeDto.executionId="+$id("executionId").value+"&taskAssgineeDto.beginOrg=<b:write property="taskAssgineeDto.beginOrg" />"+"&taskAssgineeDto.beginAssingee=<b:write property="taskAssgineeDto.beginAssingee" />";
	    		showModalCenter(strUrl, null, taskAssigneeCallBack, 700, 400, '节点选择');
			}
		}
		
		function taskAssigneeCallBack(arg){
			//arg ="taskAssgineeDto.empids=1,2&taskAssgineeDto.empnames=张三，李四&taskAssgineeDto.transitionName=同意";
			if(arg!=''){
				var url = "/dataApply/tApplyDataAction_submitAnalysis.action?";
				//url+=$("#applyDataForm").serialize();
				//url+="&";
				arg=encodeURI(arg);
				url+=arg;
				$("#applyDataForm").attr("action",url);
				maskTop();
				var options = {
		  		  		type : "post",
		  		  		cache : "false",
		  			  	success : function(data){
		  					try {  
		  					  	if(data.indexOf("success")>=0){
		      					  	alert("操作成功!");
	  	 					  		unMaskTop();
		  					  		//reload();
	  	 					  	//WEB.turnMainFrame();20140905改
		      					    window.close();
		  					  	}else if(data.indexOf("fails")>=0){
		      					  	alert("操作失败!");
	  	 					  		unMaskTop();
		  					  	}else{	 
		  					  	    alert("操作失败!"); 
	  	 					  		unMaskTop();
		  					  	}
		  	   				} catch (Exception) {  
		  					}  
		  				},  
		  			  	error : function(data){
		  				  alert("提交失败请联系管理员！");
						  		unMaskTop();
		  			   	}  
		  			}; 
		  	  	$("#applyDataForm").ajaxSubmit(options);
			}
  	   }

		$id("daTlimit").onValidate=function(hiddenValue,TextValue)
		{
			if(this.getValue()=="") 
			 return true;
			else
			{
				var result = WEB.today();
			  if(this.getValue()<result) 
			     {
			      f_alert($id("daTlimit").text,"日期要大于当前时间");
			      return false;
			      }
			      else
			      return true;
			}

		}
  </script>
</html>
