import java.util.*;
import java.io.*;

public class Hotel {
    Scanner sc = new Scanner(System.in);
    Holder hotel_ob = new Holder();

    public void bookRoom() {
        System.out.println("Enter Room Type: 1. Luxury Single, 2. Deluxe Single, 3. Luxury Double, 4. Deluxe Double");
        int choice = Integer.parseInt(sc.nextLine()); // Use nextLine() for controlled input
        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Customer Contact: ");
        String contact = sc.nextLine();
        System.out.println("Enter Gender (M/F): ");
        String gender = sc.nextLine();

        Customer customer = new Customer(name, contact, gender);
        System.out.println(customer); // Displaying customer details

        boolean roomBooked = false;
        switch (choice) {
            case 1:
                roomBooked = bookLuxurySingle(name, contact, gender);
                break;
            case 2:
                roomBooked = bookDeluxeSingle(name, contact, gender);
                break;
            case 3:
                roomBooked = bookLuxuryDouble(name, contact, gender);
                break;
            case 4:
                roomBooked = bookDeluxeDouble(name, contact, gender);
                break;
            default:
                System.out.println("Invalid room type.");
        }

        if (roomBooked) {
            System.out.println("Room booked successfully.");
            foodOrderAndBilling(); // Call food order and billing after room booking
        } else {
            System.out.println("Sorry, no rooms available.");
        }
    }

    private boolean bookLuxurySingle(String name, String contact, String gender) {
        for (int i = 0; i < hotel_ob.luxury_single.length; i++) {
            if (hotel_ob.luxury_single[i] == null) {
                hotel_ob.luxury_single[i] = new Singleroom(name, contact, gender);
                return true;
            }
        }
        return false;
    }

    private boolean bookDeluxeSingle(String name, String contact, String gender) {
        for (int i = 0; i < hotel_ob.deluxe_single.length; i++) {
            if (hotel_ob.deluxe_single[i] == null) {
                hotel_ob.deluxe_single[i] = new Singleroom(name, contact, gender);
                return true;
            }
        }
        return false;
    }

    private boolean bookLuxuryDouble(String name, String contact, String gender) {
        for (int i = 0; i < hotel_ob.luxury_double.length; i++) {
            if (hotel_ob.luxury_double[i] == null) {
                hotel_ob.luxury_double[i] = new Doubleroom(name, contact, gender);
                return true;
            }
        }
        return false;
    }

    private boolean bookDeluxeDouble(String name, String contact, String gender) {
        for (int i = 0; i < hotel_ob.deluxe_double.length; i++) {
            if (hotel_ob.deluxe_double[i] == null) {
                hotel_ob.deluxe_double[i] = new Doubleroom(name, contact, gender);
                return true;
            }
        }
        return false;
    }

    public void foodOrderAndBilling() {
        System.out.println("Enter Food Name: ");
        String foodName = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine()); // Using nextLine() for controlled input

        Food food = new Food(foodName, quantity);

        double foodPrice = 50 * food.quantity; // Example food price calculation
        double roomPrice = 100; // Example room price

        Bill bill = new Bill(roomPrice, foodPrice);
        bill.printBill(); // Print bill after room and food order

        Payment payment = new Payment();
        payment.processPayment(bill.total); // Process the payment
    }

    public void showAvailability() {
        System.out.println("Available Rooms: ");
        for (int i = 0; i < hotel_ob.luxury_single.length; i++) {
            if (hotel_ob.luxury_single[i] == null)
                System.out.println("Luxury Single Room " + (i + 1));
        }
        for (int i = 0; i < hotel_ob.deluxe_single.length; i++) {
            if (hotel_ob.deluxe_single[i] == null)
                System.out.println("Deluxe Single Room " + (i + 1));
        }
        for (int i = 0; i < hotel_ob.luxury_double.length; i++) {
            if (hotel_ob.luxury_double[i] == null)
                System.out.println("Luxury Double Room " + (i + 1));
        }
        for (int i = 0; i < hotel_ob.deluxe_double.length; i++) {
            if (hotel_ob.deluxe_double[i] == null)
                System.out.println("Deluxe Double Room " + (i + 1));
        }
    }

    public static void main(String[] args) {
        Hotel h = new Hotel();
        while (true) {
            System.out.println("Hotel Management System");
            System.out.println("1. Book Room");
            System.out.println("2. Check Availability");
            System.out.println("3. Exit");
            int choice = Integer.parseInt(h.sc.nextLine()); // Using nextLine() here as well
            switch (choice) {
                case 1:
                    h.bookRoom();
                    break;
                case 2:
                    h.showAvailability();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
