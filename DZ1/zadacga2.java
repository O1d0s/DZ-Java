import java.util.Scanner;

public class zadacga2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();
        if(year % 100 == 0 && year % 400 != 0){
            System.out.println("Этот год не весокосный");
        }
        else if(year % 4 == 0 || year % 400 == 0){
            System.out.println("Этот год весокосный");
        } 
        else{
            System.out.println("Этот год не весокосный");
        }
    }
    
}
