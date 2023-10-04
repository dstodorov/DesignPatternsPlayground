package factory.motorcycle_factory;

public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        return createMotorVehicle();
    }

    protected abstract MotorVehicle createMotorVehicle();
}
