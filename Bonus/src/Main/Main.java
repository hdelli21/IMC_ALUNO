// Main.java (no pacote utilidade)
package Main;

import ESTUDANTE.Aluno;
import ESTUDANTE.Pessoa;
import Utilidade.FUNCOESUTEIS;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcos");
        pessoa.setAltura(1.75);
        pessoa.setCPF("74415478911");
        pessoa.setPeso(89.0);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println ("Altura: " + pessoa.getAltura());
        System.out.println("CPF válido: " + FUNCOESUTEIS.verificarCpf(pessoa.getCPF()));
        System.out.printf("IMC: %.2f%n", FUNCOESUTEIS.calcularImc(pessoa.getPeso(), pessoa.getAltura()));

        // Adicionar alunos ao conjunto
        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        aluno.setCPF("47518933378");
        aluno.setAltura(1.89);
        aluno.setPeso(75.0);
        aluno.setNota(8.0);
        aluno.setPercentualFalta(10.0);

            System.out.println("Nome: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCPF());
            System.out.println("Peso: " + aluno.getPeso());
            System.out.println("Altura: " + aluno.getAltura());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("Percentual de Presença: " + (100 - aluno.getPercentualFalta()) + "%");
            System.out.println("Situação: " + FUNCOESUTEIS.avaliarAluno(aluno));
            System.out.printf("IMC: %.2f%n", FUNCOESUTEIS.calcularImc(aluno.getPeso(), aluno.getAltura())); // Cálculo do IMC
        }
        }
    
    