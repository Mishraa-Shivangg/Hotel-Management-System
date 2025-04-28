import java.io.Serializable;

public class Singleroom implements Serializable {
    String name, contact, gender;

    public Singleroom(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}
