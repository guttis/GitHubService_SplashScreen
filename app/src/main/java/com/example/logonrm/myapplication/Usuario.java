package com.example.logonrm.myapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 09/11/2017.
 */

public class Usuario {

    @SerializedName(value = "name")
    private String nome;
    @SerializedName(value = "avatar_url")
    private String foto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
