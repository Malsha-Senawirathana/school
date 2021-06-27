import java.util.List;

public class School {

        /*
         * school have to teachers and students
         * implemetnt the teachers and student
         * using Arrylist
         *
         * */

        private List<Teacher> teachers;
        private List<Student> students;
        private static int totalMoneyEarned;
        private static int totalMoneySpent;

        /*
        * new object created
        * */

        public School(List<Teacher> teacher, List<Student> student) {
                this.teachers = teacher;
                this.students = student;
                totalMoneyEarned= 0;
                totalMoneySpent=0;
        }

        /*
        * @returns list of the teachers*/

        public List<Teacher> getTeacher() {
                return teachers;
        }

        /*add teacher to school*/

        public void addTeacher(Teacher teacher) {

                teachers.add(teacher);

        }
        /*
        * return the list of the student in school
        * */
        public List<Student> getStudent() {
                return students;


        }
        /* student add to school
        * */
        public void addStudent(Student student) {
               students.add(student);
        }

        /* total money earn in the school.

        * */

        public int getTotalMoneyEarned() {
                return totalMoneyEarned;
        }

        /* total money earned by the school*/
        public static void updateTotalMoneyEarned(int MoneyEarned) {

                totalMoneyEarned += MoneyEarned;
        }
        /*
        * total money spent*/
        public int getTotalMoneySpent() {
                return totalMoneySpent;
        }

        /*the money spent by school*/
        public static void updateTotalMoneySpent(int MoneySpent) {
                /*total money reduce the earn money*/
             totalMoneyEarned -= totalMoneySpent;
        }
}
