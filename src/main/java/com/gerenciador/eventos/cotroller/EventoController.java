package com.gerenciador.eventos.cotroller;

import com.gerenciador.eventos.dto.EventoCreateDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping ("/api/v1/evento")      // localhost:8080/api/v1/evento

public class EventoController {

    //PEGAR EVENTO PELO ID
    @GetMapping ("/{id}")
    public EventoCreateDTO findById (@PathVariable("id")UUID id){
        return service.findById(id);
    }
    //PEGAR TODOS OS EVENTOS
    @GetMapping
    public List<EventoCreateDTO> findAll() {
        return service.findAll();
    }
    //SALVAR UM EVENTO
    @PostMapping
    public EventoCreateDTO save(@RequestBody EventoCreateDTO eventoCreateDTO){
        return service.save(eventoCreateDTO);
    }
    //ATUALIZAR UM EVENTO
    @PutMapping ("/{id}")
    public EventoCreateDTO update(@PathVariable("id") UUID id, @RequestBody EventoCreateDTO eventoCreateDTO){
        return service.update(id,eventoCreateDTO);
    }
    //DELETAR UM EVENTO
    @DeleteMapping ("/{id}")
    public void deleteById (@PathVariable("id")UUID id){
        service.deleteById(id);
    }
}
