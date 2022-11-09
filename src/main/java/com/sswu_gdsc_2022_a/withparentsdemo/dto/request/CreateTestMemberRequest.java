package com.sswu_gdsc_2022_a.withparentsdemo.dto.request;

import lombok.Getter;

@Getter
public class CreateTestMemberRequest {

    private String username;
    private String nickname;
    private String password;
    private String authority;

}
