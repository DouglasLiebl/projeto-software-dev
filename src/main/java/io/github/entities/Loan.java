package io.github.entities;

import io.github.dto.LoanDTO;
import io.github.dto.MovieDTO;
import lombok.*;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.UUID;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    private UUID id;
    private Client clientId;
    private Movie movieId;
    private OffsetDateTime createdAt;
    private Boolean returned;

    public static Loan of(LoanDTO dto) {
        return Loan.builder()
                .returned(false)
                .createdAt(OffsetDateTime.now())
                .build();
    }
}
