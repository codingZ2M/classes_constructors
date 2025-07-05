package creational.design.patterns.prototype.pattern;

/*  Creational Design Patterns(Prototype Pattern)
  💡 Use When:
		You want to create copies of existing objects, especially when creation is expensive.
		
   Real-World Scenario: Duplicating a filled-out form or resume.
   
   Ex: Suppose you have a template document like an invoice or resume, and you want to duplicate it multiple 
   		times with small changes.
   		
   🧠 Why?
		Copying an object is easier than recreating it.
		Good when creation cost is high (e.g., expensive database objects).
 */


class Document implements Cloneable {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Document Title: " + title);
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
