package com.gerenciador.eventos.service;

import com.gerenciador.eventos.dto.UsuarioCreateDTO;
import com.gerenciador.eventos.entity.Usuario;
import com.gerenciador.eventos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioCreateDTO findById(UUID id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        UsuarioCreateDTO usuarioCreateDTO = convertToDto(usuario);
        return usuarioCreateDTO;
    }

    public UsuarioCreateDTO convertToDto(Usuario usuario){
        UsuarioCreateDTO DTO = new UsuarioCreateDTO();
        DTO.setEmail(usuario.getEmail());
        DTO.setNome(usuario.getNome());
        DTO.setTelefone(usuario.getTelefone());
        DTO.setCpf(usuario.getCpf());
        DTO.setTipo(usuario.getTipo());
        DTO.setData_nascimento(usuario.getData_nascimento());
        return DTO;
    }

    public Usuario convertToEntity (UsuarioCreateDTO usuarioCreateDTO){
        Usuario entity = new Usuario();
        entity.setEmail(usuarioCreateDTO.getEmail());
        entity.setNome(usuarioCreateDTO.getNome());
        entity.setTelefone(usuarioCreateDTO.getTelefone());
        entity.setCpf(usuarioCreateDTO.getCpf());
        entity.setTipo(usuarioCreateDTO.getTipo());
        entity.setData_nascimento(usuarioCreateDTO.getData_nascimento());
        return entity;
    }

}
