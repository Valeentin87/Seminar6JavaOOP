package org.example;

import java.util.Arrays;

// класс описывает заметку-задачу, которая даётся для выполнения домашнего задания ребенку
public class HomeWorkTask extends NoteTask{
    String discipline; // название урока (математика, русский, физика....
    String nameBook; // название учебника
    int page; //страница, на котором находится домашнее задание
    int exercise; // номер упражнения

    public HomeWorkTask(int id,
                        String topic,
                        String[] timeCompletion,
                        Boolean status,
                        String formulation,
                        String discipline,
                        String nameBook,
                        int page,
                        int exercise) {
        super(id,topic,timeCompletion,status,formulation);
        this.discipline = discipline;
        this.nameBook = nameBook;
        this.page = page;
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return id +"."+ topic + "---> " + formulation + ". "+ discipline+ ". "+
                nameBook+ ". "+ page+ ". "+ exercise +" --->Выполнить до: " +
                Arrays.toString(timeCompletion) + " Статус выполнения: " + status;


    }
}
