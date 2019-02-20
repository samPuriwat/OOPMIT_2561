package lab8;

public class Sheriff extends Person{
    private String workState;

    public Sheriff(String name, String pid,
                   String bornYear, String workState) {
        super(name, pid, bornYear);
        this.workState = workState;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm sheriff work at "+this.workState);
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }
}
