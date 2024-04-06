package com.jsw.certificates.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginModel,Long> {

    LoginModel findByUsername(String username);
}
