package com.huynhhoapy97;

public class Score implements Cloneable {
    private Double math;
    private Double physic;

    public Score() {
    }

    public Score(Double math, Double physic) {
        this.math = math;
        this.physic = physic;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getPhysic() {
        return physic;
    }

    public void setPhysic(Double physic) {
        this.physic = physic;
    }

    @Override
    public String toString() {
        return "Score{" +
                "math=" + math +
                ", physic=" + physic +
                '}';
    }

    @Override
    protected Score clone() throws CloneNotSupportedException {
        return (Score) super.clone();
    }
}
