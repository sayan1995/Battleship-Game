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

public class NewJFrame extends javax.swing.JFrame implements MouseListener, MouseMotionListener {
static ShipClient board = new ShipClient(); 

 int Mhits=0;
    int Mguesses=0;
    int Msunk=0;
    int Nhits=0;
    int Nsunk=0;
    
   int Nguesses=0;
 static NewJFrame frame1 = new NewJFrame();
 static NewJFrame frame2 = new NewJFrame();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        //initComponents();
        //initComponents2();
       // o= new NewJFrame();
        f=false;
        f1=false;
        f2=false;
        F=false;
        
        F1=false;
        F2=false;
      
     //   foo();
    }
   /* public NewJFrame() {
        initComponents2();
        //initComponents2();
       // o= new NewJFrame();
        f=false;
        f1=false;
        f2=false;
     //   foo();
    }*/

   /* public NewJFrame2(){
    initComponents2();
    f=false;
    f1=false;
    f2=false;
    }*/
  boolean f;boolean F,F1,F2;
       int startX, startY;  // When the user presses the mouse button, the
                        //   location of the mouse is stored in these variables.
   int prevX, prevY;    // The most recent mouse location; a rubber band line has
                        //    been drawn from (startX, startY) to (prevX, prevY).
                        
   boolean dragging = false;  // For safety, this variable is set to true while a
                              // drag operation is in progress.
         boolean f1,f2;                     
   Graphics gc;  // While dragging, gc is a graphics context that can be used to 
                 // draw to the canvas.  

NewJFrame o2;
NewJFrame o1;
NewJFrame o;
 void foo()
 {
   int currentColorIndex = 0;
   int    currentBackgroundIndex = 12;
    
      addMouseListener(this);
      addMouseMotionListener(this);
}
 void foo2()
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
       board.minion.build(1);
       board.minion.build(2);
       board.minion.build(3);
       f=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.minion.build(8);
      board.minion.build(9);
      board.minion.build(10);
      f=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.minion.build(1+7+7);
      board.minion.build(2+7+7);
      board.minion.build(17);
      f=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.minion.build(1+7+7+7);
     board.minion.build(23);
     board.minion.build(24);
     f=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.minion.build(1+7+7+7+7);
      board.minion.build(30);
      board.minion.build(31);
      f=false;}
      
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.minion.build(1+7+7+7+7+7);
     board.minion.build(37);
     board.minion.build(38);
     f=false;}
      
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
      board.minion.build(1+7+7+7+7+7+7);
      board.minion.build(44);
      board.minion.build(45);
      f=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=407) && (endX<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.minion.build(1);
     board.minion.build(8);
     board.minion.build(15);
     
      f=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=301) && (endX<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.minion.build(2);
     board.minion.build(9);
     board.minion.build(16);
      f=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.minion.build(3);
     board.minion.build(10);
     board.minion.build(17);
     f=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.minion.build(4);
     board.minion.build(11);
     board.minion.build(18);
     f=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     
         board.minion.build(5);
         board.minion.build(12);
         board.minion.build(19);
         f=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.minion.build(6);
     board.minion.build(13);
     board.minion.build(13+7);
     f=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.minion.build(7);
     board.minion.build(14);
     board.minion.build(21);
     f=false;}
      

     /* if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f=false;}*/
    }
   }
    else if(f==false && f1==true && f2==false)
     {
     //X positions check!
     if((Math.abs(endY-startY))<=27)
     {
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=68) && (endY<=90)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.general.build(1);
      board.general.build(2);
      board.general.build(3);
      board.general.build(4);
       f1=false;}
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.general.build(1+7);
      board.general.build(2+7);
      board.general.build(3+7);
      board.general.build(4+7);
      
      f1=false;}
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.general.build(1+7+7);
     board.general.build(2+7+7);
     board.general.build(3+7+7);
      board.general.build(4+7+7);
      f1=false;}
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.general.build(1+7+7+7);
      board.general.build(2+7+7+7);
      board.general.build(3+7+7+7);
      board.general.build(4+7+7+7);
      f1=false;}
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.general.build(1+7+7+14);
      board.general.build(2+7+7+14);
      board.general.build(3+7+7+14);
      board.general.build(4+7+7+14);
      f1=false;}
      
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.general.build(1+7+7+21);
      board.general.build(2+7+7+21);
      board.general.build(3+7+7+21);
      board.general.build(4+7+7+21);
     f1=false;}
      
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
       board.general.build(1+7+7+28);
      board.general.build(2+7+7+28);
      board.general.build(3+7+7+28);
      board.general.build(4+7+7+28);
      f1=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192) && (((Math.abs(endY-startY)))<=192)&& ((startX>=407) && (endX<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general.build(1);
      board.general.build(1+7);
      board.general.build(1+7+7);
      board.general.build(1+7+7+7);
          f1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=301) && (endY<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general.build(2);
      board.general.build(2+7);
      board.general.build(2+7+7);
      board.general.build(2+7+7+7);
          f1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general.build(3);
      board.general.build(3+7);
      board.general.build(3+7+7);
      board.general.build(3+7+7+7);
          f1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general.build(4);
      board.general.build(4+7);
      board.general.build(4+7+7);
      board.general.build(4+7+7+7);
          f1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general.build(5);
      board.general.build(5+7);
      board.general.build(5+7+7);
      board.general.build(5+7+7+7);
          f1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general.build(6);
      board.general.build(6+7);
      board.general.build(6+7+7);
      board.general.build(6+7+7+7);
          f1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general.build(7);
      board.general.build(7+7);
      board.general.build(7+7+7);
      board.general.build(7+7+7+7);
          f1=false;}
      

      /*if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f1=false;}*/
    }
   }
    else if(f==false && f1==false && f2==true)
     {
     //X positions check!
     if((Math.abs(endY-startY))<=27)
     {
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=68) && (endY<=90)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.emperor.build(1);
       board.emperor.build(2);
       board.emperor.build(3);
       board.emperor.build(4);
       board.emperor.build(5);
       
        f2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.emperor.build(1+7);
       board.emperor.build(2+7);
       board.emperor.build(3+7);
       board.emperor.build(4+7);
       board.emperor.build(5+7);
          f2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.emperor.build(1+14);
       board.emperor.build(2+14);
       board.emperor.build(3+14);
       board.emperor.build(4+14);
       board.emperor.build(5+14);
          f2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.emperor.build(1+21);
       board.emperor.build(2+21);
       board.emperor.build(3+21);
       board.emperor.build(4+21);
       board.emperor.build(5+21);
          f2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.emperor.build(1+28);
       board.emperor.build(2+28);
       board.emperor.build(3+28);
       board.emperor.build(4+28);
       board.emperor.build(5+28);
          f2=false;}
      
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.emperor.build(1+35);
       board.emperor.build(2+35);
       board.emperor.build(3+35);
       board.emperor.build(4+35);
       board.emperor.build(5+35);
          f2=false;}
      
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
      board.emperor.build(1+42);
       board.emperor.build(2+42);
       board.emperor.build(3+42);
       board.emperor.build(4+42);
       board.emperor.build(5+42);
          f2=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=407) && (endX<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor.build(1);
       board.emperor.build(1+7);
       board.emperor.build(1+14);
       board.emperor.build(1+21);
       board.emperor.build(1+28);
          f2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=301) && (endX<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor.build(2);
       board.emperor.build(2+7);
       board.emperor.build(2+14);
       board.emperor.build(2+21);
       board.emperor.build(2+28);
         
          f2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor.build(3);
       board.emperor.build(3+7);
       board.emperor.build(3+14);
       board.emperor.build(3+21);
       board.emperor.build(3+28);
         
          f2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor.build(4);
       board.emperor.build(4+7);
       board.emperor.build(4+14);
       board.emperor.build(4+21);
       board.emperor.build(4+28);
         
          f2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor.build(5);
       board.emperor.build(5+7);
       board.emperor.build(5+14);
       board.emperor.build(5+21);
       board.emperor.build(5+28);
         
          f2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor.build(6);
       board.emperor.build(6+7);
       board.emperor.build(6+14);
       board.emperor.build(6+21);
       board.emperor.build(6+28);
         
          f2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor.build(7);
       board.emperor.build(7+7);
       board.emperor.build(7+14);
       board.emperor.build(7+21);
       board.emperor.build(7+28);
         
          f2=false;}
      
      if(F==true && F1==false && F2==false)
     {
     //X positions check!
     if((Math.abs(endY-startY))<=27)
     {
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=68) && (endY<=90)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.minion2.build(1);
       board.minion2.build(2);
       board.minion2.build(3);
       F=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.minion2.build(8);
      board.minion2.build(9);
      board.minion2.build(10);
      F=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.minion2.build(1+7+7);
      board.minion2.build(2+7+7);
      board.minion2.build(17);
      F=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.minion2.build(1+7+7+7);
     board.minion2.build(23);
     board.minion2.build(24);
     F=false;}
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.minion2.build(1+7+7+7+7);
      board.minion2.build(30);
      board.minion2.build(31);
      F=false;}
      
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.minion2.build(1+7+7+7+7+7);
     board.minion2.build(37);
     board.minion2.build(38);
     F=false;}
      
      if((((Math.abs(endX-startX)))>=98) && (((Math.abs(endX-startX)))<=136)&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
      board.minion2.build(1+7+7+7+7+7+7);
      board.minion2.build(44);
      board.minion2.build(45);
      F=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=407) && (endX<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.minion2.build(1);
     board.minion2.build(8);
     board.minion2.build(15);
     
      F=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=301) && (endX<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.minion2.build(2);
     board.minion2.build(9);
     board.minion2.build(16);
      F=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.minion2.build(3);
     board.minion2.build(10);
     board.minion2.build(17);
     F=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.minion2.build(4);
     board.minion2.build(11);
     board.minion2.build(18);
     F=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     
         board.minion2.build(5);
         board.minion2.build(12);
         board.minion2.build(19);
         F=false;}
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.minion2.build(6);
     board.minion2.build(13);
     board.minion2.build(13+7);
     F=false;}
      
      if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.minion2.build(7);
     board.minion2.build(14);
     board.minion2.build(21);
     F=false;}
      

     /* if((((Math.abs(endY-startY)))>=98) && (((Math.abs(endY-startY)))<=136)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     F=false;}*/
    }
   }
    else if(F==false && F1==true && F2==false)
     {
     //X positions check!
     if((Math.abs(endY-startY))<=27)
     {
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=68) && (endY<=90)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.general2.build(1);
      board.general2.build(2);
      board.general2.build(3);
      board.general2.build(4);
       F1=false;}
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.general2.build(1+7);
      board.general2.build(2+7);
      board.general2.build(3+7);
      board.general2.build(4+7);
      
      F1=false;}
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.general2.build(1+7+7);
     board.general2.build(2+7+7);
     board.general2.build(3+7+7);
      board.general2.build(4+7+7);
      F1=false;}
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.general2.build(1+7+7+7);
      board.general2.build(2+7+7+7);
      board.general2.build(3+7+7+7);
      board.general2.build(4+7+7+7);
      F1=false;}
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.general2.build(1+7+7+14);
      board.general2.build(2+7+7+14);
      board.general2.build(3+7+7+14);
      board.general2.build(4+7+7+14);
      F1=false;}
      
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.general2.build(1+7+7+21);
      board.general2.build(2+7+7+21);
      board.general2.build(3+7+7+21);
      board.general2.build(4+7+7+21);
     F1=false;}
      
      if((((Math.abs(endX-startX)))>=136)&&( ((Math.abs(endX-startX)))<=174 )&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
       board.general2.build(1+7+7+28);
      board.general2.build(2+7+7+28);
      board.general2.build(3+7+7+28);
      board.general2.build(4+7+7+28);
      F1=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192) && (((Math.abs(endY-startY)))<=192)&& ((startX>=407) && (endX<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general2.build(1);
      board.general2.build(1+7);
      board.general2.build(1+7+7);
      board.general2.build(1+7+7+7);
          F1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=301) && (endY<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general2.build(2);
      board.general2.build(2+7);
      board.general2.build(2+7+7);
      board.general2.build(2+7+7+7);
          F1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general2.build(3);
      board.general2.build(3+7);
      board.general2.build(3+7+7);
      board.general2.build(3+7+7+7);
          F1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general2.build(4);
      board.general2.build(4+7);
      board.general2.build(4+7+7);
      board.general2.build(4+7+7+7);
          F1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general2.build(5);
      board.general2.build(5+7);
      board.general2.build(5+7+7);
      board.general2.build(5+7+7+7);
          F1=false;}
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general2.build(6);
      board.general2.build(6+7);
      board.general2.build(6+7+7);
      board.general2.build(6+7+7+7);
          F1=false;}
      
      if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
       board.general2.build(7);
      board.general2.build(7+7);
      board.general2.build(7+7+7);
      board.general2.build(7+7+7+7);
          F1=false;}
      

      /*if((((Math.abs(endY-startY)))>=143) && (((Math.abs(endY-startY)))<=192)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     F1=false;}*/
    }
   }
    else if(F==false && F1==false && F2==true)
     {
     //X positions check!
     if((Math.abs(endY-startY))<=27)
     {
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=68) && (endY<=90)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
       board.emperor2.build(1);
       board.emperor2.build(2);
       board.emperor2.build(3);
       board.emperor2.build(4);
       board.emperor2.build(5);
       
        F2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=109) && (endY<=132)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.emperor2.build(1+7);
       board.emperor2.build(2+7);
       board.emperor2.build(3+7);
       board.emperor2.build(4+7);
       board.emperor2.build(5+7);
          F2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=151) && (endY<=173)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.emperor2.build(1+14);
       board.emperor2.build(2+14);
       board.emperor2.build(3+14);
       board.emperor2.build(4+14);
       board.emperor2.build(5+14);
          F2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=192) && (endY<=215)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.emperor2.build(1+21);
       board.emperor2.build(2+21);
       board.emperor2.build(3+21);
       board.emperor2.build(4+21);
       board.emperor2.build(5+21);
          F2=false;}
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=232) && (endY<=252)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
      board.emperor2.build(1+28);
       board.emperor2.build(2+28);
       board.emperor2.build(3+28);
       board.emperor2.build(4+28);
       board.emperor2.build(5+28);
          F2=false;}
      
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=277) && (endY<=295)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     board.emperor2.build(1+35);
       board.emperor2.build(2+35);
       board.emperor2.build(3+35);
       board.emperor2.build(4+35);
       board.emperor2.build(5+35);
          F2=false;}
      
      if((((Math.abs(endX-startX)))>=195) && (((Math.abs(endX-startX)))<=262)&& ((startY>=317) && (endY<=337)))
      {gc.drawLine(startX, startY, endX, endY);
      board.emperor2.build(1+42);
       board.emperor2.build(2+42);
       board.emperor2.build(3+42);
       board.emperor2.build(4+42);
       board.emperor2.build(5+42);
          F2=false;}  // Draw 
     //if(((Math.abs(endX-startX)))<=132 && y=121)
     
     }
    
     //Y
     else if((Math.abs(endX-startX))<=26)
     {
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=407) && (endX<=433)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor2.build(1);
       board.emperor2.build(1+7);
       board.emperor2.build(1+14);
       board.emperor2.build(1+21);
       board.emperor2.build(1+28);
          F2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=301) && (endX<=315)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor2.build(2);
       board.emperor2.build(2+7);
       board.emperor2.build(2+14);
       board.emperor2.build(2+21);
       board.emperor2.build(2+28);
         
          F2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=449) && (endX<=474)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor2.build(3);
       board.emperor2.build(3+7);
       board.emperor2.build(3+14);
       board.emperor2.build(3+21);
       board.emperor2.build(3+28);
         
          F2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=489) && (endX<=516)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor2.build(4);
       board.emperor2.build(4+7);
       board.emperor2.build(4+14);
       board.emperor2.build(4+21);
       board.emperor2.build(4+28);
         
          F2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=576) && (endX<=580)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor2.build(5);
       board.emperor2.build(5+7);
       board.emperor2.build(5+14);
       board.emperor2.build(5+21);
       board.emperor2.build(5+28);
         
          F2=false;}
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=599) && (endX<=617)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor2.build(6);
       board.emperor2.build(6+7);
       board.emperor2.build(6+14);
       board.emperor2.build(6+21);
       board.emperor2.build(6+28);
         
          F2=false;}
      
      if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=644) && (endX<=659)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
      board.emperor2.build(7);
       board.emperor2.build(7+7);
       board.emperor2.build(7+14);
       board.emperor2.build(7+21);
       board.emperor2.build(7+28);
         
          F2=false;}
      

      /*if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     F2=false;}*/
    }
   }
  
    // System.out.println(startX + " "+startY+" "+endX+ " "+ endY);
      /*gc.dispose();  // Free the graphics context, now that the draw operation is over.
   
   } // end mouseReleased*/

   // Required by the MouseMotionListener interFace.

      /*if((((Math.abs(endY-startY)))>=183) && (((Math.abs(endY-startY)))<=261)&& ((startX>=656) && (endX<=685)))
      {gc.drawLine(startX, startY, endX, endY);  // Draw 
     f2=false;}*/
    }
   }
  
     //System.out.println(startX + " "+startY+" "+endX+ " "+ endY);
      gc.dispose();  // Free the graphics context, now that the draw operation is over.
   
   } // end mouseReleased

    public void mouseClicked(MouseEvent evt) { }  // Other methods in the MouseListener interFace
   public void mouseEntered(MouseEvent evt) { }
   public void mouseExited(MouseEvent evt) { }
   public void mouseMoved(MouseEvent evt) { } 
  
      
    /**
    
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    
    public void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
       // jLabel63= new javax.swing.JLabel();
        //jLabel64= new javax.swing.JLabel();
        //jLabel65= new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BattleShip Beta (DSJ Mini Project) ---- USER 1");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enemy Water");

        jButton2.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton2.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton2.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton3.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton3.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton4.setToolTipText("");
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton4.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton4.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton5.setToolTipText("");
        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton5.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton5.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton5.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton6.setToolTipText("");
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton6.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton6.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton6.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton7.setToolTipText("");
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton7.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton7.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton7.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton8.setToolTipText("");
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton8.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton8.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton8.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton9.setToolTipText("");
        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton9.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton9.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton9.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton10.setToolTipText("");
        jButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton10.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton10.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton10.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton11.setToolTipText("");
        jButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton11.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton11.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton11.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton12.setToolTipText("");
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton12.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton12.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton12.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton13.setToolTipText("");
        jButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton13.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton13.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton13.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton14.setToolTipText("");
        jButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton14.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton14.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton14.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton15.setToolTipText("");
        jButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton15.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton15.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton15.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton16.setToolTipText("");
        jButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton16.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton16.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton16.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton17.setToolTipText("");
        jButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton17.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton17.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton17.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton18.setToolTipText("");
        jButton18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton18.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton18.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton18.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton19.setToolTipText("");
        jButton19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton19.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton19.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton19.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton20.setToolTipText("");
        jButton20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton20.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton20.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton20.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton21.setToolTipText("");
        jButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton21.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton21.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton21.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton22.setToolTipText("");
        jButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton22.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton22.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton22.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton23.setToolTipText("");
        jButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton23.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton23.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton23.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton24.setToolTipText("");
        jButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton24.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton24.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton24.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton25.setToolTipText("");
        jButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton25.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton25.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton25.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton26.setToolTipText("");
        jButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton26.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton26.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton26.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton27.setToolTipText("");
        jButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton27.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton27.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton27.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton28.setToolTipText("");
        jButton28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton28.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton28.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton28.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton29.setToolTipText("");
        jButton29.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton29.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton29.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton29.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton30.setToolTipText("");
        jButton30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton30.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton30.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton30.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton31.setToolTipText("");
        jButton31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton31.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton31.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton31.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton32.setToolTipText("");
        jButton32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton32.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton32.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton32.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton33.setToolTipText("");
        jButton33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton33.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton33.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton33.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton34.setToolTipText("");
        jButton34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton34.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton34.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton34.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton35.setToolTipText("");
        jButton35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton35.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton35.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton35.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton36.setToolTipText("");
        jButton36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton36.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton36.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton36.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton37.setToolTipText("");
        jButton37.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton37.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton37.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton37.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton38.setToolTipText("");
        jButton38.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton38.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton38.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton38.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton39.setToolTipText("");
        jButton39.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton39.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton39.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton39.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton40.setToolTipText("");
        jButton40.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton40.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton40.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton40.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton41.setToolTipText("");
        jButton41.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton41.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton41.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton41.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton42.setToolTipText("");
        jButton42.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton42.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton42.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton42.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton43.setToolTipText("");
        jButton43.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton43.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton43.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton43.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton44.setToolTipText("");
        jButton44.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton44.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton44.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton44.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton45.setToolTipText("");
        jButton45.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton45.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton45.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton45.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton46.setToolTipText("");
        jButton46.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton46.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton46.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton46.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton47.setToolTipText("");
        jButton47.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton47.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton47.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton47.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton48.setToolTipText("");
        jButton48.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton48.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton48.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton48.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton49.setToolTipText("");
        jButton49.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton49.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton49.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton49.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jButton50.setToolTipText("");
        jButton50.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton50.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton50.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton50.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jLabel2.setText(" Guesses :  ");

        jLabel4.setText("Hits: ");

        jLabel3.setText("Enemy Ships sunk : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Home Water");

        jToggleButton1.setLabel("Minion");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
                 
               }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Select A Ship ");

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


        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\patrol.gif")); // NOI18N
        jLabel7.setLabelFor(jToggleButton1);

        jLabel8.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\submarine.gif")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\battleship.gif")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel10.setToolTipText("");
        jLabel10.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel10.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel10.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel11.setToolTipText("");
        jLabel11.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel11.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel11.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel12.setToolTipText("");
        jLabel12.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel12.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel12.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel13.setToolTipText("");
        jLabel13.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel13.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel13.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel14.setToolTipText("");
        jLabel14.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel14.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel14.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel15.setToolTipText("");
        jLabel15.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel15.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel15.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel16.setToolTipText("");
        jLabel16.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel16.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel16.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel17.setToolTipText("");
        jLabel17.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel17.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel17.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel18.setToolTipText("");
        jLabel18.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel18.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel18.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel19.setToolTipText("");
        jLabel19.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel19.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel19.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel20.setToolTipText("");
        jLabel20.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel20.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel20.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel21.setToolTipText("");
        jLabel21.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel21.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel21.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel22.setToolTipText("");
        jLabel22.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel22.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel22.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel23.setToolTipText("");
        jLabel23.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel23.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel23.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel24.setToolTipText("");
        jLabel24.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel24.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel24.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel25.setToolTipText("");
        jLabel25.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel25.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel25.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel26.setToolTipText("");
        jLabel26.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel26.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel26.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel27.setToolTipText("");
        jLabel27.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel27.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel27.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel28.setToolTipText("");
        jLabel28.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel28.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel28.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel29.setToolTipText("");
        jLabel29.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel29.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel29.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel30.setToolTipText("");
        jLabel30.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel30.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel30.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel31.setToolTipText("");
        jLabel31.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel31.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel31.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel32.setToolTipText("");
        jLabel32.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel32.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel32.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel33.setToolTipText("");
        jLabel33.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel33.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel33.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel34.setToolTipText("");
        jLabel34.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel34.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel34.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel35.setToolTipText("");
        jLabel35.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel35.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel35.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel36.setToolTipText("");
        jLabel36.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel36.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel36.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel37.setToolTipText("");
        jLabel37.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel37.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel37.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel38.setToolTipText("");
        jLabel38.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel38.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel38.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel39.setToolTipText("");
        jLabel39.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel39.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel39.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel40.setToolTipText("");
        jLabel40.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel40.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel40.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel41.setToolTipText("");
        jLabel41.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel41.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel41.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel42.setToolTipText("");
        jLabel42.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel42.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel42.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel43.setToolTipText("");
        jLabel43.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel43.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel43.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel44.setToolTipText("");
        jLabel44.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel44.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel44.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel45.setToolTipText("");
        jLabel45.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel45.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel45.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel46.setToolTipText("");
        jLabel46.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel46.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel46.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel47.setToolTipText("");
        jLabel47.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel47.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel47.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel48.setToolTipText("");
        jLabel48.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel48.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel48.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel49.setToolTipText("");
        jLabel49.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel49.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel49.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel50.setToolTipText("");
        jLabel50.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel50.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel50.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel51.setToolTipText("");
        jLabel51.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel51.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel51.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel52.setToolTipText("");
        jLabel52.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel52.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel52.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel53.setToolTipText("");
        jLabel53.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel53.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel53.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel54.setToolTipText("");
        jLabel54.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel54.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel54.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel55.setToolTipText("");
        jLabel55.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel55.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel55.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel56.setToolTipText("");
        jLabel56.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel56.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel56.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel57.setToolTipText("");
        jLabel57.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel57.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel57.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        jLabel58.setToolTipText("");
        jLabel58.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel58.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel58.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel59.setText(" Hits taken : ");

        jLabel60.setText("Friendly Ships sunk : ");

        jLabel61.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel61.setText("To Place in the Water");

        jLabel62.setText("Status : ");
        jLabel62.setMaximumSize(new java.awt.Dimension(100, 14));

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
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(165, 165, 165))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(81, 81, 81))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(jLabel61)
                    .addComponent(jLabel6))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel61))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(jLabel59))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>  
    public void initComponents2() {

        nanaBoysLabel1 = new javax.swing.JLabel();
        nanaBoysButton2 = new javax.swing.JButton();
        nanaBoysButton3 = new javax.swing.JButton();
        nanaBoysButton4 = new javax.swing.JButton();
        nanaBoysButton5 = new javax.swing.JButton();
        nanaBoysButton6 = new javax.swing.JButton();
        nanaBoysButton7 = new javax.swing.JButton();
        nanaBoysButton8 = new javax.swing.JButton();
        nanaBoysButton9 = new javax.swing.JButton();
        nanaBoysButton10 = new javax.swing.JButton();
        nanaBoysButton11 = new javax.swing.JButton();
        nanaBoysButton12 = new javax.swing.JButton();
       nanaBoysButton13 = new javax.swing.JButton();
        nanaBoysButton14 = new javax.swing.JButton();
        nanaBoysButton15 = new javax.swing.JButton();
        nanaBoysButton16 = new javax.swing.JButton();
        nanaBoysButton17 = new javax.swing.JButton();
        nanaBoysButton18 = new javax.swing.JButton();
        nanaBoysButton19 = new javax.swing.JButton();
        nanaBoysButton20 = new javax.swing.JButton();
        nanaBoysButton21 = new javax.swing.JButton();
        nanaBoysButton22 = new javax.swing.JButton();
        nanaBoysButton23 = new javax.swing.JButton();
        nanaBoysButton24 = new javax.swing.JButton();
        nanaBoysButton25 = new javax.swing.JButton();
        nanaBoysButton26 = new javax.swing.JButton();
        nanaBoysButton27 = new javax.swing.JButton();
        nanaBoysButton28 = new javax.swing.JButton();
        nanaBoysButton29 = new javax.swing.JButton();
        nanaBoysButton30 = new javax.swing.JButton();
        nanaBoysButton31 = new javax.swing.JButton();
        nanaBoysButton32 = new javax.swing.JButton();
        nanaBoysButton33 = new javax.swing.JButton();
        nanaBoysButton34 = new javax.swing.JButton();
        nanaBoysButton35 = new javax.swing.JButton();
        nanaBoysButton36 = new javax.swing.JButton();
        nanaBoysButton37 = new javax.swing.JButton();
        nanaBoysButton38 = new javax.swing.JButton();
        nanaBoysButton39 = new javax.swing.JButton();
        nanaBoysButton40 = new javax.swing.JButton();
        nanaBoysButton41 = new javax.swing.JButton();
        nanaBoysButton42 = new javax.swing.JButton();
        nanaBoysButton43 = new javax.swing.JButton();
        nanaBoysButton44 = new javax.swing.JButton();
        nanaBoysButton45 = new javax.swing.JButton();
        nanaBoysButton46 = new javax.swing.JButton();
        nanaBoysButton47 = new javax.swing.JButton();
        nanaBoysButton48 = new javax.swing.JButton();
        nanaBoysButton49 = new javax.swing.JButton();
        nanaBoysButton50 = new javax.swing.JButton();
        nanaBoysLabel2 = new javax.swing.JLabel();
        nanaBoysLabel4 = new javax.swing.JLabel();
        nanaBoysLabel3 = new javax.swing.JLabel();
        nanaBoysLabel5 = new javax.swing.JLabel();
        nanaToggleButton1 = new javax.swing.JToggleButton();
        nanaBoysLabel6 = new javax.swing.JLabel();
        nanaToggleButton2 = new javax.swing.JToggleButton();
        nanaToggleButton3 = new javax.swing.JToggleButton();
        nanaBoysLabel7 = new javax.swing.JLabel();
        nanaBoysLabel8 = new javax.swing.JLabel();
        nanaBoysLabel9 = new javax.swing.JLabel();
        nanaBoysLabel10 = new javax.swing.JLabel();
        nanaBoysLabel11 = new javax.swing.JLabel();
        nanaBoysLabel12 = new javax.swing.JLabel();
        nanaBoysLabel13 = new javax.swing.JLabel();
        nanaBoysLabel14 = new javax.swing.JLabel();
        nanaBoysLabel15 = new javax.swing.JLabel();
        nanaBoysLabel16 = new javax.swing.JLabel();
        nanaBoysLabel17 = new javax.swing.JLabel();
        nanaBoysLabel18 = new javax.swing.JLabel();
        nanaBoysLabel19 = new javax.swing.JLabel();
        nanaBoysLabel20 = new javax.swing.JLabel();
        nanaBoysLabel21 = new javax.swing.JLabel();
        nanaBoysLabel22 = new javax.swing.JLabel();
        nanaBoysLabel23 = new javax.swing.JLabel();
        nanaBoysLabel24 = new javax.swing.JLabel();
        nanaBoysLabel25 = new javax.swing.JLabel();
        nanaBoysLabel26 = new javax.swing.JLabel();
        nanaBoysLabel27 = new javax.swing.JLabel();
        nanaBoysLabel28 = new javax.swing.JLabel();
        nanaBoysLabel29 = new javax.swing.JLabel();
        nanaBoysLabel30 = new javax.swing.JLabel();
        nanaBoysLabel31 = new javax.swing.JLabel();
        nanaBoysLabel32 = new javax.swing.JLabel();
        nanaBoysLabel33 = new javax.swing.JLabel();
        nanaBoysLabel34 = new javax.swing.JLabel();
        nanaBoysLabel35 = new javax.swing.JLabel();
        nanaBoysLabel36 = new javax.swing.JLabel();
        nanaBoysLabel37 = new javax.swing.JLabel();
        nanaBoysLabel38 = new javax.swing.JLabel();
        nanaBoysLabel39 = new javax.swing.JLabel();
        nanaBoysLabel40 = new javax.swing.JLabel();
        nanaBoysLabel41 = new javax.swing.JLabel();
        nanaBoysLabel42 = new javax.swing.JLabel();
        nanaBoysLabel43 = new javax.swing.JLabel();
        nanaBoysLabel44 = new javax.swing.JLabel();
        nanaBoysLabel45 = new javax.swing.JLabel();
        nanaBoysLabel46 = new javax.swing.JLabel();
        nanaBoysLabel47 = new javax.swing.JLabel();
        nanaBoysLabel48 = new javax.swing.JLabel();
        nanaBoysLabel49 = new javax.swing.JLabel();
        nanaBoysLabel50 = new javax.swing.JLabel();
        nanaBoysLabel51 = new javax.swing.JLabel();
        nanaBoysLabel52 = new javax.swing.JLabel();
        nanaBoysLabel53 = new javax.swing.JLabel();
        nanaBoysLabel54 = new javax.swing.JLabel();
        nanaBoysLabel55 = new javax.swing.JLabel();
        nanaBoysLabel56 = new javax.swing.JLabel();
        nanaBoysLabel57 = new javax.swing.JLabel();
        nanaBoysLabel58 = new javax.swing.JLabel();
        nanaBoysLabel59 = new javax.swing.JLabel();
        nanaBoysLabel60 = new javax.swing.JLabel();
        nanaBoysLabel61 = new javax.swing.JLabel();
        nanaBoysLabel62 = new javax.swing.JLabel();
       // nanaBoysLabel63= new javax.swing.JLabel();
        //nanaBoysLabel64= new javax.swing.JLabel();
        //nanaBoysLabel65= new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BattleShip Beta (DSJ Mini Project) ---- USER 2");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        nanaBoysLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nanaBoysLabel1.setText("Enemy Water");

        nanaBoysButton2.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton2.setToolTipText("");
        nanaBoysButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton2.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton2.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton2.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton2ActionPerformed(evt);
            }
        });

        nanaBoysButton3.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton3.setToolTipText("");
        nanaBoysButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton3.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton3.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton3.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton3ActionPerformed(evt);
            }
        });

        nanaBoysButton4.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton4.setToolTipText("");
        nanaBoysButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton4.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton4.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton4.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton4ActionPerformed(evt);
            }
        });

        nanaBoysButton5.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton5.setToolTipText("");
        nanaBoysButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton5.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton5.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton5.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton5ActionPerformed(evt);
            }
        });

        nanaBoysButton6.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton6.setToolTipText("");
        nanaBoysButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton6.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton6.setMinimumSize(new java.awt.Dimension(36, 36));
       nanaBoysButton6.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton6ActionPerformed(evt);
            }
        });

        nanaBoysButton7.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton7.setToolTipText("");
        nanaBoysButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton7.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton7.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton7.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton7ActionPerformed(evt);
            }
        });

        nanaBoysButton8.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton8.setToolTipText("");
       nanaBoysButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton8.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton8.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton8.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton8ActionPerformed(evt);
            }
        });

        nanaBoysButton9.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton9.setToolTipText("");
        nanaBoysButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton9.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton9.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton9.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton9ActionPerformed(evt);
            }
        });

        nanaBoysButton10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton10.setToolTipText("");
        nanaBoysButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton10.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton10.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton10.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton10ActionPerformed(evt);
            }
        });

        nanaBoysButton11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton11.setToolTipText("");
        nanaBoysButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton11.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton11.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton11.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton11ActionPerformed(evt);
            }
        });

        nanaBoysButton12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton12.setToolTipText("");
        nanaBoysButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton12.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton12.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton12.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton12ActionPerformed(evt);
            }
        });

        nanaBoysButton13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton13.setToolTipText("");
        nanaBoysButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
       nanaBoysButton13.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton13.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton13.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton13ActionPerformed(evt);
            }
        });

        nanaBoysButton14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton14.setToolTipText("");
        nanaBoysButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton14.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton14.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton14.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton14ActionPerformed(evt);
            }
        });

        nanaBoysButton15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton15.setToolTipText("");
        nanaBoysButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton15.setMaximumSize(new java.awt.Dimension(36, 36));
       nanaBoysButton15.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton15.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton15ActionPerformed(evt);
            }
        });

        nanaBoysButton16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton16.setToolTipText("");
        nanaBoysButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton16.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton16.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton16.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton16ActionPerformed(evt);
            }
        });

        nanaBoysButton17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton17.setToolTipText("");
        nanaBoysButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton17.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton17.setMinimumSize(new java.awt.Dimension(36, 36));
       nanaBoysButton17.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton17ActionPerformed(evt);
            }
        });

        nanaBoysButton18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton18.setToolTipText("");
        nanaBoysButton18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton18.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton18.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton18.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton18ActionPerformed(evt);
            }
        });

        nanaBoysButton19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton19.setToolTipText("");
        nanaBoysButton19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton19.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton19.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton19.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton19ActionPerformed(evt);
            }
        });

        nanaBoysButton20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton20.setToolTipText("");
        nanaBoysButton20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton20.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton20.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton20.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               nanaBoysButton20ActionPerformed(evt);
            }
        });

        nanaBoysButton21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton21.setToolTipText("");
        nanaBoysButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton21.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton21.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton21.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton21ActionPerformed(evt);
            }
        });

        nanaBoysButton22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton22.setToolTipText("");
        nanaBoysButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton22.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton22.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton22.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton22ActionPerformed(evt);
            }
        });

        nanaBoysButton23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton23.setToolTipText("");
        nanaBoysButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton23.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton23.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton23.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton23ActionPerformed(evt);
            }
        });

        nanaBoysButton24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton24.setToolTipText("");
        nanaBoysButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton24.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton24.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton24.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton24ActionPerformed(evt);
            }
        });

        nanaBoysButton25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton25.setToolTipText("");
        nanaBoysButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton25.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton25.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton25.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton25ActionPerformed(evt);
            }
        });

        nanaBoysButton26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton26.setToolTipText("");
        nanaBoysButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
       nanaBoysButton26.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton26.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton26.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton26ActionPerformed(evt);
            }
        });

        nanaBoysButton27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton27.setToolTipText("");
        nanaBoysButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton27.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton27.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton27.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton27ActionPerformed(evt);
            }
        });

        nanaBoysButton28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton28.setToolTipText("");
        nanaBoysButton28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton28.setMaximumSize(new java.awt.Dimension(36, 36));
       nanaBoysButton28.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton28.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton28ActionPerformed(evt);
            }
        });

        nanaBoysButton29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton29.setToolTipText("");
        nanaBoysButton29.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton29.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton29.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton29.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton29ActionPerformed(evt);
            }
        });

        nanaBoysButton30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton30.setToolTipText("");
        nanaBoysButton30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton30.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton30.setMinimumSize(new java.awt.Dimension(36, 36));
       nanaBoysButton30.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton30ActionPerformed(evt);
            }
        });

        nanaBoysButton31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton31.setToolTipText("");
        nanaBoysButton31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton31.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton31.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton31.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton31ActionPerformed(evt);
            }
        });

        nanaBoysButton32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton32.setToolTipText("");
        nanaBoysButton32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton32.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton32.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton32.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton32ActionPerformed(evt);
            }
        });

        nanaBoysButton33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton33.setToolTipText("");
        nanaBoysButton33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton33.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton33.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton33.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               nanaBoysButton33ActionPerformed(evt);
            }
        });

        nanaBoysButton34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton34.setToolTipText("");
        nanaBoysButton34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton34.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton34.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton34.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton34ActionPerformed(evt);
            }
        });

        nanaBoysButton35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton35.setToolTipText("");
        nanaBoysButton35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton35.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton35.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton35.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton35ActionPerformed(evt);
            }
        });

        nanaBoysButton36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton36.setToolTipText("");
        nanaBoysButton36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton36.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton36.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton36.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton36ActionPerformed(evt);
            }
        });

        nanaBoysButton37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton37.setToolTipText("");
        nanaBoysButton37.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton37.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton37.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton37.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton37ActionPerformed(evt);
            }
        });

        nanaBoysButton38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton38.setToolTipText("");
        nanaBoysButton38.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton38.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton38.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton38.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton38ActionPerformed(evt);
            }
        });

        nanaBoysButton39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton39.setToolTipText("");
        nanaBoysButton39.setMargin(new java.awt.Insets(0, 0, 0, 0));
       nanaBoysButton39.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton39.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton39.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton39ActionPerformed(evt);
            }
        });

        nanaBoysButton40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton40.setToolTipText("");
        nanaBoysButton40.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton40.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton40.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton40.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton40ActionPerformed(evt);
            }
        });

        nanaBoysButton41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton41.setToolTipText("");
        nanaBoysButton41.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton41.setMaximumSize(new java.awt.Dimension(36, 36));
       nanaBoysButton41.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton41.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton41ActionPerformed(evt);
            }
        });

        nanaBoysButton42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton42.setToolTipText("");
        nanaBoysButton42.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton42.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton42.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton42.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton42ActionPerformed(evt);
            }
        });

        nanaBoysButton43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton43.setToolTipText("");
        nanaBoysButton43.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton43.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton43.setMinimumSize(new java.awt.Dimension(36, 36));
       nanaBoysButton43.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton43ActionPerformed(evt);
            }
        });

        nanaBoysButton44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton44.setToolTipText("");
        nanaBoysButton44.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton44.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton44.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton44.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton44ActionPerformed(evt);
            }
        });

        nanaBoysButton45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton45.setToolTipText("");
        nanaBoysButton45.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton45.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton45.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton45.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton45ActionPerformed(evt);
            }
        });

        nanaBoysButton46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton46.setToolTipText("");
        nanaBoysButton46.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton46.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton46.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton46.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               nanaBoysButton46ActionPerformed(evt);
            }
        });

        nanaBoysButton47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton47.setToolTipText("");
        nanaBoysButton47.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton47.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton47.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton47.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton47ActionPerformed(evt);
            }
        });

        nanaBoysButton48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton48.setToolTipText("");
        nanaBoysButton48.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton48.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton48.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton48.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton48ActionPerformed(evt);
            }
        });

        nanaBoysButton49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton49.setToolTipText("");
        nanaBoysButton49.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton49.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton49.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton49.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton49ActionPerformed(evt);
            }
        });

        nanaBoysButton50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysButton50.setToolTipText("");
        nanaBoysButton50.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nanaBoysButton50.setMaximumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton50.setMinimumSize(new java.awt.Dimension(36, 36));
        nanaBoysButton50.setPreferredSize(new java.awt.Dimension(24, 24));
        nanaBoysButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaBoysButton50ActionPerformed(evt);
            }
        });

        nanaBoysLabel2.setText(" Guesses :  ");

        nanaBoysLabel4.setText("Hits: ");

        nanaBoysLabel3.setText("Enemy Ships sunk : ");

        nanaBoysLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nanaBoysLabel5.setText("Home Water");

        nanaToggleButton1.setLabel("Minion");
        nanaToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaToggleButton1ActionPerformed(evt);
                 
               }
        });

        nanaBoysLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nanaBoysLabel6.setText("Select A Ship ");

        nanaToggleButton2.setText("General");
         nanaToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaToggleButton2ActionPerformed(evt);
                 
            }
        });


        nanaToggleButton3.setText("Emperor");
            nanaToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaToggleButton3ActionPerformed(evt);
               
            }
        });


        nanaBoysLabel7.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\patrol.gif")); // NOI18N
        nanaBoysLabel7.setLabelFor(nanaToggleButton1);

        nanaBoysLabel8.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\submarine.gif")); // NOI18N

        nanaBoysLabel9.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\battleship.gif")); // NOI18N

        nanaBoysLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel10.setToolTipText("");
        nanaBoysLabel10.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel10.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel10.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel11.setToolTipText("");
        nanaBoysLabel11.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel11.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel11.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel12.setToolTipText("");
        nanaBoysLabel12.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel12.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel12.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel13.setToolTipText("");
        nanaBoysLabel13.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel13.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel13.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel14.setToolTipText("");
        nanaBoysLabel14.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel14.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel14.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel15.setToolTipText("");
        nanaBoysLabel15.setMaximumSize(new java.awt.Dimension(24, 24));
       nanaBoysLabel15.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel15.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel16.setToolTipText("");
        nanaBoysLabel16.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel16.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel16.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel17.setToolTipText("");
        nanaBoysLabel17.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel17.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel17.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel18.setToolTipText("");
        nanaBoysLabel18.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel18.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel18.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel19.setToolTipText("");
        nanaBoysLabel19.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel19.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel19.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel20.setToolTipText("");
        nanaBoysLabel20.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel20.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel20.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel21.setToolTipText("");
        nanaBoysLabel21.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel21.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel21.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel22.setToolTipText("");
        nanaBoysLabel22.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel22.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel22.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel23.setToolTipText("");
        nanaBoysLabel23.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel23.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel23.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel24.setToolTipText("");
        nanaBoysLabel24.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel24.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel24.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel25.setToolTipText("");
        nanaBoysLabel25.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel25.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel25.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel26.setToolTipText("");
        nanaBoysLabel26.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel26.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel26.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel27.setToolTipText("");
        nanaBoysLabel27.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel27.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel27.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel28.setToolTipText("");
        nanaBoysLabel28.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel28.setMinimumSize(new java.awt.Dimension(24, 24));
       nanaBoysLabel28.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel29.setToolTipText("");
        nanaBoysLabel29.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel29.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel29.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel30.setToolTipText("");
        nanaBoysLabel30.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel30.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel30.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel31.setToolTipText("");
        nanaBoysLabel31.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel31.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel31.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel32.setToolTipText("");
        nanaBoysLabel32.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel32.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel32.setPreferredSize(new java.awt.Dimension(36, 36));

       nanaBoysLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel33.setToolTipText("");
        nanaBoysLabel33.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel33.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel33.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel34.setToolTipText("");
        nanaBoysLabel34.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel34.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel34.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel35.setToolTipText("");
        nanaBoysLabel35.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel35.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel35.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel36.setToolTipText("");
        nanaBoysLabel36.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel36.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel36.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel37.setToolTipText("");
        nanaBoysLabel37.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel37.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel37.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel38.setToolTipText("");
        nanaBoysLabel38.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel38.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel38.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel39.setToolTipText("");
        nanaBoysLabel39.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel39.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel39.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel40.setToolTipText("");
        nanaBoysLabel40.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel40.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel40.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel41.setToolTipText("");
       nanaBoysLabel41.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel41.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel41.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel42.setToolTipText("");
        nanaBoysLabel42.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel42.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel42.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel43.setToolTipText("");
        nanaBoysLabel43.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel43.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel43.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       nanaBoysLabel44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel44.setToolTipText("");
        nanaBoysLabel44.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel44.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel44.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel45.setToolTipText("");
        nanaBoysLabel45.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel45.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel45.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel46.setToolTipText("");
        nanaBoysLabel46.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel46.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel46.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel47.setToolTipText("");
        nanaBoysLabel47.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel47.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel47.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel48.setToolTipText("");
        nanaBoysLabel48.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel48.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel48.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel49.setToolTipText("");
        nanaBoysLabel49.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel49.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel49.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel50.setToolTipText("");
        nanaBoysLabel50.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel50.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel50.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel51.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel51.setToolTipText("");
        nanaBoysLabel51.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel51.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel51.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel52.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel52.setToolTipText("");
        nanaBoysLabel52.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel52.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel52.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel53.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel53.setToolTipText("");
        nanaBoysLabel53.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel53.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel53.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel54.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel54.setToolTipText("");
        nanaBoysLabel54.setMaximumSize(new java.awt.Dimension(24, 24));
       nanaBoysLabel54.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel54.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel55.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel55.setToolTipText("");
        nanaBoysLabel55.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel55.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel55.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel56.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel56.setToolTipText("");
        nanaBoysLabel56.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel56.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel56.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel57.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel57.setToolTipText("");
        nanaBoysLabel57.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel57.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel57.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nanaBoysLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nanaBoysLabel58.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\water.gif")); // NOI18N
        nanaBoysLabel58.setToolTipText("");
        nanaBoysLabel58.setMaximumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel58.setMinimumSize(new java.awt.Dimension(24, 24));
        nanaBoysLabel58.setPreferredSize(new java.awt.Dimension(36, 36));

        nanaBoysLabel59.setText(" Hits taken : ");

        nanaBoysLabel60.setText("Friendly Ships sunk : ");

        nanaBoysLabel61.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nanaBoysLabel61.setText("To Place in the Water");

        nanaBoysLabel62.setText("Status : ");
        nanaBoysLabel62.setMaximumSize(new java.awt.Dimension(100, 14));

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
                                .addComponent(nanaBoysButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoysButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoysButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nanaBoysButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoysButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoysButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoysButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nanaBoysButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoysButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nanaBoysLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nanaBoysLabel1)
                                .addGap(165, 165, 165))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nanaBoysButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoysButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoysButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoysButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoysButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nanaBoysButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nanaBoysButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoysButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoysButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nanaBoysButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoysButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoysButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoysButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nanaBoysButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nanaBoysButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nanaBoysButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoysButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoysButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoysButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(nanaBoysLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nanaBoysButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nanaBoysButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nanaBoysLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(81, 81, 81))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nanaBoysLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nanaBoysLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nanaBoysLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nanaBoysLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nanaBoysLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                               .addComponent(nanaBoysLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nanaBoysLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(nanaBoysLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nanaBoysLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nanaBoysLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nanaBoysLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nanaToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nanaBoysLabel8)
                            .addComponent(nanaBoysLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nanaToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nanaBoysLabel9))
                    .addComponent(nanaBoysLabel61)
                    .addComponent(nanaBoysLabel6))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nanaBoysLabel1)
                    .addComponent(nanaBoysLabel5))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoysButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoysButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoysButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoysButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoysButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoysButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nanaBoysButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(nanaBoysButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaBoysButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nanaBoysLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nanaBoysLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nanaBoysLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nanaBoysLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nanaToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nanaToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nanaToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(nanaBoysLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nanaBoysLabel61))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nanaBoysLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nanaBoysLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nanaBoysLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nanaBoysLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nanaBoysLabel2)
                        .addComponent(nanaBoysLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nanaBoysLabel60)
                        .addComponent(nanaBoysLabel59))
                    .addComponent(nanaBoysLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nanaBoysLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>
                          

    public void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(37)||board.general.isAHit(37)||board.emperor.isAHit(37)){
   jButton34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(37)){}
else{jButton34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(37));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(39)||board.general.isAHit(39)||board.emperor.isAHit(39)){
   jButton38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(39)){}
else{jButton38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                           
}
jLabel62.setText("Status : " + board.fire(39));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(36)||board.general.isAHit(36)||board.emperor.isAHit(36)){
   jButton37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(36)){}
else{jButton37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                    }                        

jLabel62.setText("Status : " + board.fire(36));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(23)||board.general.isAHit(23)||board.emperor.isAHit(23)){
   jButton36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(23)){}
else{jButton36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                    }                        

jLabel62.setText("Status : " + board.fire(23));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(32)||board.general.isAHit(32)||board.emperor.isAHit(32)){
   jButton35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(32)){}
else{jButton35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
       }                           

jLabel62.setText("Status : " + board.fire(32));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(11)||board.general.isAHit(11)||board.emperor.isAHit(11)){
   jButton8.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(11)){}
else{jButton8.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(11));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                        

    public void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(26)||board.general.isAHit(26)||board.emperor.isAHit(26)){
   jButton30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(26)){}
else{jButton30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(26));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(35)||board.general.isAHit(35)||board.emperor.isAHit(35)){
   jButton31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(35)){}
else{jButton31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
     }                             

jLabel62.setText("Status : " + board.fire(35));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(27)||board.general.isAHit(27)||board.emperor.isAHit(27)){
   jButton28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(27)){}
else{jButton28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(27));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(25)||board.general.isAHit(25)||board.emperor.isAHit(25)){
   jButton29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(25)){}
else{jButton29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
    }                              

jLabel62.setText("Status : " + board.fire(25));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);

        
    }                                         

    public void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(38)||board.general.isAHit(38)||board.emperor.isAHit(38)){
   jButton32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(38)){}
else{jButton32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(38));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(42)||board.general.isAHit(42)||board.emperor.isAHit(42)){
   jButton33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel51.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(42)){}
else{jButton33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel51.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
         }                         

jLabel62.setText("Status : " + board.fire(42));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(16)||board.general.isAHit(16)||board.emperor.isAHit(16)){
   jButton10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(16)){}
else{jButton10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(16));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);



       
    }                                         

    public void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(17)||board.general.isAHit(17)||board.emperor.isAHit(17)){
   jButton9.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(17)){}
else{jButton9.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(17));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


       
    }                                        

    public void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(5)||board.general.isAHit(5)||board.emperor.isAHit(5)){
   jButton12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(5)){}
else{jButton12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
        }                          

jLabel62.setText("Status : " + board.fire(5));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);
    }                                         

    public void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(4)||board.general.isAHit(4)||board.emperor.isAHit(4)){
   jButton11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(4)){}
else{jButton11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(4));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(6)||board.general.isAHit(6)||board.emperor.isAHit(6)){
   jButton14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(6)){}
else{jButton14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(6));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(13)||board.general.isAHit(13)||board.emperor.isAHit(13)){
   jButton13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(13)){}
else{jButton13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(13));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(29)||board.general.isAHit(29)||board.emperor.isAHit(29)){
   jButton39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(29)){}
else{jButton39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(29));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(31)||board.general.isAHit(31)||board.emperor.isAHit(31)){
   jButton40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(31)){}
else{jButton40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(31));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(22)||board.general.isAHit(22)||board.emperor.isAHit(22)){
   jButton41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(22)){}
else{jButton41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(22));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


            }

                                             

    public void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
           if(board.minion.isAHit(24)||board.general.isAHit(24)||board.emperor.isAHit(24)){
   jButton42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(24)){}
else{jButton42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(24));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(30)||board.general.isAHit(30)||board.emperor.isAHit(30)){
   jButton43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(30)){}
else{jButton43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(30));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(44)||board.general.isAHit(44)||board.emperor.isAHit(44)){
   jButton50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel54.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(44)){}
else{jButton50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel54.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(44));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(9)||board.general.isAHit(9)||board.emperor.isAHit(9)){
   jButton6.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(9)){}
else{jButton6.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(9));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);
       
    }                                        

    public void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(46)||board.general.isAHit(46)||board.emperor.isAHit(46)){
   jButton49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel55.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(46)){}
else{jButton49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel55.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(46));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(3)||board.general.isAHit(3)||board.emperor.isAHit(3)){
   jButton7.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(3)){}
else{jButton7.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
  }                                

jLabel62.setText("Status : " + board.fire(3));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


       
    }                                        

    public void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(43)||board.general.isAHit(43)||board.emperor.isAHit(43)){
   jButton48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel52.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(43)){}
else{jButton48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel52.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(43));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(45)||board.general.isAHit(45)||board.emperor.isAHit(45)){
   jButton47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel53.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(45)){}
else{jButton47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel53.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(45));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
naruto1();                                          
}                                        


    public void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(10)||board.general.isAHit(10)||board.emperor.isAHit(10)){
   jButton15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(10)){}
else{jButton15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(10));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);

            }                                         

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(8)||board.general.isAHit(8)||board.emperor.isAHit(8)){
   jButton3.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(8)){}
else{jButton3.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
   }                               

jLabel62.setText("Status : " + board.fire(8));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);

        
 }                                        

                                       

    public void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(18)||board.general.isAHit(18)||board.emperor.isAHit(18)){
   jButton16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(18)){}
else{jButton16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(18));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(15)||board.general.isAHit(15)||board.emperor.isAHit(15)){
   jButton4.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(15)){}
else{jButton4.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
 }                                 

jLabel62.setText("Status : " + board.fire(15));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);

 }
                                    

    public void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(2)||board.general.isAHit(2)||board.emperor.isAHit(2)){
   jButton5.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(2)){}
else{jButton5.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(2));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);

           }                                        

    public void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(48)||board.general.isAHit(48)||board.emperor.isAHit(48)){
   jButton45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel57.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(48)){}
else{jButton45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel57.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(48));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(49)||board.general.isAHit(49)||board.emperor.isAHit(49)){
   jButton46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel58.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(49)){}
else{jButton46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel58.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
     }                             

jLabel62.setText("Status : " + board.fire(49));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(47)||board.general.isAHit(47)||board.emperor.isAHit(47)){
   jButton44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel56.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(47)){}
else{jButton44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel56.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
           }                       

jLabel62.setText("Status : " + board.fire(47));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(41)||board.general.isAHit(41)||board.emperor.isAHit(41)){
   jButton24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(41)){}
else{jButton24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(41));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(33)||board.general.isAHit(33)||board.emperor.isAHit(33)){
   jButton25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(33)){}
else{jButton25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
        }                          

jLabel62.setText("Status : " + board.fire(33));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(34)||board.general.isAHit(34)||board.emperor.isAHit(34)){
   jButton26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(34)){}
else{jButton26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
        }                          

jLabel62.setText("Status : " + board.fire(34));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(40)||board.general.isAHit(40)||board.emperor.isAHit(40)){
   jButton27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(40)){}
else{jButton27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(40));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(21)||board.general.isAHit(21)||board.emperor.isAHit(21)){
   jButton22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(21)){}
else{jButton22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(21));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);

    }                                         

    public void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(14)||board.general.isAHit(14)||board.emperor.isAHit(14)){
   jButton21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(14)){}
else{jButton21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
         }                         

jLabel62.setText("Status : " + board.fire(14));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(28)||board.general.isAHit(28)||board.emperor.isAHit(28)){
   jButton23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(28)){}
else{jButton23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(28));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(19)||board.general.isAHit(19)||board.emperor.isAHit(19)){
   jButton18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(19)){}
else{jButton18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(19));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(12)||board.general.isAHit(12)||board.emperor.isAHit(12)){
   jButton17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(12)){}
else{jButton17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(12));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);

    }                                         

    public void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(20)||board.general.isAHit(20)||board.emperor.isAHit(20)){
   jButton20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(20)){}
else{jButton20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
          }                        

jLabel62.setText("Status : " + board.fire(20));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


    }                                         

    public void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(7)||board.general.isAHit(7)||board.emperor.isAHit(7)){
   jButton19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(7)){}
else{jButton19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(7));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);


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
     
     

    public void nanaBoysButton34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(37)||board.general.isAHit(37)||board.emperor.isAHit(37)){
   nanaBoysButton34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(37)){}
else{nanaBoysButton34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(37));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton38ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(39)||board.general.isAHit(39)||board.emperor.isAHit(39)){
   nanaBoysButton38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(39)){}
else{nanaBoysButton38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                           
}
nanaBoysLabel62.setText("Status : " + board.fire(39));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton37ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(36)||board.general.isAHit(36)||board.emperor.isAHit(36)){
   nanaBoysButton37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(36)){}
else{nanaBoysButton37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                    }                        

nanaBoysLabel62.setText("Status : " + board.fire(36));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton36ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(23)||board.general.isAHit(23)||board.emperor.isAHit(23)){
   nanaBoysButton36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(23)){}
else{nanaBoysButton36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                    }                        

nanaBoysLabel62.setText("Status : " + board.fire(23));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton35ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(32)||board.general.isAHit(32)||board.emperor.isAHit(32)){
   nanaBoysButton35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(32)){}
else{nanaBoysButton35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
       }                           

nanaBoysLabel62.setText("Status : " + board.fire(32));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(11)||board.general.isAHit(11)||board.emperor.isAHit(11)){
   nanaBoysButton8.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(11)){}
else{nanaBoysButton8.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(11));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                        

    public void nanaBoysButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(26)||board.general.isAHit(26)||board.emperor.isAHit(26)){
   nanaBoysButton30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(26)){}
else{nanaBoysButton30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel35.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(26));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton31ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(35)||board.general.isAHit(35)||board.emperor.isAHit(35)){
   nanaBoysButton31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(35)){}
else{nanaBoysButton31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
     }                             

nanaBoysLabel62.setText("Status : " + board.fire(35));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(27)||board.general.isAHit(27)||board.emperor.isAHit(27)){
   nanaBoysButton28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(27)){}
else{nanaBoysButton28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel36.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(27));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(25)||board.general.isAHit(25)||board.emperor.isAHit(25)){
   nanaBoysButton29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(25)){}
else{nanaBoysButton29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel34.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
    }                              

nanaBoysLabel62.setText("Status : " + board.fire(25));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);

        
    }                                         

    public void nanaBoysButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(38)||board.general.isAHit(38)||board.emperor.isAHit(38)){
   nanaBoysButton32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(38)){}
else{nanaBoysButton32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(38));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(42)||board.general.isAHit(42)||board.emperor.isAHit(42)){
   nanaBoysButton33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel51.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(42)){}
else{nanaBoysButton33.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel51.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
         }                         

nanaBoysLabel62.setText("Status : " + board.fire(42));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(16)||board.general.isAHit(16)||board.emperor.isAHit(16)){
   nanaBoysButton10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(16)){}
else{nanaBoysButton10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(16));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);



       
    }                                         

    public void nanaBoysButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(17)||board.general.isAHit(17)||board.emperor.isAHit(17)){
   nanaBoysButton9.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(17)){}
else{nanaBoysButton9.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(17));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


       
    }                                        

    public void nanaBoysButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(5)||board.general.isAHit(5)||board.emperor.isAHit(5)){
   nanaBoysButton12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(5)){}
else{nanaBoysButton12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
        }                          

nanaBoysLabel62.setText("Status : " + board.fire(5));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);
    }                                         

    public void nanaBoysButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(4)||board.general.isAHit(4)||board.emperor.isAHit(4)){
   nanaBoysButton11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(4)){}
else{nanaBoysButton11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(4));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(6)||board.general.isAHit(6)||board.emperor.isAHit(6)){
   nanaBoysButton14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(6)){}
else{nanaBoysButton14.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(6));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(13)||board.general.isAHit(13)||board.emperor.isAHit(13)){
   nanaBoysButton13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(13)){}
else{nanaBoysButton13.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(13));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton39ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(29)||board.general.isAHit(29)||board.emperor.isAHit(29)){
   nanaBoysButton39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(29)){}
else{nanaBoysButton39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel38.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(29));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton40ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(31)||board.general.isAHit(31)||board.emperor.isAHit(31)){
   nanaBoysButton40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(31)){}
else{nanaBoysButton40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel39.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(31));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton41ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(22)||board.general.isAHit(22)||board.emperor.isAHit(22)){
   nanaBoysButton41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(22)){}
else{nanaBoysButton41.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel31.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(22));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


            }

                                             

    public void nanaBoysButton42ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
           if(board.minion.isAHit(24)||board.general.isAHit(24)||board.emperor.isAHit(24)){
   nanaBoysButton42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(24)){}
else{nanaBoysButton42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel32.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(24));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton43ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(30)||board.general.isAHit(30)||board.emperor.isAHit(30)){
   nanaBoysButton43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(30)){}
else{nanaBoysButton43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel40.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(30));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton50ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(44)||board.general.isAHit(44)||board.emperor.isAHit(44)){
   nanaBoysButton50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel54.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(44)){}
else{nanaBoysButton50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel54.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(44));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(9)||board.general.isAHit(9)||board.emperor.isAHit(9)){
   nanaBoysButton6.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(9)){}
else{nanaBoysButton6.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(9));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);
       
    }                                        

    public void nanaBoysButton49ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(46)||board.general.isAHit(46)||board.emperor.isAHit(46)){
   nanaBoysButton49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel55.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(46)){}
else{nanaBoysButton49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel55.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(46));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(3)||board.general.isAHit(3)||board.emperor.isAHit(3)){
   nanaBoysButton7.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(3)){}
else{nanaBoysButton7.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel12.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
  }                                

nanaBoysLabel62.setText("Status : " + board.fire(3));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


       
    }                                        

    public void nanaBoysButton48ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(43)||board.general.isAHit(43)||board.emperor.isAHit(43)){
   nanaBoysButton48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel52.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(43)){}
else{nanaBoysButton48.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel52.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(43));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton47ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(45)||board.general.isAHit(45)||board.emperor.isAHit(45)){
   nanaBoysButton47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel53.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(45)){}
else{nanaBoysButton47.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel53.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(45));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
    if(board.minion.isAHit(1)||board.general.isAHit(1)||board.emperor.isAHit(1)){
   nanaBoysButton2.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(1)){}
else{nanaBoysButton2.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(1));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);

                                          
}                                        


    public void nanaBoysButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(10)||board.general.isAHit(10)||board.emperor.isAHit(10)){
   nanaBoysButton15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(10)){}
else{nanaBoysButton15.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(10));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);

            }                                         

    public void nanaBoysButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(8)||board.general.isAHit(8)||board.emperor.isAHit(8)){
   nanaBoysButton3.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(8)){}
else{nanaBoysButton3.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
   }                               

nanaBoysLabel62.setText("Status : " + board.fire(8));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);

        
 }                                        

                                       

    public void nanaBoysButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(18)||board.general.isAHit(18)||board.emperor.isAHit(18)){
   nanaBoysButton16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(18)){}
else{nanaBoysButton16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(18));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(15)||board.general.isAHit(15)||board.emperor.isAHit(15)){
   nanaBoysButton4.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(15)){}
else{nanaBoysButton4.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
 }                                 

nanaBoysLabel62.setText("Status : " + board.fire(15));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);

 }
                                    

    public void nanaBoysButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(board.minion.isAHit(2)||board.general.isAHit(2)||board.emperor.isAHit(2)){
   nanaBoysButton5.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(2)){}
else{nanaBoysButton5.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel11.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(2));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);

           }                                        

    public void nanaBoysButton45ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(48)||board.general.isAHit(48)||board.emperor.isAHit(48)){
   nanaBoysButton45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel57.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(48)){}
else{nanaBoysButton45.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel57.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(48));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton46ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(49)||board.general.isAHit(49)||board.emperor.isAHit(49)){
   nanaBoysButton46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel58.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(49)){}
else{nanaBoysButton46.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel58.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
     }                             

nanaBoysLabel62.setText("Status : " + board.fire(49));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton44ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(47)||board.general.isAHit(47)||board.emperor.isAHit(47)){
   nanaBoysButton44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel56.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(47)){}
else{nanaBoysButton44.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel56.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
           }                       

nanaBoysLabel62.setText("Status : " + board.fire(47));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(41)||board.general.isAHit(41)||board.emperor.isAHit(41)){
   nanaBoysButton24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(41)){}
else{nanaBoysButton24.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel50.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(41));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(33)||board.general.isAHit(33)||board.emperor.isAHit(33)){
   nanaBoysButton25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(33)){}
else{nanaBoysButton25.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel42.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
        }                          

nanaBoysLabel62.setText("Status : " + board.fire(33));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(34)||board.general.isAHit(34)||board.emperor.isAHit(34)){
   nanaBoysButton26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(34)){}
else{nanaBoysButton26.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel43.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
        }                          

nanaBoysLabel62.setText("Status : " + board.fire(34));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(40)||board.general.isAHit(40)||board.emperor.isAHit(40)){
   nanaBoysButton27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(40)){}
else{nanaBoysButton27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel49.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(40));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(21)||board.general.isAHit(21)||board.emperor.isAHit(21)){
   nanaBoysButton22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(21)){}
else{nanaBoysButton22.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel30.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(21));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);

    }                                         

    public void nanaBoysButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(14)||board.general.isAHit(14)||board.emperor.isAHit(14)){
   nanaBoysButton21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(14)){}
else{nanaBoysButton21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
         }                         

nanaBoysLabel62.setText("Status : " + board.fire(14));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(28)||board.general.isAHit(28)||board.emperor.isAHit(28)){
   nanaBoysButton23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel37.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(28)){}
else{nanaBoysButton23.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel27.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(28));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(19)||board.general.isAHit(19)||board.emperor.isAHit(19)){
   nanaBoysButton18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(19)){}
else{nanaBoysButton18.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel28.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(19));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(12)||board.general.isAHit(12)||board.emperor.isAHit(12)){
   nanaBoysButton17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(12)){}
else{nanaBoysButton17.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel21.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(12));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);

    }                                         

    public void nanaBoysButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(20)||board.general.isAHit(20)||board.emperor.isAHit(20)){
   nanaBoysButton20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(20)){}
else{nanaBoysButton20.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel29.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
          }                        

nanaBoysLabel62.setText("Status : " + board.fire(20));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaBoysButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(board.minion.isAHit(7)||board.general.isAHit(7)||board.emperor.isAHit(7)){
   nanaBoysButton19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    jLabel16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(7)){}
else{nanaBoysButton19.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
nanaBoysLabel4.setText("Hits : " + Mhits);

    jLabel16.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
nanaBoysLabel62.setText("Status : " + board.fire(7));
//nanaBoysLabel2.setText("Guesses : " + ++Nguesses);
//nanaBoysLabel4.setText("Hits : " + ++Mhits);
//nanaBoysLabel3.setText("Enemy Ships Sunk : " + ++Nsunk); 
nanaBoysLabel59.setText("Hits Taken : " + Nhits);
nanaBoysLabel60.setText("Friendly Ships Sunk : "+ Msunk);


    }                                         

    public void nanaToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
     
        f=true;
        if(f1==true)
        f1=false;
        if(f2==true)
        f2=false;
    // addMouseListener(this);
     // addMouseMotionListener(this);
 if(!nanaToggleButton1.isSelected()){
     nanaToggleButton1.setSelected(true);
     } 

foo2();
    }                                              

    public void nanaToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        if(f==true)
        f=false;
        if(f2==true)
        f2=false;
     f1=true;
      if(!nanaToggleButton2.isSelected()){
     nanaToggleButton2.setSelected(true);
     } 

     foo2();
        }                                              

    public void nanaToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
     if(f==true)
    f=false;
        if(f1==true)
        f1=false;
     f2=true;
     
     if(!nanaToggleButton3.isSelected()){
     nanaToggleButton3.setSelected(true);
     } 
     foo2();
      //  f=true;
    }                                              
     
   void naruto1(){    if(board.minion.isAHit(1)||board.general.isAHit(1)||board.emperor.isAHit(1)){
   jButton2.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
    nanaBoysLabel10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\fire.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + ++Mhits);


}else if(board.hits.isAHit(1)){}
else{jButton2.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
jLabel2.setText("Guesses : " + ++Mguesses);
jLabel4.setText("Hits : " + Mhits);

    nanaBoysLabel10.setIcon(new javax.swing.ImageIcon("F:\\what sayan sent\\graphics\\splash.gif")); // NOI18N
                                  
}
jLabel62.setText("Status : " + board.fire(1));
//jLabel2.setText("Guesses : " + ++Mguesses);
//jLabel4.setText("Hits : " + ++Mhits);
//jLabel3.setText("Enemy Ships Sunk : " + ++Msunk); 
jLabel59.setText("Hits Taken : " + Nhits);
jLabel60.setText("Friendly Ships Sunk : "+ Nsunk);

}
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame1.initComponents();
               frame2.initComponents2();
               frame1.setVisible(true);
               frame2.setVisible(true);
                //new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton20;
    public javax.swing.JButton jButton21;
    public javax.swing.JButton jButton22;
    public javax.swing.JButton jButton23;
    public javax.swing.JButton jButton24;
    public javax.swing.JButton jButton25;
    public javax.swing.JButton jButton26;
    public javax.swing.JButton jButton27;
    public javax.swing.JButton jButton28;
    public javax.swing.JButton jButton29;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton30;
    public javax.swing.JButton jButton31;
    public javax.swing.JButton jButton32;
    public javax.swing.JButton jButton33;
    public javax.swing.JButton jButton34;
    public javax.swing.JButton jButton35;
    public javax.swing.JButton jButton36;
    public javax.swing.JButton jButton37;
    public javax.swing.JButton jButton38;
    public javax.swing.JButton jButton39;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton40;
    public javax.swing.JButton jButton41;
    public javax.swing.JButton jButton42;
    public javax.swing.JButton jButton43;
    public javax.swing.JButton jButton44;
    public javax.swing.JButton jButton45;
    public javax.swing.JButton jButton46;
    public javax.swing.JButton jButton47;
    public javax.swing.JButton jButton48;
    public javax.swing.JButton jButton49;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton50;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    public javax.swing.JLabel jLabel44;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    public javax.swing.JLabel jLabel47;
    public javax.swing.JLabel jLabel48;
    public javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel50;
    public javax.swing.JLabel jLabel51;
    public javax.swing.JLabel jLabel52;
    public javax.swing.JLabel jLabel53;
    public javax.swing.JLabel jLabel54;
    public javax.swing.JLabel jLabel55;
    public javax.swing.JLabel jLabel56;
    public javax.swing.JLabel jLabel57;
    public javax.swing.JLabel jLabel58;
    public javax.swing.JLabel jLabel59;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel60;
    public javax.swing.JLabel jLabel61;
    public javax.swing.JLabel jLabel62;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JToggleButton jToggleButton3;
public javax.swing.JButton nanaBoysButton10;
    public javax.swing.JButton nanaBoysButton11;
    public javax.swing.JButton nanaBoysButton12;
    public javax.swing.JButton nanaBoysButton13;
    public javax.swing.JButton nanaBoysButton14;
    public javax.swing.JButton nanaBoysButton15;
    public javax.swing.JButton nanaBoysButton16;
    public javax.swing.JButton nanaBoysButton17;
    public javax.swing.JButton nanaBoysButton18;
    public javax.swing.JButton nanaBoysButton19;
    public javax.swing.JButton nanaBoysButton2;
    public javax.swing.JButton nanaBoysButton20;
    public javax.swing.JButton nanaBoysButton21;
    public javax.swing.JButton nanaBoysButton22;
    public javax.swing.JButton nanaBoysButton23;
    public javax.swing.JButton nanaBoysButton24;
    public javax.swing.JButton nanaBoysButton25;
    public javax.swing.JButton nanaBoysButton26;
    public javax.swing.JButton nanaBoysButton27;
    public javax.swing.JButton nanaBoysButton28;
    public javax.swing.JButton nanaBoysButton29;
    public javax.swing.JButton nanaBoysButton3;
    public javax.swing.JButton nanaBoysButton30;
    public javax.swing.JButton nanaBoysButton31;
    public javax.swing.JButton nanaBoysButton32;
    public javax.swing.JButton nanaBoysButton33;
    public javax.swing.JButton nanaBoysButton34;
    public javax.swing.JButton nanaBoysButton35;
   public javax.swing.JButton nanaBoysButton36;
    public javax.swing.JButton nanaBoysButton37;
    public javax.swing.JButton nanaBoysButton38;
    public javax.swing.JButton nanaBoysButton39;
    public javax.swing.JButton nanaBoysButton4;
    public javax.swing.JButton nanaBoysButton40;
    public javax.swing.JButton nanaBoysButton41;
    public javax.swing.JButton nanaBoysButton42;
    public javax.swing.JButton nanaBoysButton43;
    public javax.swing.JButton nanaBoysButton44;
    public javax.swing.JButton nanaBoysButton45;
    public javax.swing.JButton nanaBoysButton46;
    public javax.swing.JButton nanaBoysButton47;
    public javax.swing.JButton nanaBoysButton48;
    public javax.swing.JButton nanaBoysButton49;
    public javax.swing.JButton nanaBoysButton5;
    public javax.swing.JButton nanaBoysButton50;
    public javax.swing.JButton nanaBoysButton6;
    public javax.swing.JButton nanaBoysButton7;
    public javax.swing.JButton nanaBoysButton8;
    public javax.swing.JButton nanaBoysButton9;
    public javax.swing.JLabel nanaBoysLabel1;
    public javax.swing.JLabel nanaBoysLabel10;
    public javax.swing.JLabel nanaBoysLabel11;
    public javax.swing.JLabel nanaBoysLabel12;
    public javax.swing.JLabel nanaBoysLabel13;
    public javax.swing.JLabel nanaBoysLabel14;
    public javax.swing.JLabel nanaBoysLabel15;
    public javax.swing.JLabel nanaBoysLabel16;
    public javax.swing.JLabel nanaBoysLabel17;
    public javax.swing.JLabel nanaBoysLabel18;
    public javax.swing.JLabel nanaBoysLabel19;
    public javax.swing.JLabel nanaBoysLabel2;
    public javax.swing.JLabel nanaBoysLabel20;
    public javax.swing.JLabel nanaBoysLabel21;
    public javax.swing.JLabel nanaBoysLabel22;
    public javax.swing.JLabel nanaBoysLabel23;
    public javax.swing.JLabel nanaBoysLabel24;
    public javax.swing.JLabel nanaBoysLabel25;
    public javax.swing.JLabel nanaBoysLabel26;
    public javax.swing.JLabel nanaBoysLabel27;
    public javax.swing.JLabel nanaBoysLabel28;
    public javax.swing.JLabel nanaBoysLabel29;
    public javax.swing.JLabel nanaBoysLabel3;
    public javax.swing.JLabel nanaBoysLabel30;
   public javax.swing.JLabel nanaBoysLabel31;
    public javax.swing.JLabel nanaBoysLabel32;
    public javax.swing.JLabel nanaBoysLabel33;
    public javax.swing.JLabel nanaBoysLabel34;
    public javax.swing.JLabel nanaBoysLabel35;
    public javax.swing.JLabel nanaBoysLabel36;
    public javax.swing.JLabel nanaBoysLabel37;
    public javax.swing.JLabel nanaBoysLabel38;
    public javax.swing.JLabel nanaBoysLabel39;
    public javax.swing.JLabel nanaBoysLabel4;
    public javax.swing.JLabel nanaBoysLabel40;
    public javax.swing.JLabel nanaBoysLabel41;
    public javax.swing.JLabel nanaBoysLabel42;
    public javax.swing.JLabel nanaBoysLabel43;
    public javax.swing.JLabel nanaBoysLabel44;
    public javax.swing.JLabel nanaBoysLabel45;
    public javax.swing.JLabel nanaBoysLabel46;
    public javax.swing.JLabel nanaBoysLabel47;
    public javax.swing.JLabel nanaBoysLabel48;
    public javax.swing.JLabel nanaBoysLabel49;
    public javax.swing.JLabel nanaBoysLabel5;
    public javax.swing.JLabel nanaBoysLabel50;
    public javax.swing.JLabel nanaBoysLabel51;
    public javax.swing.JLabel nanaBoysLabel52;
    public javax.swing.JLabel nanaBoysLabel53;
    public javax.swing.JLabel nanaBoysLabel54;
    public javax.swing.JLabel nanaBoysLabel55;
    public javax.swing.JLabel nanaBoysLabel56;
    public javax.swing.JLabel nanaBoysLabel57;
    public javax.swing.JLabel nanaBoysLabel58;
    public javax.swing.JLabel nanaBoysLabel59;
    public javax.swing.JLabel nanaBoysLabel6;
    public javax.swing.JLabel nanaBoysLabel60;
    public javax.swing.JLabel nanaBoysLabel61;
    public javax.swing.JLabel nanaBoysLabel62;
    public javax.swing.JLabel nanaBoysLabel7;
    public javax.swing.JLabel nanaBoysLabel8;
    public javax.swing.JLabel nanaBoysLabel9;
    public javax.swing.JToggleButton nanaToggleButton1;
    public javax.swing.JToggleButton nanaToggleButton2;
    public javax.swing.JToggleButton nanaToggleButton3;


    // End of variables declaration                   
  
//SimpleDrawCanvasWithFiles o = new SimpleDrawCanvasWithFiles();

 //add("Center",canvas);
}



   


