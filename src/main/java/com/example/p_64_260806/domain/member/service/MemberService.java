package com.example.p_64_260806.domain.member.service;

import com.example.p_64_260806.domain.member.entity.Member;
import com.example.p_64_260806.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member join(String username, String nickname) {
        return memberRepository.save(new Member(username, nickname));
    }

    public long count() {
        return memberRepository.count();
    }
}