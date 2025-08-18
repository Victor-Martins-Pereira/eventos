package com.gerenciador.eventos.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
    @Table (name = "inscricao")
public class Inscricoes {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
        @Column(nullable = false,updatable = false)
        private UUID id;
        private StatusPagamento StatusPagamento;
        private LocalDateTime dataHora;
        private LocalDateTime created_at;
        private LocalDateTime updated_at;

        @ManyToOne
        @JoinColumn(name = "evento_id", nullable = false)
        private Evento evento;

        @ManyToOne
        @JoinColumn(name = "usuario_id", nullable = false)
        private Usuario usuario;

        public Inscricoes() {
        }

        public Inscricoes(UUID id, com.gerenciador.eventos.entity.StatusPagamento statusPagamento, LocalDateTime dataHora, LocalDateTime created_at, LocalDateTime updated_at, Evento evento, Usuario usuario) {
                this.id = id;
                StatusPagamento = statusPagamento;
                this.dataHora = dataHora;
                this.created_at = created_at;
                this.updated_at = updated_at;
                this.evento = evento;
                this.usuario = usuario;
        }

        public UUID getId() {
                return id;
        }

        public void setId(UUID id) {
                this.id = id;
        }

        public StatusPagamento getStatusPagamento() {
                return StatusPagamento;
        }

        public void setStatusPagamento(StatusPagamento statusPagamento) {
                StatusPagamento = statusPagamento;
        }

        public LocalDateTime getDataHora() {
                return dataHora;
        }

        public void setDataHora(LocalDateTime dataHora) {
                this.dataHora = dataHora;
        }

        public LocalDateTime getCreated_at() {
                return created_at;
        }

        public void setCreated_at(LocalDateTime created_at) {
                this.created_at = created_at;
        }

        public LocalDateTime getUpdated_at() {
                return updated_at;
        }

        public void setUpdated_at(LocalDateTime updated_at) {
                this.updated_at = updated_at;
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
