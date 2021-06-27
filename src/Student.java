public class Student {


        private int id;
        private String name;
        private int grade;
        private int feesPaid;
        private int feesTotal;

        // created by new student by initialization
        public Student(int id, String name, int grade) {
            this.feesPaid = 0;
            this.feesTotal = 0;
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        /*   update to student details
         *    */
        public void setGrade(int grade) {
            this.grade = grade;
        }
        /*
         *   Add to fees to feepaid = 10,000+5000+15000
         * */
        public void payFees(int fees){
            feesPaid += fees;
            School.updateTotalMoneyEarned(feesPaid);
        }
        /*
         * return the id,name,feepaid,feetotal,grade in the student*/
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
        return grade;
    }

        public int getFeesPaid() {
            return feesPaid;
        }

        public int getFeesTotal() {
            return feesTotal;
        }





        public int getRemainingFees() {
            return feesTotal-feesPaid;
    }
}
