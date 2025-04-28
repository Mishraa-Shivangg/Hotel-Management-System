import java.io.Serializable;

public class Doubleroom implements Serializable {
    String name, contact, gender;

    public Doubleroom(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}
