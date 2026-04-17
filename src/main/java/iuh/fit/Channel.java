package iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Observer> participants = new ArrayList<Observer>();
    public  void register(Observer o){
        participants.add(o);
    }
    public  void unregister(Observer o){
        participants.remove(o);
    }
    public void notifyAllUser(String message){
        for(Observer o : participants){
            o.update(message);
        }
    }
    public void changeSchedule(String info){
        System.out.println("Lịch hoc thay đổi: "+info);
        notifyAllUser(info);
    }
}
