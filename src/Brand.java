import java.util.Comparator;

public class Brand implements Comparable<Brand>{
    private static int ID = 1;
    private final int id;
    private final String name;

    public String getName() {
        return name;
    }

    public Brand(String name) {
        this.name = name;
        this.id = ID++;
    }
    public int getId(){
        return this.id;
    }

    @Override
    public int compareTo(Brand o) {
        return Comparator.comparing(Brand::getName).compare(this,o);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
