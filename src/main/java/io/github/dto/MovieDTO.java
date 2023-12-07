package io.github.dto;

import io.github.entities.Movie;
import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {

    private Long id;
    private String name;
    private String duration;
    private String director;
    private String releaseDate;
    private String genre;
    private String rating;
    private String description;
    private boolean isAvailable;

    public static MovieDTO of(Movie request) {
        return MovieDTO.builder()
                .id(request.getId())
                .name(request.getName())
                .duration(request.getDuration().toString())
                .director(request.getDirector())
                .releaseDate(request.getReleaseDate())
                .genre(request.getGenre().name())
                .rating(request.getRating().name())
                .description(request.getDescription())
                .isAvailable(request.isAvailable())
                .build();
    }
}
