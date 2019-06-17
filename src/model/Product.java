package model;

public class Product {
    private String title;
    private String description;
    private double price;
    private int quality;

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuality() {
        return quality;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Product[Title=" + title + ";Description=" + description + ";Price=" + price + ";Quality=" + quality + "]";
    }
}
