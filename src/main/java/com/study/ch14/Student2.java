package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor

public class Student2 {
    private final String name;
    private String address;
    @NonNull
    private final String phone;

    //final로 정의되어 있는 것들은 setter가 없다
    //
}
