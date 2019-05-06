package classes;

public interface ITrafficLight {
    // this is changeToNext function which is used to changeToNext the state
    void changeToNext(TrafficLight light);

    // this function will return the current state
    String getCurrentState();
}
