package Ejercicio2;

import Ejercicio1.EmployeeOutsourced;
import Ejercicio1.EmployeeSalaried;

public class Test {

    public static void main(String[] args) {
        EmployeeSeller seller1 = new EmployeeSeller("Pedro", 25, 100, 200, 5);
        EmployeeSeller seller2 = new EmployeeSeller("María", 30, 100, 200, 10);

        System.out.println(seller1);
        System.out.println(seller2);
    }
}
