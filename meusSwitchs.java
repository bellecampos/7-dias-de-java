// I was always so afraid of "switch method" that I sitted and tried some stuff to loose this feeling. The idea was open the daily menu of a restaurant by choosing the switch cases. 
// I still wanna: 
// a) link this menu with a loop so it will appear till the O key is pressed  
// b) make another menu to change the menu food
// c) create an interface 

import java.util.Scanner;

public class meusSwitchs {
    public static void main (String[] args){
        switchFear menu1 = new switchFear();

    //menu de pratos
    

    System.out.println("Qual seção do menu você deseja ver? Digite: \nE - entrada \nS - salada \nP - prato principal \ns - sobremesa\n O - sair\n (Respeite a caixa das letras)");
    Scanner leitura = new Scanner(System.in);
     char resposta = leitura.next().charAt(0);
    switch (resposta){
        case 'E': menu1.verEntrada(); break;
        case 'S': menu1.verSalada(); break;
        case 'P': menu1.verPratoPrincipal(); break;
        case 's': menu1.verSobremesa(); break;
        case 'O': break;
    }



   
    
    }
}