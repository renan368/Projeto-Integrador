package unisales.br.ConsultMedica.module.consulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import unisales.br.ConsultMedica.model.Consulta;
import unisales.br.ConsultMedica.model.Usuario;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    @Query("from Consulta c where c.paciente = :paciente and c.dataStr = :dataStr")
    Consulta getByPacienteAndDataStr(String paciente, String dataStr);
}

