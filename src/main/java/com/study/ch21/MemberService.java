package com.study.ch21;


import com.study.ch19.Member;

import java.util.ArrayList;

public interface MemberService {
    
    // interface - 무조건 throws Exception 달아주기
    //구현이 안돼서 설계할 때 무슨 오류가 날지 모른다
    public void printMemberList(ArrayList<Member> members) throws Exception;
}
