import auto.Automovil;
import partesAuto.Estereo;
import partesAuto.Llanta;
import partesAuto.Ventanas;

public class Main {
    public static void main(String[] args) {
        Llanta llanta=new Llanta(25,21546,"Caucho premium","negro azabache");
        Ventanas ventanas=new Ventanas(47,"vidrio soplado", 2.5 );
        Estereo estereo= new Estereo(54,"Sony",2023);
        Automovil auto=new Automovil(llanta,ventanas,estereo);
        auto.encerAuto();
    }

}
