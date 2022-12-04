package unisales.br.ConsultMedica.module.medico.service;

import unisales.br.ConsultMedica.model.Medico;

import java.util.List;
import java.util.Optional;

public interface MedicoService {

    Medico create(Medico medico);

    Optional<Medico> getById(Long id);

    List<Medico> getAll();

    void delete(Long id);

}
