package com.lp.cloud.gateway.utils;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liupan
 * @version V1.0
 * @date 2018/10/24 16:16
 */
//@Component
public class MyFilter /*extends ZuulFilter*/ {
	private static Logger logger = LoggerFactory.getLogger(MyFilter.class);

	/**
	 * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
	 * pre：路由之前
	 * routing：路由之时
	 * post： 路由之后
	 * error：发送错误调用
	 * @return String
	 */
	//@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * 过滤的顺序
	 * @return int
	 */
	//@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * 可以写逻辑判断，是否要过滤，本文true,永远过滤
	 * @return boolean
	 */
	//@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
	 * @return Object
	 * @throws ZuulException 异常
	 */
	//@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		Object accessToken = request.getParameter("token");
		if(accessToken == null) {
			logger.warn("token is empty");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			try {
				ctx.getResponse().getWriter().write("token is empty");
			} catch (Exception e){}

			return null;
		}
		logger.info("ok");
		return null;
	}
}
