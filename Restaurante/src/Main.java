import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Item item1 = new Item("Galinha Assada", 19.99, 1);
        Item item2 = new Item("Parmegiana de Frango", 20.99, 2);
        Item item3 = new Item("Frango Grelhado", 20.99, 3);
        Item item4 = new Item("Strongonoff de Frango", 19.99, 4);
        Item item5 = new Item("Strongonoff de Carne", 19.99, 5);
        Item item6 = new Item("Bife Acebolado", 20.99, 6);
        Item item7 = new Item("Filé Mignon", 20.99, 7);
        Item item8 = new Item("Parmegiana de Carne", 20.99, 8);
        Item item9 = new Item("Caldeirada", 20.99, 9);
        Item item10 = new Item("Moqueca de Peixe", 20.99, 10);
        Item item11 = new Item("Salmão Grelhado", 27.99, 11);
        Item item12 = new Item("Bobá de Camarão", 23.99, 12);
        Item item13 = new Item("Mariscada", 21.99, 13);
        Item item14 = new Item("Feijoada", 21.99, 14);
        Item item15 = new Item("Escondidinho de Carne", 19.99, 15);
        Item item16 = new Item("Água Mineral 500ML", 2.99, 16);
        Item item17 = new Item("Água com Gás 500Ml", 3.99, 17);
        Item item18 = new Item("Coca Cola 350ML", 4.99, 18);
        Item item19 = new Item("Guaraná Antarctica 350ML", 4.99, 19);
        Item item20 = new Item("Suco de Laranja", 4.99, 20);
        Item item21 = new Item("Suco de Limão", 4.99, 21);
        Item item22 = new Item("Heineken 350ML", 8.99, 22);
        Item item23 = new Item("Pudim", 4.99, 23);
        Item item24 = new Item("Moouse de Limão", 4.99, 24);
        Item item25 = new Item("Moouse de Chocolate", 4.99, 25);
        Item item26 = new Item("Fatia de Torta", 6.99, 26);
        Item item27 = new Item("Brigadeiro", 2.99, 27);
        Item item28 = new Item("Empadinha Doce", 5.99, 28);

       
        Carrinho c = new Carrinho();

       
        Item[] comidas = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15};
        Item[] bebidas = {item16, item17, item18, item19, item20, item21, item22};
        Item[] sobremesa = {item23, item24, item25, item26, item27, item28};

        System.out.println("Bem-vindo ao Restaurante do Walter!");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item ao carrinho");
            System.out.println("2 - Remover item do carrinho");
            System.out.println("3 - Ver total do carrinho");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("\nEscolha a categoria:");
                System.out.println("1 - Comidas");
                System.out.println("2 - Bebidas");
                System.out.println("3 - Sobremesa");
                System.out.println("0 - Voltar");
                System.out.print("Opção: ");

                int categoria = scanner.nextInt();
                if (categoria == 0) {
                    continue; 
                }

                Item[] itensEscolhidos;
                if (categoria == 1) {
                    itensEscolhidos = comidas;
                    System.out.println("\nComidas disponíveis:");
                } else if (categoria == 2) {
                    itensEscolhidos = bebidas;
                    System.out.println("\nBebidas disponíveis:");
                } else if (categoria == 3) {
                    itensEscolhidos = sobremesa;
                    System.out.println("\nSobremesas disponíveis:");
                } else {
                    System.out.println("Categoria inválida!");
                    continue;
                }

                while (true) {
                    for (Item item : itensEscolhidos) {
                        System.out.println(item.getCodigo() + " - " + item.getNome() + " R$" + item.getPreco());
                    }

                    System.out.print("Digite o código do item para adicionar ou 0 para voltar: ");
                    int codigo = scanner.nextInt();

                    if (codigo == 0) {
                        break; 
                    }

                    boolean encontrado = false;
                    for (Item item : itensEscolhidos) {
                        if (item.getCodigo() == codigo) {
                            c.adicionarItem(item);
                            System.out.println(item.getNome() + " foi adicionado ao carrinho!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Código inválido! Tente novamente.");
                    }
                }

            } else if (opcao == 2) {
                System.out.print("Digite o código do item para remover: ");
                int codigo = scanner.nextInt();
                c.removerItem(codigo);

            } else if (opcao == 3) {
                c.calcularPreco();

            } else if (opcao == 4) {
                System.out.println("Obrigado pela preferência! Seu pedido já está sendo preparado🤗🤗🤗");
                break;

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
