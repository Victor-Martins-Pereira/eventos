package com.gerenciador.eventos.service;

import com.gerenciador.eventos.dto.InscricaoCreateDTO;
import com.gerenciador.eventos.entity.Inscricao;
import com.gerenciador.eventos.repository.EventoRepository;
import com.gerenciador.eventos.repository.InscricaoRepository;
import com.gerenciador.eventos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private EventoRepository eventoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public InscricaoCreateDTO findById(UUID id){
        Inscricao inscricao = inscricaoRepository.findById(id).orElseThrow();
        InscricaoCreateDTO inscricaoCreateDTO = convertToDto(inscricao);
        return inscricaoCreateDTO;
    }

    public InscricaoCreateDTO save(InscricaoCreateDTO inscricaoDTO){
        Inscricao inscricao = convertToEntity(inscricaoDTO);
        inscricao = inscricaoRepository.save(inscricao);
        return convertToDto(inscricao);
    }

    public InscricaoCreateDTO update(UUID id, InscricaoCreateDTO inscricaoCreateDTO){
        Inscricao inscricao = convertToEntity((inscricaoCreateDTO));
        inscricao.setId(id);
        inscricao = inscricaoRepository.save(inscricao);
        return convertToDto(inscricao);
    }

    public void deleteById(UUID id){
        inscricaoRepository.deleteById(id);
    }

    public List<InscricaoCreateDTO> findAll(){
        List<Inscricao> inscricoes = inscricaoRepository.findAll();
        List<InscricaoCreateDTO> inscricaoDTOS = new ArrayList<>();
        for (Inscricao inscricao : inscricoes){
            inscricaoDTOS.add(convertToDto(inscricao));
        }
        return inscricaoDTOS;
    }

    public InscricaoCreateDTO convertToDto (Inscricao inscricao){
        InscricaoCreateDTO DTO = new InscricaoCreateDTO();
        DTO.setEvento(inscricao.getEvento().getId());
        DTO.setUsuario(inscricao.getUsuario().getId());
        DTO.setDataHora(inscricao.getDataHora());
        DTO.setStatusPagamento(inscricao.getStatusPagamento());
        return DTO;
    }

    public Inscricao convertToEntity (InscricaoCreateDTO inscricaoCreateDTO){
        Inscricao entity = new Inscricao();
        entity.setEvento(eventoRepository.findById(inscricaoCreateDTO.getEvento()).orElseThrow());
        entity.setUsuario(usuarioRepository.findById(inscricaoCreateDTO.getUsuario()).orElseThrow());
        entity.setDataHora(inscricaoCreateDTO.getDataHora());
        entity.setStatusPagamento(inscricaoCreateDTO.getStatusPagamento());
        return entity;
    }
}
