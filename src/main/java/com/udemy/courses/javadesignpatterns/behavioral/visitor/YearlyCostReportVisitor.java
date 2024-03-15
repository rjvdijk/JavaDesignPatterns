package com.udemy.courses.javadesignpatterns.behavioral.visitor;

public class YearlyCostReportVisitor implements ReportVisitor<Long> {
    @Override
    public Long visit(FixedPriceContract contract) {
        return contract.costPerYear;
    }

    @Override
    public Long visit(TimeAndmaterialContract contract) {
        return contract.costPerHour * contract.hours;
    }

    @Override
    public Long visit(SupportContract contract) {
        return contract.costPerMonth * 12;
    }
}
