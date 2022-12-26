interface Parseable {
    // 추상 메서드 구현 public abstract 생략 
    void parse(String fileName);
}

class ParserManager { 
    // 리턴타입이 Parseable 인터페이스이다.
    public static Parseable getParser(String type){
        // 매개변수 type의 값에 따라 반환타입이 다름
        if (type.equals("XML")) {
            return new XMLparser();
        } else {
            Parseable p = new HTMLparser();
            return p;
            // 위 두줄을 줄이면 return new HTMLparser();
        }
    }
}
// XMLparser와 HTMLparser 클래스에서 인터페이스 Parseable 구현 (메서드 내용 구현)
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

/* 실행 결과
docment.xmlXML parsing completed.
docment2.htmlHTML parsing completed.
 */