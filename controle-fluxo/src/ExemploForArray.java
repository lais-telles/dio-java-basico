public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = { "Felipe", "Maria", "Julia", "Marcos"};

        /* 
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice " + i + " é: " + alunos[i]);
        }
        */

        // forma abreviada
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
