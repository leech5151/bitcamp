package java100.app.service;

import java.util.List;
import java.util.Map;

import java100.app.domain.Member;

public interface MemberService {
    List<Member> list(int pageNo, int pageSize, Map<String,Object> options);
    Member get(int no);
    Member get(String email, String password);
    int getTotalCount();
    int add(Member member);
    int update(Member member);
    int delete(int no);
}
