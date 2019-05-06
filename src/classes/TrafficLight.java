package classes;

// this is context for yellow state
public class TrafficLight {

    private ITrafficLight State;

    public void change() {
        getState().changeToNext(this);
    }

    public String reportState()
    {
        return getState().getCurrentState();
    }

    public ITrafficLight getState() {
        return State;
    }

    public void setState(ITrafficLight state) {
        State = state;
    }
}
