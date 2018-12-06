import java.io.*;
import java.util.*;

/*
Задача 4
В течение дня в банк заходят люди, у каждого человека есть время захода в банк и время выхода.
Всего за день у банка было N посетителей. Банк работает с 8:00 до 20:00. Человек посещает банк только один раз за день.
Написать программу, которая определяет периоды времени, когда в банке было максимальное количество посетителей.
Входные данные о посетителях программа должна получать из файла, формат файла - произвольный,
файл высылается вместе с решением.
 */

public class Main {
    public static void main(String[] args){
        List<Visitor> visitors = new ArrayList<>();
        readFile(visitors);
        for (Visitor v: visitors) {
            System.out.println(v.getId());
            System.out.println(v.getEntered());
            System.out.println(v.getExited());
        }
    }

    public static void readFile(List<Visitor> visitors){
        String tmp;
        int count=0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader
                (new FileInputStream("../BankLog"),"utf-8"))){
                while((tmp=reader.readLine())!=null){
                  visitors.add(new Visitor());
                  visitors.get(count).setId(Integer.parseInt(tmp));
                    tmp=reader.readLine();
                  visitors.get(count).setEntered(tmp);
                    tmp=reader.readLine();
                  visitors.get(count).setExited(tmp);
                  count++;
                }

            }catch (IOException ex){ex.printStackTrace();}
    }
        }
