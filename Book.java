/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import book1.details1;
import journal.details2;
class student
{
    int no,year;
    String name,author;
    int i;
    int flag=0;
    int id;
    void get()
  {
    
        
     for(i=0;i<2;i++)
     {
     System.out.println("Enter book details:");
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter book id:");
     id=obj.nextInt();
     System.out.println("Enter book access number:");
     no=obj.nextInt();
     System.out.println("Enter book name:");
     name=obj.next();
     System.out.println("Enter book publication year:");
     year=obj.nextInt();
     System.out.println("Enter author name:");
     author=obj.next();
     }
    
    
  }
 void inform()
 {
     System.out.println("The book details are:");
     System.out.println(" book id:"+id);
     System.out.println(" book access number:"+no);
     System.out.println(" book name:"+name);
     System.out.println(" book publication year:"+year);
     System.out.println(" author name:"+author);
 }
}
class staff
{
    int jid;
    String jname;
    int i;
    int b;
    void get2()
    {
    for(i=0;i<2;i++)
    {
        System.out.println("Enter journal book id:");
        Scanner obj=new Scanner(System.in);
        jid=obj.nextInt();
        System.out.println("Enter journal book name:");
        jname=obj.next();
    }
      
    
  }
  void inform2()
  {
      System.out.println("The journal book details are:");
      System.out.println(" journal book id:"+jid);
      System.out.println(" journal book name:"+jname);
  }
   
}

public class Book {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        int c;
        int flag=1;
        student obj1=new student();
        staff obj2=new staff();
        details1 obj3=new details1();
        details2 obj4=new details2();
        System.out.println("Program to find book details:");
        System.out.println("Enter 1 for book details or 0 for journal details:");
        Scanner obj=new Scanner(System.in);
        c=obj.nextInt();
        if(c==1)
        {
            obj1.get();
            obj3.check();
            if(flag==1)
             {
               System.out.println("Book is available:");
               obj1.inform();
              }
             else
              {
                 System.out.println("Book is not available");
              }
        }  
        else if(c==0)
        {
            obj2.get2();
            obj4.check2();
            if(flag==2)
             {
               System.out.println("Book is available:");
               obj1.inform();
              }
             else
              {
                 System.out.println("Book is not available");
              }
        }
        else
        {
            System.out.println("Invalid input");
        }
       
        
    }
     
}
