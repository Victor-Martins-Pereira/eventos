package com.gerenciador.eventos.cotroller;

import com.gerenciador.eventos.dto.InscricaoCreateDTO;
import com.gerenciador.eventos.service.InscricaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping ("/api/v1/inscricao")
public class InscricaoController {

    InscricaoService service;

    public InscricaoController(InscricaoService service) {
        this.service = service;
    }

    //PEGAR INSCRIÇÃO PELO ID
    @GetMapping("/{id}")
    public InscricaoCreateDTO findById (@PathVariable("id")UUID id){
        return service.findById(id);
    }
    //PEGAR TODOS AS INSCRIÇÕES
    @GetMapping
    public List<InscricaoCreateDTO> findAll() {
        return service.findAll();
    }
    //SALVAR UMA INSCRIÇÃO
    @PostMapping
    public InscricaoCreateDTO save(@RequestBody InscricaoCreateDTO inscricaoCreateDTO){
        return service.save(inscricaoCreateDTO);
    }
    //ATUALIZAR UMA INSCRIÇÃO
    @PutMapping("/{id}")
    public InscricaoCreateDTO update(@PathVariable("id") UUID id, @RequestBody InscricaoCreateDTO inscricaoCreateDTO){
        return service.update(id,inscricaoCreateDTO);
    }
    //DELETE UMA INSCRIÇÃO
    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable ("id") UUID id){
        service.deleteById(id);
    }
}
