package partesAuto;

public class Llanta {
    private Integer id;
    private Integer numeroLote;
    private String material;
    private String color;

    public Llanta() {
    }

    public Llanta(Integer id, Integer numeroLote, String material, String color) {
        this.id = id;
        this.numeroLote = numeroLote;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Llanta{" +
                "id=" + id +
                ", numeroLote=" + numeroLote +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
