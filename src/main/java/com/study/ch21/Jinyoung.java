package com.study.ch21;

public class Jinyoung {
    public static void main(String[] args) {
    /**
     * JAVA - 객체지향언어
     * 
     *  * class
     * - 쓰는 이유 :정보(기능)를 묶기 위해서 : 객체화
     * 일반 자료형이 아닌 만들어낸 class 자료형을 쓰기위해서 new(생성)을 해줘야 쓸수있음
     * 
     * 객체 생성 : 생성자
     * 
     *  * 추상화
     * - 공통점 분리 (공통점을 묶는다)
     * 기본: A, B에 있는 공통점을 C에 만들고 A, B의 공통점은 지운 후 C를 A, B에 상속시키겠다.
     * C에 void test() {}가 있지만 A, B는 void test() {}를 재정의해서 다시 쓸수있다
     * A, B 둘 다 test()를 재정의해서 C에서 쓸 기능이 없어지면 추상 클래스가 된다
     *
     * interface (기능을 묶어놓는다) -Button 누르다(); : 추상화
     * class -전원버튼 implements Button { 누르다();} : 재정의
     * // 메소드가 하나면 람다식으로 요약 가능
     * // Button b1 = () -> {};  : 람다식
     * // b1.누르다();   : 람다식
     *
     *  * 의존성 주입 (Dependency Injection = DI)
     *  
     *  * static 
     * - 복사가 안된다
     *
     *  * 제네릭
     * A 클래스에 String data1; String data2; 로 선언했지만 다른 자료형으로도 쓰고 싶을 때 class A<T, U> {T data1; U data2;}
     * A<?, ?> a = new A<>();
     * a.data();
     * <?> : 제네릭의 와일드 카드 : 무슨 자료형이 올지 모른다
     * <? extends A> : A를 상속받은 것만
     * <? super B> : 부모
     * ArrayList<> :배열 어떤 타입을 받을지 모르고 타입별로 만들어야 해서 제네릭으로 쓴다
     *
     *  * ArrayList , 향상된 for문 ( forEach() )
     * 형태) for( : 배열 또는 컬렉션) {}
     * 컬렉션 안에는 forEach()가 있다
     * 향상된 for문을 쓰는 경우 :
     *
     */

    }
}
