package com.example.demo.Service;

import com.example.demo.Constant.ResponseClass;
import com.example.demo.Domain.Login;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class LoginService {


    public ResponseClass loginSave(Login login) {
        System.out.println("Login User : -" + login.getPassword());
        ResponseClass responseClass = new ResponseClass();
        responseClass.setMessage("User Login Successfully");
        return responseClass;
    }


    public List<Login> loginData() {
        List<Login> logins = new ArrayList<>();
        int j = 65;
        for (int i = 0; i < 10; i++) {
            Login login = new Login();
            login.setPassword(UUID.randomUUID().toString());
            char j1 = (char) j;
            login.setUsername(String.valueOf(j1));
            j++;
            logins.add(login);
        }
        return logins;
    }
}
