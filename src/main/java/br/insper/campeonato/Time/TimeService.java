package br.insper.campeonato.Time;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TimeService {

    private ArrayList<Time> times = new ArrayList<>();

    public Time cadastrarTime(Time time) {
        if (time.getId().equals("") || time.getNome().equals("")) {
            throw new RuntimeException("Dados invalidos");
        }

        times.add(time);
        return time;
    }

    public ArrayList<Time> listarTimes(String estado) {
        if (estado != null) {
            ArrayList<Time> lista = new ArrayList<>();
            for (Time time : times) {
                if (time.getEstado().startsWith(estado)) {
                    lista.add(time);
                }
            }
            return lista;
        }

        return times;
    }

    public Time getTime(String id) {
        if (id != null) {
            for (Time time : times) {
                if (time.getId().equals(id)) {
                    return time;
                }
            }
        }

        throw new RuntimeException("Time não encontrado!");
    }

}
