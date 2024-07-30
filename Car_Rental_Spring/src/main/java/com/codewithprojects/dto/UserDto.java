package com.codewithprojects.dto;

import com.codewithprojects.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String name;
    private String email;
    private UserRole userRole;
}
