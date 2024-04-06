package com.jsw.certificates.Admin;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;


@Entity
@Data
@Table(name = "factory_login")
@DynamicUpdate
public class LoginModel {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLogin_date_time() {
        return login_date_time;
    }

    public void setLogin_date_time(Date login_date_time) {
        this.login_date_time = login_date_time;
    }

    public Date getLogout_date_time() {
        return logout_date_time;
    }

    public void setLogout_date_time(Date logout_date_time) {
        this.logout_date_time = logout_date_time;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,unique = true)
    private Long id;
    private String username;
    private String password;
    private Date login_date_time;
    private Date logout_date_time;

}
