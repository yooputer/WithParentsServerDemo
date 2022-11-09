package com.sswu_gdsc_2022_a.withparentsdemo.service;

import com.sswu_gdsc_2022_a.withparentsdemo.dto.FamilyDTO;
import com.sswu_gdsc_2022_a.withparentsdemo.dto.MemberDTO;
import com.sswu_gdsc_2022_a.withparentsdemo.entity.Family;
import com.sswu_gdsc_2022_a.withparentsdemo.entity.Member;
import com.sswu_gdsc_2022_a.withparentsdemo.repository.FamilyRepository;
import com.sswu_gdsc_2022_a.withparentsdemo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final MemberRepository memberRepo;
    private final FamilyRepository familyRepo;

    @Transactional
    public MemberDTO createTestMember(
            String username,
            String nickname,
            String password,
            String authority
    ){
        return MemberDTO.entityToDTO(
                memberRepo.save(new Member(
                        null,
                        username,
                        password,
                        nickname,
                        authority,
                        null
                ))
        );
    }

    @Transactional
    public FamilyDTO createFamily(
            String password,
            long creatorId
    ){

        // creator_id가 유효한지 검증
        Member creator = memberRepo.findById(creatorId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 member_id입니다."));

        Family family = familyRepo.save(new Family(
                        null,
                        password,
                        null,
                        creator
        ));

        setFamilyId(creatorId, family.getId());

        return FamilyDTO.entityToDTO(family);
    }

    @Transactional
    public Member setFamilyId(long memberId, long familyId){

        Member member = memberRepo.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 member_id입니다."));

        Family family = familyRepo.findById(familyId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 family_id입니다."));

        member.setFamily(family);

        return member;
    }

}
