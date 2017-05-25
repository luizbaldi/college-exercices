#include <stdio.h>
#include <stdlib.h>

void main() {
    int vetor[10], i, valor, *v;

    v = &vetor[0];
    float soma = 0;
    float media;

    printf ("Valor: \n");

    for (i=0; i < 10; i++) {

        printf ("[%d]%p: ", i, (v+i));
        scanf ("%d", &valor);
        getchar();
        *(v+i) = valor;
    }

    printf ("Valores gravados: \n");
    for (i=0; i < 10; i++) {
        printf("vetor[%d], ponteiro (%p) = %d\n", i, (v+i), vetor[i]);
    }

    for ( i = 0; i < 10; i++ )
        soma += v[i];
    printf ( "\nSoma total: %.2f\n", soma );
    media = soma / 10;
    printf ( "\nMedia : %.2f\n", media );
}
