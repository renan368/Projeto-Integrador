package unisales.br.ConsultMedica.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import unisales.br.ConsultMedica.model.Usuario;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {

    @NotNull(message = "O email não pode ser nulo")
    @NotEmpty(message = "O email está vazio")
    private String email;

    @NotNull(message = "A senha está vazia")
    @NotEmpty(message = "A senha está vazia")
    private String senha;
}
