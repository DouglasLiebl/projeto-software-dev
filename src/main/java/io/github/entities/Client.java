package io.github.entities;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client {

    private Long id;
    private String name;
    private String email;
    private String cpf;
}
