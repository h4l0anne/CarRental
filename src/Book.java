/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anne
 */
public class Book {
    private String title;
    private String author;
    private String callNumber;
    
    public Book(){
        this.title = "";
        this.author = "";
        this.callNumber = "";
    }
    
    public String getTitlle()
    {
        return this.title;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public String getCallNumber()
    {
        return this.callNumber;
    }
    public void setTitle(String bTitle)
    {
        this.title = bTitle;
    }
    public void setAuthor(String bAuthor)
    {
        this.author = bAuthor;
    }
    public void setCallNumber(String bCN)
    {
        this.callNumber = bCN;
    }
    
    //another constructor for Book
    //**Fill in the method header that would go here
    public Book(String t, String a)
    {
        this.title = t;
        this.author = a;
        this.callNumber = "";
    }
    
   // public static void main(String[] args){
   //Book myNewBook = new Book(t1, a1);
    
   // }
}
