import classes.*;
import config.AppConstants;
import org.junit.Assert;
import org.junit.Test;

public class TrafficSimulatorTest {

    @Test
    public void shouldSetGreenLight() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new GreenState());
        Assert.assertEquals(AppConstants.GREEN_LIGHT_STATE, trafficLight.reportState());
    }

    @Test
    public void shouldSetYellowLight() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new YellowState());
        Assert.assertEquals(AppConstants.YELLOW_LIGHT_STATE, trafficLight.reportState());
    }

    @Test
    public void shouldSetRedLight() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new RedState());
        Assert.assertEquals(AppConstants.RED_LIGHT_STATE, trafficLight.reportState());
    }

    @Test
    public void shouldChangeToGreenLight() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new RedState());
        trafficLight.change();
        Assert.assertEquals(AppConstants.GREEN_LIGHT_STATE, trafficLight.reportState());
    }

    @Test
    public void shouldChangeToRedLight() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new YellowState());
        trafficLight.change();
        Assert.assertEquals(AppConstants.RED_LIGHT_STATE, trafficLight.reportState());
    }

    @Test
    public void shouldChangeToYellowLight() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new GreenState());
        trafficLight.change();
        Assert.assertEquals(AppConstants.YELLOW_LIGHT_STATE, trafficLight.reportState());
    }

    @Test
    public void testDaySimulation() throws InterruptedException {
        Simulator simulator = new Simulator();
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new GreenState());
        simulator.startSimulator(trafficLight, true);
    }

    @Test
    public void testNightSimulation() throws InterruptedException {
        Simulator simulator = new Simulator();
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new YellowState());
        simulator.startSimulator(trafficLight, false);
    }

    @Test
    public void getCurrentTime() {
        TimeConstraint timeConstraint = new TimeConstraint();
        Assert.assertEquals("16", timeConstraint.getCurrentHour());
    }

    @Test
    public void isDayTime() {
        TimeConstraint timeConstraint = new TimeConstraint();
        Assert.assertTrue("true", timeConstraint.isHourInInterval(timeConstraint.getCurrentHour(), AppConstants.DAY_TIME_START, AppConstants.DAY_TIME_END));
    }
}