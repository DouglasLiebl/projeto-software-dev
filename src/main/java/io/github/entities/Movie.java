package io.github.entities;

import io.github.enums.Genre;
import io.github.enums.Rating;
import lombok.*;

@Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor
@ToString
public class Movie {

    private Long id;
    private String name;
    private Double duration;
    private String director;
    private String releaseDate;
    private Genre genre;
    private Rating ratings;
    private String description;
    private boolean isAvailable;

}
