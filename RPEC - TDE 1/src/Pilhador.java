public class Pilhador {
    public static void main(String[]args){
        Pilha p = new Pilha(3);

        p.empilha(15);
        p.empilha(23);
        p.empilha(2);
        p.empilha(16);

        if (p.topo() != -1){
            System.out.println(p.topo());
        }else {
            System.out.println("Pilha Vazia");
        }

        System.out.println("Valor Desempilhado: " + p.desemplilha());
    }

}
