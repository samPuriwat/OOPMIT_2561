package lab8;

public class Person {
    //properties
    private String name;
    private String pid;

    //constructor

    public Person(String name, String pid) {
        this.name = name;
        this.pid = pid;
    }
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                '}';
    }

    //getter and setter methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
