package com.sswu_gdsc_2022_a.withparentsdemo.dto;

import com.sswu_gdsc_2022_a.withparentsdemo.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MemberDTO {

    private Long id;
    private String username;
    private String nickname;
    private String authority;
    private Long family_id;

    public static MemberDTO entityToDTO(Member e){
        return new MemberDTO(
                e.getId(),
                e.getUsername(),
                e.getNickname(),
                e.getAuthority(),
                e.getFamily().getId()
        );
    }

}
