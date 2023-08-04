package com.assistencia.helpdesk.atendimento.models;

import com.assistencia.helpdesk.atendimento.enums.UserLevel;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class SystemUser implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private String phone;
    private String login;
    private String password;
    private UserLevel userLevel;
    private Character status;

    public SystemUser() {
    }

    public SystemUser(Integer id, String name, String phone, String login, String password, UserLevel userLevel, Character status) {
        Id = id;
        this.name = name;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.userLevel = userLevel;
        this.status = status;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserLevel getUserLevel() {
        return userLevel;
    }

    public Character getStatus() {
        return status;
    }


    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserLevel(UserLevel userLevel) {
        this.userLevel = userLevel;
    }

    public void setStatus(Character status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUser that = (SystemUser) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
