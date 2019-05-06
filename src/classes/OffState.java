package classes;

import config.AppConstants;

// this is concrete class for off state
public class OffState implements ITrafficLight{
    @Override
    public void changeToNext(TrafficLight light) {
        light.setState(new YellowState());
    }

    @Override
    public String getCurrentState() {
        return AppConstants.OFF_LIGHT_STATE;
    }
}
