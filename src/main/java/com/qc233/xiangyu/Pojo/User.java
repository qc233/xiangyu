package com.qc233.xiangyu.Pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    long id;
    String nickname;
    String salt;
    String password;
    String nowAuthToken;
    String email;
    boolean inEmailVite;
    Timestamp registerTime;
    Timestamp lastLoginTime;

}
