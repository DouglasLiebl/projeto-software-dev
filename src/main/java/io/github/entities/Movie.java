package io.github.entities;

import io.github.enums.Genre;
import io.github.enums.Rating;
import lombok.*;

import java.util.Date;

@Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor
public class Movie {
    private String name;
    private double duration;
    private String director;
    private Date releaseDate;
    private Genre genre;
    private Rating ratings;
    private String description;
}
