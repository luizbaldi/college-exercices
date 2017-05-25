#include <stdio.h>
#include <string.h>

typedef struct {
    char nome[30];
    int idade;
} aluno;

int carregaMenu() {
    int resp;

    printf("\n\n\t================== Menu de opcoes ==================\n");
    printf("\n\t1. Cadastrar a turma");
    printf("\n\t2. Listar nome e idade dos alunos menores de idade");
    printf("\n\t3. Imprimir idade média da turma");
    printf("\n\n\t4. Sair");
    printf("\n\n\tSelecione a opcao desejada: ");
    scanf("%d", &resp);

    return resp;
}

void cadastraTurma(aluno alunos[]) {
    int i, idade;
    char nome[30];

    for (i = 0; i < 10; i++) {
        printf("\n\tDigite o nome do aluno: ");
        scanf("%s", &nome);
        strcpy(alunos[i].nome, nome);

        printf("\tDigite a idade do aluno: ");
        scanf("%i", &idade);
        alunos[i].idade = idade;
    }
}

void listaMenoresIdade(aluno alunos[]) {
    int i;
    for (i = 0; i < 10; i++) {
        if(alunos[i].idade < 18) {
            printf("\n Aluno: %s", alunos[i].nome);
            printf("\n Idade: %i", alunos[i].idade);
        }
    }
}

void imprimeIdadeMedia(aluno alunos[]) {
    float media = 0;
    int i;

    for (i = 0; i < 10; i++) {
        media += alunos[i].idade;
    }
    media = (media / 10);
    printf("\n Media das idades: %f", media);
}

void main() {
    int resp = 0;
    aluno alunos[10];

    while(resp != 4) {
        resp = carregaMenu();

        switch(resp) {
            case 1:
                cadastraTurma(alunos);
                break;
            case 2:
                listaMenoresIdade(alunos);
                break;
            case 3:
                imprimeIdadeMedia(alunos);
                break;
            case 4:
                printf("\n\tObrigado por utilizar nosso sistema.\n");
                break;
            default:
                printf("\n\tA opcao selecionada nao e valida, digite novamente");
        }
    }
}

