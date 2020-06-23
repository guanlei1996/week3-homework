package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class TextBox extends AbstractBaseElement {

    public TextBox(String name) {
        super(name);
    }

    public String print() {
        return String.format("TextBox[name=%s]", this.getName());
    }
}
