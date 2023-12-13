
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Venta PC
 */
public class Central {
    //classes
    MovieInf cinema[] = new MovieInf[20];
    ActivitiesGym activities = new ActivitiesGym();
    PreLoadInfo workerInfo = new PreLoadInfo();
    ActionHistory history = new ActionHistory();
    
    
    //contructor

    public Central() {
        cinema[0] = new MovieInf("Megalodon", 0);
    }
    
    
    
    /*
    MOVIES
    */
    //Vars
    int cinemaCreated = 1; //used to keep track on how many movies have been made
    int cState; //Used for the seats to either delete or make a reservation
    int tempSelected;//temporary selected cinema
    int tempID;//temporary worker ID
    
    //Setters and getters

    public int getcState() {
        return cState;
    }

    public void setcState(int cState) {
        this.cState = cState;
    }

    public int getTempSelected() {
        return tempSelected;
    }

    public void setTempSelected(int tempSelected) {
        this.tempSelected = tempSelected;
    }

    public int getTempID() {
        return tempID;
    }

    public void setTempID(int tempID) {
        this.tempID = tempID;
    }
    
    
    
    //Make a new cinema class
    
    public void newCin(String name,int size){
        if(cinemaCreated<20){
            cinema[cinemaCreated] = new MovieInf(name, size);
            cinemaCreated++;
        }
    }
    
    //edit cinema
    public void editCinema(String name,int s){
        cinema[tempSelected-1].setMovieName(name);
        cinema[tempSelected-1].setSize(s);
    }
    
    //delete cinema
    public void delCinema(int del){
        cinemaCreated--;
        for (int i = del; i < cinemaCreated; i++) {
            cinema[i].setMovieName(cinema[i+1].getMovieName());
            cinema[i].setSize(cinema[i+1].getSize());
            
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    cinema[i].setMovieSeat(j, k, cinema[i+1].getMovieSeat(j, k));
                }
            }
            
        }
    }
    
    
    //get the cinema names for the list 
    public String getMovieList(int x){
        String tempStr = "";
        if(x<cinemaCreated) {
            tempStr = tempStr + (x+1) + ". " + cinema[x].getMovieName();
        }
        return tempStr;
    }
    
    //get movSize
    
    public int getMovieSize(){
        return cinema[tempSelected-1].getSize();
    }
    
    //get button state
    public int getButtonState(int col, int row, int id){
        if(cinema[tempSelected-1].getMovieSeat(row,col)==id){
            return 1;
        }else{
            return 0;
        }
    }
    
    //delSeat
    public void delSeat(int row,int col){
        cinema[tempSelected-1].setMovieSeat(row, col,0);
    }
    
    //addSeat
    public void addSeat(int row,int col){
        
        if(cinema[tempSelected-1].getMovieSeat(row, col)==0){
            cinema[tempSelected-1].setMovieSeat(row, col, tempID);
        }else{
            JOptionPane.showMessageDialog(null, "OCUPADO");
        }
    }
    
    
    /*
    Activities
    */
    
    //Yoga
    int y7c =0;
    int y8c =0;
    
    public void addYogaR(int hour,int ID){
        if(hour==0){
            activities.setYoga(hour, y7c, ID);
            y7c++;
        }else{
            activities.setYoga(hour, y8c, ID);
            y8c++;
        }
    }
    
    public void removeYr(int hour,int x){
        if(hour==0){
            y7c--;
            for (int i = x; i < y7c; i++) {
                activities.setYoga(hour, i, activities.getYoga(hour, i+1));
            }
            activities.setYoga(hour, y7c, 0);
        }else{
            y8c--;
            for (int i = x; i < y8c; i++) {
                activities.setYoga(hour, i, activities.getYoga(hour, i+1));
            }
            activities.setYoga(hour, y8c, 0);
        }
    }
    
    public int getYr(int horario,int x){
        return activities.getYoga(horario, x);
    }
    
    
    public String listYoga(int horario,int x){
        String tempS = "";
        
        if(activities.getYoga(horario,x)!=0){
            tempS= tempS+ (x+1)+": "+getWorkerName(activities.getYoga(horario,x));
        }
        
        return tempS;
    }
    
    
    //Dance
    
    int d7c =0;
    int d8c =0;
    
    public void addDanceR(int hour,int ID){
        if(hour==0){
            activities.setDance(hour, d7c, ID);
            d7c++;
        }else{
            activities.setDance(hour, d8c, ID);
            d8c++;
        }
    }
    
    public void removeDr(int hour,int x){
        if(hour==0){
            d7c--;
            for (int i = x; i < d7c; i++) {
                activities.setDance(hour, i, activities.getDance(hour, i+1));
            }
            activities.setDance(hour, d7c, 0);
        }else{
            d8c--;
            for (int i = x; i < d8c; i++) {
                activities.setDance(hour, i, activities.getDance(hour, i+1));
            }
            activities.setDance(hour, d8c, 0);
        }
    }
    
    public int getDr(int horario,int x){
        return activities.getDance(horario, x);
    }
    
    
    public String listDance(int horario,int x){
        String tempS = "";
        
        if(activities.getDance(horario,x)!=0){
            tempS= tempS+ (x+1)+": "+getWorkerName(activities.getDance(horario,x));
        }
        
        return tempS;
    }
    
    
    //gym
    public void setGymr(int pos,int ID){
        if(activities.getGym(pos)==0){
            activities.setGym(pos, ID);
        }
    }
    
    public void delGymR(int x){
        activities.setGym(x, 0);
    }
    
    public int getGymR(int x){
        return activities.getGym(x);
    }
    
    public String listGym(int x){
        String tempS = "" + (x+2)+"PM: ";
        
        if(activities.getGym(x)==0){
            tempS= tempS +"Vacio";
        }else{
            tempS= tempS+getWorkerName(activities.getGym(x));
        }
        
        return tempS;
    }
    
    
    /*
    WorkersInfo
    */
    
    public String getWorkerName(int id){
        String temp = "";
        for (int i = 0; i < 30; i++) {
            if(workerInfo.getID(i)==id){
                temp = workerInfo.getName(i);
            }
        }
        return temp;
    }
    
    /*
    ActionHistory
    */
    
    public void addHist(){
        
    }
    
    public void getHistList(){
        
    }
    
}
