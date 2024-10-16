package ESTUDANTE;

public class Pessoa {

public String Nome;
public String CPF;
public double peso;
public double altura;

public Pessoa () {
}
public Pessoa (String Nome, String CPF, double altura, double peso) {
    this.CPF = CPF;
    this.Nome = Nome;
    this.peso = peso;
    this.altura = altura;
}
public String getNome() {
    return Nome;
}
public void setNome(String Nome) {
    this.Nome = Nome;
}
public String getCPF() {
    return CPF;
}
public void setCPF(String cPF) {
    CPF = cPF;
}
public double getPeso() {
    return peso;
}
public void setPeso(double peso) {
    this.peso = peso;
}
public double getAltura() {
    return altura;
}
public void setAltura(double altura) {
    this.altura = altura;
}

}
