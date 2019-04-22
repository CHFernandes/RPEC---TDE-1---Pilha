public class Pilha {
    private int topo;
    protected int max;
    private int dados[];

    public Pilha(int max){
        this.max = max;
        this.topo = -1;
        this.dados = new int[max];
    }

    public void empilha(int empilhar){
        if(!verificacheio()){
            this.topo = this.topo + 1;
            this.dados[this.topo] = empilhar;
            System.out.println("Empilhado");
            if (verificacheio()){
                System.out.println("Pilha Cheia");
            }
        }else {
            System.out.println("Pilha Cheia");
        }
    }

    public int desemplilha(){
        if (!verificavazio()){
            int top = this.topo;
            this.topo = this.topo - 1;
            return this.dados[top];
        }else {
            System.out.println("Pilha vazia");
            return -1;
        }
    }

    public int topo(){
        if (!verificavazio()){
            return this.dados[this.topo];
        }
        else {
            return -1;
        }
    }

    public boolean verificavazio(){
        if (this.topo == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean verificacheio(){
        if (max-1 == this.topo){
            return true;
        }else {
            return false;
        }
    }
}
