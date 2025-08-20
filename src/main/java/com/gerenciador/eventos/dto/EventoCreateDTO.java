package com.gerenciador.eventos.dto;

import com.gerenciador.eventos.entity.EventoEnum;

import java.time.LocalDateTime;

public class EventoCreateDTO {
    private String nome;
    private String descricao;
    private EventoEnum tipo;
    private String local;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFinal;
    private String link_evento;
    private String link_imagem;
    private LocalDateTime created_at ;
    private LocalDateTime updated_at;

    public EventoCreateDTO() {
    }

    public EventoCreateDTO(String nome, String descricao, EventoEnum tipo, String local, LocalDateTime dataInicio, LocalDateTime dataFinal, String link_evento, String link_imagem, LocalDateTime created_at, LocalDateTime updated_at) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.link_evento = link_evento;
        this.link_imagem = link_imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EventoEnum getTipo() {
        return tipo;
    }

    public void setTipo(EventoEnum tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getLink_evento() {
        return link_evento;
    }

    public void setLink_evento(String link_evento) {
        this.link_evento = link_evento;
    }

    public String getLink_imagem() {
        return link_imagem;
    }

    public void setLink_imagem(String link_imagem) {
        this.link_imagem = link_imagem;
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

    {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }
}
