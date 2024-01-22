package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Mostra a data atual:
        LocalDate date1 = LocalDate.now();
        // Mostra a data atual e horário atual local:
        LocalDateTime date2 = LocalDateTime.now();
        // Mostra a data atual e o horário atual com GMT:
        Instant date3 = Instant.now();
        // Texto ISO 8601 para Data-hora:
        LocalDate date4 = LocalDate.parse("2024-07-20");
        LocalDateTime date5 = LocalDateTime.parse("2024-07-20T01:30:26");
        Instant date6 = Instant.parse("2024-07-20T01:30:26Z");
        Instant date7 = Instant.parse("2024-07-20T01:30:26-03:00");
        // Texto no formato customizado:
        LocalDate date8 = LocalDate.parse("20/07/2024", fmt1);
        LocalDate date9 = LocalDate.of(2024, 7, 20);
        LocalDateTime date10 = LocalDateTime.of(2024, 7, 20, 1, 30);

        System.out.println("D1: " + date1);
        System.out.println("D2: " + date2);
        System.out.println("D3: " + date3);
        System.out.println("D4: " + date4);
        System.out.println("D5: " + date5);
        System.out.println("D6: " + date6);
        System.out.println("D7: " + date7);
        System.out.println("D8: " + date8);
        System.out.println("D9: " + date9);
        System.out.println("D10: " + date10);


    }
}
