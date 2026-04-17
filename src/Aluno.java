public class Aluno {

    private String nome;
    private double[] notas;

    //Construtor
    public Aluno(String nome,int quantiadadeNotas) {
        this.nome = nome;
        this.notas = new double[quantiadadeNotas];
    }

    //Getter
    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    //Setter de nota
    public void setNota(int index ,double nota) {
        this.notas[index] = nota;
    }

    //Metodo para calcular média
    public double calcularMedia(){
        double soma = 0;
        for(double nota: notas){
            soma += nota;
        }
        return soma / notas.length;
    }
}
