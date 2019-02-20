package lab8;

public class Police extends Person {
    private String workCountry;

    public Police(String name, String pid, String bornYear, String workCountry) {
        super(name, pid, bornYear);
        this.workCountry = workCountry;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm police work at "+this.getWorkCountry());
    }

    public String getWorkCountry() {
        return workCountry;
    }

    public void setWorkCountry(String workCountry) {
        this.workCountry = workCountry;
    }
}
