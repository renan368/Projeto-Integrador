package unisales.br.ConsultMedica.module.usuario.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unisales.br.ConsultMedica.model.Usuario;
import unisales.br.ConsultMedica.module.usuario.repository.UsuarioRepository;
import unisales.br.ConsultMedica.module.usuario.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private final UsuarioRepository repository;


    @Override
    public Optional<Usuario> getById(Long idUsuario) {
        return this.repository.findById(idUsuario);
    }

    @Override
    public Usuario create(Usuario usuario) {
        return this.repository.save(usuario);
    }

    @Override
    public List<Usuario> getAll() {
        return this.repository.findAll();
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Usuario getByEmailAndNome(String email, String nome) {
        return this.repository.getByEmailandSenha(email, nome);
    }
}
