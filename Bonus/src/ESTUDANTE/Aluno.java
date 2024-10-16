package ESTUDANTE;

public class Aluno  extends Pessoa{

    public double Nota;
    public double PercentualFalta;

public Aluno (){
}
public Aluno (double Nota, double PercentualFalta){
super();
this.Nota = Nota;
this.PercentualFalta = PercentualFalta;
}
public double getNota() {
    return Nota;
}
public void setNota(double nota) {
    Nota = nota;
}
public double getPercentualFalta() {
    return PercentualFalta;
}
public void setPercentualFalta(double percentualFalta) {
    PercentualFalta = percentualFalta;
}

}