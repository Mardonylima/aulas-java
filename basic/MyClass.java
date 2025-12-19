
public class MyClass {
    
        //* Uma classe Java pode conter os seguintes blocos de construção:

        // Fields - Campos são variáveis ​​(dados) locais da classe ou instâncias (objetos) dessa classe.

        // Constructors - Construtores são métodos que inicializam uma instância da classe. 
        // Frequentemente, os construtores definem os valores dos campos na instância em questão.

        // Methods - Métodos são operações que a classe ou instâncias dessa classe podem executar. 
        // Por exemplo, um método pode realizar uma operação em parâmetros de entrada ou alterar o 
        // valor de campos armazenados internamente no objeto, etc.

        // Nested Classes - Classes aninhadas são classes Java definidas dentro de outra classe. 
        // Elas geralmente são destinadas a serem usadas apenas internamente pela classe Java que 
        // as contém ou em conjunto com essa classe.*/ 

        // Exemplo de campos
        String marca;
        String modelo;
        int ano;
        String cor;

        // Exemplo de construtor
        public MyClass() { 
        } 
        
        public MyClass(String aMarca, String oModelo, String aCor, int oAno) { 
            this.marca = aMarca; 
            this.modelo = oModelo; 
            this.ano = oAno;
            this.cor = aCor; 
        }

        // Exemplo de método
        public static void main(String[] args) {
            MyClass carro = new MyClass("Ford", "Mustang", "Vermelho", 1969);
                System.out.println(carro.marca + " " + carro.modelo + " " + carro.cor + " " + carro.ano);
        }
    
}