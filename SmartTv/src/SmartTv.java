public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

public void ligar() {
    ligada = true;
}

public void desligar() {
    ligada = false;
}
public void aumentarVolume(){
    volume++;
    System.out.println("Volume aumentou para: " + volume);
}
public void diminuirVolume(){
    volume--;
    if (volume <= 0) {
        volume = 0;
    }
}
public void aumentarCanal(){
    canal++;
}
public void diminuirCanal(){
    canal--;
    if (canal <=0){
        canal = 0;
    }
}
public void mudarCanal( int novoCanal){
    canal = novoCanal;
}

}