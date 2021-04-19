package com.hrb.gamersky.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSaveDto {

    private String name;

    private String nickName;

    private String password;

    private String email;

    private String skin;

    private char gender;

    private String note;
}
