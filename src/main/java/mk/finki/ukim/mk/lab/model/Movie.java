package mk.finki.ukim.mk.lab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String summary;

    private double rating;
    @ManyToOne(cascade  = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private Production production;

    public Movie(String title, String summary, double rating, Production production) {
        this.id=(long) (Math.random() * 1000);
        this.title = title;
        this.summary = summary;
        this.rating = rating;
        this.production = production;
    }
}
