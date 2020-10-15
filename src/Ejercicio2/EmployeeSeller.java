package Ejercicio2;

import Ejercicio1.EmployeeOutsourced;

public class EmployeeSeller extends EmployeeOutsourced {

    private float percentage;

    public EmployeeSeller(float percentage) {
        this.percentage = percentage;
    }

    public EmployeeSeller(String name, int age, float sallary, float quantityHours, float percentage) {
        super(name, age, sallary, quantityHours);
        this.percentage = percentage;
    }

    @Override
    public float calculatePayment() {
        return super.calculatePayment() * ((100 + percentage) / 100);
    }
}
