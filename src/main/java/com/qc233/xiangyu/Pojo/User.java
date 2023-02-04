package com.qc233.xiangyu.Pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    long id;
    String nickname;
    String salt;
    String password;
    Timestamp registerTime;
    Timestamp lastLoginTime;

}
