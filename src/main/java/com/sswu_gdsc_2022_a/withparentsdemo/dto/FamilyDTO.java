package com.sswu_gdsc_2022_a.withparentsdemo.dto;

import com.sswu_gdsc_2022_a.withparentsdemo.entity.Family;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FamilyDTO {

    private long id;
    private String password;
    private Long creator_id;

    public static FamilyDTO entityToDTO(Family e){
        return new FamilyDTO(
                e.getId(),
                e.getPassword(),
                e.getCreator().getId()
        );
    }

}
