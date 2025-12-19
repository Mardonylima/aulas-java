public class string {
    public static void main(String[] args) {
        //* Strings em java são objetos, portanto preciso usar o 
        // operador 'new' para criar um novo objeto string */
        String nome = new String("olá, mundo");
        System.out.println(nome);

        //* existe uma maneira mais curta pra criar um string */
        String nome2 = "olá, mundo 2º";
        System.out.println(nome2);

        //* As strings literais em Java aceitam um conjunto de 
        // caracteres de escape que são traduzidos em caracteres 
        // especiais na string criada. 
        // '\\' Traduzido para um único caractere \ na string 
        // '\t' Traduzido em um único caractere de tabulação na string
        // '\r' Traduzido em um único caractere de retorno de carro na string
        // '\n' Traduzido para um único caractere de nova linha na string */
        String exempleString = "\tEste texto está a uma tabulação de distância.\r\n";
        System.out.println(exempleString);

        //* strings de múltiplas linhas em Java , são um recurso adicionado 
        // no Java 13que permite declarar literais de string que abrangem 
        // várias linhas em seu código Java com mais facilidade */
        String textblock = """ 
                   Este é um texto dentro de um 
                   bloco de texto. 
                   Você pode usar "aspas" aqui 
                   sem precisar escapá-las. 
                   """;
        System.out.println(textblock);

        //* compilador Java remove todos os caracteres de indentação da string
        //  produzida pela declaração do bloco de texto Java. O compilador Java 
        // sabe quantos caracteres de indentação remover observando a última linha 
        // do bloco de texto — a linha que contém os últimos 3 caracteres de aspas 
        // delimitadoras. A indentação dos caracteres de aspas nessa última linha 
        // determina quantos caracteres de indentação o compilador Java remove do 
        // texto dentro do bloco de texto. */
        String textblock1 = """ 
                   Este é um bloco de texto Java 
                   """; 

        String textblock2 = """ 
                   Este é um bloco de texto Java 
                """; 

        String textblock3 = """ 
                   Este é um bloco de texto Java 
            """; 

        System.out.println(textblock1); 
        System.out.println(textblock2); 
        System.out.println(textblock3);

        //*Concatenar strings significa adicionar uma string a outra. 
        // Strings em Java são imutáveis, ou seja, não podem ser alteradas 
        // após sua criação. Portanto, ao concatenar dois objetos String em Java, 
        // o resultado é, na verdade, armazenado em um terceiro objeto String. */
        String saudacao = "Olá, ";
        String nome3 = "Mardony!";
        String mensagemCompleta = saudacao + nome3;
        System.out.println(mensagemCompleta);

        //* Ao concatenar strings, é preciso estar atento a possíveis problemas de desempenho. */
        String one = "Olá, ";
        String two = "mundão!";
        //* String three = one + " " + two;*/
        String three = new StringBuilder(one).append(two).toString();
        System.out.println(three);

        //* A maneira mais rápida de concatenar strings é criar uma instância
        //  StringBuilder e reutilizá-la dentro do loop */
        String[] strings = new String[] {"Java ", "é ", "uma ", "linguagem ", "legal."};
        StringBuilder temp = new StringBuilder();
        for (String string : strings) {
            temp.append(string);
        }
        String resultado = temp.toString();
        System.out.println(resultado);

        //* As strings em Java também possuem um conjunto de métodos usados ​​para comparar strings 
        // 1- equals()
        // 2- equalsIgnoreCase()
        // 3- startsWith()
        // 4- endsWith()
        // 5- compareTo() */

        String um   = "abc";
        String dois   = "def";
        String tres = "abc";
        String quatro  = "ABC";

        System.out.println( um.equals(dois) );
        System.out.println( um.equals(tres) );
        System.out.println( um.equals(quatro) );
    }
}