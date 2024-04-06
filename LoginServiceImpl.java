package com.jsw.certificates.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;
    @Override
    public LoginModel getCredential(LoginModel factoryModel) {
        return loginRepository.findByUsername(factoryModel.getUsername());
    }
}
