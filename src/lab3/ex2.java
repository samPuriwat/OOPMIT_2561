package lab3;

public class ex2 {
    public static void main(String[] args) {
        int score = 300;
        // 0-49  = F
        // 50-59 = D
        // 60-69 = C
        //70-79  = B
        //80-100 = A
        if (score>=0 && score <=49)
            System.out.println("Grade F.");
        else if (score>=50 && score <=59)
            System.out.println("Grade D.");
        else if (score>=60 && score <=69)
            System.out.println("Grade C.");
        else if (score>=70 && score <=79)
            System.out.println("Grade B.");
        else if (score>=80 && score <=100)
            System.out.println("Grade A.");
        else
            System.out.println("Invalid Score.");






    }//main

}//class
