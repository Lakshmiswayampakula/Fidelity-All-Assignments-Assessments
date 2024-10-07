package project;

    public class TemporaryEmployee extends Employee {
        int dailyWages;
        int noOfDaysWorked;

        TemporaryEmployee(int id, String name, int dailyWages, int noOfDaysWorked) {
            super(id, name, dailyWages * noOfDaysWorked, 0);
            this.dailyWages = dailyWages;
            this.noOfDaysWorked = noOfDaysWorked;
        }
        public void calculateSalary() {
            netSalary = dailyWages * noOfDaysWorked;
        }
        public void display() {
            super.display();
            System.out.println("Daily Wages: " + dailyWages);
            System.out.println("No. of Days Worked: " + noOfDaysWorked);
        }
    }



