package io.github.entities;

import io.github.enums.Genre;
import io.github.enums.Rating;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

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
