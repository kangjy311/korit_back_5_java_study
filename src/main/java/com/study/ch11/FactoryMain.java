package com.study.ch11;

public class FactoryMain {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("삼성");
//        company.showCompanyInfo();
//
//        // static 클래스는 생성하지 않아도 쓸수있다.
//        // 하나의 메모리 공간을 공유한다
        //복사되지않는다
////        SamsungCompany samsungCompany = new SamsungCompany();
//
//        SamsungCompany.name = "애플";
//        SamsungCompany.showCompanyInfo();

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);


    }
}
