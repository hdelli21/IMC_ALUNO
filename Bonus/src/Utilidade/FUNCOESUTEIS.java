package Utilidade;

import ESTUDANTE.Aluno;
import ESTUDANTE.Pessoa;

public class FUNCOESUTEIS {

    public static boolean verificarCpf(String cpf) {
        // Exemplo simples de verificação (pode ser melhorado com lógica real)
        return cpf.matches("\\d{11}");
    }

    // Calcular o IMC (Índice de Massa Corporal)
    public static double calcularImc(double peso, double altura) {
        if (altura > 0) {
            return peso / (altura * altura);
        } else {
            return 0.0; // Valor padrão se a altura for inválida
        }
    }

    // Avaliar Aluno
    public static String avaliarAluno(Aluno aluno) {
        // Verifica se a nota é maior ou igual a 5 e o percentual de presença é maior ou igual a 75%
        if (aluno.getNota() >= 5 && (100 - aluno.getPercentualFalta()) >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
