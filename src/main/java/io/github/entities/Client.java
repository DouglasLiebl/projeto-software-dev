package io.github.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter @Setter @SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client extends Person {

    private String email;
    private String cpf;

}
