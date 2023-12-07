package io.github.dto;

import io.github.entities.Loan;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanDTO {

    private UUID id;
    private Long clientId;
    private Long movieId;
    private OffsetDateTime createdAt;
    private Boolean returned;

    public static LoanDTO of(Loan request) {
        return LoanDTO.builder()
                .id(request.getId())
                .clientId(request.getClientId().getId())
                .movieId(request.getMovieId().getId())
                .createdAt(request.getCreatedAt())
                .returned(request.getReturned())
                .build();
    }
}
