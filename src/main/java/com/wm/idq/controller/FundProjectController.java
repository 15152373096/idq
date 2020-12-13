package com.wm.idq.controller;

import com.alibaba.fastjson.JSON;
import com.wm.idq.constants.AccountContants;
import com.wm.idq.constants.NumberConstants;
import com.wm.idq.service.FundProjectService;
import com.wm.idq.vo.FundProjectVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-25
 */
@Controller
@RequestMapping(value = "/fundProject")
public class FundProjectController {
    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[NumberConstants.ONE].getClassName());

    @Autowired
    FundProjectService fundProjectService;

    @RequestMapping(value = "/getAll", produces = "application/json;charset=UTF-8")
    public void getAll(HttpServletResponse response) throws IOException {
        // 当前方法
        final String method = Thread.currentThread().getStackTrace()[NumberConstants.ONE].getMethodName();
        // 定义返回map
        Map<String, Object> map = new HashMap<String, Object>(NumberConstants.SIXTEEN);
        // 服务调用
        List<FundProjectVo> fundProjectVoList = fundProjectService.queryAllFundProject();
        // 日志记录
        LOGGER.info(method + ": queryAllFundProject return - " + fundProjectVoList);
        // 构建map
        map.put(AccountContants.FUND_PROJECT_LIST, fundProjectVoList);
        // 相应消息
        response.getWriter().write(JSON.toJSONString(map));
    }
}
