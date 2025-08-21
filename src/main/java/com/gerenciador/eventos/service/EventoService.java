package com.gerenciador.eventos.service;

import com.gerenciador.eventos.dto.EventoCreateDTO;
import com.gerenciador.eventos.entity.Evento;
import com.gerenciador.eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EventoService {
    @Autowired // EventoRepository eventoRepository = new EventoRepository();
    private EventoRepository eventoRepository;

    public EventoCreateDTO findById(UUID id) {
        Evento evento = eventoRepository.findById(id).orElseThrow();
        EventoCreateDTO eventoCreateDTO = convertToDto(evento);
        return eventoCreateDTO;
    }

    public EventoCreateDTO convertToDto(Evento evento){
        EventoCreateDTO DTO = new EventoCreateDTO();
        DTO.setNome(evento.getNome());
        DTO.setDescricao(evento.getDescricao());
        DTO.setLocal(evento.getLocal());
        DTO.setTipo((evento.getTipo()));
        DTO.setDataInicio(evento.getDataInicio());
        DTO.setDataFinal(evento.getDataFinal());
        DTO.setLink_evento((evento.getLink_evento()));
        DTO.setLink_imagem((evento.getLink_imagem())); ;
        return DTO;
    }

    public Evento convertToEntity (EventoCreateDTO eventoCreateDTO){
        Evento entity = new Evento();
        entity.setNome(eventoCreateDTO.getNome());
        entity.setDescricao(eventoCreateDTO.getDescricao());
        entity.setLocal(eventoCreateDTO.getLocal());
        entity.setTipo(eventoCreateDTO.getTipo());
        entity.setDataInicio(eventoCreateDTO.getDataInicio());
        entity.setDataFinal(eventoCreateDTO.getDataFinal());
        entity.setLink_evento(eventoCreateDTO.getLink_evento());
        entity.setLink_imagem(eventoCreateDTO.getLink_imagem());
        return entity;
    }

}
