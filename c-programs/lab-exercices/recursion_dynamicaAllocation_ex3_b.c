#include <stdio.h>

float leElementoArranjo() {
    float num;
    printf("Digite o valor do numero: ");
    scanf("%f", &num);
    return num;
}

void leArranjo(float array[]) {
    int i;

    for(i = 0; i < 10; i++) {
        array[i] = leElementoArranjo();
    }
}

float calculaSoma(float array[]) {
    int i;
    float soma;
    for(i = 0; i < 10; i++) {
        soma += array[i];
    }
    return soma;
}

float calculaMedia(float array[]) {
    return (calculaSoma(array) / 10);
}

void imprimeValoresAcimaMedia(float array[]) {
    float media = calculaMedia(array);
    int i;

    printf("\n Valores acima da media: ");
    for(i = 0; i < 10; i++) {
        if (array[i] > media) {
            printf("\narray[%d]: %f", i, array[i]);
        }
    }
}

void main() {
    float array[10], media = 0, soma = 0;

    // Preenche array com valores
    leArranjo(array);

    // Calcula soma
    soma = calculaSoma(array);

    // Calcula media
    media = calculaMedia(array);

    // Imprime valores acima da média
    imprimeValoresAcimaMedia(array);
}
