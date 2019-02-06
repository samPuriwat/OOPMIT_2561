package lab6;

import java.util.StringTokenizer;

public class ex3 {

    public static void main(String[] args) {

        String mystr = "Hello, Welcome to RUTS SAIYAI";

        StringTokenizer myToken = new StringTokenizer(mystr);

        System.out.println(myToken.countTokens());

        while (myToken.hasMoreTokens()){
            System.out.println(myToken.nextToken());
        }





    }//main
}//class
