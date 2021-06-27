public class Teacher {

        private int id;
        private int salary;
        private String name;
        private int salaryEarned;

        /* NEW TEACHER OBJECT*/

        public Teacher(int id, String name,int salary){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.salaryEarned=0;
        }
        /*@retuen the teacher id,name,salary*/
        public int getId() {
            return id;
        }

        public int getSalary() {
            return salary;
        }



        public String getName() {
            return name;
        }

        /*update the salary*/

        public void setSalary(int salary) {
            this.salary = salary;
        }
        /*
        * removes the totalmoney by school*/

        public void receiveSalary(int salary){
            salaryEarned+=salary;
            School.updateTotalMoneySpent(salary);


    }



}
