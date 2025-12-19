public class Main {
    public static void main(String[] args) {
        
        int n1 = 1;
        int n2 = 1;
        int n3 = 10;

        int soma = n1 + n2 + n3;

        int divisao = soma / 3 ;

        if (divisao >= 7){
            System.out.println("Parabens vc passou, Sua média é: " + divisao);
        }

        else if (divisao <= 6) {
            System.out.println("Reprovado, boa sorte na final. Sua média é: " + divisao);
        }
    }
}