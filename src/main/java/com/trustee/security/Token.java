package com.trustee.security;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Token {

    private String sub;
    private String userType;
    private String userId;
    private Integer tokenLogId;
    private String userName;
    private String email;

    public Token(String sub, String userType, String email) {
        this.sub = sub;
        this.userType = userType;
        this.email = email;
    }

}
