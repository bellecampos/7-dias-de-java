
import java.util.Scanner;

public class meusdrones {
    public static void main (String[] args){
        drone drone1 = new drone();

        //Atribuindo nome ao drone

        drone1.nome = "Paul";
        
        // Atribuindo altura maxima ao drone:

        drone1.altMax = 250;

        // Atribuindo veloc maxima ao drone:

        drone1.velMax = 50.;

        //atribuindo tempo total

        drone1.tempoTotal = 60;
        //Relatorio 

        System.out.println("Drone: \n" + drone1.nome); 
        System.out.println("Altura Maxima (km): \n" + drone1.altMax); 
        System.out.println("Velocidade Maxima (km/h): \n" + drone1.velMax);
        
        System.out.println("--------------------------------------------------------- \n"); 
    
        //oprando o drone1 
            drone1.ligar();
            drone1.mudarAlt(50);
            drone1.mudarVeloc(10.);
            drone1.mudarDirecao(90.);
            int infoTeto;
            infoTeto = drone1.teto();
            System.out.println("Faltam" + infoTeto + "metris para a alt max \n" ); 


            System.out.println("Drone: \n" + drone1.nome); 
            System.out.println("Altura (km): \n" + drone1.altAtual); 
            System.out.println("Velocidade (km/h): \n" + drone1.velocAtual);
            System.out.println("Direcao (graus): \n" + drone1.direcaoAtual);

            int tempo1;
            Scanner dado = new Scanner(System.in);
            System.out.println("Informe o tempo de uso em min \n");
            tempo1= dado.nextInt();
            System.out.println("tempo restante de uso" + drone1.tempoRestante(tempo1)+ "min\n");

            String re;
            re = drone1.Relatorio() + "\n";
            System.out.println(re);

    }


}
