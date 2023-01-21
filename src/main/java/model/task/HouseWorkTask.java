package model.task;
// класс описывает задачу-заметку по выполнению задачи по дому
public class HouseWorkTask extends NoteTask{
    public HouseWorkTask(int id, String topic, String timeCompletion, Boolean status, String formulation) {
        super(id, topic, timeCompletion, status, formulation);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
