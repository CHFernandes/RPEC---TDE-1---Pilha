public class Validador {
    private int topo;
    protected int max;
    private String dados[];

    public Validador(int max){
        this.max = max;
        this.topo = -1;
        this.dados = new String[max];
    }

    public boolean avaliaexpressao(String exprecao){
        for (int i = 0; i < exprecao.length();i++){
            char c = exprecao.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                String s = String.valueOf(c);
                empilha(s);
            }
            if(c == ')' || c == ']' || c == '}'){
                if (c == ')'){
                    if (topo().equals("(")){
                        desemplilha();
                    }else {
                        return false;
                    }
                }
                if (c == ']'){
                    if (topo().equals("[")){
                        desemplilha();
                    }else {
                        return false;
                    }
                }
                if (c == '}'){
                    if (topo().equals("{")){
                        desemplilha();
                    }else {
                        return false;
                    }
                }
            }
        }
        if (verificavazio()){
            return true;
        }else {
            return false;
        }
    }

    public void empilha(String empilhar){
        if(!verificacheio()){
            this.topo = this.topo + 1;
            this.dados[this.topo] = empilhar;
            System.out.println("Simbolo Empilhado");
            if (verificacheio()){
                System.out.println("Pilha Cheia");
            }
        }else {
            System.out.println("Pilha Cheia");
        }
    }

    public void desemplilha(){
        if (!verificavazio()){
            this.topo = this.topo - 1;
        }else {
            System.out.println("Pilha vazia");
        }
    }

    public String topo(){
        if (!verificavazio()){
            return this.dados[this.topo];
        }
        else {
            return "Nulo";
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
