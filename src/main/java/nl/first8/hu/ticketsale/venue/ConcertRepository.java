package nl.first8.hu.ticketsale.venue;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rikde on 05/09/2017.
 */

public interface ConcertRepository extends CrudRepository<Concert, Long> {
    Iterable<Concert> findAllByArtist_Name(String name);
    Iterable<Concert> findAllByGenre(ArtistGenre artistGenre);
    Iterable<Concert> findAllByLocation_Name(String name);

}
