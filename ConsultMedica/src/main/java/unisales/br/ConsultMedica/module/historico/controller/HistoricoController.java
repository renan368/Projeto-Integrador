package unisales.br.ConsultMedica.module.historico.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unisales.br.ConsultMedica.model.Consulta;
import unisales.br.ConsultMedica.module.consulta.repository.ConsultaRepository;
import unisales.br.ConsultMedica.module.consulta.service.ConsultaService;

@RestController
@RequestMapping("/historico")
@RequiredArgsConstructor
public class HistoricoController {

    @Autowired
    private final ConsultaService service;

    @GetMapping({"/exibir"})
    public List<Consulta> lista() {
        return service.getAll();
    }
    
    @GetMapping("/exclui")
    public void exclui(Long id) {
        service.delete(id);
    }

}
