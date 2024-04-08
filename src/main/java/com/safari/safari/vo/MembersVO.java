package com.safari.safari.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class MembersVO {

    private String UserId;
    private String Password;
    private String UserName;
    private String Email;
    private String Phone;

    public MembersVO(String UserId, String Password, String UserName, String Email, String Phone) {
        this.UserId = UserId;
        this.Password = Password;
        this.UserName = UserName;
        this.Email = Email;
        this.Phone = Phone;
    }
}