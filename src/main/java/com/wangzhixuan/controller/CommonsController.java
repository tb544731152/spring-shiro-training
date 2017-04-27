package com.wangzhixuan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangzhixuan.commons.shiro.captcha.DreamCaptcha;
import com.wangzhixuan.commons.ueditor.UeditorService;

/**
 * 通用的控制器
 * @author L.cm
 *
 */
@Controller
public class CommonsController {
    @Autowired
    private DreamCaptcha dreamCaptcha;
    @Autowired
    private UeditorService ueditorService;
    
    /**
     * 图标页
     */
    @GetMapping("icons.html")
    public String icons() {
        return "icons";
    }
    
    /**
     * 图形验证码
     */
    @GetMapping("captcha.jpg")
    public void captcha(HttpServletRequest request, HttpServletResponse response) {
        dreamCaptcha.generate(request, response);
    }
    
    /**
     * ueditor编辑器
     */
    @RequestMapping("ueditor")
    public void ueditor(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        String json = ueditorService.exec(request);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            IOUtils.closeQuietly(writer);
        }
    }
}
