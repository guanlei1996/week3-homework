package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class PasswordBox extends AbstractBaseElement {

    public PasswordBox(String name) {
        super(name);
    }

    public String print() {
        return String.format("PasswordBox[name=%s]", this.getName());
    }
}
