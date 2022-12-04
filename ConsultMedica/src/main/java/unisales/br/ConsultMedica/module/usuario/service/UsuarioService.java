package unisales.br.ConsultMedica.module.usuario.service;

import unisales.br.ConsultMedica.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Optional<Usuario> getById(Long idUsuario);

    Usuario create(Usuario consulta);

    List<Usuario> getAll();

    void delete (Long id);

    Usuario getByEmailAndNome (String email, String nome);
}
