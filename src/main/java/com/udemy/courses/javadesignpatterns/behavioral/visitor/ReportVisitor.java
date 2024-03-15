package com.udemy.courses.javadesignpatterns.behavioral.visitor;

public interface ReportVisitor<R> {
    public R visit(FixedPriceContract contract);
    public R visit(TimeAndmaterialContract contract);
    public R visit(SupportContract contract);
}
