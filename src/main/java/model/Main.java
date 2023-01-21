package model;

import model.task.GoShopTask;
import model.task.HomeWorkTask;
import model.task.HouseWorkTask;
import model.task.NoteTask;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NoteTasksToday noteTasksToday = new NoteTasksToday();
        noteTasksToday.addTaskToday(new GoShopTask(1,"поход в магазин","20:30",false,
                "купить продукты в магазине", List.of(new String[]{"хлеб", "молоко"})));
        noteTasksToday.addTaskToday(new HomeWorkTask(2,"Домашнее задание","17:00",false,
                "выполнить ДЗ ","Математика","3 класс",10,24));
        noteTasksToday.addTaskToday(new HouseWorkTask(3,"Уборка по дому","16:46",false,
                "Убраться на кухне"));
        Iterator<NoteTask> iterator = noteTasksToday.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
