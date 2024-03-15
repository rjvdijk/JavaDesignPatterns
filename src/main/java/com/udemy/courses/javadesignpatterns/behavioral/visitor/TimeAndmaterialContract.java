package com.udemy.courses.javadesignpatterns.behavioral.visitor;

public class TimeAndmaterialContract implements ReportElement {
    long costPerHour;
    long hours;

    public TimeAndmaterialContract(long costPerHour, long hours) {
        this.costPerHour = costPerHour;
        this.hours = hours;
    }

    @Override
    public <R> R accept(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }

}
