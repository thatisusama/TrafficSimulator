package classes;

import config.AppConstants;

// this is concrete class for green state
public class GreenState implements ITrafficLight{
    @Override
    public void changeToNext(TrafficLight light) {
        light.setState(new YellowState());
    }

    @Override
    public String getCurrentState() {
        return AppConstants.GREEN_LIGHT_STATE;
    }
}
