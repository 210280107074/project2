import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class server extends JFrame implements ActionListener{
    JTextField  text;
    JPanel p2;
    Box vertical = Box.createVerticalBox();
    server()  {

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,400,60);
        add(p1);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("3 (1).png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(9,15,25,25);
        p1.add(back);
        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me){
                System.exit(0);
            }
        });
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                back.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                back.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("profile1.png"));
        Image i5 = i4.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40,6,50,50);
        p1.add(profile);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("phone (1).png"));
        Image i8 = i7.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel call= new JLabel(i9);
        call.setBounds(250,14,30,30);
        p1.add(call);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("video (1).png"));
        Image i11 = i10.getImage().getScaledInstance(23, 23, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel video= new JLabel(i12);
        video.setBounds(300,14,30,30);
        p1.add(video);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("3icon (1).png"));
        Image i14 = i13.getImage().getScaledInstance(23, 23, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel dots= new JLabel(i15);
        dots.setBounds(350,14,30,30);
        p1.add(dots);

        JLabel U1 = new JLabel("NARUTO UZUMAKI");
        U1.setBounds(100,0,200,50);
        U1.setForeground(Color.WHITE);
        U1.setFont(new Font("SAN_SERIF",Font.BOLD,13));
        p1.add(U1);

        JLabel status = new JLabel("Online");
        status.setBounds(100,20,200,50);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF",Font.BOLD,9));
        p1.add(status);

         p2 = new JPanel();
        p2.setBounds(4,60,378,550);
        // p2.setBackground(Color.BLACK);
        add(p2);    

        JButton send = new JButton("send");
        send.setBounds(310,610,70,45);
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        add(send);

        text = new JTextField();
        text.setBounds(3,610,300,45);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
       
        add(text);

        



        setLayout(null);
        setSize(400,700);
        setLocation(10,30);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String str = text.getText();
        JLabel out = new JLabel(str);
        out.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        JPanel p3  = new JPanel();
        p3.setBackground(new Color(37,211,102));
        p3.setLayout(new BorderLayout());
        p3.add(out,BorderLayout.LINE_END);
        p2.setLayout(new BorderLayout());
        vertical.add(p3);
        vertical.add(Box.createVerticalStrut(15));
        p2.add(vertical,BorderLayout.PAGE_START);
        repaint();
        validate();
        invalidate();
    }
 
    public static void main(String[] args) {
        new server();
    }

}
