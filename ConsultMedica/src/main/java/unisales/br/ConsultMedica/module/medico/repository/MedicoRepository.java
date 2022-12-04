package unisales.br.ConsultMedica.module.medico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unisales.br.ConsultMedica.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    
    
    
}
