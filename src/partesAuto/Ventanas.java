package partesAuto;

public class Ventanas {
    private Integer id;
    private String material;
    private Double grosor;

    public Ventanas(Integer id, String material, Double grosor) {
        this.id = id;
        this.material = material;
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Ventanas{" +
                "id=" + id +
                ", material='" + material + '\'' +
                ", grosor=" + grosor +
                '}';
    }

    public Ventanas() {
    }
}
