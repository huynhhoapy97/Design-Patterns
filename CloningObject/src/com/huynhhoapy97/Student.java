package com.huynhhoapy97;

public class Student implements Cloneable {
    private Integer id;
    private String name;
    private Address address;
    private Score score;
    private TuitionSubject tuitionSubject;

    public Student() {
    }

    public Student(Integer id, String name, Address address, Score score, TuitionSubject tuitionSubject) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.score = score;
        this.tuitionSubject = tuitionSubject;
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

    public TuitionSubject getTuitionSubject() {
        return tuitionSubject;
    }

    public void setTuitionSubject(TuitionSubject tuitionSubject) {
        this.tuitionSubject = tuitionSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", score=" + score +
                ", tuitionSubject=" + tuitionSubject +
                '}';
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.score = student.score.clone();
        student.tuitionSubject = student.tuitionSubject.createTuitionSubject();

        return student;
    }
}
