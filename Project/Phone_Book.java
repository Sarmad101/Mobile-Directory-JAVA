
package phone_book;
import java.io.*;
import java.util.*;
class nod {
    String data;
   
    nod next;
    nod(String data){
        this.data=data;
       
        next=null;
    }
}
class c{
    int non=0;
    nod start=null,end=null;
    void i(nod data){
        if(start==null){
            start=data;
           
            
            end=data;
            non++;
        }
        else{
            
            data.next=start;
            start=data;
           
            non++;
            
        }
    }
    void d(){
        nod temp=start;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    void de(String val){
       
        nod temp=start,pre=start;
        
        int count=0;
        
        while(temp!=null){
            pre=temp;
            temp=temp.next;
            String t=temp.data;
            if(val.equals(t));
            {
                
                 pre.next=temp.next;
                
                 temp=null;
                 System.out.println("Deleted");
                 break;
                
            }
        }
        
      
        
    }
    
    void sav(){
        nod temp=start;
        String arayy[]=new String[non];
        try{
            
         Writer y= new FileWriter("D:\\files_mine.txt",true);
         int count=0;
         while(temp!=null){
             arayy[count]=temp.data;
             temp=temp.next;
             count++;
         }
         for(int a=0;a<arayy.length;a++){
             y.write(arayy[a]+"\n");
            // y.append("\n");
         }
         y.close();
         
         
         
         
        }
        catch(Exception e){
            
        }
    }
    void showw(){
        try{
            FileReader p= new FileReader("D:\\files_mine.txt");
	    BufferedReader c=new BufferedReader(p);
            String one;
            int n;
             while((one=c.readLine())!=null)
    {
    	System.out.println(one);
    }
    p.close();
    c.close();
    
        }
        catch(Exception e){
            
        }
    }
}

public class Phone_Book {
    
 static String a[]=new String[1];
   
    public static void main(String[] args) {
        c v = new c();
        nod n;
        int ss;
        int sette=0;
        Scanner s= new Scanner(System.in);
        while(true){
            sette++;
            System.out.println("Enter no");
            ss=s.nextInt();
            if(ss==1){
                System.out.println("Value");
                  String vall=s.nextLine();
                  if(sette%2==1){
                      String val=s.nextLine();
                      n= new nod(val);
                      v.i(n);
                  }
                  else{
                
                 String val2=s.nextLine();
                n= new nod(val2);
                v.i(n);
                  }
            }
            else if(ss==2){
                v.d();
            }
            else if(ss==3){
                 System.out.println("Value");
                  String vall=s.nextLine();
                  String val=s.nextLine();
                
                v.de(val);
            }
            
             else if(ss==4){
                 v.sav();
             }
              else if(ss==5){
                  v.showw();
              }
            
            
        }
    
    }
    
}
