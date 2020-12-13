package com.wm.idq.controller;

import com.wm.idq.constants.CommonConstants;
import com.wm.idq.constants.NumberConstants;
import com.wm.idq.constants.SignOnConstants;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-01-31
 */

@Controller
public class SignOnController {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[NumberConstants.ONE].getClassName());

    /**
     * 登录主页面
     */
    private static final String FTL_LOGIN_IN = "/web/pc/login/index";

    /**
     * 跳转管理页面
     */
    private static final String LOGIN_SUCCESS = "redirect:/pc/account/index";

    /**
     * 登录
     *
     * @param username String
     * @param password String
     * @param request HttpServletRequest
     * @param model Model
     * @return String
     */
    @RequestMapping(value = "/login")
    public String login(String username, String password, HttpServletRequest request, Model model) {
        // 当前方法
        final String method = Thread.currentThread().getStackTrace()[NumberConstants.ONE].getMethodName();
        // 回跳地址
        String targetUrl = request.getParameter(SignOnConstants.TARGET_URL);
        LOGGER.info(method + ":targetUrl=" + targetUrl);
        // 校验登录
        if(StringUtils.equals("wangming", username) && StringUtils.equals("aidiaqiong", password)) {
            request.getSession().setAttribute(SignOnConstants.LOGIN_FLAG, SignOnConstants.FLAG_YES);
            if(StringUtils.isNoneBlank(targetUrl)) {
                return CommonConstants.REQUEST_TYPE_REDIRECT + targetUrl;
            }else {
                return LOGIN_SUCCESS;
            }
        }
        model.addAttribute(SignOnConstants.TARGET_URL, targetUrl);
        return FTL_LOGIN_IN;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute(SignOnConstants.LOGIN_FLAG);
        return FTL_LOGIN_IN;
    }
}
