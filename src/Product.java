public abstract class Product {

    protected int id = 1;
    protected String name = null;
    protected Brand brand = null;
    protected $GB storage;
    protected float screenSizeInInch;
    protected $GB RAM;
    protected double unitPrice = 0;
    protected double discountPercentage = 0;
    protected int stock = 0;

    public Product() {
    }

    public Product(String name, Brand brand, $GB storage, float screenSizeInInch, $GB RAM, double unitPrice, double discountPercentage, int stock) {
        this.name = name;
        this.brand = brand;
        this.storage = storage;
        this.screenSizeInInch = screenSizeInInch;
        this.RAM = RAM;
        this.unitPrice = unitPrice;
        this.discountPercentage = discountPercentage;
        this.stock = stock;
    }

    public Product(String name, Brand brand, $GB storage, float screenSizeInInch, $GB RAM, double unitPrice, double discountPercentage) {
        this.name = name;
        this.brand = brand;
        this.storage = storage;
        this.screenSizeInInch = screenSizeInInch;
        this.RAM = RAM;
        this.unitPrice = unitPrice;
        this.discountPercentage = discountPercentage;
    }

    public long getId() {
        return id;
    }

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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
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

}
