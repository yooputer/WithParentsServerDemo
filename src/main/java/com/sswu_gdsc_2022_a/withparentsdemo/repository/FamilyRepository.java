package com.sswu_gdsc_2022_a.withparentsdemo.repository;

import com.sswu_gdsc_2022_a.withparentsdemo.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<Family, Long> {
}
