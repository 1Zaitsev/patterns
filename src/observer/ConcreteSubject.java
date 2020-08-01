package observer;

import java.util.List;
import java.util.Observer;

public class ConcreteSubject extends Subject{
    private Object subjectState;

    public ConcreteSubject(int id) {
        super(id);
    }

    public Object getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(Object subjectState) {
        this.subjectState = subjectState;
        observerNotify(subjectState);
    }
}
