package ObjectAndClass.P06VehicleCatalogue;

public class Vehicle {
    //{typeOfVehicle} {model} {color} {horsepower}
    private String typeOfVehicle;
    private String model;
    private String color;
    private double horsePower;

    public Vehicle(String typeOfVehicle, String model, String color, double horsePower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }


    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f", this.typeOfVehicle, this.model, this.color, this.horsePower);
    }
}