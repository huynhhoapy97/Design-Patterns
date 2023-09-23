package com.huynhhoapy97;

public class Math extends TuitionSubject {
    public Math() {
    }

    public Math(Double tuition) {
        super(tuition);
    }

    @Override
    protected Math clone() throws CloneNotSupportedException {
        return (Math) super.clone();
    }

    @Override
    public TuitionSubject createTuitionSubject() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
