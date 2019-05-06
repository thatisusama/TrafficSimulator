package classes;

import config.AppConstants;

// this is concrete class for red state
public class RedState implements ITrafficLight{
    @Override
    public void changeToNext(TrafficLight light) {
        light.setState(new GreenState());
    }

    @Override
    public String getCurrentState() {
        return AppConstants.RED_LIGHT_STATE;
    }
}
