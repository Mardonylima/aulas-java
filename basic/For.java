import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> soma = new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            //dobro.add(i * 2);
            dobro.add(Math.multiplyExact(i, 2));
        }
        System.out.println(dobro);
        
        for (int i = 0; i <=10; i++) {
            soma.add(Math.addExact(i, 5));
        }
        System.out.println(soma);
    }
}