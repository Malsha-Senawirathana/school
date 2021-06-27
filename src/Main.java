import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* created the list of the teachers*/
       Teacher nimal = new Teacher(1,"nimal",500);
       Teacher kamal = new Teacher(2,"kamal",600);
       Teacher amara = new Teacher(3,"amara",800);

    /* Added to the teachers in the list */
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(nimal);
        teacherList.add(kamal);
        teacherList.add(amara);


        Student nayana = new Student(001,"nayana",6);
        Student kasun = new Student(002,"kasun",7);
        Student amila = new Student(003,"amila",8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(nayana);
        studentList.add(kasun);
        studentList.add(amila);

        School ghs = new School(teacherList,studentList);
        nayana.payFees(5000);

        kasun.payFees(7000);
        System.out.println("GHS has earned Rs:"+ ghs.getTotalMoneyEarned());

        System.out.println("======= GSH  SCHOOL PAY SALARY======");
        nimal.receiveSalary(nimal.getSalary());
        System.out.println("GHS has spent for salary to " + nimal.getName()+" and now has Rs:" + ghs.getTotalMoneyEarned());

        kamal.receiveSalary(kamal.getSalary());
        System.out.println("GHS has spent for salary to " + kamal.getName()+" and now has Rs:" + ghs.getTotalMoneyEarned());



    }
}
