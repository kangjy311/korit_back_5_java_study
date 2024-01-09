package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        //추상 클래스 :생성x
//        ElectronicDevice electronicDevice = new ElectronicDevice();

        //익명 클래스 
        //일회용
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override   //재정의
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");
            }
        };
        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 상태확인");
            }
        };

        //추상 클래스를 상속받은 일반 클래스 :생성가능
        RemoteController remoteController = new RemoteController();

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
    }
}
