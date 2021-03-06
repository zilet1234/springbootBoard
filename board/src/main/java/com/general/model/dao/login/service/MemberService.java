package com.general.model.dao.login.service;

import com.general.model.dao.login.domain.Member;

import java.util.List;

public interface MemberService {

    Member get(Integer memberSeq);

    List<Member> getAll();

    Member add(Member member);

    List<Member> adds(List<Member> members);

    Member modify(Member member);

    void remove(Integer memberSeq);

    void removes(List<Integer> memberSeqs);

}
