package com.example.demo.Controller;


import com.example.demo.Constant.ResponseClass;
import com.example.demo.Domain.Register;
import com.example.demo.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register-service")
public class RegisterController {


    @Autowired
    private RegisterService registerService;


    @PostMapping("/register-user")
    public ResponseClass doRegistration(@RequestBody Register register){
        return registerService.doRegistration(register);
    }
}
