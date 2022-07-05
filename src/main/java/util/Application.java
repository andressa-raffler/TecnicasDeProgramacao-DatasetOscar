package util;

import mappers.DadosOscarMapper;
import model.DadosOscar;
import service.OscarService;
import java.io.IOException;
import java.util.List;

/*         Exercício Dataset Oscar
         1 - Importar dataset
         2 - Criar model que represente os dados
         3 - Transformar os dois arquivos em apenas 1 stream
         4 - Quem é o ator ou atriz mais jovem a ser premiado?
         5 - Quem foi o ator ou atriz mais premiado?
         6- Quem foi o jovem mais premiado (entre 18 e 24 anos)?
 */
public class Application {
    public static void main(String[] args) throws IOException {

        OscarService oscarService = getOscarService();
        oscarService.atorMaisJovem();
        oscarService.atorMaisPremiado();
        oscarService.atorJovemMaisPremiado();


    }

    private static OscarService getOscarService() throws IOException {
        var fileOscarFemale = new FileUtil<DadosOscar>("oscar_age_female.csv");
        var fileOscarMale = new FileUtil<DadosOscar>("oscar_age_male.csv");
        List<DadosOscar> dadosOscarMale = fileOscarMale.readFile(new DadosOscarMapper());
        List<DadosOscar> dadosOscarFemale = fileOscarFemale.readFile(new DadosOscarMapper());
        return new OscarService(dadosOscarMale, dadosOscarFemale);
    }
}
