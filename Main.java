package compulsory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() throws IOException {
        Catalog catalog =
                new Catalog("MyRefs");
        var book = new Item("article1","The Art of Computer Programming", "E:/tacp.png" );
        var article = new Item("book1","The Java Language Specification", "https://docs.oracle.com/javase/specs/jls/se17/html/index.html" );
        catalog.add(book);
        catalog.add(article);

        System.out.println(catalog.toString());

        CatalogUtil.save(catalog, "E:/java/catalog.json");

    }

    private void testLoadView() throws IOException {

        Catalog catalog = CatalogUtil.load("E:/java/catalog.json");
        if(catalog!=null) {
            CatalogUtil.view(catalog.findById("article1"));
        }
    }
}

