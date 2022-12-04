package unisales.br.ConsultMedica.module.consulta.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unisales.br.ConsultMedica.dto.request.ConsultaRequest;
import unisales.br.ConsultMedica.dto.response.ConsultaResponse;
import unisales.br.ConsultMedica.model.Consulta;
import unisales.br.ConsultMedica.module.consulta.mapper.ConsultaMapper;
import unisales.br.ConsultMedica.module.consulta.service.ConsultaService;

import java.util.List;

@RestController
@RequestMapping("/consulta")
@RequiredArgsConstructor
public class ConsultaController {

    @Autowired
    private final ConsultaService service;

    @Autowired
    private final ConsultaMapper mapper;

    @PostMapping({"/cadastro"})
    public ResponseEntity<ConsultaResponse> create(@RequestBody ConsultaRequest request) {

        return ResponseEntity.ok(this.mapper.toResponse(this.service.create(this.mapper.toDomain(request))));
    }

    @GetMapping("/get")
    public ResponseEntity<ConsultaResponse> getById(Long id) {

        return ResponseEntity.ok(this.mapper.toResponse(service.getById(id).get()));
    }

    @GetMapping({"/", "/index"})
    public ResponseEntity<List<ConsultaResponse>> lista() {
        return ResponseEntity.ok(this.service.getAll().stream().map(this.mapper::toResponse).toList());
    }

    @GetMapping("/exclui")
    public void delete(Long id) {
        this.service.delete(id);
    }

    @GetMapping("/pesquisa")
    public Consulta pesquisa(String paciente, String dataStr) {
        return this.service.getByPacienteAndData(paciente, dataStr);
    }
}
