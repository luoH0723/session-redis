package com.lh.sessionredis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: session-redis
 * @BelongsPackage: com.lh.sessionredis.controller
 * @Author: LHao
 * @CreateTime: 2023-10-30  17:15
 * @Description: TODO
 * @Version: 1.0
 */
/**
 * 主页
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@RestController
public class IndexRestController {

    /**
     * 主页
     *
     * @param request  请求
     * @param response 响应
     * @return 返回 数据
     */
    @RequestMapping
    public Map<String, Object> index(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>(4);

        HttpSession session = request.getSession();
        String id = session.getId();

        map.put("sessionId", id);

        return map;
    }

}
