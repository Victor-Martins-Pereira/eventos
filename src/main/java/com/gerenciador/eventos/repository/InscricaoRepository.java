package com.gerenciador.eventos.repository;

import com.gerenciador.eventos.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InscricaoRepository extends JpaRepository<Inscricao, UUID> {
}
