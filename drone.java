//a orientação ao objeto não é um processo sequencial
//Na orientação objeto agrupamos dados (os objetos) e construimos as classes que gerenciam esses objetos
//O grupo de objetos possui caracteristicamos comuns (atributos) e realizam ações via os métodos
//O diagrama UML mostra com clareza as características e métodos existentes

public class drone {
    //Atributos
    String nome;
    int altMax;
    double velMax;
    boolean ligado = false;
    int altAtual=0;
    double velocAtual=0.;
    double direcaoAtual=0.;
    int tempoTotal;

    //Metodos
    void ligar(){
        ligado=true;
        System.out.println("O drone" + nome + "estaligado?" + ligado);  
    }

    void desligado(){
        ligado = false;
        System.out.println("O drone" + nome + "esta ligado?" + ligado);

    }

    void mudarVeloc(double incrementoVeloc){
        velocAtual+=incrementoVeloc;
    }

    void mudarAlt(double incrementoAlt){
        altAtual+=incrementoAlt;
    }

    void mudarDirecao(double incrementoDirecao){
        direcaoAtual +=incrementoDirecao;
    }

    void pousar(){
        altAtual=0;
        velocAtual=0.;
        System.out.println("O drone" + nome + "pousou");
    }

    int teto(){
        int altRestante = this.altMax - this.altAtual;
        return altRestante;
    }

    String Relatorio(){
        String mens = "Drone" + this.nome + "\n";
        mens += "altura atual = " + this.altAtual + "\n"; 
        mens+= "velocidade atual = " + this.velocAtual + "\n";
        mens+= "direcao atual = " + this.direcaoAtual + "\n";
        return mens;
        }

        int tempoRestante(int tempoUso){
            return this.tempoTotal - tempoUso;
        }
}
