/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenemyship;

/**
 *
 * @author USER-PC
 */
public abstract class Enemyship {
    private String name;
    private double amtDamage;
    //------------------------
    public String getName(){return name;}
    public void setName(String n){name = n;}
    
    public double getDmg(){return amtDamage;}
    public void setDmg(double d){ amtDamage = d;}
    
    public void heroship(){
        System.out.println(getName()+" follows hero!");
    }
    
    public void displayEnemy(){
        System.out.println(getName()+" is in action!");
    }
    
    public void Enemyshoots(){
        System.out.println(getName()+" shoots and does damage "+getDmg());
    }
    
}








