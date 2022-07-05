package service;

import model.DadosOscar;

import java.util.*;
import java.util.stream.Collectors;

public class OscarService {
    private final List<DadosOscar> dadosOscar = new ArrayList<>();

    public OscarService(List<DadosOscar> dadosOscarMale, List<DadosOscar> dadosOscarFemale) {
        dadosOscar.addAll(dadosOscarFemale);
        dadosOscar.addAll(dadosOscarMale);
    }

    public void atorMaisJovem() {
        DadosOscar atorMaisJovem = dadosOscar.stream()
                .sorted(Comparator.comparing(DadosOscar::getAge))
                .findFirst()
                .get();
        System.out.printf("O ator mais jovem a vencer o oscar foi: %s, com %d anos, pelo filme %s \n"
                ,atorMaisJovem.getName(),atorMaisJovem.getAge(),atorMaisJovem.getMovie());
    }

    public void atorMaisPremiado(){
        dadosOscar.stream()
                .collect(Collectors.groupingBy(DadosOscar::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(ator ->
                        System.out.printf("O ator que mais venceu o Oscar foi: %s com %d premios \n",
                                ator.getKey(), ator.getValue()));

    }

    public void atorJovemMaisPremiado() {
        System.out.println("Os atores jovens mais premiados foram: ");
        dadosOscar.stream()
                .filter(a -> a.getAge() >= 18 && a.getAge() <= 24)
                .collect(Collectors.groupingBy(DadosOscar::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(ator -> System.out.printf("%s, com %d premio(s), ",ator.getKey(),ator.getValue()));


    }
}
