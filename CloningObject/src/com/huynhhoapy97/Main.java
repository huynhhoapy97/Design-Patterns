package com.huynhhoapy97;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student_1 = new Student(
                1,
                "Hoa",
                new Address("Nguyen Trung Truc"),
                new Score(6.5, 7.5));
        Student student_2 = student_1.clone();
        System.out.println(student_1);
        System.out.println(student_2);

        System.out.println("\n-------- After changed primitive attribute --------");
        student_2.setName("Tony");
        System.out.println(student_1);
        System.out.println(student_2);

        /*
            Demo shallow clone
         */
        System.out.println("\n-------- After changed object attribute --------");
        student_2.getAddress().setStreetName("Ban Huyen Thanh Quan");
        System.out.println(student_1);
        System.out.println(student_2);

        /*
            Demo deep clone
         */
        System.out.println("\n-------- After changed object attribute --------");
        student_2.getScore().setMath(9.0);
        System.out.println(student_1);
        System.out.println(student_2);
    }
}
