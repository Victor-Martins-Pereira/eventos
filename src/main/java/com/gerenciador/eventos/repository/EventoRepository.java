package com.gerenciador.eventos.repository;

import com.gerenciador.eventos.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventoRepository extends JpaRepository<Evento, UUID> {


}
