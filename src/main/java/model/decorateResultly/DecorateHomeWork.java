package model.decorateResultly;

public class DecorateHomeWork implements DecorateResultly{
    @Override
    public void decorate() {
        System.out.println("Молодец! В твоём дневнике появилась запись о выполнении ДЗ ");
    }
}
