package project;

//public class PermanentEmployee {
    public class PermanentEmployee extends Employee {
        int pf;
        public PermanentEmployee(int id, String name, float basicSalary, float bonus, int pf) {
            super(id, name, basicSalary, bonus);
            this.pf = pf;
        }
        public void calculateBonus(){
            if (pf < 1000) {
                bonus = 0.10f * basicSalary;
            } else if (pf < 1500) {
                bonus = 0.115f * basicSalary;
            }else if (pf < 1800) {
                bonus = 0.12f * basicSalary;
            } else {
                bonus = 0.15f * basicSalary;
            }
        }
        public void calculateSalary() {

            netSalary = basicSalary + bonus - pf;
        }
        public void display() {
            super.display();
            System.out.println("PF: " + pf);
        }
    }

