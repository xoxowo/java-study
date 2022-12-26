interface Parseable {
    void parse(String fileName);
}

class ParserManager {
    public static Parseable getParser(String type){
        if (type.equals("XML")) {
            return new XMLparser();
        } else {
            Parseable p = new HTMLparser();
            return p;
            // return new HTMLparser();
        }
    }
}

class XMLparser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "XML parsing completed.");
    }
}

class HTMLparser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "HTML parsing completed.");
    }
}
class ParseableRest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("docment.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("docment2.html");
    }    
}
