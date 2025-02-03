# Restaurante do Walter - Sistema de Carrinho de Compras

## Visão Geral
O programa é um sistema de carrinho de compras desenvolvido em Java para um restaurante fictício chamado "Restaurante do Walter". Ele permite que os clientes escolham itens de diferentes categorias (comidas, bebidas e sobremesas), adicionem ou removam itens ao carrinho e vejam o total de sua compra.

## Funcionalidades
1. **Adicionar itens ao carrinho**:
   - Os usuários podem escolher itens de três categorias: comidas, bebidas e sobremesas.
   - Cada item tem um nome, preço e código exclusivo.
   - O cliente pode adicionar quantos itens desejar ao carrinho.
   
2. **Remover itens do carrinho**:
   - Os usuários podem remover itens específicos do carrinho usando o código do item.

3. **Exibir o total do carrinho**:
   - O sistema calcula e exibe o total acumulado dos itens no carrinho.

4. **Sair do sistema**:
   - Finaliza o programa e exibe uma mensagem de agradecimento.
  
   ## Como Executar
1. Certifique-se de ter o JDK instalado no seu sistema.
2. Compile o código Java com o seguinte comando no terminal:
   ```bash
   javac Main.java
   ```
3. Execute o programa com o comando:
   ```bash
   java Main
   ```
4. Siga as instruções exibidas no console para interagir com o sistema.


## Estrutura do Código

### Classes Principais

1. **`Main`**:
   - Contém a lógica principal do programa.
   - Cria os objetos dos itens disponíveis.
   - Gerencia o fluxo de interação com o usuário.

2. **`Item`**:
   - Representa um item do menu.
   - Contém atributos como nome, preço e código do item.

3. **`Carrinho`**:
   - Gerencia os itens adicionados ao carrinho.
   - Permite adicionar e remover itens.
   - Calcula o total do carrinho.

### Fluxo de Execução

1. **Início**:
   - O programa exibe uma mensagem de boas-vindas.
   - Mostra as opções principais: adicionar item, remover item, ver total ou sair.

2. **Adicionando Itens**:
   - O usuário escolhe uma categoria (comidas, bebidas ou sobremesas).
   - O programa lista os itens disponíveis na categoria escolhida.
   - O usuário insere o código do item para adicioná-lo ao carrinho.
   - O programa valida o código inserido e confirma a adição.

3. **Removendo Itens**:
   - O usuário insere o código do item a ser removido.
   - O programa remove o item, caso ele esteja no carrinho.

4. **Visualizando o Total**:
   - O programa exibe o valor total dos itens no carrinho.

5. **Saindo do Sistema**:
   - Exibe uma mensagem de despedida e encerra o programa.

## Instruções para Uso
1. Compile e execute o programa em um ambiente Java.
2. Siga as instruções exibidas no console para interagir com o sistema.
3. Insira os números correspondentes às opções desejadas para navegar pelas funcionalidades.

## Exemplo de Execução
1. **Boas-vindas**:
   ```
   Bem-vindo ao Restaurante do Walter!
   
   Escolha uma opção:
   1 - Adicionar item ao carrinho
   2 - Remover item do carrinho
   3 - Ver total do carrinho
   4 - Sair
   ```
2. **Adicionar Item**:
   ```
   Escolha a categoria:
   1 - Comidas
   2 - Bebidas
   3 - Sobremesa
   0 - Voltar
   ```
3. **Remover Item**:
   ```
   Digite o código do item para remover:
   ```
4. **Ver Total**:
   ```
   Total do carrinho: R$XX.XX
   ```
5. **Sair**:
   ```
   Obrigado pela preferência! Seu pedido já está sendo preparado 🤗🤗🤗
   ```

## Observações Técnicas
- O programa utiliza `Scanner` para capturar a entrada do usuário.
- A lógica de validação assegura que apenas códigos válidos sejam aceitos.
- Inclui uma opção de "voltar" para facilitar a navegação entre menus.
