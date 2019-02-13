package lab7;

public class StudentApp {

    public static void main(String[] args) {

        //create object of Student class
        Student std = new Student();
        System.out.println(std.getName());

        std.setId("STD001");
        std.setName("Puriwat Lertkrai");
        std.setAge(33);

        System.out.println(std.getId());
        System.out.println(std.getName());
        System.out.println(std.getAge());

        std.setAge(34);
        System.out.println(std.getAge());

        Student std2 = new Student("STD002", "Boy", 30);

        System.out.println(std2.getAge());

        System.out.println(std.toString());
        System.out.println(std2.toString());

    }
}
