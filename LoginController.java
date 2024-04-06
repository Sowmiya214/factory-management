package com.jsw.certificates.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loginInfo")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;
    @PostMapping("/getCredential")
    public String getCredential(@RequestBody LoginModel loginModel){
        LoginModel user = loginRepository.findByUsername(loginModel.getUsername());
        // Check if the user exists and if the password matches
        try {
            if(user!=null && user.getUsername().equals(loginModel.getUsername())) {
                if (user.getPassword().equals(loginModel.getPassword())) {
                    return "Login success";
                } else {
                    return "Login failed";
                }
            }else {
                return "Invalid Credential";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
