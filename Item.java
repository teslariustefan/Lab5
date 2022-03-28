package compulsory;

import java.util.HashMap;
import java.util.Map;

public class Item {
    protected String id;
    protected String title;
    protected String location;

    protected Map<String, Object> tags = new HashMap<>();

    public Item() {
    }

    public Item(String id, String title, String location) {
        this.id = id;
        this.title = title;
        this.location = location;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map<String, Object> getTags() {
        return tags;
    }

    public void setTags(Map<String, Object> tags) {
        this.tags.putAll(tags);
    }
}
