package lab7;

public class Student {
    //class properties
    private String id;
    private String name;
    private int age;
    //constructor

    public Student(){}
    public Student(String id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //getter and setter methods
    //getter -> อ่านข้อมูลจาก properties
    //setter -> ปรับปรุงข้อมูลใน properties

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //toString


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}//class
