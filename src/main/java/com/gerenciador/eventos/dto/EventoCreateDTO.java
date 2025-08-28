package com.gerenciador.eventos.dto;

import com.gerenciador.eventos.entity.EventoEnum;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class EventoCreateDTO {

    private UUID id;
    private String nome;
    private String descricao;
    private EventoEnum tipo;
    private String local;
    private Date dataInicio;
    private Date dataFinal;
    private String link_evento;
    private String link_imagem;
    private LocalDateTime created_at ;
    private LocalDateTime updated_at;

    public EventoCreateDTO() {
    }

    public EventoCreateDTO(UUID id, String nome, String descricao, EventoEnum tipo, String local, Date dataInicio, Date dataFinal, String link_evento, String link_imagem) {
        this.id = id;
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }
}
