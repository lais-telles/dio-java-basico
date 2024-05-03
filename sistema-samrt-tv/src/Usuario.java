public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volumer atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("NOVO STATUS - > TV ligada? " + smartTv.ligada);

        smartTv.mudarCanal(22);
        System.out.println("NOVO CANAL -> Canal atual: " + smartTv.canal);
    }
}
