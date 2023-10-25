import auto.Automovil;
import partesAuto.Estereo;
import partesAuto.Llanta;
import partesAuto.Ventanas;

public class Main {
    public static void main(String[] args) {
        Llanta llanta=new Llanta(25,21546,"Caucho premium","negro azabache");
        Ventanas ventanas=new Ventanas(47,"vidrio soplado", 2.5 );
        Estereo estereo= new Estereo(54,"Sony",2023,"700");
        Automovil auto=new Automovil(llanta,ventanas,estereo);
        System.out.println("Este es un mensaje que existe despues del commit en git");
        auto.encerAuto();
    }

}
