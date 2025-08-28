package com.gerenciador.eventos.dto;

import com.gerenciador.eventos.entity.Evento;
import com.gerenciador.eventos.entity.StatusPagamento;
import com.gerenciador.eventos.entity.Usuario;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class InscricaoCreateDTO {

  private StatusPagamento statusPagamento;
  private Date dataHora;
  private UUID evento;
  private UUID usuario;

    public InscricaoCreateDTO(StatusPagamento statusPagamento, Date dataHora, UUID evento, UUID usuario) {
        this.statusPagamento = statusPagamento;
        this.dataHora = dataHora;
        this.evento = evento;
        this.usuario = usuario;
    }

    public InscricaoCreateDTO() {
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public UUID getEvento() {
        return evento;
    }

    public void setEvento(UUID evento) {
        this.evento = evento;
    }

    public UUID getUsuario() {
        return usuario;
    }

    public void setUsuario(UUID usuario) {
        this.usuario = usuario;
    }
}
