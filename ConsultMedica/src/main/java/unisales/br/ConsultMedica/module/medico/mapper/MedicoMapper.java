package unisales.br.ConsultMedica.module.medico.mapper;

import org.springframework.stereotype.Service;
import unisales.br.ConsultMedica.dto.request.MedicoRequest;
import unisales.br.ConsultMedica.dto.response.MedicoResponse;
import unisales.br.ConsultMedica.model.Medico;

@Service
public class MedicoMapper {

    public Medico toDomain(MedicoRequest request){
        Medico medico = new Medico();
        medico.setNome(request.getNome());
        medico.setEspecialidade(request.getEspecialidade());
        return medico;
    }

    public MedicoResponse toResponse (Medico medico){
        MedicoResponse response = new MedicoResponse();
        response.setId(medico.getId());
        response.setNome(medico.getNome());
        response.setEspecialidade(medico.getEspecialidade());
        return response;
    }
}
