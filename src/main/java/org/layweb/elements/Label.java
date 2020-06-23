package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class Label extends AbstractBaseElement {
    private String text;

    public Label(String name, String text) {
        super(name);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Label setText(String text) {
        this.text = text;
        return this;
    }

    public String print() {
        return String.format("Label[name=%s, text=%s]", this.getName(), this.getText());
    }
}
