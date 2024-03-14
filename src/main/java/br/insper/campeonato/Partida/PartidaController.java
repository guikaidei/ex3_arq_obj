package br.insper.campeonato.Partida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @GetMapping("/partidas")
    public ArrayList<Partida> getPartidas(@RequestParam(required = false) String idMandante) {
        return partidaService.listarPartidas(idMandante);
    }

    @GetMapping("/vitorias")
    public Integer getVitorias(String id) {
        return partidaService.calcularVitorias(id);
    }

    @PostMapping("/partidas")
    public Partida cadastrarPartida(@RequestBody Partida partida) {
        return partidaService.cadastrarPartida(partida);
    }

    @GetMapping("partidas/campeonato/{id}")
    public ArrayList<Partida> getPartidasCampeonato(@PathVariable String id) {
        return partidaService.getPartidasCampeonato(id);
    }
}
