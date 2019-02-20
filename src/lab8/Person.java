package lab8;

public class Person {
    //properties
    private String name;
    private String pid;
    private String bornYear;

    //constructor

    public Person(String name, String pid) {
        this.name = name;
        this.pid = pid;
    }

    public Person(String name, String pid, String bornYear) {
        this.name = name;
        this.pid = pid;
        this.bornYear = bornYear;
    }

    public void introduce(){
        System.out.println("My name is "+this.name);
        System.out.println("I was born in "+this.bornYear);
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


    public String getBornYear() {
        return bornYear;
    }

    public void setBornYear(String bornYear) {
        this.bornYear = bornYear;
    }

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
