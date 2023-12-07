package io.github.dto;

import io.github.entities.Client;
import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

    private Long id;
    private String name;
    private String email;
    private String cpf;

    public static ClientDTO of(Client request) {
        return ClientDTO.builder()
                .id(request.getId())
                .cpf(request.getCpf())
                .name(request.getName())
                .email(request.getEmail())
                .build();
    }
}
