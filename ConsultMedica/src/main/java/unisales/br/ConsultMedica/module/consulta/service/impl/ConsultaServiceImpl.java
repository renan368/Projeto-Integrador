package unisales.br.ConsultMedica.module.consulta.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import unisales.br.ConsultMedica.model.Consulta;
import unisales.br.ConsultMedica.module.consulta.repository.ConsultaRepository;
import unisales.br.ConsultMedica.module.consulta.service.ConsultaService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConsultaServiceImpl implements ConsultaService {

    @Autowired
    private final ConsultaRepository repository;

    @Override
    public Optional<Consulta> getById(Long idConsulta) {
        return this.repository.findById(idConsulta);
    }

    @Override
    public Consulta create(Consulta consulta) {
        return this.repository.save(consulta);
    }

    @Override
    public List<Consulta> getAll() {
        return this.repository.findAll(Sort.by("id"));
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Consulta getByPacienteAndData(String paciente, String dataStr) {
        return this.repository.getByPacienteAndDataStr(paciente, dataStr);
    }
}
