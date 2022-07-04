package mappers;

import model.DadosOscar;
import java.time.LocalDate;
import java.util.function.Function;

public class DadosOscarMapper implements Function<String, DadosOscar> {
    @Override
    public DadosOscar apply(String l) {
        String [] dadosLinha = l.split("; ");
        var index = Integer.parseInt(dadosLinha[0]);
        var year = Integer.parseInt(dadosLinha[1]);
        var age = Integer.parseInt(dadosLinha[2]);
        var name = String.valueOf(dadosLinha[3]);
        var movie = String.valueOf(dadosLinha[4]);

        return new DadosOscar(index, year, age, name, movie);
    }

}
