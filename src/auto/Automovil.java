package auto;

import partesAuto.Estereo;
import partesAuto.Llanta;
import partesAuto.Ventanas;

public class Automovil {
    private Llanta llanta;
    private Ventanas ventanas;
    private Estereo estereo;
//    private String faros;
//    private String motor;
//    private String suspension;
//


    public Automovil() {
    }

    public Automovil(Llanta llanta, Ventanas ventanas, Estereo estereo) {
        this.llanta = llanta;
        this.ventanas = ventanas;
        this.estereo = estereo;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public Ventanas getVentanas() {
        return ventanas;
    }

    public void setVentanas(Ventanas ventanas) {
        this.ventanas = ventanas;
    }

    public Estereo getEstereo() {
        return estereo;
    }

    public void setEstereo(Estereo estereo) {
        this.estereo = estereo;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "llanta=" + llanta +
                ", ventanas=" + ventanas +
                ", estereo=" + estereo +
                '}';
    }
    public void encerAuto(){
        System.out.println("El auto se encendio");
        System.out.println(llanta.toString());
        System.out.println(ventanas.toString());
        System.out.println(estereo.toString());
//        encenderMotor();
        estereo.encenderEstereo();
//        encenderLuz();

    }
}
