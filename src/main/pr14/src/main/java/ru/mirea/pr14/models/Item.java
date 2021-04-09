package ru.mirea.pr14.models;

public class Item {
    private int id;
    private String name;
    private String creationDate;
    private int price;

    public Item(String name, String creationDate, int price) {
        this.name = name;
        this.creationDate = creationDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", price=" + price +
                '}';
    }
}
