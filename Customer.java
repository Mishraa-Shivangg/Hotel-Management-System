public class Customer {
    String name;
    String contact;
    String gender;

    public Customer(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "-------- Customer Details --------\n" +
                "Name: " + name + "\n" +
                "Contact: " + contact + "\n" +
                "Gender: " + gender + "\n";
    }
}
