import java.util.*;
class worldcup {
    static int score;
    public static void output(){
        System.out.print("Enter the score :");
        sc();
        if (score >=12)
          System.out.print("Your team is qualified");
        else 
          System.out.print("Your team is not qualified");
    }
    public static void sc(){
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
    }
    public static void main(String[] args){
        output(); 
    }
}