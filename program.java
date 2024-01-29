// Задание

// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// - Создать множество ноутбуков.
// - Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// - Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// - Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.Set;

public class program {
    public static void main(String[] args) {

        Notebook noteBook1 = new Notebook("MSI", "Windows11", 1024, 16, "silver");
        Notebook noteBook2 = new Notebook("MSI", "Windows11", 2048, 8, "black");
        Notebook noteBook3 = new Notebook("Lenovo", "Windows11", 512, 8, "black");
        Notebook noteBook4 = new Notebook("HP", "Windows10", 512, 8, "yellow");
        Notebook noteBook5 = new Notebook("Xiaomi", "Windows11", 1024, 8, "white");
        Notebook noteBook6 = new Notebook("Asus", "Linux", 512, 4, "gray");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(noteBook1);
        notebooks.add(noteBook2);
        notebooks.add(noteBook3);
        notebooks.add(noteBook4);
        notebooks.add(noteBook5);
        notebooks.add(noteBook6);

        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }


       

        
    }
}