package unisales.br.ConsultMedica.module.medico.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unisales.br.ConsultMedica.model.Medico;
import unisales.br.ConsultMedica.module.medico.repository.MedicoRepository;
import unisales.br.ConsultMedica.module.medico.service.MedicoService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private final MedicoRepository repository;

    @Override
    public Medico create(Medico medico) {
        return this.repository.save(medico);
    }

    @Override
    public Optional<Medico> getById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public List<Medico> getAll() {
        return this.repository.findAll();
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
