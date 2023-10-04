package Exercicios.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
  }

  public void exibirAgenda() {
    // já ordena automaticamente passando o eventosMap
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    // Set<LocalDate> dateSet = eventosMap.keySet();
    // Collection<Evento> values = eventosMap.values(); não se conhecem
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();

        System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        break;

        // funciona porque o nosso eventosMap já está ordenado por data ao transformalo
        // em TreeMap. Sendo assim o primeiro evento que aparecer logo após a data de
        // hoje já será o próximo evento.
      }
    }
    // a partir desse metodo entry eu consigo ter acesso ao determinado valor e a
    // sua key. no caso acesso ao evento e a sua localdate
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");

    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 22), "Evento 2", "Atração 2");

    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 18), "Evento 3", "Atração 3");

    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 11), "Evento 4", "Atração 4");

    // agendaEventos.exibirAgenda();
    agendaEventos.obterProximoEvento();
  }

}
