import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DZ4 {

    public static void zadacha1() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean f = true;
        int count = 0;
        System.out.println("Команда print выводит строки");
        System.out.println("Команда revert удаляет предыдущую введенную строку из памяти");
        while(f){
            System.out.print("Введите команду или новое слово: ");
            String str = in.next();
            String first,last;
            switch (str) {
                case "print":
                    first = list.getFirst();
                    last = list.getLast();
                    list.removeFirst();
                    list.removeLast();
                    list.addFirst(last);
                    list.addLast(first);
                    System.out.print(list);
                    break;
                case "revert":
                    list.removeLast();
                    System.out.println(list);
                    break;
                default:
                    list.add(str);
                    break;
            }
            count++;
        }
    }

    public static List<Integer> reverseList(LinkedList<Integer> list)
    {
        List<Integer> reverse = new LinkedList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }

    public static void zadacha2() {
        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                list.add(rnd.nextInt(100));
        }
        System.out.println(list);
        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        
    }
    
}
