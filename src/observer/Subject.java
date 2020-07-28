package observer;

import java.util.*;

public abstract class Subject extends Observable {
    private int id;
    private List<Observer> observers;

    public Subject(int id) {
        this.id = id;
        this.observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        for (Observer o: observers) {
            if(o == observer) return;
        }
        observers.add(observer);
    }

    public void detach(Observer observer) {
        for (Observer o: observers){
            if(observer == o){
                observers.remove(o);
                break;
            }
        }
    }

    public void observerNotify(Object arg) {
        for(Observer o: observers){
            o.update(this, arg);
        }
    }

    public int getId() {
        return id;
    }

    abstract void setSubjectState(Object state);
}
