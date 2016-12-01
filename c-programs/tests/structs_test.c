/*
Create a system to register students.
The register must own this properties:
    registration id;
    name;
    monthly fee;
    
Must have this options:
    1 - Include ;
    2 - Update ;
    3 - Delete ;
    4 - List all students with respective fees ;
    5 - List all students with a fee higher than a value defined by the user ;

    Obs: The system messages were writen in portuguese.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    int matricula;
    char nome[30];
    float mensalidade;
} aluno;

int carregaMenu() {
    int resp;

    printf("\n\n\t================== Menu de opcoes ==================\n");
    printf("\n\t1. Incluir novo aluno");
    printf("\n\t2. Alterar dados de aluno");
    printf("\n\t3. Excluir aluno");
    printf("\n\t4. Listar todos os alunos");
    printf("\n\t5. Listar alunos com mensalidade acima de valor determinado");
    printf("\n\n\t6. Sair");
    printf("\n\n\tSelecione a opcao desejada: ");
    scanf("%d", &resp);

    return resp;
}

void carregaHeader() {
    printf("\t====================================================");
    printf("\n\t== Bem vindo ao sistema de gerenciamento escolar ==");
    printf("\n\t====================================================");
}

int getTotalAlunos() {
    int totalAlunos;

    printf("\n\n\tDigite a quantidade de alunos da turma: ");
    scanf("%d", &totalAlunos);

    return totalAlunos;
}

void inicializaDados(aluno alunos[], int totalAlunos) {
    int i;

    for(i = 0; i < totalAlunos; i++) {
        alunos[i].matricula = 0;
        alunos[i].mensalidade = 0;
    }
}

void incluiAluno(aluno alunos[], int totalAlunos) {
    int i;
    int matricula;
    char nome[30];
    float mensalidade;
    int flagInserido = 0;

    printf("\n\tDigite o numero de matricula: ");
    scanf("%d", &matricula);
    printf("\tDigite o nome do aluno: ");
    scanf("%s", &nome);
    printf("\tDigite o valor da mensalidade: ");
    scanf("%f", &mensalidade);

    for (i = 0; i < totalAlunos; i++) {
        // Verifica se dados nao foram inseridos e se posição ja possui dados cadastrados
        if (flagInserido == 0 && alunos[i].matricula == 0 && alunos[i].mensalidade == 0) {
            alunos[i].matricula = matricula;
            strcpy(alunos[i].nome, nome);
            alunos[i].mensalidade = mensalidade;

            // Muda status da flag
            flagInserido = 1;
        }
    }

    printf("\n\tDados inseridos com sucesso");
}

void listarAlunos(aluno alunos[], int totalAlunos, char tipoImpressao[20]) {
    int i, contadorImpressao = 0;
    float valorDeterminado;

    if (tipoImpressao == "todos") {
        for(i = 0; i < totalAlunos; i++) {
            // Só imprime os alunos que foram cadastrados
            if (alunos[i].matricula != 0 && alunos[i].matricula != 0) {
                printf("\n\tAluno: %s", alunos[i].nome);
                printf("\n\tMensalidade: %1.2f\n", alunos[i].mensalidade);
                contadorImpressao++;
            }
        }

        if (contadorImpressao == 0) {
            printf("\n\tNao existem alunos cadastrados");
        }
    } else if (tipoImpressao == "valorDeterminado") {
        printf("\n\tDigite o valor determinado: ");
        scanf("%f", &valorDeterminado);

        for(i = 0; i < totalAlunos; i++) {
            // Só imprime os alunos que foram cadastrados
            if (alunos[i].matricula != 0 && alunos[i].matricula != 0 && alunos[i].mensalidade > valorDeterminado) {
                printf("\n\tAluno: %s", alunos[i].nome);
                printf("\n\tMensalidade: %1.2f\n", alunos[i].mensalidade);
                contadorImpressao++;
            }
        }

        if (contadorImpressao == 0) {
            printf("\n\tNao existem alunos cadastrados com mensalidade acima de %1.2f", valorDeterminado);
        }
    }
}

void alteraAluno(aluno alunos[], int totalAlunos) {
    int matricula, i, flagMatriculaValida = 0, posicaoValida;
    char nome[30];
    float mensalidade;

    printf("\n\tDigite a matricula do aluno: ");
    scanf("%d", &matricula);

    for(i = 0; i < totalAlunos; i++) {
        if (matricula == alunos[i].matricula) {
            flagMatriculaValida = 1;
            posicaoValida = i;
        }
    }

    if (flagMatriculaValida == 1) {
        printf("\n\tDigite o nome para ser alterado: ");
        scanf("%s", &nome);
        printf("\tDigite a mensalidade para ser alterada: ");
        scanf("%f", &mensalidade);

        strcpy(alunos[posicaoValida].nome, nome);
        alunos[posicaoValida].mensalidade = mensalidade;
        printf("\n\tDados alterados com sucesso");
    } else {
        printf("\n\tA matricula digitada e invalida");
    }
}

void excluiAluno(aluno alunos[], int totalAlunos) {
    int matricula, i, flagMatriculaValida = 0, posicaoValida;

    printf("\n\tDigite a matricula do aluno: ");
    scanf("%d", &matricula);

    for(i = 0; i < totalAlunos; i++) {
        if (matricula == alunos[i].matricula) {
            flagMatriculaValida = 1;
            posicaoValida = i;
        }
    }

    if (flagMatriculaValida == 1) {
        alunos[posicaoValida].matricula = 0;
        alunos[posicaoValida].mensalidade = 0;

        printf("\n\tAluno excluido com sucesso");
    } else {
        printf("\n\tA matricula digitada e invalida");
    }
}

int main() {
    int resp = 0;
    int totalAlunos;

    carregaHeader();
    totalAlunos = getTotalAlunos();

    // Cria array de estruturas com total de alunos para inicializar o sistema
    aluno alunos[totalAlunos];

    inicializaDados(alunos, totalAlunos);

    while(resp != 6) {
        resp = carregaMenu();

        switch(resp) {
            case 1:
                incluiAluno(alunos, totalAlunos);
                break;
            case 2:
                alteraAluno(alunos, totalAlunos);
                break;
            case 3:
                excluiAluno(alunos, totalAlunos);
                break;
            case 4:
                listarAlunos(alunos, totalAlunos, "todos");
                break;
            case 5:
                listarAlunos(alunos, totalAlunos, "valorDeterminado");
                break;
            case 6:
                printf("\n\tObrigado por utilizar nosso sistema.\n");
                break;
            default:
                printf("\n\tA opcao selecionada nao e valida, digite novamente");
        }
    }

    return 0;
}
