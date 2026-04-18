import java.util.Scanner;
import java.util.ArrayList;
class Produto{
    String nome;
    Double preco;
    Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }
}

public class cafeteria {
    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        ArrayList<Produto> cardapio;
        cardapio = new ArrayList<>();
        ArrayList<Produto> pedido;
        pedido = new ArrayList<>();

        //formulando cardápio

        cardapio.add(new Produto("café expresso", 5.00));
        cardapio.add(new Produto("capuccino", 8.00));
        cardapio.add(new Produto("bolo de chocolate", 10.00));
        

        //lógica simples do pedido
        boolean continuar=true;
        while(continuar){
            System.out.println(" Bem-vindo à Cafeteria!");
            System.out.println("Escolha um item ou 0 para finalizar.");
            for(int i = 0; i < cardapio.size(); i++){
                System.out.println((i+1) + ". " + cardapio.get(i).nome + " - " + cardapio.get(i).preco);}
            System.out.println("\n");

            int escolha = sanner.nextInt();
            if(escolha==0){
                continuar=false;
            }
            else if(escolha>0 && escolha<=cardapio.size()){
                pedido.add(cardapio.get(escolha-1));
                System.out.println("Item adicionado com sucesso!");
            }
        }
        //finalização
        double total = 0;
        System.out.println("\n ---Resumo do Pedido---");
        for(Produto p: pedido){
            System.out.println(p.nome + ":R$" + p.preco);
            total+=p.preco;
        }
        System.out.println("Total de pedidos: "+total);

    }
}