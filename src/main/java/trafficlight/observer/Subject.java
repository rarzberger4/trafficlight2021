package trafficlight.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer o){
        observerList.add(o);
    }

    public void removeObserver(Observer o){
        observerList.remove(o);
    }

    public void notifyObservers(){
        observerList.stream().forEach(o -> o.update());
    }
}
