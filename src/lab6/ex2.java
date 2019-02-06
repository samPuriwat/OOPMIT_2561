package lab6;

public class ex2 {

    public static void main(String[] args) {

        StringBuffer myBuf = new StringBuffer();
        System.out.println(myBuf);
        myBuf.append("Hello");
        System.out.println(myBuf);
        myBuf.append(2019);
        System.out.println(myBuf);
        System.out.println(myBuf.reverse());
        myBuf.replace(5, 8, "2562");
        System.out.println(myBuf);
    }

}//class
