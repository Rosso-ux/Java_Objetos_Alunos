import java.util.Scanner;

public class sistemaDeNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos deseja cadastrar?");
        int quantidadeAlunos = sc.nextInt();

        System.out.println("Quantas notas cada aluno possui?");
        int quantidadeNotas = sc.nextInt();

        Aluno[] alunos = new Aluno[quantidadeAlunos];

        // Criando alunos
        for (int i = 0; i < quantidadeAlunos; i++) {

            sc.nextLine();

            System.out.println("Digite o nome do Aluno " + (i + 1) + ": ");
            String nome = sc.nextLine();

            alunos[i] = new Aluno(nome,quantidadeNotas);

            //Notas com validação
            for (int j = 0; j < quantidadeNotas; j++) {

                double nota;

                do {
                    System.out.println("Digite a nota " + (j + 1) + ": ");
                    nota = sc.nextDouble();

                    if(nota < 0 || nota > 10) {
                        System.out.println("Nota inválida!Digite novamente!");
                    }
                }while (nota < 0 || nota > 10);

                alunos[i].setNota(j,nota);
            }
        }

        // Resultados
        System.out.println("\n===== RESULTADOS =====");
        for (Aluno aluno : alunos){
            System.out.println("\nAluno: " + aluno.getNome());

            System.out.println("Notas: ");
            for (double nota : aluno.getNotas()){
                System.out.println(nota + " ");
            }
            System.out.printf("\nMédia: %.2f" , aluno.calcularMedia());
            System.out.println();
        }
        sc.close();
    }
}
