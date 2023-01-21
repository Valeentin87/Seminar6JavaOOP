package org.example;
// класс NoteTask (Заметка-задача) позволяет описать задачу, в последующем будем её вводить в консоль, либо получать из
    // файла
public abstract class NoteTask {
   // public int id; //номер задачи
   // public String topic; //тематика задачи
   // String[] timeCompletion = new String[2];
   // Boolean status; //статус выполнения задачи
   // String formulation; //формулировка задачи
    Helply helply; //переменная интерфейса, которая инкапсулирует переменное поведение различных суб классов,
                   //позволяет реализовать по разному метод help (помощь при выполнении порученной задачи)
    DecorateResultly decorateResultly; //переменная интерфейса, которая инкапсулирует переменное поведение различных
                                       //суб классов, позволяет реализовать метод decorate(), отражающий результат выполнения задачи

    public NoteTask(){
    }
    public void perfomHelp(){  //метод, реализующий полиморфизм интерфейса helply
        helply.help();
    }

    public void perfomDecorate(){ //метод, реализующий полиморфизм интерфейса DecorateResultly
        decorateResultly.decorate();
    }

}
