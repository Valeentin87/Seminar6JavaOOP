package model;

import model.task.NoteTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoteTasksToday implements Iterable<NoteTask>{
    public List<NoteTask> noteTaskList = new ArrayList<>();
    public void addTaskToday(NoteTask noteTask){
        noteTaskList.add(noteTask);
    }


    @Override
    public Iterator<NoteTask> iterator() {
        return new Iterator<NoteTask>() {
            int index;
            @Override
            public boolean hasNext() {
                index+=1;
                return index<=noteTaskList.size();
            }

            @Override
            public NoteTask next() {
                return noteTaskList.get(index-1);
            }
        };
    }
}
