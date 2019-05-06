package classes;

import config.AppConstants;

// this is concrete class for state pattern
public class YellowState implements ITrafficLight{
    @Override
    public void changeToNext(TrafficLight light) {
        light.setState(new RedState());
    }

    @Override
    public String getCurrentState() {
        return AppConstants.YELLOW_LIGHT_STATE;
    }
}
