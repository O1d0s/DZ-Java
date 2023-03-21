import java.util.Random;
import java.util.Scanner;

/**
 * zadacha1
 */
public class zadacha1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int n = in.nextInt();    
        int[] arr = new int[n];
        Random random = new Random();
        for(int i = 0;i< arr.length;i++){
            arr[i] = random.nextInt(100); 
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " | ");
            if (max < arr[i]){
                max = arr[i];    
            }
            if (min > arr[i]){
                min = arr[i];    
            }
        }
        System.out.println();
        System.out.println("Максимальное элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

    }
}