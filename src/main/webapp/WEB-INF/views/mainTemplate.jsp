<%@ include file="/WEB-INF/views/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
	<head>
		<title><f:message key="header.title"/></title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="<f:message key="header.metadata"/>" />
		<meta name="keywords" content="<f:message key="header.title"/>" />
	</head>
	<body>
		<tiles:insertAttribute name="header"/>
		<div id="site_content">		
			<tiles:insertAttribute name="banner"/>
			<tiles:insertAttribute name="content"/>
		</div>
		<tiles:insertAttribute name="footer"/>
	</body>
</html>
