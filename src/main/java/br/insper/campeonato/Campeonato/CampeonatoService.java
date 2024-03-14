package br.insper.campeonato.Campeonato;

import br.insper.campeonato.Partida.Partida;
import br.insper.campeonato.Partida.PartidaService;
import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CampeonatoService {

    private ArrayList<Campeonato> campeonatos = new ArrayList<>();

    public Campeonato cadastrarCampeonato(Campeonato campeonato) {
        if (campeonato.getId().equals("") || campeonato.getNome().equals("")) {
            throw new RuntimeException("Dados invalidos");
        }

        campeonatos.add(campeonato);
        return campeonato;
    }

    public Campeonato getCampeonato(String id) {
        for (Campeonato campeonato : campeonatos) {
            if (campeonato.getId().equals(id)) {
                return campeonato;
            }
        }
        return null;
    }

    public ArrayList<Campeonato> listarCampeonatos() {
        return campeonatos;
    }


}
