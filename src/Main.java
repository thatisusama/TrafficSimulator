import classes.*;
import config.AppConstants;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Simulator simulator = new Simulator();
        TrafficLight trafficLight = new TrafficLight();
        TimeConstraint timeConstraint = new TimeConstraint();
        boolean isDay = timeConstraint.isHourInInterval(timeConstraint.getCurrentHour(), AppConstants.DAY_TIME_START, AppConstants.DAY_TIME_END);

        if (isDay){
            trafficLight.setState(new GreenState());
            simulator.printToScreen(trafficLight.reportState());

        }else{
            trafficLight.setState(new YellowState());
            simulator.printToScreen(trafficLight.reportState());
        }

        while (true) {
            isDay = timeConstraint.isHourInInterval(timeConstraint.getCurrentHour(), AppConstants.DAY_TIME_START, AppConstants.DAY_TIME_END);
            simulator.startSimulator(trafficLight, isDay);
        }
    }
}
