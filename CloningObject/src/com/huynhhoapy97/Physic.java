package com.huynhhoapy97;

public class Physic extends TuitionSubject {
    public Physic() {
    }

    public Physic(Double tuition) {
        super(tuition);
    }

    @Override
    protected Physic clone() throws CloneNotSupportedException {
        return (Physic) super.clone();
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
