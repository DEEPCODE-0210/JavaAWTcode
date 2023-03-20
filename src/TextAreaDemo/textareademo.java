package TextAreaDemo;

import java.awt.event.*;
import java.awt.*;

class MyFrame extends  Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame()
    {
        super("TextAreaDemo");
        l=new Label("No TextEntered");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        b = new Button("Click");
        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}
public class textareademo {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
