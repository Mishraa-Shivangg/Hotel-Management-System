import java.io.Serializable;

public class Food implements Serializable {
    String name;
    int quantity;

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
