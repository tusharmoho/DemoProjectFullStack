package com.example.demo.Service;

import com.example.demo.Constant.ResponseClass;
import com.example.demo.Domain.Register;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class RegisterService {

    public ResponseClass doRegistration(Register register){
        ResponseClass responseClass= new ResponseClass();
        System.out.println("Data Received : "+ register.toString());
        responseClass.setMessage(UUID.randomUUID().toString());
        return responseClass;
    }
}
