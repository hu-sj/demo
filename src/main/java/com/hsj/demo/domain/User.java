package com.hsj.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    int id;
    String username;
    String password;
    String nickname;
    String email;
    String phone;
    String address;
}
