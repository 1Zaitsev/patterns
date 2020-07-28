package observer;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject(1);
        Observer observer1 = new ConcreteObserver(1);
        Observer observer2 = new ConcreteObserver(2);
        Observer observer3 = new ConcreteObserver(3);
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.setSubjectState(new Integer(25));
        subject.detach(observer1);
        subject.setSubjectState(new Integer(20));
    }
}
