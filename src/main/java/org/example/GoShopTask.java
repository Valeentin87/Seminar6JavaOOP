package org.example;

import java.util.ArrayList;
import java.util.List;
// класс описывает заметку-задачу, поход в магазин для приобретения продуктов
public class GoShopTask extends NoteTask{
    List<String> products = new ArrayList(); //список продуктов, которые надо купить

    public GoShopTask(int id,
                      String topic,
                      String[] timeCompletion,
                      Boolean status,
                      String formulation,
                      List<String> products) {
        super(id, topic, timeCompletion, status, formulation);
        this.products = products;
    }
}
