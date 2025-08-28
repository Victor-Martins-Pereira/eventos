package com.gerenciador.eventos.service;

import com.gerenciador.eventos.dto.UsuarioCreateDTO;
import com.gerenciador.eventos.dto.UsuarioCreateIdDTO;
import com.gerenciador.eventos.entity.Usuario;
import com.gerenciador.eventos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioCreateIdDTO findById(UUID id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        UsuarioCreateIdDTO usuarioCreateDTO = IDconvertToDto(usuario);
        return usuarioCreateDTO;
    }

    public UsuarioCreateDTO save(UsuarioCreateDTO usuarioCreateDTO){
        Usuario usuario = convertToEntity(usuarioCreateDTO);
        usuario = usuarioRepository.save(usuario);
        return convertToDto(usuario);
    }

    public UsuarioCreateDTO update(UUID id, UsuarioCreateDTO usuarioCreateDTO){
        Usuario usuario = convertToEntity(usuarioCreateDTO);
        usuario.setId(id);
        usuario = usuarioRepository.save(usuario);
        return convertToDto(usuario);
    }

    public void deleteById(UUID id) {
        usuarioRepository.deleteById(id);
    }

    public List<UsuarioCreateIdDTO> findAll(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        List<UsuarioCreateIdDTO> usuarioDTOS = new ArrayList<>();
        for (Usuario usuario : usuarios){
            usuarioDTOS.add(IDconvertToDto(usuario));
        }
        return usuarioDTOS;
    }

    public UsuarioCreateDTO convertToDto(Usuario usuario){
        UsuarioCreateDTO DTO = new UsuarioCreateDTO();
        DTO.setEmail(usuario.getEmail());
        DTO.setSenha(usuario.getSenha());
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
        entity.setSenha(usuarioCreateDTO.getSenha());
        entity.setNome(usuarioCreateDTO.getNome());
        entity.setTelefone(usuarioCreateDTO.getTelefone());
        entity.setCpf(usuarioCreateDTO.getCpf());
        entity.setTipo(usuarioCreateDTO.getTipo());
        entity.setData_nascimento(usuarioCreateDTO.getData_nascimento());
        return entity;
    }

    public UsuarioCreateIdDTO IDconvertToDto(Usuario usuario){
        UsuarioCreateIdDTO DTO = new UsuarioCreateIdDTO();
        DTO.setId(usuario.getId());
        DTO.setEmail(usuario.getEmail());
        DTO.setNome(usuario.getNome());
        DTO.setTelefone(usuario.getTelefone());
        DTO.setCpf(usuario.getCpf());
        DTO.setTipo(usuario.getTipo());
        DTO.setData_nascimento(usuario.getData_nascimento());
        return DTO;
    }
}
