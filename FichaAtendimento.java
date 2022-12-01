import java.io.Serializable;
import java.time.LocalDate;

public class FichaAtendimento implements Serializable {
    private String rg;
    private LocalDate data;
    private Animal animal;

    public FichaAtendimento() {
    this.animal = new Animal();
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "FichaAtendimento{" +
                "rg='" + rg + '\'' +
                ", data=" + data +
                ", animal=" + animal +
                '}';
    }
}
