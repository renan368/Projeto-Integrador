package unisales.br.ConsultMedica.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaResponse {

    private Long id;

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
