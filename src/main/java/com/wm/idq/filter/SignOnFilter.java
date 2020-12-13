package com.wm.idq.filter;

import com.wm.idq.constants.CommonConstants;
import com.wm.idq.constants.SignOnConstants;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-01-31
 */
public class SignOnFilter implements Filter {

    /**
     * 跳转管理页面
     */
    private static final String FTL_LOGIN = "/idq/login";

    /**
     * 不过滤的文件
     */
    private static List<String> prefixIgnores;


    public void init(FilterConfig filterConfig) throws ServletException {
        prefixIgnores = new ArrayList<String>();
        String ignoresParam = filterConfig.getInitParameter("ignores");
        String[] ignoreArray = ignoresParam.split(",");
        for (String s : ignoreArray) {
            prefixIgnores.add(s);
        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        // 获取请求路径
        String path = request.getRequestURI();
        // 获取登录标记
        String loginFlag = (String) session.getAttribute(SignOnConstants.LOGIN_FLAG);
        // 如果已经登录或者可以忽略过滤
        if (StringUtils.equals(SignOnConstants.FLAG_YES, loginFlag) || needIgnore(path, prefixIgnores)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            response.sendRedirect(getLoginUrl(request));
        }
    }

    /**
     * 获取登录地址
     *
     * @param request HttpServletRequest
     * @return String
     */
    private String getLoginUrl(HttpServletRequest request) {
        return FTL_LOGIN + getTargetUrlParam(request);
    }

    /**
     * 获取登录成功后的回转地址
     *
     * @param request HttpServletRequest
     * @return String
     */
    private String getTargetUrlParam(HttpServletRequest request) {
        String requestURL = request.getRequestURL().toString();
        if(requestURL.contains("/login") || requestURL.contains("/logout")) {
            return CommonConstants.EMPTY_STRING;
        }
        return CommonConstants.QUESTION_SIGN + SignOnConstants.TARGET_URL + CommonConstants.EQUAL_SIGN + request.getRequestURL();
    }

    /**
     * 判断是否可以忽略过滤
     *
     * @param path          String
     * @param prefixIgnores List<String>
     * @return boolean
     */
    private boolean needIgnore(String path, List<String> prefixIgnores) {
        for (String s : prefixIgnores) {
            if (path.contains(s)) {
                return true;
            }
        }
        return false;
    }

    public void destroy() {

    }
}
