package classes;

public interface ITrafficLight {
    // this is change function which is used to change to Next state
    void changeToNext(TrafficLight light);

    // this function will return the current state
    String getCurrentState();
}
