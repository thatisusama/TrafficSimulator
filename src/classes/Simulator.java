package classes;

import config.AppConstants;

import java.util.concurrent.TimeUnit;

// this is final simulator class which starts simulation of the traffic lights
public class Simulator {

    public void startSimulator(TrafficLight trafficLight, Boolean isDay) throws InterruptedException {
        if (isDay){
            dayTimeSimulation(trafficLight);

        }else{
            nightTimeSimulation(trafficLight);
        }
    }

    // this function will start day time simulation
    private void dayTimeSimulation(TrafficLight trafficLight) throws InterruptedException {

        if (trafficLight.reportState().equals(AppConstants.GREEN_LIGHT_STATE)) {
            TimeUnit.SECONDS.sleep(AppConstants.GREEN_LIGHT_DURATION);
            trafficLight.setState(new GreenState());
            printToScreen(trafficLight.reportState());
            trafficLight.change();
            printToScreen(trafficLight.reportState());
        }

        if (trafficLight.reportState().equals(AppConstants.YELLOW_LIGHT_STATE)) {
            TimeUnit.SECONDS.sleep(AppConstants.YELLOW_LIGHT_DURATION);
            trafficLight.change();
            printToScreen(trafficLight.reportState());
        }

        if (trafficLight.reportState().equals(AppConstants.RED_LIGHT_STATE)) {
            TimeUnit.SECONDS.sleep(AppConstants.RED_LIGHT_DURATION);
            trafficLight.change();
            printToScreen(trafficLight.reportState());
        }
    }

    // this function will start night time simulation
    private void nightTimeSimulation(TrafficLight trafficLight) throws InterruptedException {

        if (trafficLight.reportState().equals(AppConstants.YELLOW_LIGHT_STATE)){
            TimeUnit.SECONDS.sleep(AppConstants.ON_YELLOW_LIGHT_DURATION);
            trafficLight.setState(new OffState());
            printToScreen(trafficLight.reportState());
        }

        if (trafficLight.reportState().equals(AppConstants.OFF_LIGHT_STATE)){
            TimeUnit.SECONDS.sleep(AppConstants.OFF_YELLOW_LIGHT_DURATION);
            trafficLight.change();
            printToScreen(trafficLight.reportState());
        }

    }

    public void printToScreen(String message){
        System.out.println(message);
    }
}
