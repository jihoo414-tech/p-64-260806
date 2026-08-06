package com.example.p_64_260806.domain.member.repository;

import com.example.p_64_260806.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {
}
