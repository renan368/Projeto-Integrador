package unisales.br.ConsultMedica.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaRequest {

    @NotNull(message = "O atributo 'paciente' não pode ser nulo")
    private String paciente;

    private String dataStr;

    private String horario;

    private String especialidade;

    private String medico;

    private String idadeAt;

    private Boolean atendido;

    private String exame;

    private String contato;

    private String observacao;

    private Boolean pcd;
}
