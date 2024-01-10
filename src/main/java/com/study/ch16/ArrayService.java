package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        //add가 호출 될때 새로운 배열을 만들겠다
        String[] newArray = new String[strArray.length + 1];    //기존배열의 크기보다 하나 크게 만듦
        //반복 돌려서 안에 있는거 옮겨주기
        for(int i = 0; i < strArray.length; i++) {
            //크기가 작은 어레이만큼 돌린다
            newArray[i] = strArray[i];
            //반복이 다 되면 newArray 에 옮김
        }
        strArray = newArray;    // 주소 변경

        strArray[strArray.length - 1] = str;    //배열의 끝에 넣겠다

    }

    public void remove(int index) {     // 기존보다 하나 작은 배열을 만들어서 지우는 값을 기점으로 큰 값들을 다 지운다
        // 기존보다 크기가 1 작은 배열을 새로 만든다
        // 매개변수로 받은 인덱스 값을 기준으로 작은 index들은 그대로 옮기고 큰 인덱스들은 -1하여 옮긴다
        // strArray의 배열을 새로운 배열로 바꾼다.
        String[] newArray = new String[strArray.length - 1];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1];
        }
        strArray = newArray;

    }

    public String get(int index) {
        return strArray[index];
    }

    public int indexOf(String str) {    // 탐색  (몇번째 인덱스에 있는지)
        if(str == null) {
            return -1;      //못찾았을때
        }
        for(int i = 0; i < strArray.length; i ++) {
            if(strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;      //못찾았을때 -1
    }

    @Override
    public String toString() {
        String result = "Array[ ";
        for(int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length - 1) {
                result += ", ";
            }
        }
        result += " ]";

        return  result;

    }
}
