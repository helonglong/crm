package com.hll.controller;

import com.hll.utils.VerifyCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 何龙
 * @create 2018-12-16 11:27
 */
@Controller
public class VerificationCodeController {
    @RequestMapping("/getCode")
    public void getAuthCode(HttpServletRequest request, HttpServletResponse response, HttpSession session)
            throws IOException {
        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        //删除以前的
        session.removeAttribute("verCode");
        session.setAttribute("verCode", verifyCode.toLowerCase());
        //生成图片
        int w = 100, h = 30;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }
}
