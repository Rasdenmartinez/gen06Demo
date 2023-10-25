package partesAuto;

public class Estereo {
    Integer id;
    String marca;
    Integer modelo;
    String potencia;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Estereo(Integer id, String marca, Integer modelo, String potencia) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Estereo() {
    }
    public void encenderEstereo(){
        System.out.println("Se encendio estereo");
    }

    @Override
    public String toString() {
        return "Estereo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", potencia='" + potencia + '\'' +
                '}';
    }
}
