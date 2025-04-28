public class Bill {
    double roomPrice;
    double foodPrice;
    double total;

    public Bill(double roomPrice, double foodPrice) {
        this.roomPrice = roomPrice;
        this.foodPrice = foodPrice;
        this.total = roomPrice + foodPrice;
    }

    public void printBill() {
        System.out.println("Room Price: " + roomPrice);
        System.out.println("Food Price: " + foodPrice);
        System.out.println("Total Price: " + total);
    }
}
