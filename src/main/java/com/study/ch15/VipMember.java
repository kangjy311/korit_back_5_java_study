package com.study.ch15;

public class VipMember extends Member {
    private final String GRADE = "VIP";

    //상속받은 Member 클래스에 AllArgsConstructor 가 있어서 NoArgsConstructor 가 올수없어서 생성해줘야함
    public VipMember(String name, String phone) {
        super(name, phone);
    }
}
