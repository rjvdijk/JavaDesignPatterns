package com.udemy.courses.javadesignpatterns.behavioral.visitor;

public interface ReportElement {
    <R> R accept(ReportVisitor<R> visitor);
}
