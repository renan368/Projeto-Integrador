package unisales.br.ConsultMedica.dto.request;


import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MedicoRequest {

    @NotNull(message = "O atributo 'nome' não pode ser nulo")
    private String nome;

    @NotNull(message = "O atributo 'especialidade' não pode ser nulo")
    private String especialidade;
}
