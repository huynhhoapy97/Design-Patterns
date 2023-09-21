package com.huynhhoapy97;

public class Student implements Cloneable {
    private Integer id;
    private String name;
    private Address address;
    private Score score;

    public Student() {
    }

    public Student(Integer id, String name, Address address, Score score) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", score=" + score +
                '}';
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.score = student.score.clone();

        return student;
    }
}
