package mk.finki.ukim.mk.lab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class User {
    public User(Long id, String username, String name, String surname, String password, LocalDate dateOfBirth, List<ShoppingCart> carts) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.carts = carts;
    }

    private Long id;

            private String username;

            private String name;

            private String surname;

            private String password;

            private LocalDate dateOfBirth;

            private List<ShoppingCart> carts;
}
