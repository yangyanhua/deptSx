<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<%@ page import="com.ztcf.entity.* "%>
<%@ page import="java.util.Date" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"    prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.easyui.min.js"></script>
	<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/My97DatePicker/WdatePicker.js" defer="dp"></script>
    <script>
        var date=$("#date").val();
        function findxs() {

            $.ajax({
                //几个参数需要注意一下
                type: "POST",//方法类型
               dataType: "text",//预期服务器返回的数据类型
                url: "${pageContext.request.contextPath }/deptinfo/findAll.do" ,//url
                data: $('#form1').serialize(),date:date,
                success: function (data) {
                    console.log(data+"打印服务端返回的数据(调试用)");//打印服务端返回的数据(调试用)

                        location.href="${pageContext.request.contextPath }/datagrid2.jsp"
                        //alert("SUCCESS");

                },
                error : function() {

                    alert("注意选择日期存在数据缺失！");
                }
            });
        }


    </script>
</head>

<body>
		<h3 align="center">各部门销售报表</h3>
        <h4 align="left"><fmt:formatDate value="${sessionScope.sysdate}" pattern="yyyy-MM-dd "  /></h4>
        <div style="overflow-x:scroll;width:1400px;height:600px;white-space:nowrap;">
        <form  autoScroll="true">

	<table id="tt3"  border="1" bgcolor="#f0f8ff" align="left" >
		<!-- 展示数据 -->
		<tr>
			<td rowspan="3" align="center">部 门</td>
			<td rowspan="3" align="center">主 管</td>
			<td rowspan="3" align="center">当前人数</td>
			<td colspan="6" align="center">和讯课程</td>
			<td  rowspan="3" align="center">周 奖</td>
			<td rowspan="3" align="center">主管加薪</td>
			<td colspan="2" rowspan="2" align="center">升级单数</td>
			<td colspan="2" rowspan="2" align="center">长沙金额</td>
			<td rowspan="3" align="center">月金额汇总</td>
			<td rowspan="3" align="center">升级率</td>
		</tr>
		<tr>
			<td  colspan="3" align="center" width="120px">新单数</td><td colspan="3" align="center">新单金额</td>
		</tr>

		<td align="center">当日</td><td align="center">当周</td><td align="center">当月</td><td align="center">当日</td><td align="center">当周</td><td align="center">当月</td>
		<td align="center">当日</td><td align="center">当月</td>
		<td align="center">当日</td><td align="center">月金额</td>
		</tr>

		<c:forEach items="${sessionScope.deptList}" var="zj">
		<tr class="row1">

			<td style="text-align: center;">
					${zj.dept}
			</td>
			<td style="text-align: center;">
					${zj.name}
			</td>
			<td style="text-align: center;">
						${zj.deptNum}
			</td>

			<td style="text-align: center;">
					${zj.todayOrderNum}
			</td>
			<td style="text-align: center;">
					${zj.weekOrderNum}
			</td>
			<td style="text-align: center;">
					${zj.monthOrderNum}
			</td>

			<td style="text-align: center;">
					${zj.todayAmount}
			</td>
			<td style="text-align: center;">
					${zj.weekAmount}
			</td>
			<td style="text-align: center;">
					${zj.mothAmount}
			</td>
			<td style="text-align: center;">
					${zj.weekBonus}
			</td>
			<td style="text-align: center;">
					${zj.monthBonuss}
			</td>
			<td style="text-align: center;">
					${zj.todayOrdersj}
			</td>
			<td style="text-align: center;">
					${zj.monthOrdersj}
			</td>
			<td style="text-align: center;">
					${zj.todaySjAmount}
			</td>
			<td style="text-align: center;">
					${zj.mothSjAmount}
			</td>
			<td style="text-align: center;">
					${zj.monthSum}
			</td>
			<td style="text-align: center;">
					${zj.sjrate}
			</td>


		</tr>
		</c:forEach>
	</table>
		</form>

			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
			<br><br><br>
		<form id="form1"  action="##"  method="post" align="left">

			选择时间查询:<input  name="datestr" onClick="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'%y-%M-%d'})"  id= "date" type="text"   size="24">
			<%--<input id="date" type="text" name="date" class="Wdate" onclick="WdatePicker({el:$dp.$('date'),dateFmt:'yyyy-MM-dd'})"/>--%>
			<input type="button" onsubmit="return false" value="查询" onclick="findxs()">
		</form>
        </div>


</body>
</html>