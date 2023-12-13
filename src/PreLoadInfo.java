/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Venta PC
 */
public class PreLoadInfo {
    private String workers[]={
        "Brooke Mills","Arya Nelson","Makayla Thomas","Hope Young","Lyla Nelson","Lilah Floyd","Emilia Stokes","Alaya Cooper","Maxwell Edwards","Gabrielle Lewis","Zoe Patel","Aliyah Gutierrez","Walter Baker","Rachel Carter","Katherine Patterson","Wade Klein","Adrian Mitchell","Johan Phillips","Emilio Ross","Caleb Clark",
        "David Nuñez","Makenzie Bennet","Frank Lindsey","Johan Norman","Gael Johnson","Amira Ross","Chase Cox","Owen Harris","Harper Sanders","Valeria Lambert","John Gutierrez","Madeleine Hall","Jade Garcia","Leilani Taylor","Julianna Foster","Bryce Norman","Talia Lee","Matthew Barnes","Bowen Lewis ","Blakely Johnson",
        "Elliott Johnston","Destiny Hill","August Houston","Philip Mccarty","Lena White","Malcolm Thompson","Albert Webster","Sadie Watson","Johan Kim","Garrett Gutierrez"
    };

    private int idententification[]=new int[50];

    public PreLoadInfo() {
        for (int i = 0; i < 50; i++) {
            idententification[i] = i+300;
        }
        
        
    }
    
    
    public int getID(int pos){
        return idententification[pos];
    }
    
    public String getName(int pos){
        return workers[pos];
    }
    
    
    
}
