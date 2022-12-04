package unisales.br.ConsultMedica.module.usuario.mapper;

import org.springframework.stereotype.Service;
import unisales.br.ConsultMedica.dto.request.UsuarioRequest;
import unisales.br.ConsultMedica.model.Usuario;

@Service
public class UsuarioMapper {

    public Usuario toDomain(UsuarioRequest request){
        Usuario medico = new Usuario();
        medico.setEmail(request.getEmail());
        medico.setSenha(request.getSenha());
        return medico;
    }
}
