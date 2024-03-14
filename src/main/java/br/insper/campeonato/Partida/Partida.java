package br.insper.campeonato.Partida;

import br.insper.campeonato.Campeonato.Campeonato;

public class Partida {
    private String idMandante;
    private String idVisitante;
    private Integer placarMandante;
    private Integer placarVisistante;
    private Campeonato campeonato;

    public Partida() {
    }

    public Partida(String idMandante, String idVisitante, Integer placarMandante, Integer placarVisistante, Campeonato campeonato) {
        this.idMandante = idMandante;
        this.idVisitante = idVisitante;
        this.placarMandante = placarMandante;
        this.placarVisistante = placarVisistante;
        this.campeonato = campeonato;
    }

    public String getIdMandante() {
        return idMandante;
    }

    public void setIdMandante(String idMandante) {
        this.idMandante = idMandante;
    }

    public String getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(String idVisitante) {
        this.idVisitante = idVisitante;
    }

    public Integer getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(Integer placarMandante) {
        this.placarMandante = placarMandante;
    }

    public Integer getPlacarVisistante() {
        return placarVisistante;
    }

    public void setPlacarVisistante(Integer placarVisistante) {
        this.placarVisistante = placarVisistante;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
}
