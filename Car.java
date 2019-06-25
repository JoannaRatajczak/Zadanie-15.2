import java.util.Objects;

public class Car {

    private String type;
    private String brand;
    private String model;
    private int yearbook;
    private int flow;
    private String VIN;

    @Override
    public String toString() {
        return type + ";" + brand + ";" + model + ";" + yearbook + ";" + flow + ";" + VIN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearbook == car.yearbook &&
                flow == car.flow &&
                type.equals(car.type) &&
                brand.equals(car.brand) &&
                model.equals(car.model) &&
                VIN.equals(car.VIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, model, yearbook, flow, VIN);
    }

    public Car(String type, String brand, String model, int yearbook, int flow, String VIN) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.yearbook = yearbook;
        this.flow = flow;
        this.VIN = VIN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearbook() {
        return yearbook;
    }

    public void setYearbook(int yearbook) {
        this.yearbook = yearbook;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
}