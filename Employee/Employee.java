package Employee;


import java.util.Date;

import javax.swing.JOptionPane;

public class Employee {
        private String employeeName;
        private String employeeSex;
        private String employeePosition;
        private Date employeeDob;
        private boolean isFullTime=true;
        private double hoursWorked;
        private final static double STANDARD_PAY_RATE = 17;
        private double salary;

        public Employee() {
        }

        public Employee(String aEmployeeName, String aEmployeeSex, String aEmployeePosition) {
                super();
                employeeName = aEmployeeName;
                employeeSex = aEmployeeSex;
                employeePosition = aEmployeePosition;
        }

        public String getName() {
                return employeeName;
        }

        public String getSex() {
                return employeeSex;
        }

        public String getPosition() {
                return employeePosition;
        }

        public Date getDate() {
                return employeeDob;
        }

        public double getSalary() {
                if(isFullTime)
                return salary;
                return hoursWorked * STANDARD_PAY_RATE;
        }

        public void setName(String aEmployeeName) {
                employeeName = aEmployeeName;
        }

        public void setSex(String aEmployeeSex) {
                employeeSex = aEmployeeSex;
        }

        public void setPosition(String aEmployeePosition) {
                employeePosition = aEmployeePosition;
        }

        public void setDOB(Date aDate) {
                employeeDob = aDate;
        }

        public void setPartTimeHours(double aHoursWorked) {
                hoursWorked = aHoursWorked;
                isFullTime=false;
        }

        public void setFullTimeSalary(double sal) {
                salary = sal;
        }
}