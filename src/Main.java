import javax.imageio.ImageTypeSpecifier;

public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if(grade <= 49){
            return 'F';
        }
        else if(grade >= 50 && grade <= 59){
            return 'E';
        }
        else if(grade >= 60 && grade <= 69){
            return 'D';
        }
        else if(grade >= 70 && grade <= 79){
            return 'C';
        }
        else if(grade >= 80 && grade <= 89){
            return 'B';
        }
        else{
            return 'A';
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int myInt){
        if(myInt%3 == 0 && myInt%5 == 0){
            return "fizzbuzz";
        }
        else if(myInt%3 == 0){
            return "fizz";
        }
        else if(myInt%5 == 0){
            return "buzz";
        }
        else{
            return "unlucky";
        }
    }
    // Question 3 - frontBack
    public static String frontBack(String myStr){
        if(myStr.length() >= 2) {
            String front = myStr.substring(0, 2);
            return front + myStr + front;
        }
        else{
            return myStr;
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if(a + b == c){
            return true;
        }
        else if(b + c == a){
            return true;
        }
        else if(a + c == b){
            return true;
        }
        else{
            return false;
        }
    }
    // Question 5 - endUp
    public static String endUp(String myStr){
        if(myStr.length() >= 3){
            String backOfStr = myStr.substring(myStr.length()-3,myStr.length());
            String frontOfStr = myStr.substring(0,myStr.length()-3);
            return frontOfStr + backOfStr.toUpperCase();
        }
        else{
            return myStr.toUpperCase();
        }
    }
}
