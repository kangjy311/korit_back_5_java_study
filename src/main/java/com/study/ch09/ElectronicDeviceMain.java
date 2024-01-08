package com.study.ch09;

public class ElectronicDeviceMain {
    public static void main(String[] args) {

//        Computer[] computers = new Computer[100];
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];

//        for(int i = 0; i < computers.length; i++) {     //컴퓨터 100대
//            computers[0] = new Computer();
//        }
        for(int i = 0; i < electronicDevices.length; i++) {     //컴퓨터 100대
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }

        //        ElectronicDevice electronicDevice = new ElectronicDevice();
//        SmartPhone smartPhone = new SmartPhone();
//
//        ElectronicDevice electronicDevice2 = smartPhone;    //업캐스팅 (상위 부모한테)
//
//        electronicDevice.showDeviceState();
//        smartPhone.showDeviceState();
//
//        for(int i = 0; i < computers.length; i++) {     //컴퓨터 100대 전원 온
//            computers[i].setPowerOn();
//        }

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println();

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        System.out.println();

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        for(int i = 0; i < electronicDevices.length; i++) {
            if(electronicDevices[i] instanceof Computer) {      //업캐스팅 하기 전에 원래 어떤 형태였는지 일치하면
                Computer computer = (Computer) electronicDevices[i];    //다운캐스팅
                computer.playGame();
            } else if(electronicDevices[i] instanceof SmartPhone) {     //업캐스팅 하기 전에 원래 어떤 형태였는지 일치하면
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];      //다운캐스팅
                smartPhone.call();
            }

        }


    }
}
