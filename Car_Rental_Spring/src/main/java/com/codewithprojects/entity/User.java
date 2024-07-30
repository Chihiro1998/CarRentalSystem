package com.codewithprojects.entity;

import com.codewithprojects.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 主键生成策略
    private long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;
}
