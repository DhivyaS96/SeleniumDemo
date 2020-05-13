  
import java.awt.Robot;
import java.util.Random;


public class FirstClass {
    public static final int timeInterval = 5000;
    public static final int yAxis = 800;
    public static final int xAxis = 800;
    
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        while(true) {
            robot.mouseMove(random.nextInt(xAxis), random.nextInt(yAxis));
            Thread.sleep(timeInterval);
        }
    }
}



