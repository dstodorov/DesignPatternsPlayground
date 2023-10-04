package factory.motorcycle_factory;

public class Car implements MotorVehicle
{
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
