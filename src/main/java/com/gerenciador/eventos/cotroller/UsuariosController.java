package com.gerenciador.eventos.cotroller;

import com.gerenciador.eventos.dto.UsuarioCreateDTO;
import com.gerenciador.eventos.dto.UsuarioCreateIdDTO;
import com.gerenciador.eventos.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping ("/api/v1/usuario")
public class UsuariosController {

    UsuarioService service;

    @GetMapping("/{id}")
    public UsuarioCreateIdDTO findById (@PathVariable("id")UUID id){
        return service.findById(id);
    }

    @GetMapping
    public List<UsuarioCreateIdDTO> findAll(){
        return service.findAll();
    }

    @PostMapping
    public UsuarioCreateDTO save(@RequestBody UsuarioCreateDTO usuarioCreateDTO){
        return service.save(usuarioCreateDTO);
    }

    @PutMapping ("/{id}")
    public UsuarioCreateDTO update(@PathVariable("id") UUID id, @RequestBody UsuarioCreateDTO usuarioCreateDTO){
        return service.update(id, usuarioCreateDTO);
    }

    @DeleteMapping ("/{id}")
    public void deleteById (@PathVariable("id") UUID id){
        service.deleteById(id);
    }

    public UsuariosController(UsuarioService service) {
        this.service = service;
    }
}
