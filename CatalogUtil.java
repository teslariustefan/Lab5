package compulsory;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CatalogUtil {

    public static void save(Catalog catalog, String path)
            throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(
                new File(path),
                catalog);
    }

    public static Catalog load(String path)
            throws IOException {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(
                    new File(path),
                    Catalog.class);
        }  catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    public static void view(Item item) throws IOException {
        Desktop desktop = Desktop.getDesktop();

        File fileItem = new File(item.getLocation());
        try {
            desktop.print(fileItem);
        } catch (IOException e) {
            System.out.println("Exception IOException ! ");
        }
    }
 }

