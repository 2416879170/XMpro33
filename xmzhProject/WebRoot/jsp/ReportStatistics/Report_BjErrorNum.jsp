<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@include file="/common/common.jsp"%>
<%@include file="/common/skins/skin0/component.jsp"%>
<h:css href="/css/style1/style-custom.css" />
<script src="<%=request.getContextPath() %>/common/gotop/jquery.min.js"></script>

<script src="<%=request.getContextPath() %>/js/org_public.js"></script>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>笔均差错数统计表</title>
	</head>
	<body topmargin="0" leftmargin="0">
	<h:form name="appQuery"	action="/reportjbpm/bjErrorNumReportAction_bjErrorNumReportList.action" method="post">
		<w:panel id="panel1" title="查询条件">
			<table align="center" border="0" width="100%" class="form_table">
				
				<tr>
                     <td class="form_label" align="right" >派单日期：</td>
					<td >
					从
					<w:date  format="yyyy-MM-dd" submitFormat="yyyy-MM-dd" id="repTimeStart" name="bjErrorNumReport.repTimeStart" 
					property="bjErrorNumReport.repTimeStart" /> 
					到
					<w:date format="yyyy-MM-dd" submitFormat="yyyy-MM-dd" id="repTimeEnd" name="bjErrorNumReport.repTimeEnd" 
					property="bjErrorNumReport.repTimeEnd" /></td>
					
                    <td class="form_label" align="right" >一级支行：</td>
					<td>
					    <h:text id="orgNameOne" property="bjErrorNumReport.orgNameOne" readonly="true"  style="width:130px;"/>
						<h:hidden id="orgCodeOne" property="bjErrorNumReport.orgCodeOne" />
					    <a href="#" onclick="open_slzhej_fun(1)">选择</a>
		            </td>	
		            
		            <td class="form_label" align="right" >二级支行：</td>
					<td>
					    <h:text id="orgNameTwo" property="bjErrorNumReport.orgNameTwo" readonly="true"  style="width:130px;"/>
						<h:hidden id="orgCodeTwo" property="bjErrorNumReport.orgCodeTwo" />
					    <a href="#" onclick="open_slzhej_fun(2)">选择</a>
		            </td>				
				</tr>
				
				<tr>	
					<td class="form_label" align="right" >一级分类：</td>
					<td >
			     		<h:hidden id="oneCategoryId" property="bjErrorNumReport.oneCategoryId"/>  
						<h:text id="oneCategory" property="bjErrorNumReport.oneCategory" readonly="true"  style="width:130px;"/>
						<a href="#" onclick="showoneCategory();">选择</a>
					</td>
					
					<td class="form_label" align="right" >贷种分类：</td>
					<td colspan="3">
						<h:hidden id="loanCategoryId" property="bjErrorNumReport.loanCategoryId"/>
						<h:text id="loanCategory" property="bjErrorNumReport.loanCategory" readonly="true"   style="width:130px;"/>
						<a href="#" onclick="showloanCategory();">选择</a>
					</td>
				</tr>
				
				<tr class="form_bottom">
						<td colspan="10" class="form_bottom">
						    <b:message key="l_display_per_page"></b:message>
					        <h:text size="2" property="page.length" value="10" validateAttr="minValue=1;maxValue=100;type=integer;isNull=true" />
					        <input type="hidden" name="page.begin" value="0">
					        <input type="hidden" name="page.isCount" value="true">
							<input id="querys" type="button" value="查 询" class="button" onclick="search();">
							<input type="button" value="清 空" class="button" onclick="clears();">
                                                        <input id="downexl" type="button" class="button" value="导出列表" onclick="excelExport();"></td>
					</tr>			
					
			</table>
		</w:panel>
	</h:form>
	<DIV class="divList">
			<w:panel id="panel" width="100%" title="笔均差错数统计列表">
				<viewlist id="e2c61865-3b56-470d-bd42-fff792fb9493">
				<h:form name="page_form"
					action="/reportjbpm/bjErrorNumReportAction_bjErrorNumReportList.action" method="post">
			 <h:hiddendata property="bjErrorNumReport"/>  

            <h:hidden property="page.begin"/>
		    <h:hidden property="page.length"/>
		    <h:hidden property="page.count"/>
		    <h:hidden property="page.isCount"/>
		    
					<table align="center" border="0" width="100%" class="EOS_table">
		           <tr>
							<th nowrap="nowrap">
								一级支行
							</th>
							<th nowrap="nowrap">
								二级支行
							</th>
							<th nowrap="nowrap">
								一级分类
							</th>
							<th nowrap="nowrap">
								贷种分类
							</th>
							<th nowrap="nowrap">
								笔均差错数
							</th>
						</tr>
                           <l:iterate property="bjErrorNumReportList" id="id1">
							<tr class="<l:output evenOutput='EOS_table_row' oddOutput='EOS_table_row_o'  />">
								<td nowrap="nowrap"> 
									<b:write iterateId="id1" property="orgNameOne" />
								</td>
								<td nowrap="nowrap"> 
									<b:write iterateId="id1" property="orgNameTwo" />
								</td>
								<td nowrap="nowrap"> 
									<b:write iterateId="id1" property="oneCategory" />
								</td>
								<td nowrap="nowrap"> 
									<b:write iterateId="id1" property="loanCategory" />
								</td>
								<td nowrap="nowrap"> 
									<b:write iterateId="id1" property="averageCount" />
								</td>
							</tr>
						</l:iterate>
							<tr>
              <td colspan="23" class="command_sort_area">
            
							
              <div class="h4">
	                <l:equal property="page.isCount" targetValue="true" >
	                  <b:message key="l_total"></b:message>
	                  <b:write property="page.count" />
	                  <b:message key="l_recordNO."></b:message>
	                  <b:write property="page.currentPage" />
	                  <b:message key="l_page"></b:message>/
	                  <b:write property="page.totalPage" />
	                  <b:message key="l_page"></b:message>
	                </l:equal>
	                <l:equal property="page.isCount" targetValue="false" >
	                  <b:message key="l_NO."></b:message>
	                  <b:write property="page.currentPage" />
	                  <b:message key="l_page"></b:message>
	                </l:equal>
	                <l:equal property="page.isCount" targetValue="true">
		                <input type="button" class="button" onclick="firstPage('page', '', null, null, 'page_form');" value='<b:message key="l_firstPage"></b:message>'  <l:equal property="page.isFirst"  targetValue="true">disabled</l:equal> >
		                <input type="button" class="button" onclick="prevPage('page', '', null, null, 'page_form');" value='<b:message key="l_upPage"></b:message>' <l:equal property="page.isFirst"  targetValue="true">disabled</l:equal> >
		                <input type="button" class="button" onclick="nextPage('page', '', null, null, 'page_form');" value='<b:message key="l_nextPage"></b:message>' <l:equal property="page.isLast"  targetValue="true">disabled</l:equal> >
	                  	<input type="button" class="button" onclick="lastPage('page', '', null, null, 'page_form');" value='<b:message key="l_lastPage"></b:message>' <l:equal property="page.isLast"  targetValue="true">disabled</l:equal> >
	                </l:equal>
              </div>
              
              
              </td>
            </tr>
					</table>
				</h:form>
				</viewlist>
			</w:panel>		
		</DIV>
		<script type="text/javascript">

		//清空
		function clears(){
			//清空JSP页面时间控件显示的值
			$("#repTimeStart_input").val("");
			$("#repTimeEnd_input").val("");
			//清空传入后台的时间控件的值
			$name("bjErrorNumReport.repTimeStart").value = "";
			$name("bjErrorNumReport.repTimeEnd").value = "";

			$("#orgNameOne").val("");
			$("#orgCodeOne").val("");
			$("#orgNameTwo").val("");
			$("#orgCodeTwo").val("");
			$("#oneCategory").val("");
			$("#oneCategoryId").val("");
			$("#loanCategory").val("");
			$("#loanCategoryId").val("");
			
		}

		
            function search(){
            	var frm = $name("appQuery");
                frm.submit();
			}

    		//导出excel 	
             function excelExport(){
    				//报单时间 开始
    				var repTimeStart = $id("repTimeStart").value;
    				//报单时间 结束
    				var repTimeEnd = $id("repTimeEnd").value;
    				//一级支行 名称
    				var orgNameOne = $id("orgNameOne").value;
    				//一级支行 code
    				var orgCodeOne = $id("orgCodeOne").value;
    				//二级支行 名称
    				var orgNameTwo = $id("orgNameTwo").value;
    				//二级支行 code
    				var orgCodeTwo = $id("orgCodeTwo").value;
					//一级分类
    				var oneCategory = $id("oneCategory").value;
    				//一级分类id
    				var oneCategoryId = $id("oneCategoryId").value;
    				//贷种分类
    				var loanCategory = $id("loanCategory").value;
    				//贷种分类id
    				var loanCategoryId = $id("loanCategoryId").value;
    				
    				var strUrl = "/reportjbpm/bjErrorNumReportAction_bjErrorNumReportExcel.action?";
    				if(repTimeStart != null){strUrl=strUrl+"&bjErrorNumReport.repTimeStart="+repTimeStart;}
    	    		if(repTimeEnd != null){strUrl=strUrl+"&bjErrorNumReport.repTimeEnd="+repTimeEnd;} 
    				if(orgNameOne != ""){strUrl=strUrl+"&bjErrorNumReport.orgNameOne="+orgNameOne+"&bjErrorNumReport.orgCodeOne="+orgCodeOne;}
    				if(orgNameTwo != ""){strUrl=strUrl+"&bjErrorNumReport.orgNameTwo="+orgNameTwo+"&bjErrorNumReport.orgCodeTwo="+orgCodeTwo;}
    				if(oneCategory != ""){strUrl=strUrl+"&bjErrorNumReport.oneCategory="+oneCategory;} 
    				if(oneCategoryId != ""){strUrl=strUrl+"&bjErrorNumReport.oneCategoryId="+oneCategoryId;} 
    				if(loanCategory != ""){strUrl=strUrl+"&bjErrorNumReport.loanCategory="+loanCategory;} 
    				if(loanCategoryId != ""){strUrl=strUrl+"&bjErrorNumReport.loanCategoryId="+loanCategoryId;} 
    				//alert(strUrl);
    				window.location.href=strUrl;
    			}
		
           //选择	受理支行 
     		function open_slzhej_fun(param){
     			var strUrl ="";
     			var objName="";
     			var peArgument = [];
     			var startOrgid= ${sessionScope.login_user.orgid}; 

     			 //调用org_public.js公共函数，判断当前机构是部门还是机构
     			var info = judgeIsDept(startOrgid); 
     			
     			if(info == "yes"){ //说明是部门，显示全部机构树
     				strUrl ="/tree/initMainTree_mainTree.action?changeTree.showTabOrg=1&changeTree.orgType=4&changeTree.showSelBox=1&changeTree.checkcount=1";
         		}else{ //说明是支行，显示本级及下级机构树
         			strUrl ="/tree/initMainTree_mainTree.action?changeTree.showTabOrg=1&changeTree.orgType=4&changeTree.showSelBox=1&changeTree.checkcount=1&changeTree.startOrgid="+startOrgid;
             	}
             	
     			objName="选择受理支行";  
     			var paramEntity = new ParamEntity('Organization');
         			if(param==1){
         				paramEntity.setProperty('orgname',$id("orgNameOne").value);
         				paramEntity.setProperty('orgcode',$id("orgCodeOne").value);
         				peArgument[3]=[paramEntity,'orgname','orgcode',"orgid"];	
         						
         				showModalCenter(strUrl,peArgument,open_slzhej_callback1,600,430,objName);  //一级支行 机构树回调
                 	}else{
                 		paramEntity.setProperty('orgname',$id("orgNameTwo").value);
         				paramEntity.setProperty('orgcode',$id("orgCodeTwo").value);
         				peArgument[3]=[paramEntity,'orgname','orgcode',"orgid"];	
         				
                 		showModalCenter(strUrl,peArgument,open_slzhej_callback2,600,430,objName);  //二级支行 机构树回调
                 	}
     			}

     		//一级支行	回调方法
    		function open_slzhej_callback1(arg){//回调方法

				if(arg!=''){
    		    	if(arg['Organization']){ //原写法无需判断是否为空
    				  		var sorgidArra  = arg['Organization'].slice(0);//人员数组
    				  		argRes=[[],[],[],[]];
    						for(var i=0;i<sorgidArra.length;i++){
    							argRes[0].push(sorgidArra[i].getProperty("orgcode"));
    							argRes[1].push(sorgidArra[i].getProperty("orgname"));
    						}
    						$id("orgNameOne").value = argRes[1];
    						$id("orgCodeOne").value = argRes[0];
    					}
    		    	}
    			}

    		//二级支行	回调方法
    		function open_slzhej_callback2(arg){//回调方法

				if(arg!=''){
    		    	if(arg['Organization']){ //原写法无需判断是否为空
    				  		var sorgidArra  = arg['Organization'].slice(0);//人员数组
    				  		argRes=[[],[],[],[]];
    						for(var i=0;i<sorgidArra.length;i++){
    							argRes[0].push(sorgidArra[i].getProperty("orgcode"));
    							argRes[1].push(sorgidArra[i].getProperty("orgname"));
    						}
    						$id("orgNameTwo").value = argRes[1];
    						$id("orgCodeTwo").value = argRes[0];
    					}
    		    	}
    			}

     		//选择  一级分类
    		function showoneCategory() {
    			var oneCategoryId=document.getElementById("oneCategoryId").value;
    			strUrl ="/Generalprocess/tGeneralprocessCdtypeAction_oneCategoryDic.action?cdtypeJson="+oneCategoryId,
    			showModalCenter(strUrl,'',showoneCategory_callback1 ,800,430,'一级分类选择'); 
    		} 
    		//一级分类 回调函数
    		function showoneCategory_callback1(args){
    			if(args!=''){
    			var array;
    			array = args.split(":");
    			 document.getElementById("oneCategoryId").value = array[0];
    			 document.getElementById("oneCategory").value = array[1];
    			}
    		}	

    		// 选择  贷种分类
    		function showloanCategory() {
    			var loanCategoryId=document.getElementById("loanCategoryId").value;
    			strUrl ="/Generalprocess/tGeneralprocessCdtypeAction_loanCategoryDic.action?cdtypeJson="+loanCategoryId,
    			showModalCenter(strUrl,'',showloanCategory_callback1 ,800,500,'贷种选择'); 
    		} 
    		//贷种分类 回调函数
    		function showloanCategory_callback1(args){
    			if(args!=''){
    			var array;
    			array = args.split(":");
    			 document.getElementById("loanCategoryId").value = array[0];
    			 document.getElementById("loanCategory").value = array[1];
    			}
    		}
		</script>
		
	</body>
</html>