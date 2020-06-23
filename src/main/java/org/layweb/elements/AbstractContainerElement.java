package org.layweb.elements;

import java.util.LinkedList;
import java.util.List;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public abstract class AbstractContainerElement extends AbstractBaseElement {
    private final List<AbstractBaseElement> childElements = new LinkedList<AbstractBaseElement>();

    public AbstractContainerElement(String name) {
        super(name);
    }

    public void addChild(AbstractBaseElement child) {
        childElements.add(child);
    }

    public List<AbstractBaseElement> getChild() {
        return childElements;
    }

    public String render() {
        StringBuilder elementsContent = new StringBuilder();
        for (AbstractBaseElement element : childElements) {
            elementsContent.append(element.print()).append("\n");
        }
        return elementsContent.toString();
    }

}
