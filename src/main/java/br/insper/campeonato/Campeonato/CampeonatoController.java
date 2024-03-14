package br.insper.campeonato.Campeonato;

import br.insper.campeonato.Partida.Partida;
import br.insper.campeonato.Partida.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CampeonatoController {

    @Autowired
    private CampeonatoService campeonatoService;

    @Autowired
    private PartidaService partidaService;


    @GetMapping("/campeonato")
    public ArrayList<Campeonato> listarCampeonatos() {
        return campeonatoService.listarCampeonatos();
    }

    @PostMapping("/campeonato")
    public Campeonato cadastrarCampeonato(@RequestBody Campeonato campeonato) {
        return campeonatoService.cadastrarCampeonato(campeonato);
    }
}
