package com.udemy.courses.javadesignpatterns.behavioral.visitor;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        FixedPriceContract projectAlpha = new FixedPriceContract(10000);
        SupportContract projectBeta = new SupportContract(500);
        TimeAndmaterialContract projectGamma = new TimeAndmaterialContract(150, 10);
        TimeAndmaterialContract projectDelta = new TimeAndmaterialContract(50, 50);

        List<ReportElement> projects = List.of(projectAlpha, projectBeta, projectGamma, projectDelta);

        MonthlyCostReportVisitor monthlyReport = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearlyReport = new YearlyCostReportVisitor();

        long monthlyCost = 0;
        long yearlyCost = 0;

        for (ReportElement project : projects) {
            monthlyCost += project.accept(monthlyReport);
            yearlyCost += project.accept(yearlyReport);
        }

        System.out.println("Monthly costs is " + monthlyCost);
        System.out.println("Yearly costs is " + yearlyCost);
    }

}
