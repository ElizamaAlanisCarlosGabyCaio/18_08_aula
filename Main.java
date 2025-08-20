public class Main {
    public static void main(String[] args) {
        try {
            // Cria o primeiro aluno
            Aluno aluno1 = new Aluno("Silvana da Silva", 20);

            // Atualiza a idade e o curso do primeiro aluno
            aluno1.setIdade(20);
            aluno1.setCurso("Psicologia");

            // Cria o segundo aluno
            Aluno aluno2 = new Aluno("Eduardo Carvalho", 19);

            // Atualiza a idade e o curso do segundo aluno
            aluno2.setIdade(22);
            aluno2.setCurso("Designer Gráfico");

            // Imprime os dados dos dois alunos
            System.out.println("--- Cadastro de Alunos ---");
            System.out.println(aluno1);
            System.out.println(aluno2);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar aluno: " + e.getMessage());
        }
    }
}
