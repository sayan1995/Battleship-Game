/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sarthak
 */
 import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewJFrame2 extends javax.swing.JFrame implements MouseListener, MouseMotionListener {
static ShipClient board = new ShipClient(); 

    /**
     * Creates new form NewJFrame2
     */
    public NewJFrame2() {
        initComponents();
       // o= new NewJFrame2();
        f=false;
        f1=false;
        f2=false;
     //   foo();
    }
  boolean f;
       int startX, startY;  // When the user presses the mouse button, the
                        //   location of the mouse is stored in these variables.
   int prevX, prevY;    // The most recent mouse location; a rubber band line has
                        //    been drawn from (startX, startY) to (prevX, prevY).
                        
   boolean dragging = false;  // For safety, this variable is set to true while a
                              // drag operation is in progress.
         boolean f1,f2;                     
   Graphics gc;  // While dragging, gc is a graphics context that can be used to 
                 // draw to the canvas.  

NewJFrame2 o2;
NewJFrame2 o1;
NewJFrame2 o;
 void foo()
 {
   int currentColorIndex = 0;
   int    currentBackgroundIndex = 12;
    
      addMouseListener(this);
      addMouseMotionListener(this);
}
   public void mousePressed(MouseEvent evt) {
         // This is called by the system when the user presses the mouse button.
         // Record the location at which the mouse was pressed.  This location
         // is one endpoint of the line that will be drawn when the mouse is
         // released.  This method is part of the MouseLister interface.
      
      if((f==true && f1==false && f2==false)|| (f==false && f1==true && f2==false) || (f==false && f1==false && f2==true))
      {startX = evt.getX();
      startY = evt.getY();
      prevX = startX;
      prevY = startY;
      dragging = true;
      gc = getGraphics();  // Get a graphics context for use while drawing.
     gc.setColor(ColoredLine.colorList[0]);
      gc.setXORMode(getBackground());
      gc.drawLine(startX, startY, prevX, prevY);
   }
  } 
   public void mouseDragged(MouseEvent evt) {
         // This is called by the system when the user moves the mouse while holding
         // down a mouse button.  The previously drawn rubber band line is erased by
         // drawing it a second time, and a new rubber band line is drawn from the
         // start point to the current mouse location.
      if (!dragging)  // Make sure that the drag operation has been properly started.
         return;
      gc.drawLine(startX,startY,prevX,prevY);  // Erase the previous line.
      prevX = evt.getX();
      prevY = evt.getY();
      gc.drawLine(startX,startY,prevX,prevY);  // Draw the new line.
   }

   public void mouseReleased(MouseEvent evt) {
         // This is called by the system when the user releases the mouse button.
         // The previously drawvn rubber band line is erased by drawing it a second
         // time.  Then a permanent line is drawn in the current drawing color,
         // and is added to the array of lines.
      if (!dragging)  // Make sure that the drag operation has been properly started.
         return;
      gc.drawLine(startX,startY,prevX,prevY);  // Erase the previous line.
      int endX = evt.getX();  // Where the mouse was released.
      int endY = evt.getY();
      gc.setPaintMode();
     //if first button pressed
     if(f==true && f1==false && f2==false)
     {
     //X positions check!
     if((Math.abs(endY-startY))<=27)
     {
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=68) && (endY<=90)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       f=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f=false;}
      
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f=false;}
      
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
      f=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=407) && (endY<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=301) && (endY<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f=false;}
      

      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f=false;}
    }
   }
    else if(f==false && f1==true && f2==false)
     {
     //X positions check!
     if((Math.abs(endY-startY))<=27)
     {
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=68) && (endY<=90)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       f1=false;}
      if((((Math.abs(endX-startX)))>=136)&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f1=false;}
      if((((Math.abs(endX-startX)))>=136)&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f1=false;}
      if((((Math.abs(endX-startX)))>=136)&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f1=false;}
      if((((Math.abs(endX-startX)))>=136)&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f1=false;}
      
      if((((Math.abs(endX-startX)))>=136)&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f1=false;}
      
      if((((Math.abs(endX-startX)))>=136)&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
      f1=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192) && (((Math.abs(endY-startY)))<=192)&& ((startX>=407) && (endY<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=301) && (endY<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f1=false;}
      

      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f1=false;}
    }
   }
    else if(f==false && f1==false && f2==true)
     {
     //X positions check!
     if((Math.abs(endY-startY))<=27)
     {
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=68) && (endY<=90)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       f2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      f2=false;}
      
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f2=false;}
      
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
      f2=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=407) && (endY<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=301) && (endY<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      f2=false;}
      

      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f2=false;}
    }
   }
  
     System.out.println(startX + " "+startY+" "+endX+ " "+ endY);
      gc.dispose();  // Free the graphics context, now that the draw operation is over.
   
   } // end mouseReleased

   public void mouseClicked(MouseEvent evt) { }  // Other methods in the MouseListener interface
   public void mouseEntered(MouseEvent evt) { }
   public void mouseExited(MouseEvent evt) { }
   public void mouseMoved(MouseEvent evt) { }  // Required by the MouseMotionListener interface.

    /**
    
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    public void initComponents() {

        nanaBoysLabels1 = new javax.swing.JLabel();
        nanaBoys2 = new javax.swing.JButton();
        nanaBoys3 = new javax.swing.JButton();
        nanaBoys4 = new javax.swing.JButton();
        nanaBoys5 = new javax.swing.JButton();
        nanaBoys6 = new javax.swing.JButton();
        nanaBoys7 = new javax.swing.JButton();
        nanaBoys8 = new javax.swing.JButton();
        nanaBoys9 = new javax.swing.JButton();
        nanaBoys10 = new javax.swing.JButton();
        nanaBoys11 = new javax.swing.JButton();
        nanaBoys12 = new javax.swing.JButton();
        nanaBoys13 = new javax.swing.JButton();
        nanaBoys14 = new javax.swing.JButton();
        nanaBoys15 = new javax.swing.JButton();
        nanaBoys16 = new javax.swing.JButton();
        nanaBoys17 = new javax.swing.JButton();
        nanaBoys18 = new javax.swing.JButton();
        nanaBoys19 = new javax.swing.JButton();
        nanaBoys20 = new javax.swing.JButton();
        nanaBoys21 = new javax.swing.JButton();
        nanaBoys22 = new javax.swing.JButton();
        nanaBoys23 = new javax.swing.JButton();
        nanaBoys24 = new javax.swing.JButton();
        nanaBoys25 = new javax.swing.JButton();
        nanaBoys26 = new javax.swing.JButton();
        nanaBoys27 = new javax.swing.JButton();
        nanaBoys28 = new javax.swing.JButton();
        nanaBoys29 = new javax.swing.JButton();
        nanaBoys30 = new javax.swing.JButton();
        nanaBoys31 = new javax.swing.JButton();
        nanaBoys32 = new javax.swing.JButton();
        nanaBoys33 = new javax.swing.JButton();
        nanaBoys34 = new javax.swing.JButton();
        nanaBoys35 = new javax.swing.JButton();
        nanaBoys36 = new javax.swing.JButton();
        nanaBoys37 = new javax.swing.JButton();
        nanaBoys38 = new javax.swing.JButton();
        nanaBoys39 = new javax.swing.JButton();
        nanaBoys40 = new javax.swing.JButton();
        nanaBoys41 = new javax.swing.JButton();
        nanaBoys42 = new javax.swing.JButton();
        nanaBoys43 = new javax.swing.JButton();
        nanaBoys44 = new javax.swing.JButton();
        nanaBoys45 = new javax.swing.JButton();
        nanaBoys46 = new javax.swing.JButton();
        nanaBoys47 = new javax.swing.JButton();
        nanaBoys48 = new javax.swing.JButton();
        nanaBoys49 = new javax.swing.JButton();
        nanaBoys50 = new javax.swing.JButton();
        nanaBoysLabels2 = new javax.swing.JLabel();
        nanaBoysLabels4 = new javax.swing.JLabel();
        nanaBoysLabels3 = new javax.swing.JLabel();
        nanaBoysLabels5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        nanaBoysLabels6 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        nanaBoysLabels7 = new javax.swing.JLabel();
        nanaBoysLabels8 = new javax.swing.JLabel();
        nanaBoysLabels9 = new javax.swing.JLabel();
        nanaBoysLabels10 = new javax.swing.JLabel();
        nanaBoysLabels11 = new javax.swing.JLabel();
        nanaBoysLabels12 = new javax.swing.JLabel();
        nanaBoysLabels13 = new javax.swing.JLabel();
        nanaBoysLabels14 = new javax.swing.JLabel();
        nanaBoysLabels15 = new javax.swing.JLabel();
        nanaBoysLabels16 = new javax.swing.JLabel();
        nanaBoysLabels17 = new javax.swing.JLabel();
        nanaBoysLabels18 = new javax.swing.JLabel();
        nanaBoysLabels19 = new javax.swing.JLabel();
        nanaBoysLabels20 = new javax.swing.JLabel();
        nanaBoysLabels21 = new javax.swing.JLabel();
        nanaBoysLabels22 = new javax.swing.JLabel();
        nanaBoysLabels23 = new javax.swing.JLabel();
        nanaBoysLabels24 = new javax.swing.JLabel();
        nanaBoysLabels25 = new javax.swing.JLabel();
        nanaBoysLabels26 = new javax.swing.JLabel();
        nanaBoysLabels27 = new javax.swing.JLabel();
        nanaBoysLabels28 = new javax.swing.JLabel();
        nanaBoysLabels29 = new javax.swing.JLabel();
        nanaBoysLabels30 = new javax.swing.JLabel();
        nanaBoysLabels31 = new javax.swing.JLabel();
        nanaBoysLabels32 = new javax.swing.JLabel();
        nanaBoysLabels33 = new javax.swing.JLabel();
        nanaBoysLabels34 = new javax.swing.JLabel();
        nanaBoysLabels35 = new javax.swing.JLabel();
        nanaBoysLabels36 = new javax.swing.JLabel();
        nanaBoysLabels37 = new javax.swing.JLabel();
        nanaBoysLabels38 = new javax.swing.JLabel();
        nanaBoysLabels39 = new javax.swing.JLabel();
        nanaBoysLabels40 = new javax.swing.JLabel();
        nanaBoysLabels41 = new javax.swing.JLabel();
        nanaBoysLabels42 = new javax.swing.JLabel();
        nanaBoysLabels43 = new javax.swing.JLabel();
        nanaBoysLabels44 = new javax.swing.JLabel();
        nanaBoysLabels45 = new javax.swing.JLabel();
        nanaBoysLabels46 = new javax.swing.JLabel();
        nanaBoysLabels47 = new javax.swing.JLabel();
        nanaBoysLabels48 = new javax.swing.JLabel();
        nanaBoysLabels49 = new javax.swing.JLabel();
        nanaBoysLabels50 = new javax.swing.JLabel();
        nanaBoysLabels51 = new javax.swing.JLabel();
        nanaBoysLabels52 = new javax.swing.JLabel();
        nanaBoysLabels53 = new javax.swing.JLabel();
        nanaBoysLabels54 = new javax.swing.JLabel();
        nanaBoysLabels55 = new javax.swing.JLabel();
        nanaBoysLabels56 = new javax.swing.JLabel();
        nanaBoysLabels57 = new javax.swing.JLabel();
        nanaBoysLabels58 = new javax.swing.JLabel();
        nanaBoysLabels59 = new javax.swing.JLabel();
        nanaBoysLabels60 = new javax.swing.JLabel();
        nanaBoysLabels61 = new javax.swing.JLabel();
        nanaBoysLabels62 = new javax.swing.JLabel();
       // nanaBoysLabels63= new javax.swing.JLabel();
        //nanaBoysLabels64= new javax.swing.JLabel();
        //nanaBoysLabels65= new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BattleShip Beta (DSJ Mini Project) ---- USER 2");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        nanaBoysLabels1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nanaBoysLabels1.setText("Enemy Water");

        nanaBoys2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys2.setToolTipText("");
        nanaBoys2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys2.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys2.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys2.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys2ActionPerformed(evt);
            }
        });

        nanaBoys3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys3.setToolTipText("");
        nanaBoys3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys3.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys3.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys3.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys3ActionPerformed(evt);
            }
        });

        nanaBoys4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys4.setToolTipText("");
        nanaBoys4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys4.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys4.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys4.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys4ActionPerformed(evt);
            }
        });

        nanaBoys5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys5.setToolTipText("");
        nanaBoys5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys5.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys5.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys5.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys5ActionPerformed(evt);
            }
        });

        nanaBoys6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys6.setToolTipText("");
        nanaBoys6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys6.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys6.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys6.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys6ActionPerformed(evt);
            }
        });

        nanaBoys7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys7.setToolTipText("");
        nanaBoys7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys7.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys7.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys7.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys7ActionPerformed(evt);
            }
        });

        nanaBoys8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys8.setToolTipText("");
        nanaBoys8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys8.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys8.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys8.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys8ActionPerformed(evt);
            }
        });

        nanaBoys9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys9.setToolTipText("");
        nanaBoys9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys9.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys9.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys9.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys9ActionPerformed(evt);
            }
        });

        nanaBoys10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys10.setToolTipText("");
        nanaBoys10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys10.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys10.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys10.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys10ActionPerformed(evt);
            }
        });

        nanaBoys11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys11.setToolTipText("");
        nanaBoys11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys11.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys11.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys11.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys11ActionPerformed(evt);
            }
        });

        nanaBoys12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys12.setToolTipText("");
        nanaBoys12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys12.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys12.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys12.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys12ActionPerformed(evt);
            }
        });

        nanaBoys13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys13.setToolTipText("");
        nanaBoys13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys13.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys13.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys13.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys13ActionPerformed(evt);
            }
        });

        nanaBoys14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys14.setToolTipText("");
        nanaBoys14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys14.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys14.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys14.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys14ActionPerformed(evt);
            }
        });

        nanaBoys15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys15.setToolTipText("");
        nanaBoys15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys15.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys15.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys15.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys15ActionPerformed(evt);
            }
        });

        nanaBoys16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys16.setToolTipText("");
        nanaBoys16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys16.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys16.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys16.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys16ActionPerformed(evt);
            }
        });

        nanaBoys17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys17.setToolTipText("");
        nanaBoys17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys17.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys17.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys17.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys17ActionPerformed(evt);
            }
        });

        nanaBoys18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys18.setToolTipText("");
        nanaBoys18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys18.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys18.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys18.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys18ActionPerformed(evt);
            }
        });

        nanaBoys19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys19.setToolTipText("");
        nanaBoys19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys19.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys19.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys19.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys19ActionPerformed(evt);
            }
        });

        nanaBoys20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys20.setToolTipText("");
        nanaBoys20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys20.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys20.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys20.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys20ActionPerformed(evt);
            }
        });

        nanaBoys21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys21.setToolTipText("");
        nanaBoys21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys21.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys21.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys21.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys21ActionPerformed(evt);
            }
        });

        nanaBoys22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys22.setToolTipText("");
        nanaBoys22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys22.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys22.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys22.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys22ActionPerformed(evt);
            }
        });

        nanaBoys23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys23.setToolTipText("");
        nanaBoys23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys23.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys23.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys23.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys23ActionPerformed(evt);
            }
        });

        nanaBoys24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys24.setToolTipText("");
        nanaBoys24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys24.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys24.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys24.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys24ActionPerformed(evt);
            }
        });

        nanaBoys25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys25.setToolTipText("");
        nanaBoys25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys25.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys25.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys25.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys25ActionPerformed(evt);
            }
        });

        nanaBoys26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys26.setToolTipText("");
        nanaBoys26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys26.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys26.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys26.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys26ActionPerformed(evt);
            }
        });

        nanaBoys27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys27.setToolTipText("");
        nanaBoys27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys27.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys27.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys27.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys27ActionPerformed(evt);
            }
        });

        nanaBoys28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys28.setToolTipText("");
        nanaBoys28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys28.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys28.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys28.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys28ActionPerformed(evt);
            }
        });

        nanaBoys29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys29.setToolTipText("");
        nanaBoys29.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys29.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys29.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys29.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys29ActionPerformed(evt);
            }
        });

        nanaBoys30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys30.setToolTipText("");
        nanaBoys30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys30.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys30.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys30.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys30ActionPerformed(evt);
            }
        });

        nanaBoys31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys31.setToolTipText("");
        nanaBoys31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys31.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys31.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys31.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys31ActionPerformed(evt);
            }
        });

        nanaBoys32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys32.setToolTipText("");
        nanaBoys32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys32.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys32.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys32.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys32ActionPerformed(evt);
            }
        });

        nanaBoys33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys33.setToolTipText("");
        nanaBoys33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys33.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys33.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys33.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys33ActionPerformed(evt);
            }
        });

        nanaBoys34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys34.setToolTipText("");
        nanaBoys34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys34.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys34.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys34.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys34ActionPerformed(evt);
            }
        });

        nanaBoys35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys35.setToolTipText("");
        nanaBoys35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys35.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys35.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys35.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys35ActionPerformed(evt);
            }
        });

        nanaBoys36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys36.setToolTipText("");
        nanaBoys36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys36.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys36.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys36.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys36ActionPerformed(evt);
            }
        });

        nanaBoys37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys37.setToolTipText("");
        nanaBoys37.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys37.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys37.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys37.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys37ActionPerformed(evt);
            }
        });

        nanaBoys38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys38.setToolTipText("");
        nanaBoys38.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys38.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys38.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys38.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys38ActionPerformed(evt);
            }
        });

        nanaBoys39.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys39.setToolTipText("");
        nanaBoys39.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys39.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys39.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys39.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys39ActionPerformed(evt);
            }
        });

        nanaBoys40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys40.setToolTipText("");
        nanaBoys40.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys40.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys40.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys40.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys40ActionPerformed(evt);
            }
        });

        nanaBoys41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys41.setToolTipText("");
        nanaBoys41.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys41.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys41.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys41.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys41ActionPerformed(evt);
            }
        });

        nanaBoys42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys42.setToolTipText("");
        nanaBoys42.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys42.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys42.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys42.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys42ActionPerformed(evt);
            }
        });

        nanaBoys43.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys43.setToolTipText("");
        nanaBoys43.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys43.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys43.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys43.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys43ActionPerformed(evt);
            }
        });

        nanaBoys44.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys44.setToolTipText("");
        nanaBoys44.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys44.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys44.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys44.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys44ActionPerformed(evt);
            }
        });

        nanaBoys45.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys45.setToolTipText("");
        nanaBoys45.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys45.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys45.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys45.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys45ActionPerformed(evt);
            }
        });

        nanaBoys46.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys46.setToolTipText("");
        nanaBoys46.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys46.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys46.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys46.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys46ActionPerformed(evt);
            }
        });

        nanaBoys47.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys47.setToolTipText("");
        nanaBoys47.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys47.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys47.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys47.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys47ActionPerformed(evt);
            }
        });

        nanaBoys48.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys48.setToolTipText("");
        nanaBoys48.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys48.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys48.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys48.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys48ActionPerformed(evt);
            }
        });

        nanaBoys49.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys49.setToolTipText("");
        nanaBoys49.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys49.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys49.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys49.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys49ActionPerformed(evt);
            }
        });

        nanaBoys50.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoys50.setToolTipText("");
        nanaBoys50.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoys50.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoys50.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoys50.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoys50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoys50ActionPerformed(evt);
            }
        });

        nanaBoysLabels2.setText(" Guesses :  ");

        nanaBoysLabels4.setText("Hits: ");

        nanaBoysLabels3.setText("Enemy generals sunk : ");

        nanaBoysLabels5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nanaBoysLabels5.setText("Home Water");

        jToggleButton1.setLabel("Minion");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
                 
               }
        });

        nanaBoysLabels6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nanaBoysLabels6.setText("Select A Ship ");

        jToggleButton2.setText("General");
         jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
                 
            }
        });


        jToggleButton3.setText("Emperor");
            jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
               
            }
        });


        nanaBoysLabels7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\patrol.gif")); // NOI18N
        nanaBoysLabels7.setLabelFor(jToggleButton1);

        nanaBoysLabels8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\submarine.gif")); // NOI18N

        nanaBoysLabels9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\battleship.gif")); // NOI18N

        nanaBoysLabels10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels10.setToolTipText("");
        nanaBoysLabels10.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels10.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels10.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels11.setToolTipText("");
        nanaBoysLabels11.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels11.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels11.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels12.setToolTipText("");
        nanaBoysLabels12.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels12.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels12.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels13.setToolTipText("");
        nanaBoysLabels13.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels13.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels13.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels14.setToolTipText("");
        nanaBoysLabels14.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels14.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels14.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels15.setToolTipText("");
        nanaBoysLabels15.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels15.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels15.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels16.setToolTipText("");
        nanaBoysLabels16.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels16.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels16.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels17.setToolTipText("");
        nanaBoysLabels17.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels17.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels17.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels18.setToolTipText("");
        nanaBoysLabels18.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels18.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels18.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels19.setToolTipText("");
        nanaBoysLabels19.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels19.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels19.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels20.setToolTipText("");
        nanaBoysLabels20.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels20.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels20.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels21.setToolTipText("");
        nanaBoysLabels21.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels21.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels21.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels22.setToolTipText("");
        nanaBoysLabels22.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels22.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels22.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels23.setToolTipText("");
        nanaBoysLabels23.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels23.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels23.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels24.setToolTipText("");
        nanaBoysLabels24.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels24.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels24.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels25.setToolTipText("");
        nanaBoysLabels25.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels25.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels25.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels26.setToolTipText("");
        nanaBoysLabels26.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels26.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels26.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels27.setToolTipText("");
        nanaBoysLabels27.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels27.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels27.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels28.setToolTipText("");
        nanaBoysLabels28.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels28.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels28.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels29.setToolTipText("");
        nanaBoysLabels29.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels29.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels29.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels30.setToolTipText("");
        nanaBoysLabels30.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels30.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels30.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels31.setToolTipText("");
        nanaBoysLabels31.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels31.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels31.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels32.setToolTipText("");
        nanaBoysLabels32.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels32.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels32.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels33.setToolTipText("");
        nanaBoysLabels33.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels33.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels33.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels34.setToolTipText("");
        nanaBoysLabels34.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels34.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels34.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels35.setToolTipText("");
        nanaBoysLabels35.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels35.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels35.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels36.setToolTipText("");
        nanaBoysLabels36.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels36.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels36.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels37.setToolTipText("");
        nanaBoysLabels37.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels37.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels37.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels38.setToolTipText("");
        nanaBoysLabels38.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels38.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels38.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels39.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels39.setToolTipText("");
        nanaBoysLabels39.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels39.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels39.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels40.setToolTipText("");
        nanaBoysLabels40.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels40.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels40.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels41.setToolTipText("");
        nanaBoysLabels41.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels41.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels41.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels42.setToolTipText("");
        nanaBoysLabels42.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels42.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels42.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels43.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels43.setToolTipText("");
        nanaBoysLabels43.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels43.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels43.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels44.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels44.setToolTipText("");
        nanaBoysLabels44.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels44.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels44.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels45.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels45.setToolTipText("");
        nanaBoysLabels45.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels45.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels45.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels46.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels46.setToolTipText("");
        nanaBoysLabels46.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels46.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels46.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels47.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels47.setToolTipText("");
        nanaBoysLabels47.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels47.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels47.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels48.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels48.setToolTipText("");
        nanaBoysLabels48.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels48.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels48.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels49.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels49.setToolTipText("");
        nanaBoysLabels49.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels49.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels49.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels50.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels50.setToolTipText("");
        nanaBoysLabels50.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels50.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels50.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels51.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels51.setToolTipText("");
        nanaBoysLabels51.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels51.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels51.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels52.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels52.setToolTipText("");
        nanaBoysLabels52.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels52.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels52.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels53.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels53.setToolTipText("");
        nanaBoysLabels53.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels53.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels53.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels54.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels54.setToolTipText("");
        nanaBoysLabels54.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels54.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels54.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels55.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels55.setToolTipText("");
        nanaBoysLabels55.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels55.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels55.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels56.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels56.setToolTipText("");
        nanaBoysLabels56.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels56.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels56.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels57.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels57.setToolTipText("");
        nanaBoysLabels57.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels57.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels57.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabels58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabels58.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\water.gif")); // NOI18N
        nanaBoysLabels58.setToolTipText("");
        nanaBoysLabels58.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels58.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabels58.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabels59.setText(" Hits taken : ");

        nanaBoysLabels60.setText("Friendly generals sunk : ");

        nanaBoysLabels61.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nanaBoysLabels61.setText("To Place in the Water");

        nanaBoysLabels62.setText("Status : ");
        nanaBoysLabels62.setMaximumSize(new java.awt.Dimension(100, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoys39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoys43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoys41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoys36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoys37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nanaBoys34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoys3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoys6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoys2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoys5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoys4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nanaBoys10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoys48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoys50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nanaBoysLabels2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nanaBoysLabels1)
                                .addGap(165, 165, 165))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nanaBoys32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoys38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoys27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoys24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoys33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nanaBoys40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nanaBoys42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoys29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoys35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nanaBoys9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoys16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoys18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoys20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoys22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nanaBoys15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nanaBoys7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoys11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoys8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoys47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(nanaBoysLabels4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoys44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoys46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nanaBoysLabels3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(81, 81, 81))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nanaBoysLabels62, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nanaBoysLabels38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabels31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nanaBoysLabels17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nanaBoysLabels19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabels11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoysLabels12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabels13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabels14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabels15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabels16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nanaBoysLabels5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabels44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nanaBoysLabels60, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nanaBoysLabels59, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nanaBoysLabels8)
                            .addComponent(nanaBoysLabels7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nanaBoysLabels9))
                    .addComponent(nanaBoysLabels61)
                    .addComponent(nanaBoysLabels6))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nanaBoysLabels1)
                    .addComponent(nanaBoysLabels5))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoys2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoys3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoys4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoys41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoys39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoys37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoys48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoys46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nanaBoysLabels10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nanaBoysLabels12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabels13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabels14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabels15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabels16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nanaBoysLabels7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(nanaBoysLabels9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabels6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabels61))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabels18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabels25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabels32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabels39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabels46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabels53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabels58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nanaBoysLabels11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabels54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nanaBoysLabels2)
                        .addComponent(nanaBoysLabels4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nanaBoysLabels60)
                        .addComponent(nanaBoysLabels59))
                    .addComponent(nanaBoysLabels3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nanaBoysLabels62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    public void nanaBoys34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys38ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys37ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys36ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys35ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    public void nanaBoys30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys31ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(1+14+1)||board.general.isAHit(1+15)||board.emperor.isAHit(1+15)){
    nanaBoys10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(1+15));

    }                                         

    public void nanaBoys9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(17)||board.general.isAHit(17)||board.emperor.isAHit(17)){
    nanaBoys9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(17));

    }                                        

    public void nanaBoys12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys39ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys40ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys41ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys42ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(3+14+7)||board.general.isAHit(24)||board.emperor.isAHit(3+21)){
    nanaBoys42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }      
    }                                         

    public void nanaBoys43ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys50ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(2+7)||board.general.isAHit(2+7)||board.emperor.isAHit(2+7)){
    nanaBoys6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(2+7));

    }                                        

    public void nanaBoys49ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(3)||board.general.isAHit(1+2)||board.emperor.isAHit(1+2)){
    nanaBoys7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(1+2));

    }                                        

    public void nanaBoys48ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys47ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
if(board.minion.isAHit(1)||board.general.isAHit(1)||board.emperor.isAHit(1)){
    nanaBoys2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else if(board.hits.isAHit(1)){}
else{nanaBoys2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(1));
    }
    public void nanaBoys15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(3+7)||board.general.isAHit(10)||board.emperor.isAHit(10)){
    nanaBoys15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(10));

    }                                         

    public void nanaBoys3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(1+7)||board.general.isAHit(1+7)||board.emperor.isAHit(1+7)){
    nanaBoys3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(1+7));

    }                                        

    public void nanaBoys16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(1+14)||board.general.isAHit(1+14)||board.emperor.isAHit(1+14)){
    nanaBoys4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(1+14));

    }                                        

    public void nanaBoys5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(2)||board.general.isAHit(2)||board.emperor.isAHit(2)){
    nanaBoys5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\fire.gif")); // NOI18N
}else{nanaBoys5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\kamikaze-kamikaze\\battleship\\graphics\\splash.gif")); // NOI18N}
    }                                        

nanaBoysLabels62.setText("Status : " + board.fire(2));

    }                                        

    public void nanaBoys45ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys46ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys44ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void nanaBoys19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
     
        f=true;
        if(f1==true)
        f1=false;
        if(f2==true)
        f2=false;
    // addMouseListener(this);
     // addMouseMotionListener(this);
 if(!jToggleButton1.isSelected()){
     jToggleButton1.setSelected(true);
     } 

foo();
    }                                              

    public void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        if(f==true)
        f=false;
        if(f2==true)
        f2=false;
     f1=true;
      if(!jToggleButton2.isSelected()){
     jToggleButton2.setSelected(true);
     } 

     foo();
        }                                              

    public void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
     if(f==true)
    f=false;
        if(f1==true)
        f1=false;
     f2=true;
     
     if(!jToggleButton3.isSelected()){
     jToggleButton3.setSelected(true);
     } 
     foo();
      //  f=true;
    }                                              


    public void formMouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    /**
     * @param args the command line arguments
     */
    public static void maitri() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton nanaBoys10;
    public javax.swing.JButton nanaBoys11;
    public javax.swing.JButton nanaBoys12;
    public javax.swing.JButton nanaBoys13;
    public javax.swing.JButton nanaBoys14;
    public javax.swing.JButton nanaBoys15;
    public javax.swing.JButton nanaBoys16;
    public javax.swing.JButton nanaBoys17;
    public javax.swing.JButton nanaBoys18;
    public javax.swing.JButton nanaBoys19;
    public javax.swing.JButton nanaBoys2;
    public javax.swing.JButton nanaBoys20;
    public javax.swing.JButton nanaBoys21;
    public javax.swing.JButton nanaBoys22;
    public javax.swing.JButton nanaBoys23;
    public javax.swing.JButton nanaBoys24;
    public javax.swing.JButton nanaBoys25;
    public javax.swing.JButton nanaBoys26;
    public javax.swing.JButton nanaBoys27;
    public javax.swing.JButton nanaBoys28;
    public javax.swing.JButton nanaBoys29;
    public javax.swing.JButton nanaBoys3;
    public javax.swing.JButton nanaBoys30;
    public javax.swing.JButton nanaBoys31;
    public javax.swing.JButton nanaBoys32;
    public javax.swing.JButton nanaBoys33;
    public javax.swing.JButton nanaBoys34;
    public javax.swing.JButton nanaBoys35;
    public javax.swing.JButton nanaBoys36;
    public javax.swing.JButton nanaBoys37;
    public javax.swing.JButton nanaBoys38;
    public javax.swing.JButton nanaBoys39;
    public javax.swing.JButton nanaBoys4;
    public javax.swing.JButton nanaBoys40;
    public javax.swing.JButton nanaBoys41;
    public javax.swing.JButton nanaBoys42;
    public javax.swing.JButton nanaBoys43;
    public javax.swing.JButton nanaBoys44;
    public javax.swing.JButton nanaBoys45;
    public javax.swing.JButton nanaBoys46;
    public javax.swing.JButton nanaBoys47;
    public javax.swing.JButton nanaBoys48;
    public javax.swing.JButton nanaBoys49;
    public javax.swing.JButton nanaBoys5;
    public javax.swing.JButton nanaBoys50;
    public javax.swing.JButton nanaBoys6;
    public javax.swing.JButton nanaBoys7;
    public javax.swing.JButton nanaBoys8;
    public javax.swing.JButton nanaBoys9;
    public javax.swing.JLabel nanaBoysLabels1;
    public javax.swing.JLabel nanaBoysLabels10;
    public javax.swing.JLabel nanaBoysLabels11;
    public javax.swing.JLabel nanaBoysLabels12;
    public javax.swing.JLabel nanaBoysLabels13;
    public javax.swing.JLabel nanaBoysLabels14;
    public javax.swing.JLabel nanaBoysLabels15;
    public javax.swing.JLabel nanaBoysLabels16;
    public javax.swing.JLabel nanaBoysLabels17;
    public javax.swing.JLabel nanaBoysLabels18;
    public javax.swing.JLabel nanaBoysLabels19;
    public javax.swing.JLabel nanaBoysLabels2;
    public javax.swing.JLabel nanaBoysLabels20;
    public javax.swing.JLabel nanaBoysLabels21;
    public javax.swing.JLabel nanaBoysLabels22;
    public javax.swing.JLabel nanaBoysLabels23;
    public javax.swing.JLabel nanaBoysLabels24;
    public javax.swing.JLabel nanaBoysLabels25;
    public javax.swing.JLabel nanaBoysLabels26;
    public javax.swing.JLabel nanaBoysLabels27;
    public javax.swing.JLabel nanaBoysLabels28;
    public javax.swing.JLabel nanaBoysLabels29;
    public javax.swing.JLabel nanaBoysLabels3;
    public javax.swing.JLabel nanaBoysLabels30;
    public javax.swing.JLabel nanaBoysLabels31;
    public javax.swing.JLabel nanaBoysLabels32;
    public javax.swing.JLabel nanaBoysLabels33;
    public javax.swing.JLabel nanaBoysLabels34;
    public javax.swing.JLabel nanaBoysLabels35;
    public javax.swing.JLabel nanaBoysLabels36;
    public javax.swing.JLabel nanaBoysLabels37;
    public javax.swing.JLabel nanaBoysLabels38;
    public javax.swing.JLabel nanaBoysLabels39;
    public javax.swing.JLabel nanaBoysLabels4;
    public javax.swing.JLabel nanaBoysLabels40;
    public javax.swing.JLabel nanaBoysLabels41;
    public javax.swing.JLabel nanaBoysLabels42;
    public javax.swing.JLabel nanaBoysLabels43;
    public javax.swing.JLabel nanaBoysLabels44;
    public javax.swing.JLabel nanaBoysLabels45;
    public javax.swing.JLabel nanaBoysLabels46;
    public javax.swing.JLabel nanaBoysLabels47;
    public javax.swing.JLabel nanaBoysLabels48;
    public javax.swing.JLabel nanaBoysLabels49;
    public javax.swing.JLabel nanaBoysLabels5;
    public javax.swing.JLabel nanaBoysLabels50;
    public javax.swing.JLabel nanaBoysLabels51;
    public javax.swing.JLabel nanaBoysLabels52;
    public javax.swing.JLabel nanaBoysLabels53;
    public javax.swing.JLabel nanaBoysLabels54;
    public javax.swing.JLabel nanaBoysLabels55;
    public javax.swing.JLabel nanaBoysLabels56;
    public javax.swing.JLabel nanaBoysLabels57;
    public javax.swing.JLabel nanaBoysLabels58;
    public javax.swing.JLabel nanaBoysLabels59;
    public javax.swing.JLabel nanaBoysLabels6;
    public javax.swing.JLabel nanaBoysLabels60;
    public javax.swing.JLabel nanaBoysLabels61;
    public javax.swing.JLabel nanaBoysLabels62;
    public javax.swing.JLabel nanaBoysLabels7;
    public javax.swing.JLabel nanaBoysLabels8;
    public javax.swing.JLabel nanaBoysLabels9;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration                   
  
//SimpleDrawCanvasWithFiles o = new SimpleDrawCanvasWithFiles();

 //add("Center",canvas);
}



   


