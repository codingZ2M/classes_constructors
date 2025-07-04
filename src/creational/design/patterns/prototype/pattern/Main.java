package creational.design.patterns.prototype.pattern;

public class Main {
    public static void main(String[] args) {
        Document template = new Document();
        Document copy1 = template.clone();
        Document copy2 = template.clone();

        copy1.setTitle("Invoice for Client A");
        copy2.setTitle("Invoice for Client B");

        copy1.print(); // Invoice for Client A
        copy2.print(); // Invoice for Client B
    }
}
