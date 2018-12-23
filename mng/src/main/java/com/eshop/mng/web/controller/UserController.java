package com.eshop.mng.web.controller;

import com.eshop.mng.service.UserService;
import com.eshop.mng.vo.ResponseData;
import com.eshop.mng.vo.ResponseDateEnum;
import com.eshop.mng.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 佳琪如梦
 * @create 2018-12-23 13:24
 **/

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public ResponseData addUser(HttpServletRequest request, @RequestBody UserVO userVO) {
        userService.addUser(userVO);
        return null;
    }

    @RequestMapping("getUser")
    public ResponseData getUser() {
        return null;
    }

    @RequestMapping("deleteUser")
    public ResponseData deleteUser() {
        return null;
    }

    @RequestMapping("updateUser")
    public ResponseData updateUser() {
        return null;
    }

    @RequestMapping("login")
    public ResponseData login(HttpServletRequest request, @RequestBody UserVO userVO) {
        HttpSession session = request.getSession();
        boolean ret = userService.login(userVO);
        return new ResponseData(ResponseDateEnum.SUCCESS,ret);
    }
}
