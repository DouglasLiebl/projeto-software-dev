package io.github.entities;

import io.github.dto.MovieDTO;
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
    private Rating rating;
    private String description;
    private boolean isAvailable;

    public static Movie of(MovieDTO request) {
        return Movie.builder()
                .name(request.getName())
                .director(request.getDirector())
                .duration(Double.parseDouble(request.getDuration()))
                .releaseDate(request.getReleaseDate())
                .genre(Genre.valueOf(request.getGenre()))
                .rating(Rating.valueOf(request.getRating()))
                .description(request.getDescription())
                .isAvailable(true)
                .build();
    }
}
