package observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    private int id;

    private Object observerState;

    public ConcreteObserver(int id) {
        this.id = id;
    }

    @Override
    public void update(Observable o, Object arg) {
        ConcreteSubject subject = (ConcreteSubject) o;
        observerState = subject.getSubjectState();
        System.out.printf("Observer # %s, subject %s value = %s \n", this.id,subject.getId(), arg);
    }
}
