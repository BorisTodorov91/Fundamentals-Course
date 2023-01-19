package ObjectAndClass.P06VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Vehicle> vehicleList = new ArrayList<>();
       List<Double> truckList = new ArrayList<>();
       List<Double> carList = new ArrayList<>();
         String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] inputData = command.split("\\s+");

            String type = inputData[0];
            String model = inputData[1];
            String color = inputData[2];
            double horsePower = Double.parseDouble(inputData[3]);

            Truck truck = null;
            Car car = null;

            switch (type){
                case "truck":
                    truck = new Truck(type,model,color,horsePower);
                    vehicleList.add(truck);
                    truckList.add(truck.getHorsePower());
                    break;
                case "car":
                    car= new Car(type,model,color,horsePower);
                    vehicleList.add(car);
                    carList.add(car.getHorsePower());
                    break;
            }
            command = scanner.nextLine();
        }
        String commandForPrint = scanner.nextLine();
        while (!commandForPrint.contains("Close the Catalogue")){
            String currentComand = commandForPrint;
            Vehicle find = vehicleList.stream().filter(d -> d.getModel().equals(currentComand)).findFirst().get();

            System.out.println(find);
            commandForPrint = scanner.nextLine();
        }

        double carAverageHorsePower = carList.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double truckAverageHorsePower = truckList.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.printf("Cars have average horsepower of: %.2f.%n",carAverageHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",truckAverageHorsePower);
    }
}
