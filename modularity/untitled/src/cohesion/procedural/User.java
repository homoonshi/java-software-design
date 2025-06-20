package cohesion.procedural;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String mail;

    public User(String name, String mail) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.mail = mail;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }
}
