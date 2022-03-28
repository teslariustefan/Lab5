package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    protected String name;
    private List<Item> items = new ArrayList<>();

    public Catalog() {
    }

    public Catalog(String name) {
        this.name = name;
    }

    public Catalog(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void add(Item item) {
        items.add(item);
    }

    public Item findById(String id) {
        return items.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }


    @Override
    public String toString() {
        StringBuilder catalogPresentation = new StringBuilder("The content of the catalog" + this.name + " is:" + "\n");

        for(Item item: items){
            catalogPresentation.append("Item ").append(item.getId()).append(": ").append(item.getTitle()).append(", with location: ").append(item.getLocation()).append(".").append("\n");
        }
        return catalogPresentation.toString();
    }
}
