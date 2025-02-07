package mk.finki.ukim.mk.lab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Production {
    @Id
    private Long id;

    private String name;

    private String country;

    private String address;

    public Production(String name, String country, String address) {
        this.id = (long) (Math.random() * 1000);
        this.name = name;
        this.country = country;
        this.address = address;
    }
}
