package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class Frame extends AbstractContainerElement {

    public Frame(String name) {
        super(name);
    }

    @Override
    public String print() {
        return "-------------frame-------------\n"
                + super.render() +
                "------------------------------\n";
    }
}
