package org.example;

import java.util.Arrays;

// класс NoteTask (Заметка-задача) позволяет описать задачу, в последующем будем её вводить в консоль, либо получать из
    // файла
public abstract class NoteTask {
   public int id; //номер заметки-задачи
   public String topic; //тематика задачи (задание по дому, дошка ребенка, поход в магазин)
   String[] timeCompletion = new String[2]; // время, до которого надо выполнить
   Boolean status; //статус выполнения задачи
   String formulation; //формулировка задачи

    public NoteTask(int id, String topic, String[] timeCompletion, Boolean status, String formulation) {
        this.id = id;
        this.topic = topic;
        this.timeCompletion = timeCompletion;
        this.status = status;
        this.formulation = formulation;
    }

    Helply helply; //переменная интерфейса, которая инкапсулирует переменное поведение различных суб классов,
                   //позволяет реализовать по разному метод help (помощь при выполнении порученной задачи)
    DecorateResultly decorateResultly; //переменная интерфейса, которая инкапсулирует переменное поведение различных
                                       //суб классов, позволяет реализовать метод decorate(), отражающий результат выполнения задачи

    public void setHelply(Helply helply) {
        this.helply = helply;
    }

    public void setDecorateResultly(DecorateResultly decorateResultly) {
        this.decorateResultly = decorateResultly;
    }

    public NoteTask(){
    }
    public void perfomHelp(){  //метод, реализующий полиморфизм интерфейса helply
        helply.help();
    }

    public void perfomDecorate(){ //метод, реализующий полиморфизм интерфейса DecorateResultly
        decorateResultly.decorate();
    }

    @Override
    public String toString() {
        return
                id +"."+ topic + "---> " + formulation + " --->Выполнить до: " +
                        Arrays.toString(timeCompletion) + " Статус выполнения: " + status;
    }
}
