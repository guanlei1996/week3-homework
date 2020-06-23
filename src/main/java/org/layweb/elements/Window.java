package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class Window extends AbstractContainerElement{

    public Window(String name) {
        super(name);
    }

    @Override
    public String print() {
        return "-------------window------------\n"
                + super.render() +
                "------------------------------\n";
    }
}
