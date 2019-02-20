package lab8;

public class PersonApp {
    public static void main(String[] args) {

        Person person1,person2,person3;

        person1 = new Person("Jiraporn Thomkeaw",
                "P001","1986");
        person2 = new Sheriff("Piyapong Senanut",
                "P002", "1984","Thamyai");
        person3 = new Police("Puriwat Lertkrai",
                "P003","1986","Nakhonsithammarat");
        person1.introduce();
        person2.introduce();
        person3.introduce();

    }
}
