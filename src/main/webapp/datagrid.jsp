<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<%@ page import="com.ztcf.entity.* "%>
<%@ page import="java.util.*" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"    prefix="c" %>

<html>
<head>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.easyui.min.js"></script>
</head>

<body>
		<h2>本月各部门销售报表</h2>

	<table id="tt3"  border="1" bgcolor="#f0f8ff" align="left">
		<!-- 展示数据 -->
		<tr>
			<td style="text-align: center;">部门</td>
			<td style="text-align: center;">主管</td>
			<td style="text-align: center;">当前人数</td>
		</tr>

		<c:forEach items="${sessionScope.list1}" var="zj">
		<tr class="row1">

			<td style="text-align: center;">
					${zj.dept}
			</td>
			<td style="text-align: center;">
					${zj.name}
			</td>
			<td style="text-align: center;">
					${zj.zjcfDeptnumber.num}
			</td>

		</tr>
		</c:forEach>

	</table>
<table  id="ta"  border="1"  bgcolor="#f0f8ff" align="left">
	<tr>
		<td style="text-align: center;">当日订单数</td>

	</tr>
	<c:forEach items="${sessionScope.lista }" var="count">
		<tr class="row2">

			<td style="text-align: center;">
					${counts}
			</td>
		</tr>
	</c:forEach>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
</table>
	<table  id="tb" border="1"  bgcolor="#f0f8ff" align="left">
	<tr>

		<td style="text-align: center;">当周订单数</td>
	</tr>
		<c:forEach items="${sessionScope.listb }" var="model">
		<tr class="row2">


			<td style="text-align: center;">
					${model.counts}
			</td>
		</tr>
	</c:forEach>
		<tr style="text-align: center;">
			<td>0</td>
		</tr>
		<tr style="text-align: center;">
			<td>0</td>
		</tr>
		<tr style="text-align: center;">
			<td>0</td>
		</tr>
		<tr style="text-align: center;">
			<td>0</td>
		</tr>
		<tr style="text-align: center;">
			<td>0</td>
		</tr>


</table>
	<table  id="tc"  border="1"  bgcolor="#f0f8ff" align="left">
		<tr>

			<td style="text-align: center;">当月订单数</td>
		</tr>
		<c:forEach items="${sessionScope.listc }" var="model">
			<tr class="row2">

				<td style="text-align: center;">
						${model.counts}
				</td>
			</tr>
		</c:forEach>
	</table>
<table  id="td"  border="1"  bgcolor="#f0f8ff" align="left">
	<tr>
		<td style="text-align: center;">当日订单金额</td>
	</tr>
	<c:forEach items="${sessionScope.listd }" var="count">
		<tr class="row2">
			<td style="text-align: center;">
					${count}
			</td>
		</tr>
	</c:forEach>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
</table>
<table  id="te" border="1"  bgcolor="#f0f8ff" align="left">
	<tr>



		<td style="text-align: center;">当周订单金额</td>
	</tr>
	<c:forEach items="${sessionScope.liste }" var="model">
		<tr class="row2">

			<td style="text-align: center;">
					${model.counts}
			</td>
		</tr>
	</c:forEach>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>
	<tr style="text-align: center;">
		<td>0</td>
	</tr>

</table>
<table  id="tf"  border="1"  bgcolor="#f0f8ff" align="left">
	<tr>

		<td style="text-align: center;">当月订单金额</td>
	</tr>
	<c:forEach items="${sessionScope.listf }" var="model">
		<tr class="row2">

			<td style="text-align: center;">
					${model.counts}
			</td>
		</tr>
	</c:forEach>
</table>

		<table  id="bord" border="1"  bgcolor="#f0f8ff" align="left">
			<tr>



				<td style="text-align: center;">周奖金</td>
			</tr>
			<c:forEach items="${sessionScope.weekBonus }" var="model">
				<tr class="row2">

					<td style="text-align: center;">
							${model}
					</td>
				</tr>
			</c:forEach>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>

		</table>
		<table  id="month" border="1"  bgcolor="#f0f8ff" align="left">
			<tr>



				<td style="text-align: center;">主管奖金</td>
			</tr>
			<c:forEach items="${sessionScope.monthBonus }" var="model">
				<tr class="row2">

					<td style="text-align: center;">
							${model}
					</td>
				</tr>
			</c:forEach>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>

		</table>
		<table  id="tsji"  border="1"  bgcolor="#f0f8ff" align="left">
			<tr>


				<td style="text-align: center;">月升级单数</td>
				<td style="text-align: center;">升级单金额</td>
			</tr>
			<c:forEach items="${sessionScope.list4 }" var="model">
				<tr class="row2">


					<td style="text-align: center;">
							${model.counts}
					</td>
					<td style="text-align: center;">
							${model.upamount}
					</td>
				</tr>
			</c:forEach>
			<tr style="text-align: center;">
				<td>0</td>
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
				<td>0</td>
			</tr>

		</table>


		<table  id="montol"  border="1"  bgcolor="#f0f8ff" align="left">
			<tr>
				<td style="text-align: center;">月总金额</td>
			</tr>
			<c:forEach items="${sessionScope.monthTol }" var="model">
				<tr class="row2">
					<td style="text-align: center;">
							${model}
					</td>
				</tr>
			</c:forEach>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
		</table>

		<table  id="percent"  border="1"  bgcolor="#f0f8ff" align="left">
			<tr>
				<td style="text-align: center;">升级率</td>
			</tr>
			<c:forEach items="${sessionScope.percentum}" var="model">
				<tr class="row2">
					<td style="text-align: center;">
							${model}
					</td>
				</tr>
			</c:forEach>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
			<tr style="text-align: center;">
				<td>0</td>
			</tr>
		</table>

</body>
</html>