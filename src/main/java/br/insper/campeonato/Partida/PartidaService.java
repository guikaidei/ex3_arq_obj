package br.insper.campeonato.Partida;

import br.insper.campeonato.Campeonato.Campeonato;
import br.insper.campeonato.Campeonato.CampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

@Service
public class PartidaService {
    private ArrayList<Partida> partidas = new ArrayList<>();

    @Autowired
    private CampeonatoService campeonatoService;

    public Partida cadastrarPartida(Partida partida) {

        Campeonato campeonato = campeonatoService.getCampeonato(partida.getCampeonato().getId());

        if (campeonato == null) {
            throw new RuntimeException("Campeonato não encontrado!");
        }

        partida.setCampeonato(campeonato);
        partidas.add(partida);

        return partida;
    }

    public ArrayList<Partida> listarPartidas(String idMandante) {
        if (idMandante != null) {
            ArrayList<Partida> lista = new ArrayList<>();
            for (Partida partida : partidas) {
                if (partida.getIdMandante().equals(idMandante)) {
                    lista.add(partida);
                }
            }
            return lista;
        }

        return partidas;
    }

    public Integer calcularVitorias(String id) {
        if (id == null) {
            throw new RuntimeException("Time não encontrado!");
        }

        Integer vitorias = 0;

        for (Partida partida : partidas) {
            if (partida.getIdMandante().equals(id)) {
                if (partida.getPlacarMandante() > partida.getPlacarVisistante()) {
                    vitorias += 1;
                }
            }

            if (partida.getIdVisitante().equals(id)) {
                if (partida.getPlacarVisistante() > partida.getPlacarMandante()) {
                    vitorias += 1;
                }
            }
        }

        return vitorias;

    }

    public ArrayList<Partida> getPartidasCampeonato(String id) {
        Campeonato campeonatoSelecionado = null;

        ArrayList<Campeonato> campeonatos = campeonatoService.listarCampeonatos();
        for (Campeonato campeonato : campeonatos) {
            if (campeonato.getId().equals(id)) {
                campeonatoSelecionado = campeonato;
            }
        }

        if (campeonatoSelecionado == null) {
            throw new RuntimeException("Campeonato nao encontrado");
        }

        ArrayList<Partida> partidasCampeonado = new ArrayList<>();

        for (Partida partida : partidas) {
            if (partida.getCampeonato().equals(campeonatoSelecionado)) {
                partidasCampeonado.add(partida);
            }
        }

        return partidasCampeonado;
    }



}
