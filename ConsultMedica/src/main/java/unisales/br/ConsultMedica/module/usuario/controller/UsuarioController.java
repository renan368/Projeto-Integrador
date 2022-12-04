
package unisales.br.ConsultMedica.module.usuario.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unisales.br.ConsultMedica.dto.request.UsuarioRequest;
import unisales.br.ConsultMedica.model.Usuario;
import unisales.br.ConsultMedica.module.usuario.mapper.UsuarioMapper;
import unisales.br.ConsultMedica.module.usuario.repository.UsuarioRepository;
import unisales.br.ConsultMedica.module.usuario.service.UsuarioService;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UsuarioController {
    
    @Autowired
    private final UsuarioService service;
    @Autowired
    private final UsuarioMapper mapper;

    
    @PostMapping("/cadastro")
    public Usuario adiciona (@RequestBody Usuario request){
        return this.service.create(request);
    }
    
    @GetMapping("/get")
    public Usuario getById(Long id) {
        return this.service.getById(id).get();
    }
    
    @GetMapping
    public List lista(Model model) {
        return this.service.getAll();
    }

    @GetMapping("/login")
    public Usuario login(String email, String nome) {
        return this.service.getByEmailAndNome(email, nome);
    }
}
