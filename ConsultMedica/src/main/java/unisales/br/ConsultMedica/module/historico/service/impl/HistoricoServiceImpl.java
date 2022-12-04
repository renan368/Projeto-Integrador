package unisales.br.ConsultMedica.module.historico.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unisales.br.ConsultMedica.model.Consulta;
import unisales.br.ConsultMedica.module.consulta.service.ConsultaService;
import unisales.br.ConsultMedica.module.historico.service.HistoricoService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoricoServiceImpl implements HistoricoService {

    @Autowired
    private final ConsultaService consultaService;

    @Override
    public List<Consulta> getAll() {
        return this.consultaService.getAll();
    }
}
