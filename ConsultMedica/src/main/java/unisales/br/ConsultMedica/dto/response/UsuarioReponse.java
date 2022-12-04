package unisales.br.ConsultMedica.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import unisales.br.ConsultMedica.dto.request.UsuarioRequest;

@Data
public class UsuarioReponse extends UsuarioRequest {
    private Long id;
}
