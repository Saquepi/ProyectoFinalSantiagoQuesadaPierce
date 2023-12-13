/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Venta PC
 */
public class ActivitiesGym {
    
    private int yoga[][] = new int[2][30];
    private int dance[][] = new int[2][30];
    private int gym[] = new int[6];
    
    
    //constructor
    public ActivitiesGym() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 30; j++) {
                yoga[i][j] = 0;
                dance[i][j] = 0;
            }
        }
        for (int i = 0; i < 6; i++) {
            gym[i]=0;
        }
    }
    
    
    //setters and getters
    
    public int getGym(int pos){
        return gym[pos];
    }
    
    public void setGym(int pos, int eID){
        gym[pos]=eID;
    }
    
    public int getYoga(int hour,int pos){
        return yoga[hour][pos];
    }
    
    public void setYoga(int hour,int pos, int eID){
        yoga[hour][pos]=eID;
    }
    
    public int getDance(int hour,int pos){
        return dance[hour][pos];
    }
    
    public void setDance(int hour,int pos, int eID){
        dance[hour][pos]=eID;
    }
    
    
    
    
}
