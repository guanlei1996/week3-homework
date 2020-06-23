package org.layweb;

import org.layweb.elements.Button;
import org.layweb.elements.CheckBox;
import org.layweb.elements.Frame;
import org.layweb.elements.Label;
import org.layweb.elements.LinkLabel;
import org.layweb.elements.PasswordBox;
import org.layweb.elements.Picture;
import org.layweb.elements.TextBox;
import org.layweb.elements.Window;

/**
 * .
 *
 * @author Lay
 * @date 2020年06月23日
 */
public class DrawMain {

    public static void main(String[] args) {
        Window win = new Window("登录");
        win.addChild(new Picture("Logo图片", "http://example.com/logo.png"));

        Frame frame = new Frame("登录信息");
        frame.addChild(new Label("用户名", "用户名"));
        frame.addChild(new TextBox("用户名输入框"));
        frame.addChild(new Label("密码", "密码"));
        frame.addChild(new PasswordBox("密码输入框"));
        frame.addChild(new CheckBox("记住用户名复选框"));
        frame.addChild(new Label("记住用户名", "记住用户名"));
        frame.addChild(new LinkLabel("忘记密码", "忘记密码", "http://example.com/forgotPassword"));

        win.addChild(frame);
        win.addChild(new Button("登录按钮", "登录", "login()"));
        win.addChild(new Button("注册按钮", "注册", "registry()"));

        System.out.println(win.print());
    }

}
