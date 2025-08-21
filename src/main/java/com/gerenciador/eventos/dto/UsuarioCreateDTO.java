package com.gerenciador.eventos.dto;

import com.gerenciador.eventos.entity.TipoUsuario;

import java.time.LocalDateTime;
import java.util.Date;

public class UsuarioCreateDTO {
        private String email;
//        private String senha;
        private String nome;
        private String telefone;
        private String cpf;
        private TipoUsuario tipo;
        private Date data_nascimento;
        private LocalDateTime created_at ;
        private LocalDateTime updated_at;

    public UsuarioCreateDTO() {
    }

    public UsuarioCreateDTO(String email, String nome, String telefone, String cpf, TipoUsuario tipo, Date data_nascimento) {
        this.email = email;
//        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.tipo = tipo;
        this.data_nascimento = data_nascimento;
    }

    {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
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
}
