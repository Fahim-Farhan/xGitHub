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
import java.util.*;
public class TestEnemyship {

    /**
     * @param args the command line arguments
     */
    TestEnemyship(){}// cons does nothing
   
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            factory shipfactory = new factory();
            Enemyship theEnemy = null;
            Scanner s = new Scanner(System.in);
            System.out.println("choice? u/r/b");
            String c = s.next();
            if(c.equals("x"))
                    break;
            theEnemy = shipfactory.makeEnemy(c);
           // if(userInput.hasNextLine()){}
           if(theEnemy!=null)
               dosth(theEnemy);
           else 
              // System.out.println("choice? u/r/b");
               continue;
        }
       
        
    }
     public static void dosth(Enemyship x){
        x.displayEnemy();
        x.Enemyshoots();
        x.heroship();
    }
    
}
