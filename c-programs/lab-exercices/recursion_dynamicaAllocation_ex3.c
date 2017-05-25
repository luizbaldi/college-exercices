#include <stdio.h>

void main() {
    float array[10], media = 0, num;
    int i;

    // Preenche array com valores
    for(i = 0; i < 10; i++) {
        printf("Digite o valor do numero para a posicao vetor[%d]: ", i);
        scanf("%f", &num);
        array[i] = num;
        media += num;
    }

    // Calcula media
    media = (media / 10);

    // Imprime valores acima da média
    printf("\n Valores acima da media: ");
    for(i = 0; i < 10; i++) {
        if (array[i] > media) {
            printf("\narray[%d]: %f", i, array[i]);
        }
    }
}
