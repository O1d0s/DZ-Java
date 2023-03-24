package DZ2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * zadacha1
 */
public class zadacha1 {

    public static boolean Polindrom() {
        Scanner in  = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = in.next();
        boolean a = false;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) == str.charAt((str.length()-1)-i)){
                a = true;
            }
            else{
                a = false;
            }
        }
        return a;

    }
    public static String WriteToTheFile(){
        Scanner in  = new Scanner(System.in);
        System.out.print("Введите имя файла который хотите создать: ");
        String file = in.next();
        System.out.print("Введите слово которое хотите записать в файл: ");
        String str = in.next();
        System.out.print("Введите количество повторений: ");
        int num = in.nextInt();
            try(FileWriter wr = new FileWriter(file+".txt",false))
            {
                for (int i = 0; i < num; i++) {
                    wr.write(str + "\n");
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        return "Файл успешно создан и записан";
    }

    public static void main(String[] args) {
        
    }
}