package com.sswu_gdsc_2022_a.withparentsdemo.controller;

import com.sswu_gdsc_2022_a.withparentsdemo.dto.FamilyDTO;
import com.sswu_gdsc_2022_a.withparentsdemo.dto.MemberDTO;
import com.sswu_gdsc_2022_a.withparentsdemo.dto.request.CreateFamilyRequest;
import com.sswu_gdsc_2022_a.withparentsdemo.dto.request.CreateTestMemberRequest;
import com.sswu_gdsc_2022_a.withparentsdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/api/user/createTestMember")
    public MemberDTO createTestMember(
            @RequestBody CreateTestMemberRequest body
    ){
        return userService.createTestMember(
                body.getUsername(),
                body.getNickname(),
                body.getPassword(),
                body.getAuthority()
        );
    }

    @PostMapping("/api/user/createFamily")
    public FamilyDTO createFamily(
            @RequestBody CreateFamilyRequest body
    ){
        return userService.createFamily(
                body.getPassword(),
                body.getCreatorId()
        );
    }

}
