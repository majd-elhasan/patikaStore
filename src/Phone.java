public class Phone extends Product{
    private static int ID=1;

    private int batteryPower;

    private String color;

    public Phone(){
        this.id = ID++;
    }

    public Phone(String name, Brand brand, double unitPrice, double discountPercentage ,int stock,$GB storage,float screenSizeInInch,$GB RAM, int batteryPower, String color) {
        super(name, brand,storage,screenSizeInInch,RAM, unitPrice, discountPercentage, stock);
        this.id = ID++;
        this.batteryPower = batteryPower;
        this.color = color;
    }
    public Phone(String name, Brand brand, double unitPrice, double discountPercentage ,$GB storage,float screenSizeInInch,$GB RAM, int batteryPower, String color) {
        super(name, brand,storage,screenSizeInInch,RAM, unitPrice, discountPercentage);
        this.id = ID++;
        this.batteryPower = batteryPower;
        this.color = color;
        this.stock = 1;
    }


    public float getScreenSizeInInch() {
        return screenSizeInInch;
    }

    public void setScreenSizeInInch(float screenSizeInInch) {
        this.screenSizeInInch = screenSizeInInch;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public $GB getRAM() {
        return RAM;
    }

    public void setRAM($GB RAM) {
        this.RAM = RAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", storage=" + storage +
                ", screenSizeInInch=" + screenSizeInInch +
                ", RAM=" + RAM +
                ", unitPrice=" + unitPrice +
                ", discountPercentage=" + discountPercentage +
                ", batteryPower=" + batteryPower +
                ", color='" + color + '\'' +
                ", stock=" + stock +
                '}';
    }

    public boolean equalsExceptID(Phone obj) {
        return this.name.equals(obj.name) &&
                this.brand!=null && this.brand.equals(obj.brand) &&
                this.unitPrice == obj.unitPrice &&
                this.discountPercentage == obj.discountPercentage &&
                this.RAM == obj.RAM &&
                this.screenSizeInInch == obj.screenSizeInInch &&
                this.storage == obj.storage &&
                this.batteryPower == obj.batteryPower &&
                this.color.equals(obj.color);
    }
}
