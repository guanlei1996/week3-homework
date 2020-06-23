package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class Picture extends AbstractBaseElement {
    private String src;

    public Picture(String name, String src) {
        super(name);
        this.src = src;
    }

    public String getSrc() {
        return src;
    }

    public Picture setSrc(String src) {
        this.src = src;
        return this;
    }

    public String print() {
        return String.format("Picture[name=%s, src=%s]", this.getName(), this.getSrc());
    }
}
