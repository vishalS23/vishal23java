import java.util.*;

//Average of 3 Numbers
public class Day1{
    public static void main(String[] args){

        Scanner SC = new Scanner(System.in);
        int A = SC.nextInt();
        int B = SC.nextInt();
        int C = SC.nextInt();

        int average = (A+B+C)/3;
        System.out.println("average is:" + average);
    }
}