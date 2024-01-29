package abstractMethods.entities;

import abstractMethods.entities.enums.Color;

// NÃO PODE SER INSTANCIADA DIRETAMENTE!
public abstract class Shape {

    private Color color;

    /* Constructors on abstract classes should be PROTECTED, not PUBLIC! It makes no sense to use public constructors
    * in an abstract class.
    * SOURCE: https://stackoverflow.com/questions/761854/why-should-constructors-on-abstract-classes-be-protected-not-public */
    protected Shape() {
    }

    protected Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /* Um método abstrato é um método que é declarado na classe, mas não possui uma IMPLEMENTAÇÃO dentro dessa classe.
    * A responsabilidade de fornecer uma implementação é transferida para as subclasses. É útil em situações onde
    * queremos garantir que todas as subclasses forneçam uma implementação específica de um método! */
    public abstract double area();

}
