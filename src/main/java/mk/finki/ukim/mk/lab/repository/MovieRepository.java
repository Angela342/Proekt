package mk.finki.ukim.mk.lab.repository;


import mk.finki.ukim.mk.lab.model.Movie;
import mk.finki.ukim.mk.lab.model.Production;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class MovieRepository {

    public List<Movie> movies;
    public MovieRepository(ProductionRepository productionRepository) {
        movies = new ArrayList<>();
        movies.add(new Movie("The Marsh King's Daughter", "A young mother must confront her long-buried past as the child of a kidnapper and the girl he held captive when her father breaks out of prison.", 8.3, productionRepository.findAll().get(0)));
        movies.add(new Movie("The Nun II", "In 1956 France, a priest is violently murdered, and Sister Irene begins to investigate. She once again comes face-to-face with a powerful evil.", 8.9, productionRepository.findAll().get(1)));
        movies.add(new Movie("A Haunting in Venice", "Now retired and living in self-imposed exile in the world's most glamorous city, Poirot reluctantly attends a seance at a decaying, haunted palazzo.", 8.4, productionRepository.findAll().get(2)));
        movies.add(new Movie("The Equalizer 3", "Since giving up his life as a government assassin, Robert McCall finds solace in serving justice on behalf of the oppressed.", 8.7, productionRepository.findAll().get(3)));
        movies.add(new Movie("Spider-Man: Across the Spider-Verse", "After reuniting with Gwen Stacy, Brooklyn's full-time, friendly neighborhood Spider-Man is catapulted across the Multiverse, where he encounters a team of Spider-People charged with protecting its very existence.", 8.1, productionRepository.findAll().get(4)));


    }
    public List<Movie> findAll() {
        return movies;
    }
    public Optional<Movie> findById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id)).findFirst();
    }
    public void deleteById(Long id) {
        movies.removeIf(movie -> movie.getId().equals(id));
    }

    public Optional<Movie> save(String title, String summary, double rating, Production production) {
        if( production==null)
            throw new RuntimeException("Production not found");
        Movie movie = new Movie(title,summary,rating,production);
        movies.add(movie);
        return Optional.of(movie);
    }




}
