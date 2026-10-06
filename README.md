# Resolução exercício Beecrowd1118

## Descrição do problema
Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

## Como Funciona
1. **Laço Principal (`for` com `i`):** Controla a execução de todo o programa. Ele continua rodando enquanto a variável `i` for igual a 1.
2. **Laço das Notas (`for` com `j`):** Lê os valores decimais e valida as notas. Se a nota for válida, acumula o valor em `soma` e incrementa o contador `j` manualmente (`j++`). Se for inválida, exibe o erro e mantém `j` no mesmo valor para repetir a leitura daquela nota.
3. **Laço do Menu (`for` com `k`):** Após exibir a média, entra em um loop para ler a escolha do usuário (`1` ou `2`) na variável `i`. Se o valor digitado for válido (1 ou 2), o código altera `k = 1` para quebrar esse laço interno. Caso o usuário escolha `2`, o laço principal também será encerrado na próxima verificação.