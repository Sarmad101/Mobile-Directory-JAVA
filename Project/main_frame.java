
package phone_book;


import javax.swing.JOptionPane;

import java.io.*;

import java.awt.*;
import javax.swing.*;

class friends{
    String dataf;
    friends nextf;
    friends(String dataf){
        this.dataf=dataf;
        nextf=null;
    }
}
class nood{
    String data;
    nood next;
    nood(String data){
        this.data=data;
        next=null;
    }
}
public class main_frame extends javax.swing.JFrame {

    
    public main_frame() {
           
        initComponents();
   
        
          
    }
    
    friends startf=null,endf=null;
    nood start=null,end=null;
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        textt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        field = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listing = new javax.swing.JList<>();
        adc = new javax.swing.JButton();
        fieldc = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        listv = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        sear = new javax.swing.JList<>();
        selecting = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 1235));
        setSize(new java.awt.Dimension(930, 1235));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 144, 95));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        textt.setFont(new java.awt.Font("Raavi", 3, 18)); // NOI18N
        textt.setBorder(null);
        textt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texttKeyReleased(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        field.setText("Write Name here");
        field.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 102), new java.awt.Color(204, 255, 204)));
        field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldMouseClicked(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phone_book/dlt2.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        listing.setBackground(new java.awt.Color(246, 246, 252));
        listing.setFont(new java.awt.Font("Traditional Arabic", 3, 14)); // NOI18N
        jScrollPane3.setViewportView(listing);
        listing.getAccessibleContext().setAccessibleName("listing");

        adc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phone_book/add.jpg"))); // NOI18N
        adc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                adcMouseMoved(evt);
            }
        });
        adc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcActionPerformed(evt);
            }
        });

        fieldc.setText("Write Number here");
        fieldc.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 102), new java.awt.Color(204, 255, 204)));
        fieldc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldcMouseClicked(evt);
            }
        });

        listv.setBackground(new java.awt.Color(246, 246, 252));
        listv.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jScrollPane5.setViewportView(listv);
        listv.getAccessibleContext().setAccessibleName("listv");

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setText("View All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        sear.setBackground(new java.awt.Color(246, 246, 252));
        sear.setFont(new java.awt.Font("Traditional Arabic", 3, 14)); // NOI18N
        jScrollPane4.setViewportView(sear);
        sear.getAccessibleContext().setAccessibleName("sear");

        selecting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Friends", "Family" }));
        selecting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select By");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View All Contacts");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(field)
                                    .addComponent(fieldc)
                                    .addComponent(jScrollPane3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(adc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selecting, 0, 182, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3)
                                .addComponent(adc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(selecting, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(227, 227, 227)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                .addGap(191, 191, 191))
        );

        textt.getAccessibleContext().setAccessibleName("textt");
        field.getAccessibleContext().setAccessibleName("field");
        adc.getAccessibleContext().setAccessibleName("adc");
        fieldc.getAccessibleContext().setAccessibleName("fieldc");
        selecting.getAccessibleContext().setAccessibleName("selecting");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 1235);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

public Image im= new ImageIcon("C:\\Users\\RYK\\Desktop\\sear.PNG").getImage();

         
     
 
   
   int choices=0;




String gett[]=new String[1000];



    private void texttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texttKeyReleased
  
    
    String str=textt.getText();
   
  
   modelt.removeAllElements();
     
     
      
      
      try{
       FileReader p= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends.txt");
	    BufferedReader c=new BufferedReader(p);
            String one;
            int n=0;
             while((one=c.readLine())!=null)
    {
        
        gett[n]=one;
    	n++;
        
        
    }
             p.close();
             c.close();
             
              FileReader pp= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family.txt");
	    BufferedReader cc=new BufferedReader(pp);
            String onee;
          
              while((onee=cc.readLine())!=null)
    {
        gett[n]=onee;
        n++;
    
    }
              cc.close();
              pp.close();
             
             
      }
      catch(Exception e){
          
      }
      
      
      for(int a=0;a<gett.length;a++){
          if(str.equals(gett[a])){
              
           modelt.addElement(gett[a]);
           
           String ss=gett[a+1];
           modelt.addElement(ss);
           sear.setModel(modelt);
          }
          else{
         
          }
      }
      
      
  
  
  
  
       
    }//GEN-LAST:event_texttKeyReleased

     DefaultListModel model = new DefaultListModel();
     DefaultListModel modelt = new DefaultListModel();
     DefaultListModel model1 = new DefaultListModel();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved


   Graphics2D gd= (Graphics2D)jPanel1.getGraphics();
   
        gd.drawImage(im, 193,3, null); 
       
   gd.drawLine(1, 28, 208, 28);
   
   
   
  
   
   
  
    }//GEN-LAST:event_jPanel1MouseMoved
    public int select;
    
    
   
    
    void d(){
        while(temp!=null){
           
            temp.next=null;
            
         
            
        }
     
    }
     void dd(){
        while(tempf!=null){
           
            tempf.nextf=null;
            
         
            
        }
     
    }
  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        
        
  
        listing.removeAll();
       
       int sii=listing.getSelectedIndex();
    
       if(start==null){
       
       
       }
       else{
           d();
      
       }
       if(startf==null){
           
       }
       else{
           
       dd();
       }
       
       
     
      
        
      try{
          
          
          if(sii%2==0){
              
              
               if(giver.equals("Family")){
                  
               
          
            Writer yyyy= new FileWriter("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family_temp.txt");
          
             FileReader p= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family.txt");
	     BufferedReader c=new BufferedReader(p);
            String one;
            int in=0;
      
             while((one=c.readLine())!=null)
    {
    	if(sii==in || in==sii+1){
            
        }
        else{
            yyyy.write(one);
            yyyy.write("\n");
        }
       in++;
     
       
   
    }
             yyyy.close();
             p.close();
             c.close();
             
              Writer familys= new FileWriter("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family.txt");
               FileReader reading= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family_temp.txt");
	     BufferedReader buffer=new BufferedReader(reading);
            String one1;
         
             while((one1=buffer.readLine())!=null)
    {
    	
      
            familys.write(one1);
            familys.write("\n");
       
     
       
   
    }
             familys.close();
             reading.close();
             buffer.close();
             

             
              
               FileReader r= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family.txt");
	     BufferedReader br=new BufferedReader(r);
            String one2;
          model.removeAllElements();
             while((one2=br.readLine())!=null)
    {
             model.addElement(one2);
             listing.setModel(model);
    }  
             r.close();
             br.close();
             
             
             
             
             
             
             
             
               }
               else  if(giver.equals("Friends")){
             
             
             
             
             
             
              Writer fiends= new FileWriter("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends_temp.txt");
          
             FileReader ff= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends.txt");
	     BufferedReader cc=new BufferedReader(ff);
            String onef;
            int inf=0;
          
             while((onef=cc.readLine())!=null)
    {
    	if(sii==inf || inf==sii+1){
            
        }
        else{
            fiends.write(onef);
            fiends.write("\n");
        }
       inf++;
     
       
   
    }
             fiends.close();
             ff.close();
             cc.close();
             
              Writer frie= new FileWriter("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends.txt");
               FileReader fri= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends_temp.txt");
	     BufferedReader bfri=new BufferedReader(fri);
            String onefr;
         
             while((onefr=bfri.readLine())!=null)
    {
    	
      
            frie.write(onefr);
            frie.write("\n");
       
     
       
   
    }
             frie.close();
             fri.close();
             bfri.close();
             

             
              
               FileReader ffr= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends.txt");
	     BufferedReader bffr=new BufferedReader(ffr);
            String oneffr;
          model.removeAllElements();
             while((oneffr=bffr.readLine())!=null)
    {
             model.addElement(oneffr);
             listing.setModel(model);
    }  
             ffr.close();
             bffr.close();
             
             
             
          }
               
               
               
               
          }
          
          
          
          else if(sii%2==1){
             JOptionPane.showMessageDialog(null,"You can't delete number please select name to delete");
         }
          
             
             
             
             
          
        }
             
        catch(Exception e){
           
            
            
        }
         
         
    
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    
  
 

void insertf(friends dataf){
    if(startf==null){
        startf=dataf;
        endf=dataf; 
        
    
      
    }
    else{
        dataf.nextf=startf;
        startf=dataf;
       
    }
}



void insert(nood data){
    if(start==null){
        start=data;
        end=data;
     
    }
    else{
        data.next=start;
        start=data;
      
    }
}




String getter,numbrer;

    private void adcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcActionPerformed
     
 
        
        if(choices==1){
        
             
     
       nood n;
        friends nod;
        
      
               
       
       try{
           
           
          Writer y= new FileWriter("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends.txt",true);
          Writer yy= new FileWriter("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family.txt",true);
         
             
             
           
       
     if(giver.equals("Friends")){
      
            
          
      
       numbrer=fieldc.getText();
        
        nod=new friends (numbrer);
      
       insertf(nod);
        
       
       getter=field.getText();
        
           y.write(getter);
           y.write("\n");
            y.write(numbrer);
           y.write("\n");
       
        nod=new friends (getter);
      
       insertf(nod);
      
       
      friends tempf=startf;
      
      
      
     
            
     
      
     FileReader ffr= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends.txt");
	     BufferedReader bffr=new BufferedReader(ffr);
            String oneffr;
          model.removeAllElements();
             while((oneffr=bffr.readLine())!=null)
    {
             model.addElement(oneffr);
             listing.setModel(model);
    }  
             ffr.close();
             bffr.close();
      
      
            
      }
    
      
      else if(giver.equals("Family")){
     
       
       numbrer=fieldc.getText();
       
       n=new nood (numbrer);
      
       insert(n);
       getter=field.getText();
        yy.write(getter);
           yy.write("\n");
            yy.write(numbrer);
           yy.write("\n");
           
           yy.close();
       
        n=new nood (getter);
      
       insert(n);
      
     
       
               FileReader r= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family.txt");
	     BufferedReader br=new BufferedReader(r);
            String one2;
          model.removeAllElements();
             while((one2=br.readLine())!=null)
    {
             model.addElement(one2);
             listing.setModel(model);
    }  
             r.close();
             br.close();
             
    
      }
      
      
      y.close();
      
       }
       catch(Exception e){
           
       }
    
       
       
      
    
  
        }
        else{
            
        }
        
     
      
      
   
        
     
        choices=0;
         
        
       
 
    }//GEN-LAST:event_adcActionPerformed

    private void fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldMouseClicked

        field.setText("");
        choices=1;
    }//GEN-LAST:event_fieldMouseClicked

    private void fieldcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldcMouseClicked

      fieldc.setText("");
      choices=1;
    }//GEN-LAST:event_fieldcMouseClicked

    private void adcMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adcMouseMoved

String number,name;
name=field.getText();
number=fieldc.getText();

if(name.equals("Write Name here") || number.equals("Write Number here")){
    field.setText("");
    fieldc.setText("");
}


       
    }//GEN-LAST:event_adcMouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
      model1.removeAllElements();
     
    
      
      try{
       FileReader p= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends.txt");
	    BufferedReader c=new BufferedReader(p);
            String one;
            int n;
             while((one=c.readLine())!=null)
    {
    	model1.addElement(one);
        listv.setModel(model1);
    }
             p.close();
             c.close();
             
              FileReader pp= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family.txt");
	    BufferedReader cc=new BufferedReader(pp);
            String onee;
              while((onee=cc.readLine())!=null)
    {
    	model1.addElement(onee);
        listv.setModel(model1);
    }
              cc.close();
              pp.close();
             
             
      }
      catch(Exception e){
          
      }
    
   
  
    }//GEN-LAST:event_jButton4ActionPerformed
String giver;
    private void selectingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectingActionPerformed



    model.removeAllElements();
 
        giver=(String)selecting.getSelectedItem();
        
       
       
          try{
        if(giver.equals("Friends")){
            
             
       FileReader p= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\friends.txt");
	    BufferedReader c=new BufferedReader(p);
            String one;
             model.removeAllElements();
             while((one=c.readLine())!=null)
    {
    	model.addElement(one);
        listing.setModel(model);
    }
             c.close();
             p.close();
             
             
     
            
            
        }
        
      
      else if(giver.equals("Family")){
          
            FileReader pp= new FileReader("C:\\Users\\RYK\\Documents\\NetBeansProjects\\Phone_Book\\src\\phone_book\\family.txt");
	    BufferedReader cc=new BufferedReader(pp);
            String onee;
             model.removeAllElements();
              while((onee=cc.readLine())!=null)
    {
    	model.addElement(onee);
        listing.setModel(model);
    }
              cc.close();
              pp.close();
             
          
      
          }
      }
      catch(Exception e){
          
      }
          
          
      
           
     

        // TODO add your handling code here:
    }//GEN-LAST:event_selectingActionPerformed
  
        friends tempf=startf;
        nood temp=start;
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
     
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
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adc;
    private javax.swing.JTextField field;
    private javax.swing.JTextField fieldc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> listing;
    private javax.swing.JList<String> listv;
    private javax.swing.JList<String> sear;
    private javax.swing.JComboBox<String> selecting;
    private javax.swing.JTextField textt;
    // End of variables declaration//GEN-END:variables
}
