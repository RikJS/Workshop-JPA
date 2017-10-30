package nl.first8.hu.ticketsale.venue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rikde on 05/09/2017.
 */
@RestController
public class ConcertResource {

    @Autowired
    private ConcertService concertService;

    @RequestMapping(method = RequestMethod.GET, value = "/concerts/artist/{artistName}")
    public List<Concert> getAllConcertsByArtistName(@PathVariable String artistName) {
        return concertService.getAllConcertsByArtistName(artistName);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/concerts/genre/{artistName}")
    public List<Concert> getAllConcertsByGenre(@PathVariable ArtistGenre genre) {
        return concertService.getAllConcertsByGenre(genre);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/concerts/location/{locationName}")
    public List<Concert> getAllConcertsByLocationName(@PathVariable String locationName) {
        return concertService.getAllConcertsByLocationName(locationName);
    }
}
