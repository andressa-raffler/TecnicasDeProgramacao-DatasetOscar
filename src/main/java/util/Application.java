package util;

import mappers.DadosOscarMapper;
import model.DadosOscar;
import service.OscarService;
import java.io.IOException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {


        var fileOscarFemale = new FileUtil<DadosOscar>("oscar_age_female.csv");
        var fileOscarMale = new FileUtil<DadosOscar>("oscar_age_male.csv");
        List<DadosOscar> dadosOscarMale = fileOscarMale.readFile(new DadosOscarMapper());
        List<DadosOscar> dadosOscarFemale = fileOscarFemale.readFile(new DadosOscarMapper());
        OscarService oscarService = new OscarService(dadosOscarMale, dadosOscarFemale);

        oscarService.atorMaisJovem();
        oscarService.atorMaisPremiado();

        // exercicios
        // 1 - Importar dataset
        // 2 - Criar model que represente os dados
        // 3 - Transformar os dois arquivos em apenas 1 stream
        // 4 - Ator mais jovem a ser premiado
        // 5 - Ator com maior qtd de prêmios


    }
}
