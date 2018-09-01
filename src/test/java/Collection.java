/**
 * Created by Stas on 30.09.2018.
 */
import java.util.Scanner;
import  java.io.File;
import java.util.ArrayList;
import java.util.*;

public class Collection {
    Scanner scn;
    ArrayList list=new ArrayList();


    public void zadanie()
    {
        Set<String> sortedSet = new TreeSet<String>();
        Map<String, Integer> statistic = new HashMap<String, Integer>();
        //Сначала преобразуем массив ArrayList в TreeSet для сортировки записей.
        int k = 0;
        String d;
        String max[];
        max = new String[1];


        for (int i = 0; i < list.size(); i++) {
            //добавляем записи из массива ArrayList в TreeSet
            d = (String) list.get(i);
            sortedSet.add(d);
// Сразу делаем подсчет слова из файла и записыаем их Мап.
            Integer count = statistic.get(d);
            if (count == null) {
                count = 0;
            }
            //Запись в Мап
            statistic.put(d, ++count);

            //Находим слово с максимальным повторением
            if (count >k  ) {
                k = count;
                max[0] = d;

            }

        }

        System.out.println("Отсортировка: "+sortedSet);
        System.out.println("Подсчет: "+statistic);
        System.out.println("Наибольшее: " + max[0] + " Колличество повторений = " +k);


    }
//Выводим слова в файле на экран
    public  void out() {
        System.out.println("В файле есть слова: " + list);

    }
//считываем файл
    public  void readFile() {
        while (scn.hasNext()){
            String word = scn.next();
            list.add(word);
        }
    }

    public  void openFile() {
        try {
            scn = new Scanner(new File("c:/Users/Stas/Desktop/Massiv.txt"));
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
    }
}