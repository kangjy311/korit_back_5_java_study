package com.study.ch15;

/**
 * * 제네릭 (SendData 클래스에)
 * 클래스<>
 * 타입을 여러개 받아올 수 있다 ( <T, R, E> 등.. )
 * 리턴 자료형에도 쓸수있다
 * 일반 자료형은 쓸수없음 -> 무조건 참조 자료형
 */
public class SendMain {

    public static void main(String[] args) {
        SendData<?> sendData1 = new SendData<>(200, "김준일");
        send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("김준일", "01099881916"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김준이", "01011112222"));
        send(sendData3);

    }

    // <?> 제네릭의 와일드카드 : 어떤 자료형이 올지 모를때
    // 리턴자료형이 어떤 자료형으로 리턴 될지 모를때도 쓸수있음 (void 자리에 SendData<?>)
    public static void send(SendData<?> sendData) {
        /*
            와일드카드 상속제한
            <? extends Member>
            <? super VipMember>
         */
        sendData.send();

    }
}
