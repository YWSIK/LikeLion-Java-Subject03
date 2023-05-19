package ex04;

public class CarTest {
    public static void main(String[] args) throws Exception {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("===============");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}