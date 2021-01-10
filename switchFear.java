// I was always so afraid of "switch method" that I sitted and tried some stuff to loose this feeling. The idea was open the daily menu of a restaurant by choosing the switch cases. 
// I still wanna: 
// a) link this menu with a loop so it will appear till the O key is pressed  
// b) make another menu to change the menu food
// c) create an interface 

public class switchFear {
    
    String Entrada = "Brie com geleia";
    String Salada = "Ceaser"; 
    String pratoPrincipal = "Risoto de alho poró";
    String Sobremesa = "Torta de limão"; 

    //metodo 1 - ver entrada

        void verEntrada() {
            System.out.println("A entrada do dia é: " + this.Entrada + "\n");
        }

    //metodo 2 - ver salada
    
         void verSalada(){
            System.out.println("A salada do dia é: " + this.Salada + "\n");
        }

    //metodo 3 - ver prato principal
    
    void verPratoPrincipal(){
        System.out.println("O prato principal do dia é: " + this.pratoPrincipal + "\n");
    }

    //metodo 4 - ver sobremesa
    
    void verSobremesa(){
        System.out.println("A sobremesa do dia é: " + this.Sobremesa + "\n");
    }

    // metodos para trocar pratos 

    void trocarEntrada (String novaEntrada){
        this.Entrada = novaEntrada;
    }
    
    void trocarSalada (String novaSalada){
        this.Salada = novaSalada;
    }

    void trocarPratoPrincipal (String novoPratoPrincipal){
        this.pratoPrincipal= novoPratoPrincipal;
    }

    void trocarSobremesa (String novaSobremesa){
        this.Sobremesa= novaSobremesa;
    }



}
