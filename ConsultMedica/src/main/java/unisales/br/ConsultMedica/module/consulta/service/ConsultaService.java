package unisales.br.ConsultMedica.module.consulta.service;

import unisales.br.ConsultMedica.model.Consulta;
import unisales.br.ConsultMedica.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface ConsultaService {

    Optional<Consulta> getById(Long idConsulta);

    Consulta create(Consulta consulta);

    List<Consulta> getAll();

    void delete (Long id);

    Consulta getByPacienteAndData(String paciente, String dataStr);
}
