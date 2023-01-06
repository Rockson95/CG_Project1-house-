package com.company;

import java.applet.Applet;
import java.awt.*;
import javax.swing.JPanel;

public class Draw extends Applet {
    Thread t=new Thread();

    public void init()
    {
        super.init();
        resize(1350,650);
        setBackground(Color.white);

    }

    public void run()
    {
        t.start();
    }

    //instance of the primitives
    com.company.GraphicsPrimitives s1p = new com.company.GraphicsPrimitives();

    public void paint(Graphics g) {
        Graphics2D s1 = (Graphics2D) g;



        //The sky
        Color a19 = new Color(182,243,244);
        s1.setColor(a19);
        s1.fillArc(-150,-50,800,600,0,360);

        //The cloud
        Color a25 = new Color(240,254,255);
        s1.setColor(a25);
        s1.fillArc(50,50,200,100,0,360);
        s1.fillArc(100,0,100,300,0,360);
        s1.fillArc(150,0,150,300,0,360);

        s1.fillArc(500,100,150,60,0,360);
        s1.fillArc(550,80,60,100,0,360);


        // House background
        Color a12 = new Color(250,250,250);
        s1.setColor(a12);
        s1.fillRect(50,190,400,230);
        s1.fillRect(210,67,57+15,30);
        s1.fillRect(200,90,80+15,10);
        s1.fillRect(185,100,110+15,10);
        s1.fillRect(170,110,130+20,10);
        s1.fillRect(165,120,150+20,10);
        s1.fillRect(155,130,180+20,10);
        s1.fillRect(140,140,200+20,10);
        s1.fillRect(120,150,235+20,10);
        s1.fillRect(105,160,260+20,10);
        s1.fillRect(90,170,290+20,10);
        s1.fillRect(70,180,320+25,10);


        //The ground floor of the house
        Color a20 = new Color(102,153,52);
        s1.setColor(a20);
        s1.fillArc(-50,220,650,400,0,-180);

        //the mountains
        Color a21 = new Color(51,153,105);
        s1.setColor(a21);
        s1.fillArc(450,250,150,350,0,180);
        s1.fillArc(0,250,50,350,0,180);

        Color a11 = new Color(250,206,99);
        s1.setColor(a11);
        s1.fillRect(180,370,140,60);

        //The small line in the house
        Color a13 = new Color(211,211,209);
        s1.setColor(a13);
        s1.fillRect(220,80,57,2);
        s1.fillRect(210,90,80,2);
        s1.fillRect(195,100,110,2);
        s1.fillRect(180,110,130,2);
        s1.fillRect(175,120,150,2);
        s1.fillRect(165,130,180,2);
        s1.fillRect(150,140,200,2);
        s1.fillRect(130,150,235,2);
        s1.fillRect(115,160,260,2);
        s1.fillRect(100,170,290,2);
        s1.fillRect(80,180,320,2);
        s1.fillRect(60,190,360,2);
        s1.fillRect(40,200,390,2);
        s1.fillRect(40,200,410,2);
        s1.fillRect(40,210,420,2);
        s1.fillRect(40,220,420,2);
        s1.fillRect(40,230,420,2);
        s1.fillRect(40,240,420,2);
        s1.fillRect(40,250,420,2);
        s1.fillRect(40,260,420,2);
        s1.fillRect(40,270,420,2);
        s1.fillRect(40,280,420,2);
        s1.fillRect(40,290,420,2);
        s1.fillRect(40,300,420,2);
        s1.fillRect(40,310,420,2);
        s1.fillRect(40,320,420,2);
        s1.fillRect(40,330,420,2);
        s1.fillRect(40,340,420,2);
        s1.fillRect(40,350,420,2);
        s1.fillRect(40,360,420,2);
        s1.fillRect(40,370,420,2);
        s1.fillRect(40,380,145,2);
        s1.fillRect(315,380,145,2);
        s1.fillRect(40,390,140,2);
        s1.fillRect(320,390,140,2);
        s1.fillRect(40,400,145,2);
        s1.fillRect(315,400,145,2);
        s1.fillRect(40,410,140,2);
        s1.fillRect(320,410,140,2);

        /*body*/
        s1.setColor(Color.black);
        s1.drawLine(40, 420, 180, 420);
        s1.drawLine(320, 420, 460, 420);
        s1.drawLine(460, 200, 460, 420);
        s1.drawLine(50, 210, 50, 420);
        s1.drawLine(450, 210, 450, 420);
        s1.drawLine(40, 200, 40, 420);

        /*Door*/
        s1.drawRect(180, 400, 141, 31);
        s1.drawRect(180, 395, 141, 6);
        s1.drawRect(210, 270, 61, 101);
        s1.drawRect(280, 290, 21, 31);
        s1.drawLine(190, 370, 180, 395);
        s1.drawLine(310, 370, 320, 395);
        s1.drawLine(190, 370, 310, 370);
        s1.drawLine(200, 240, 280, 240);
        s1.drawLine(200, 240, 190, 260);
        s1.drawLine(280, 240, 290, 260);
        s1.drawRect(190, 260, 101, 11);


        /*windows*/

        s1.drawRect(70, 230, 100, 102);
        s1.drawRect(330, 230, 101, 101);
        s1.drawRect(210, 100, 81, 71);
        s1.drawRect(220, 110, 22, 21);
        s1.drawRect(260, 110, 22, 21);
        s1.drawRect(220, 140, 22, 23);
        s1.drawRect(260, 140, 21, 21);
        s1.drawRect(113, 230, 12, 102);
        s1.drawRect(70, 275, 100, 10);
        s1.drawRect(375, 230, 12, 101);
        s1.drawRect(330, 274, 101, 10);

        /*roof*/
        Color c3 = new Color(240, 191, 50);
        s1.setColor(c3);
        s1.fillRect(330,230,100,100);
        s1.fillRect(70,230,100,102);
        Color a14 = new Color(94,65,25);
        s1.setColor(a14);
        s1.setStroke(new BasicStroke(10));
        s1.drawLine(250, 45, 30, 215);
        s1.drawLine(250, 45, 470, 215);
        Color a15 = new Color(250,206,99);
        s1.setColor(a15);
        s1.drawLine(250, 60, 450, 210);
        s1.drawLine(250, 60, 50, 210);
        Color a1 = new Color(200,0,0);
        s1.setColor(a1);
        s1.fillRect(130, 50, 40, 50);
        s1.fillArc(130,60,30,60,0,360);
        s1.fillRect(130, 100, 14, 29);
        Color a2 = new Color(250,206,99);
        s1.setColor(a2);
        s1.fillRect(451, 210, 9, 210);
        s1.fillRect(41, 210, 9, 210);
        s1.fillRect(113, 230, 11, 103);
        s1.fillRect(375, 230, 12, 103);
        s1.fillRect(70, 275, 100, 10);
        s1.fillRect(330, 274, 100, 10);
        s1.setColor(a2);
        s1.fillRect(210,100,80,73);
        Color c2 = new Color(4, 10, 8);
        s1.setColor(c2);
        s1.fillRect(260,140,20,20);
        s1.fillRect(220,140,22,22);
        s1.fillRect(220,111,22,22);
        s1.fillRect(260,111,22,22);
        s1.setColor(a2);
        s1.fillRect(243,100,16,73);
        s1.fillRect(210,130,80,10);
        s1.setColor(a2);
        s1.fillRect(207,270,3,100);
        s1.fillRect(271,270,3,100);
        s1.setColor(Color.black);
        s1.fillRect(280,290,20,30);
        Color p11 = new Color(95,2,13);
        s1.setColor(p11);
        s1.fillRect(200,240,80,20);
        s1.fillRect(280,240,7,20);
        s1.fillRect(195,240,7,20);
        s1.fillArc(193,246,10,15,0,360);
        s1.fillArc(190,255,5,5,0,360);
        s1.fillArc(278,246,10,15,0,360);
        s1.fillArc(285,255,5,5,0,360);
        s1.setColor(a2);
        s1.fillRect(190,260,100,10);

        //The block on top of the roof
        Color a16 = new Color(200,0,0);
        s1.setColor(a16);
        s1.drawLine(130, 50, 130, 130);
        s1.drawLine(170, 50, 170, 100);
        s1.drawLine(130, 50, 170, 50);
        s1.fillRect(150, 100, 20, 20);
        s1.fillRect(126, 116, 15, 20);
        Color a30 = new Color(208,149,153);
        s1.setColor(a30);
        s1.fillRect(130, 45, 1, 20);
        s1.fillRect(140, 45, 1, 20);
        s1.fillRect(150, 45, 1, 20);
        s1.fillRect(160, 45, 1, 20);
        s1.fillRect(170, 45, 1, 20);

        s1.fillRect(125, 80, 20, 1);
        s1.fillRect(155, 80, 20, 1);

        s1.fillRect(130, 100, 1, 20);
        s1.fillRect(140, 100, 1, 20);
        s1.fillRect(150, 100, 1, 20);
        s1.fillRect(160, 100, 1, 20);
        s1.fillRect(170, 100, 1, 20);

        //The door painting
        Color a17 = new Color(255,254,255);
        s1.setColor(a17);
        s1.fillRect(210, 270, 60, 100);

        //The door knob
        s1.setColor(Color.black);
        s1.fillArc(213,320,6,6,0,360);

        //The walkway to the room of the house
        Color a18 = new Color(176,176,176);
        s1.setColor(a18);
        s1.fillRect(210, 430, 60, 180);

        //Painting the window color green
        Color a22 = new Color(95,150,92);
        s1.setColor(a22);
        s1.fillRect(70, 230, 15, 45);
        s1.fillRect(70, 230, 45, 15);
        s1.fillRect(155, 230, 15, 45);
        s1.fillRect(120, 230, 45, 15);
        s1.fillRect(70, 285, 15, 47);
        s1.fillRect(165, 285, 5, 47);

        //The secdond windpw painting
        s1.fillRect(330, 230, 15, 45);
        s1.fillRect(330, 230, 45, 15);
        s1.fillRect(415, 230, 15, 45);
        s1.fillRect(385, 230, 45, 15);
        s1.fillRect(330, 285, 15, 47);
        s1.fillRect(425, 285, 5, 47);

        //Painting the frames of the top windows
        s1.setColor(Color.black);
        s1.fillRect(217, 103, 33, 33);
        s1.fillRect(217+35, 103, 33, 33);

        s1.fillRect(217, 138, 33, 33);
        s1.fillRect(217+35, 138, 33, 33);


        //Drawing the flowers infront of the house

        Color a33 = new Color(0,105,63);
        s1.setColor(a33);
        s1.fillOval(80,400,50,40);
        s1.fillOval(110,400,70,40);
        s1.fillOval(40,400,60,40);

        s1.fillOval(350,400,50,40);
        s1.fillOval(380,400,70,40);
        s1.fillOval(320,400,60,40);
//1
        Color a34= new Color(245,0,255);
        s1.setColor(a34);
        s1.fillOval(150,410,10,20);
        s1.fillOval(160,410,10,30);
        s1.fillOval(145,419,20,10);
        s1.fillOval(160,419,20,10);
//2
        Color a38= new Color(156,31,187);
        s1.setColor(a38);
        s1.fillOval(130,410,10,20);
        s1.fillOval(140,410,10,30);
        s1.fillOval(125,419,20,10);
        s1.fillOval(130,419,20,10);
//3
        Color a35= new Color(251,36,173);
        s1.setColor(a35);
        s1.fillOval(100,410,10,20);
        s1.fillOval(110,410,10,30);
        s1.fillOval(95,419,25,10);
        s1.fillOval(110,419,20,10);
//4
        Color a36= new Color(245,0,255);
        s1.setColor(a36);
        s1.fillOval(70,410,10,20);
        s1.fillOval(80,410,10,30);
        s1.fillOval(65,419,20,10);
        s1.fillOval(70,419,20,10);
//5
        Color a37= new Color(244,34,123);
        s1.setColor(a37);
        s1.fillOval(50,410,10,20);
        s1.fillOval(60,410,10,30);
        s1.fillOval(45,419,20,10);
        s1.fillOval(50,419,20,10);
//6
        Color a39= new Color(245,0,255);
        s1.setColor(a39);
        s1.fillOval(70,390,10,20);
        s1.fillOval(80,390,10,30);
        s1.fillOval(65,399,20,10);
        s1.fillOval(70,399,20,10);

        Color a40= new Color(156,31,187);
        s1.setColor(a40);
        s1.fillOval(130,390,10,20);
        s1.fillOval(140,390,10,30);
        s1.fillOval(125,399,20,10);
        s1.fillOval(130,399,20,10);

        //To the right
        Color a41= new Color(156,31,187);
        s1.setColor(a41);
        s1.fillOval(350,390,10,20);
        s1.fillOval(340,390,10,30);
        s1.fillOval(335,399,20,10);
        s1.fillOval(350,399,20,10);

        Color a42= new Color(245,0,255);
        s1.setColor(a42);
        s1.fillOval(370,410,10,20);
        s1.fillOval(360,410,10,30);
        s1.fillOval(345,419,20,10);
        s1.fillOval(370,419,20,10);

        Color a43= new Color(156,31,187);
        s1.setColor(a43);
        s1.fillOval(390,410,10,20);
        s1.fillOval(380,410,10,30);
        s1.fillOval(365,419,20,10);
        s1.fillOval(390,419,20,10);

        Color a44= new Color(251,36,173);
        s1.setColor(a44);
        s1.fillOval(410,410,10,20);
        s1.fillOval(400,410,10,30);
        s1.fillOval(395,419,25,10);
        s1.fillOval(410,419,20,10);

        Color a45= new Color(245,0,255);
        s1.setColor(a45);
        s1.fillOval(430,410,10,20);
        s1.fillOval(420,410,10,30);
        s1.fillOval(405,419,20,10);
        s1.fillOval(430,419,20,10);

        Color a46= new Color(244,34,123);
        s1.setColor(a46);
        s1.fillOval(450,410,10,20);
        s1.fillOval(440,410,10,30);
        s1.fillOval(435,419,20,10);
        s1.fillOval(450,419,20,10);

        Color a47= new Color(245,0,255);
        s1.setColor(a47);
        s1.fillOval(470,390,10,20);
        s1.fillOval(460,390,10,30);
        s1.fillOval(450,399,20,10);
        s1.fillOval(470,399,20,10);
    }
}