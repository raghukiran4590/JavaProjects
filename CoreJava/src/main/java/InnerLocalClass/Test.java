package InnerLocalClass;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10, 5, "Hilton Group");
        hotel.reserveGuests("Raghu Kiran", 1);
        hotel.reserveGuests("Ravi", 2);
    }
}
