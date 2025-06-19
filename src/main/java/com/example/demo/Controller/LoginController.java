package com.example.demo.Controller;

import com.example.demo.Constant.ResponseClass;
import com.example.demo.Domain.Login;
import com.example.demo.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/login-service")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login-check")
    public ResponseClass saveUser(@RequestBody Login login) {
        return loginService.loginSave(login);
    }

    @GetMapping("/login-list")
    public List<Login> list() {
        return loginService.loginData();
    }

    @GetMapping("/login-data")
    public Login user(@RequestParam(name = "username") String name) {
        return loginService.getData(name);
    }
}
