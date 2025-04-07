package org.example.calcularIdade;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalcularIdadeEmDias {

    public static class DataNascimento {
        byte dia;
        byte mes;
        short ano;

        public DataNascimento(byte dia, byte mes, short ano) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public static long calcularIdadeEmDias(DataNascimento dataNascimento) {
        LocalDate dataNascimentoLocal = LocalDate.of(dataNascimento.ano, dataNascimento.mes, dataNascimento.dia);
        LocalDate hoje = LocalDate.now();
        return ChronoUnit.DAYS.between(dataNascimentoLocal, hoje);

    }
}
