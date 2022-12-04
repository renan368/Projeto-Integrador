
package unisales.br.ConsultMedica.module.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import unisales.br.ConsultMedica.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    @Query("from Usuario u where u.email = :email and u.senha = :senha")
    Usuario getByEmailandSenha(String email, String senha);
}
