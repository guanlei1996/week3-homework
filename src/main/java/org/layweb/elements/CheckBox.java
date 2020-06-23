package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class CheckBox extends AbstractBaseElement {

    public CheckBox(String name) {
        super(name);
    }

    public String print() {
        return String.format("CheckBox[name=%s]", this.getName());
    }
}
