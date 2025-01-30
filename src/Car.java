public class Car {
    private int carID;
    private String brand;
    private String model;
    private String color;
    private int priceForHour;
    private int manufactureYear;
    private int plate;

    public Car(int carID, String brand, String model, String color, int priceForHour, int manufactureYear, int plate) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.priceForHour = priceForHour;
        this.manufactureYear = manufactureYear;
        this.plate = plate;
    }

    @Override
    public String toString() {
        return " carList::: carID='" + carID + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", priceForHour='" + priceForHour + '\'' +
                ", manufactureYear='" + manufactureYear + '\'' +
                ", plate='" + plate + '\'';
    }


    public int getCarID() {
        return carID;
    }

    public int getPriceForHour() {
        return priceForHour;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
