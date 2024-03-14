package br.insper.campeonato.Time;

public class Time {
    private String id;
    private String nome;
    private String estado;
    private String estadio;

    public Time() {
    }

    public Time(String id, String nome, String estado, String estadio) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.estadio = estadio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
}
