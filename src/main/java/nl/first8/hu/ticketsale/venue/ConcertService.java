package nl.first8.hu.ticketsale.venue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rikde on 05/09/2017.
 */
@Service
public class ConcertService {

    @Autowired
    private ConcertRepository concertRepository;

    public List<Concert> getAllConcertsByArtistName(String artistName) {
        List<Concert> concerts = new ArrayList<>();
        concertRepository.findAllByArtist_Name(artistName).forEach(concerts::add);
        return concerts;
    }

    public List<Concert> getAllConcertsByGenre(ArtistGenre genre) {
        List<Concert> concerts = new ArrayList<>();
        concertRepository.findAllByGenre(genre).forEach(concerts::add);
        return concerts;
    }

    public List<Concert> getAllConcertsByLocationName(String locationName) {
        List<Concert> concerts = new ArrayList<>();
        concertRepository.findAllByLocation_Name(locationName).forEach(concerts::add);
        return concerts;
    }
}
