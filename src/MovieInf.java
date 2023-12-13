/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Venta PC
 */
public class MovieInf {
    private String movieName;
    private int size;//0=25 /1=30
    private int movieSeats[][] ={
      // 1 2 3 4 5 6
        {0,0,0,0,0,0},//A
        {0,0,0,0,0,0},//B
        {0,0,0,0,0,0},//C
        {0,0,0,0,0,0},//D
        {0,0,0,0,0,0}//E
    }; 
    
    //constructor

    public MovieInf(String movieName, int size) {
        this.movieName = movieName;
        this.size = size;
    }
    
    
    
    
    //setters and getters
    
    public int getMovieSeat(int row, int col){
        return movieSeats[row][col];
    }
    
    public void setMovieSeat(int row, int col, int wID){
        movieSeats[row][col]=wID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
}
