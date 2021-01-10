//As variáveis são locais de memoria que o computador consegue manipular, são identificadas por nome e tipo (boolean, int, float, double, char)
// A classe big Decimal corrige erros de arredondamento em operações aritmeticas
//https://blog.caelum.com.br/arredondamento-no-java-do-double-ao-bigdecimal/
//Escopo da variável é o trecho de código em que a mesma pode agir
// Transferir o conteúdo de uma variável para outra de tipo diferente é um processo chamado de casting
// O casting só pode acontecer se o tipo de variável destino tiver mais espaço que a origem
// Os operadores são +,-,*,/,%
// Operadores unários são operações com uma unica variavel:
// v1++ = v1 + 1 (incremento posterior ao uso da variável) 
// ++v1 = v1 +1  (antes do uso da variavel) 
//existem as formas v1-- e --v1
//Operadores relacionais realizam comparação de valor, o resultado é sempre um boolean
//==,!=,<, <=,>, >=
//Operadores lógicos são usados para combinar operadores relacionais
// &&, ||, ! (também resultam em boolean)



public class variaveis {
    public static void main (String[] args){
        int x, y;
        float z = 3.414f;
        double w = 3.1415;
        boolean truth = true;
        char c;
        String str;
        String str1 = "olá";
        c = 'A';
        str = "Hello people";
        x = 6;
        y = 1000;

        System.out.println(x);
        System.out.println("soma =" + (x + y));
        System.out.println("multiplicacao =" + (x*y));

        if(x>y){
            System.out.println("Ooh yeah"); 
        }
        else{ System.out.println("Ooh no");}
        

    }
}
