public class Vehicle {

    private String name;
    private double maxSpeed;
    private int yearOfManufacture;

    public Vehicle(String name, double maxSpeed, int yearOfManufacture)
    {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void display()
    {
        System.out.println(String.format("Vehicle Year: %d %nVehicle Name: %s %nVehicle Max Speed: %g %n ", this.yearOfManufacture, this.name, this.maxSpeed));
    }

    public double showDistance(double timeInSeconds)
    {
        return (timeInSeconds / 3600) * maxSpeed;
    }
}
