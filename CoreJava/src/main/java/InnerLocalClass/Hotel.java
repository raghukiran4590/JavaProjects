package InnerLocalClass;

public class Hotel {

    private String hotelName;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(int totalRooms, int reservedRooms, String hotelName) {
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    void reserveGuests (String guestName, int roomsToBook) {
        System.out.println(guestName+" has requested to book "+roomsToBook+" rooms");


        class validateRoomBooking {
            boolean validate() {
                if (roomsToBook > totalRooms) {
                    System.out.println("Rooms to be booked cannot be more than Total Rooms");
                    return false;
                } else if (guestName == null || guestName.isEmpty() || guestName.isBlank()) {
                    System.out.println("Guest Name cannot be blank or empty");
                    return false;
                } else if (roomsToBook > (totalRooms - reservedRooms)) {
                    System.out.println("Rooms to booked is more than available rooms");
                    return false;
                } else if (roomsToBook <= 0) {
                    System.out.println("Rooms to booked is less than or equal to 0");
                    return false;
                }
                return true;
            }

            void roomsAvailable() {
                int availableRooms = totalRooms - reservedRooms;
                System.out.println("Total Available Rooms in the hotel are "+availableRooms);
            }
        }

        validateRoomBooking validateBooking = new validateRoomBooking();
        if(validateBooking.validate()) {
            reservedRooms += roomsToBook;
            System.out.println("Congratulations!!! Reservation of "+roomsToBook+" room(s) confirmed for "+guestName);
        } else {
            System.out.println("Sorry! Reservation failed");
        }
        validateBooking.roomsAvailable();
    }
}
