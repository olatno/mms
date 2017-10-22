package com.mms.application.bean;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by olatu on 26/12/2015.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{

    private int id;
    private String password;
    private String email;
    private boolean enabled;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private String userRole;


    public User(){}

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column (name = "account_non_expired", columnDefinition = "TINYINT")
    public boolean isAccountNonExpired() {
        return true;
    }
    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }


    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column (name = "account_non_locked", columnDefinition = "TINYINT")
    public boolean isAccountNonLocked() {
        return true;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;

    }

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column (name = "credential_non_expired", columnDefinition = "TINYINT")
    public boolean isCredentialsNonExpired() {
        return true;
    }
    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;

    }

    @Column (name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column (name = "enabled", columnDefinition = "TINYINT")
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    @Column (name = "role")
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Column (name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
