public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada/ desligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume:" + smartTv.volume);


        /*smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);  
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume:" + smartTv.volume);        
   
        smartTv.ligar();
        System.out.println("Novo status tv: " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status tv: " + smartTv.ligada); 
        */       
    }
}
