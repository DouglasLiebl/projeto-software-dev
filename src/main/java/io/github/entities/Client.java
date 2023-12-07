package io.github.entities;

import io.github.dto.ClientDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter @Setter @SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client extends Person {

    private String email;
    private String cpf;

    public static Client of(ClientDTO request) {
        return Client.builder()
                .name(request.getName())
                .cpf(request.getCpf())
                .email(request.getEmail())
                .build();
    }

}
