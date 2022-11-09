package com.sswu_gdsc_2022_a.withparentsdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String username;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 30)
    private String nickname;

    @Column(nullable = false, length = 15)
    private String authority;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;

}
