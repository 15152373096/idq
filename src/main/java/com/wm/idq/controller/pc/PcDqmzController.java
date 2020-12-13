package com.wm.idq.controller.pc;

import com.wm.idq.constants.NumberConstants;
import com.wm.idq.vo.ImageItemVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-01-05
 */

@Controller
public class PcDqmzController {
    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[NumberConstants.ONE].getClassName());

    private static final String FTL_DQMZ = "/web/pc/dqmz/index";

    @RequestMapping(value = "/dqmz")
    public String dqmz(Model model) {
        LOGGER.info("go ");
        List<ImageItemVo> imageList = getImageList();
        model.addAttribute("imageList", imageList);
        return FTL_DQMZ;
    }

    /**
     * 模拟数据
     * @return 图片列表
     */
    private List<ImageItemVo> getImageList() {
        List<ImageItemVo> imageList = new ArrayList<ImageItemVo>();
        for (int i = 1; i < NumberConstants.THIRTY_NINE; i++) {
            ImageItemVo image = new ImageItemVo();
            String imageId = i < 10 ? "0" + i : "" + i;
            image.setId(imageId);
            image.setTitle("photo");
            image.setSubTitle("dq");
            String description = 1 == i%2 ? "dq is the most beautiful girl" : "dq will be 18 forever";
            image.setDescription(description);
            imageList.add(image);
        }
        return imageList;
    }
}
