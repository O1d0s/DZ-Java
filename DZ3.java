import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Main {
  public static ArrayList Rand() {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите сколько будет количество чисел: ");
    int n = in.nextInt();
    Random rnd = new Random();
    ArrayList<Integer> arr = new ArrayList<>();
    for (int index = 0; index < n; index++) {
      arr.add(rnd.nextInt(100));
    }
    return arr;
  }

  public static List Chet() {
    ArrayList<Integer> arr = new ArrayList<>();
    arr = Rand();
    System.out.println(arr);
    for (int index = 0; index < arr.size(); index++) {
      if (arr.get(index) % 2 == 0) {
        arr.remove(index);
      }
    }
    return arr;
  }

  public static Double MaxMinAVG() {
    ArrayList<Integer> arr = new ArrayList<>();
    arr = Rand();
    System.out.println(arr);
    System.out.println("Max = " + Collections.max(arr));
    System.out.println("Max = " + Collections.min(arr));
    int s = 0;
    for (int i = 0; i < arr.size(); i++) {
        s+=arr.get(i);
    }
    double AVG = s / arr.size();
    return AVG;
  }

  public static ArrayList zadacha3() {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите сколько будет количество слов: ");
    int n = in.nextInt();
    Random rnd = new Random();
    ArrayList<String> arr = new ArrayList<>();
    for (int index = 0; index < n; index++) {
      System.out.print("Введите " + (index+1) + " слово: ");
      String x = in.next();
      arr.add(x);
    }
    arr.removeIf(el ->{
        try{
            Integer.parseInt(el);
            return true;
        }catch (Exception x){
            return false;
        }
    });
    return arr;
  }

  public static void main(String[] args) {
    System.out.println(zadacha3());
  }
}