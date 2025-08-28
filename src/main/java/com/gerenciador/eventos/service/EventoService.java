package com.gerenciador.eventos.service;

import com.gerenciador.eventos.dto.EventoCreateDTO;
import com.gerenciador.eventos.entity.Evento;
import com.gerenciador.eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public EventoCreateDTO save(EventoCreateDTO eventoDTO){
        Evento evento = convertToEntity(eventoDTO);
        evento = eventoRepository.save(evento);
        return convertToDto(evento);
    }

    public EventoCreateDTO update(UUID id, EventoCreateDTO eventoDTO){
        Evento evento = convertToEntity(eventoDTO);
        evento.setId(id);
        evento = eventoRepository.save(evento);
        return convertToDto(evento);
    }

    public void deleteById(UUID id){
        eventoRepository.deleteById(id);
    }

    public List<EventoCreateDTO> findAll(){
        List<Evento> eventos = eventoRepository.findAll();
        List<EventoCreateDTO> eventoDTOS = new ArrayList<>();
        for (Evento evento : eventos){
            eventoDTOS.add(convertToDto(evento));
        }
        return eventoDTOS;
    }

    public EventoCreateDTO convertToDto(Evento evento){
        EventoCreateDTO DTO = new EventoCreateDTO();
        DTO.setId(evento.getId());
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
        entity.setId(eventoCreateDTO.getId());
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
