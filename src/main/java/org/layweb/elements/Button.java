package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class Button extends AbstractBaseElement {
    private String text;
    private String function;

    public Button(String name, String text, String function) {
        super(name);
        this.text = text;
        this.function = function;
    }

    public String getText() {
        return text;
    }

    public Button setText(String text) {
        this.text = text;
        return this;
    }

    public String getFunction() {
        return function;
    }

    public Button setFunction(String function) {
        this.function = function;
        return this;
    }

    public String print() {
        return String.format("Button[name=%s, text=%s, function=%s]", this.getName(), this.getText(), this.getFunction());
    }
}
