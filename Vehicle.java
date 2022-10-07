import java.util.ArrayList;

abstract class Vehicle {
    protected String plate_number;
    protected int number_of_refuel;
    protected ArrayList<Integer> refuels = new ArrayList<>();

    public Vehicle(String plate_number, int number_of_refuel) {
        this.plate_number = plate_number;
        this.number_of_refuel = number_of_refuel;
    }

    public void addRefuels(int e) {
        refuels.add(e);
    }

    public String getPlate() {
        return plate_number;
    }

    public int getNumberOfRefuels() {
        return number_of_refuel;
    }

    public ArrayList<Integer> getRefuelsArray() {
        return refuels;
    }

    public int mean() {
        int sum = 0;
        for (int e : refuels)
            sum = sum + e;

        return sum / refuels.size();
    }

    public abstract char getTypeNum();
}