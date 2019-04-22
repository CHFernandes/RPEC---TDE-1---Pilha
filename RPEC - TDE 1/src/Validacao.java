public class Validacao {
    public static void main(String[]args){
        Validador n = new Validador(3);

        String s1 = "{}((()))()[]";
        String s2 = "(";


        if(n.avaliaexpressao(s1)){
            System.out.println("Expressão: " + s1 + " é válida");
        }else {
            System.out.println("Expressão: " + s1 + "é inválida");
        }
        if(n.avaliaexpressao(s2)){
            System.out.println("Expressão: " + s2 + " é válida");
        }else {
            System.out.println("Expressão: " + s2 + "é inválida");
        }
    }
}
