interface Document{
    void create();
}

class WordDocument implements Document{
    @Override
    public void create(){
        System.out.println("Word Document created");
    }
}
class PdfDocument implements Document{
    @Override
    public void create(){
        System.out.println("Pdf Document created");
    }

}
class ExcelDocument implements Document{
    @Override
    public void create(){
        System.out.println("Excel Document created");
    }
}



abstract class DocumentFactory{
    public abstract Document createDocument();
}



class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}

class Test{
    public static void main(String[] args) {
        DocumentFactory word = new WordDocumentFactory();
        DocumentFactory pdf = new PdfDocumentFactory();
        DocumentFactory excel = new ExcelDocumentFactory();

        word.createDocument().create(); 
        pdf.createDocument().create();
        excel.createDocument().create();
    }
}