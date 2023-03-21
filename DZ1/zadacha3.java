import java.util.Random;
import java.util.Scanner;

public class zadacha3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int n = in.nextInt();    
        int[] arr = new int[n];
        Random random = new Random();
        for(int i = 0;i< arr.length;i++){
            arr[i] = random.nextInt(10); 
        }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" | "); 
        }
        System.out.println();
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int temp = 0; 
        for(int i = 0;i < arr.length;i++){
            if (number == arr[i]){
                for(int j=0;j < (arr.length-1) - i;j++){
                    temp = arr[i+j];
                    arr[i+j] = arr[i+(j+1)];
                    arr[i+(j+1)] = temp;
                }
            } 
        }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" | "); 
        }
    }
}
