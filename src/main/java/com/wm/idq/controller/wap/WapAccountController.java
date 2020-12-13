package com.wm.idq.controller.wap;

import com.wm.idq.constants.NumberConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-07
 */
@Controller
@RequestMapping(value = "/wap")
public class WapAccountController {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[NumberConstants.ONE].getClassName());

    /**
     * 账单主页
     */
    private static final String FTL_ACCOUNT_INDEX = "/web/wap/account/index";

    /**
     * 账单查询主页
     */
    private static final String FTL_VIEW_INDEX = "/web/wap/account/viewIndex";


    @RequestMapping(value = "/account/index")
    public String index() {
        LOGGER.info("wap account index");
        return FTL_ACCOUNT_INDEX;
    }

    @RequestMapping(value = "/view/index")
    public String viewIndex() {
        LOGGER.info("wap view index");
        return FTL_VIEW_INDEX;
    }
}
