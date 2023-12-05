package io.github.entities;

import lombok.*;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.UUID;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    private Long id;
    private Client clientId;
    private Movie movieId;
    private OffsetDateTime createdAt;
    private Boolean returned;
}
