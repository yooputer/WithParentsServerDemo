package com.sswu_gdsc_2022_a.withparentsdemo.repository;

import com.sswu_gdsc_2022_a.withparentsdemo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
