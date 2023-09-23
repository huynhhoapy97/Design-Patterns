package com.huynhhoapy97;

public abstract class TuitionSubject implements Cloneable {
    protected Double tuition;

    public TuitionSubject() {
    }

    public TuitionSubject(Double tuition) {
        this.tuition = tuition;
    }

    public Double getTuition() {
        return tuition;
    }

    public void setTuition(Double tuition) {
        this.tuition = tuition;
    }

    @Override
    public String toString() {
        return "TuitionSubject{" +
                "tuition=" + tuition +
                '}';
    }

    public abstract TuitionSubject createTuitionSubject();
}
