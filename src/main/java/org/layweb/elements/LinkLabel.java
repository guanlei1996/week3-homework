package org.layweb.elements;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class LinkLabel extends AbstractBaseElement {
    private String text;
    private String href;

    public LinkLabel(String name, String text, String href) {
        super(name);
        this.text = text;
        this.href = href;
    }

    public String getText() {
        return text;
    }

    public LinkLabel setText(String text) {
        this.text = text;
        return this;
    }

    public String getHref() {
        return href;
    }

    public LinkLabel setHref(String href) {
        this.href = href;
        return this;
    }

    public String print() {
        return String.format("LinkLabel[name=%s, text=%s, href=%s]", this.getName(), this.getText(), this.getHref());
    }
}
