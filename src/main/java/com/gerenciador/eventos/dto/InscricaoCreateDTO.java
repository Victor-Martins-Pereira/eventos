package com.gerenciador.eventos.dto;

import com.gerenciador.eventos.entity.Evento;
import com.gerenciador.eventos.entity.StatusPagamento;
import com.gerenciador.eventos.entity.Usuario;

import java.time.LocalDateTime;

public class InscricaoCreateDTO {

  private StatusPagamento statusPagamento;
  private LocalDateTime dataHora;
  private Evento evento;
  private Usuario usuario;

    public InscricaoCreateDTO(StatusPagamento statusPagamento, LocalDateTime dataHora, Evento evento, Usuario usuario) {
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
