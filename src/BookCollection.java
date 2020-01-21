/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anne
 */
public class BookCollection {
    private final int MAXBOOKS = 30000;
    
    private Book[] booklist = new Book[MAXBOOKS];
    
    private int count = 0;
    
    public BookCollection(){
        
    }
    
    
    public int countScienceBooks(){
        if (booklist[MAXBOOKS].getCallNumber().equals('Q') ){
            
            count++;
        }
        return count;
    }
    
}
