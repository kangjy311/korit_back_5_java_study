package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Car[] cars = new Car[3];    //루프가 끝나고 while 다시 시작해도 정보 남아있음. 전역에 car1 -> 다른 지역 car1 쓸수있음
        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);
//        carService.carRepository = carRepository;
//        carRepository.cars = cars;

        while(loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            if("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료중...");
                loopFlag = false;   //while 문 종료

            } else if ("1".equals(selectedMenu)) {
                System.out.println(" <<< 자동차 등록 페이지 >>>");
//카서비스                int emptyCount = 0;     //비어있는 공간갯수
                String model = null;
                String color = null;
                
                //배열이 비어있는지 먼저 확인 (service)
                //데이터를 가지고 온다 (repository)
//카서비스                for(int i = 0; i < cars.length; i++) {
//                    if(cars[i] == null) {
//                        emptyCount++;
//                    }
//                }

                //배열 빈곳없을때
//카서비스                if(emptyCount == 0) {         //emptyCount CarService로 옮김
                if(carService.isFull()) {
                    System.out.println("더 이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("모델명 >> ");
                model = scanner.nextLine();
                System.out.print("색상 >> ");
                color = scanner.nextLine();

                Car car = new Car(model, color);    //entity
                carService.append(car);

                //배열 빈곳 찾아서 넣기
//                int emptyIndex = 0;   // Car car = new Car(model, color);
//카서비스                for(int i = 0; i < cars.length; i++) {
//                    if(cars[i] == null) {   // 인덱스 비었는지 확인
//                        cars[i] = car;     //비어있는 인덱스
//                        break;
//                    }
//                }

//                cars[emptyIndex] = new Car(model, color);    // (model, color) AllArgsConstructor 로   //Car car = new Car(model, color);
                //생성자 안만들었으면
//                car.model = model;
//                car.color = color;
                //반복적으로 사용 -> 함수
//                System.out.println("Car(model= " + car.model + ", color= " + car.color + ")");    //System.out.println(car.toString());
//                System.out.println(cars[emptyIndex].toString());                                  //System.out.println(car.toString());

            } else if ("2".equals(selectedMenu)) {
                System.out.println(" <<< 자동차 조회 페이지 >>>");
//                for(int i = 0; i < cars.length; i++) {
//                    System.out.print("[" + i + "] > ");
//                    if(cars[i] == null) {
//                        System.out.println("x");
//                        continue;
//                    }
//                    System.out.println(cars[i].toString());
//                    // cars 배열이 null인 경우 함수 호출 불가능
//                }
                carService.printCarList();

            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");


        // 데이터 관련 (추가Create, 조회Read, 수정Update, 삭제Delete) -> Repository로
        // Main -> Service -> Repository 거쳐가야함
        // 결합도는 낮아야 한다. 응집도는 높아야 한다.

        /*
        DI (종속성 주입, 의존성 주입)
        1. 자료형, 변수
        Car car = new(생성) Car();
        Car() 생성자
        new Car()를 car에 대입 , new Car()주소가 100이면 car에 주소 100을 준다

        CarRepository cr = new CarRepository(); 주소100
        CarService sc = new CarService(); 주소200
        cs안에 CarRepository cr 처음 넣으면 cr은 null
        cs.cr(200.cr) = cr(주소100);

        2. 함수, 매개변수
        - 리턴자료형 : 이 함수가 끝났을 때 돌려주는 것
        - 리턴받는 자료형에 때라 리턴자료형 자리에 맞게 넣어야 함
        리턴자료형 함수명(매개변수 자료형, 변수) {
            실행문
            리턴 
        }
        new CarService();로 리턴 받으려면 자료형인 CarService가 와야한다
        CarService 함수명(CarService cs) {
            실행문
            return new CarService();
        }

        생성자와 함수의 차이점
        1) 생성자는 클래스 명과 일치해야한다
        2) 생성자는 return X. 힙메모리에 할당받은 주소를 return 한다.

        3. 생성자
         */
    }
}
