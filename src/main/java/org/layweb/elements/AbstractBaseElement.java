package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public abstract class AbstractBaseElement {
    // Common field......
    private String name;

    public AbstractBaseElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AbstractBaseElement setName(String name) {
        this.name = name;
        return this;
    }

    public abstract String print();

}
