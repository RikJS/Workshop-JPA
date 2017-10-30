package nl.first8.hu.ticketsale.venue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by rikde on 04/09/2017.
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "artist")
    private List<Concert> concerts;

    @Enumerated(EnumType.STRING)
    private ArtistGenre genre;

    public String getName() {
        return name;
    }
}
