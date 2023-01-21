package model.decorateResultly;

public class DecorateGoShop implements DecorateResultly {
    @Override
    public void decorate() {
        System.out.println(" Вы купили требуемые продукты в магазине, не забудте убрать в холодильник");
    }
}
