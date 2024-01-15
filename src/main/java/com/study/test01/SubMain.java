package com.study.test01;

import java.util.Arrays;
import java.util.List;

public class SubMain {
    public static void main(String[] args) {
        List<String> subjects = Arrays.asList(new String[]{"c", "JAVA", "Python"});
        SubjectService subjectService = new SubjectService(subjects);
        subjectService.showSubjects();
    }
}
