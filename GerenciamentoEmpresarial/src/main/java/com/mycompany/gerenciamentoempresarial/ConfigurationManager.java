/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoempresarial;

/**
 *
 * @author igorb
 */
public final class ConfigurationManager {
    private final String idioma;
    private final String fusoHorario;
    private final String tema;
    private final int tamanhoFonte;
    private final String nomeEmpresa;

    private static ConfigurationManager instancia;

    // Construtor privado
    private ConfigurationManager(Builder builder) {
        this.idioma = builder.idioma;
        this.fusoHorario = builder.fusoHorario;
        this.tema = builder.tema;
        this.tamanhoFonte = builder.tamanhoFonte;
        this.nomeEmpresa = builder.nomeEmpresa;
    }

    // Método de acesso Singleton
    public static ConfigurationManager getInstance(Builder builder) {
        if (instancia == null) {
            instancia = new ConfigurationManager(builder);
        }
        return instancia;
    }

    // Getters
    public String getIdioma() { return idioma; }
    public String getFusoHorario() { return fusoHorario; }
    public String getTema() { return tema; }
    public int getTamanhoFonte() { return tamanhoFonte; }
    public String getNomeEmpresa() { return nomeEmpresa; }

    // Classe Builder
    public static class Builder {
        private String idioma = "pt-BR";
        private String fusoHorario = "GMT-3";
        private String tema = "claro";
        private int tamanhoFonte = 12;
        private final String nomeEmpresa;

        public Builder(String nomeEmpresa) {
            if (nomeEmpresa == null || nomeEmpresa.isEmpty()) {
                throw new IllegalArgumentException("Nome da empresa é obrigatório.");
            }
            this.nomeEmpresa = nomeEmpresa;
        }

        public Builder idioma(String idioma) {
            this.idioma = idioma;
            return this;
        }

        public Builder fusoHorario(String fusoHorario) {
            this.fusoHorario = fusoHorario;
            return this;
        }

        public Builder tema(String tema) {
            this.tema = tema;
            return this;
        }

        public Builder tamanhoFonte(int tamanhoFonte) {
            this.tamanhoFonte = tamanhoFonte;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Configuração do Sistema:\n" +
                "Empresa: " + nomeEmpresa + "\n" +
                "Idioma: " + idioma + "\n" +
                "Fuso Horário: " + fusoHorario + "\n" +
                "Tema: " + tema + "\n" +
                "Tamanho da Fonte: " + tamanhoFonte;
    }
}

