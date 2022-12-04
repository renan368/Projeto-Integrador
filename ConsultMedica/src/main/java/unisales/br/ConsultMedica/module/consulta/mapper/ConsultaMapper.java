package unisales.br.ConsultMedica.module.consulta.mapper;

import org.springframework.stereotype.Service;
import unisales.br.ConsultMedica.dto.request.ConsultaRequest;
import unisales.br.ConsultMedica.dto.response.ConsultaResponse;
import unisales.br.ConsultMedica.model.Consulta;

@Service
public class ConsultaMapper {

    public Consulta toDomain(ConsultaRequest request){
         Consulta consulta = new Consulta();
        consulta.setPaciente(request.getPaciente());
        consulta.setDataStr(request.getDataStr());
        consulta.setHorario(request.getHorario());
        consulta.setEspecialidade(request.getEspecialidade());
        consulta.setMedico(request.getMedico());
        consulta.setIdadeAt(request.getIdadeAt());
        consulta.setAtendido(request.getAtendido());
        consulta.setContato(request.getContato());
        consulta.setObservacao(request.getObservacao());

        return consulta;
    }

    public ConsultaResponse toResponse (Consulta consulta){
        ConsultaResponse response = new ConsultaResponse();
        response.setId(consulta.getId());
        response.setPaciente(consulta.getPaciente());
        response.setDataStr(consulta.getDataStr());
        response.setHorario(consulta.getHorario());
        response.setMedico(consulta.getMedico());
        response.setEspecialidade(consulta.getEspecialidade());
        response.setIdadeAt(consulta.getIdadeAt());
        response.setAtendido(consulta.getAtendido());
        response.setContato(consulta.getContato());
        response.setObservacao(consulta.getObservacao());

        return response;
    }
}
