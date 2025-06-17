package com.example.demo.Service;

import com.example.demo.Constant.ResponseClass;
import com.example.demo.Domain.Login;
import org.springframework.stereotype.Service;


@Service
public class LoginService {



    public ResponseClass loginSave(Login login) {
        System.out.println("Login User : -" + login.getPassword());
        ResponseClass responseClass =new ResponseClass();
        responseClass.setMessage("User Login Successfully");
        return responseClass;
    }
}
