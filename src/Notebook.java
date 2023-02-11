
public class Notebook extends Product{
    private static int ID=1;

    public Notebook(String name, Brand brand, double unitPrice, double discountPercentage, int stock, $GB storage, float screenSizeInInch, $GB RAM) {
        super(name, brand,storage,screenSizeInInch,RAM, unitPrice, discountPercentage, stock);
        this.id = ID++;
    }

    public Notebook(String name, Brand brand, double unitPrice, double discountPercentage, $GB storage, float screenSizeInInch, $GB RAM) {
        super(name, brand, storage, screenSizeInInch, RAM, unitPrice, discountPercentage);
        this.id = ID++;
        this.stock =1;
    }

    public Notebook(){this.id = ID++;}

    public $GB getStorage() {
        return storage;
    }

    public void setStorage($GB storage) {
        this.storage = storage;
    }

    public float getScreenSizeInInch() {
        return screenSizeInInch;
    }

    public void setScreenSizeInInch(float screenSizeInInch) {
        this.screenSizeInInch = screenSizeInInch;
    }

    public $GB getRAM() {
        return RAM;
    }

    public void setRAM($GB RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", storage=" + storage +
                ", screenSizeInInch=" + screenSizeInInch +
                ", RAM=" + RAM +
                ", unitPrice=" + unitPrice +
                ", discountPercentage=" + discountPercentage +
                ", stock=" + stock +
                '}';
    }


    public boolean equalsExceptID(Notebook obj) {
        return this.name.equals(obj.name) &&
                this.brand!=null && this.brand.equals(obj.brand) &&
                this.unitPrice == obj.unitPrice &&
                this.discountPercentage == obj.discountPercentage &&
                this.RAM == obj.RAM &&
                this.screenSizeInInch == obj.screenSizeInInch &&
                this.storage == obj.storage;
    }
}
