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
public class factory extends Enemyship{
    public Enemyship makeEnemy(String str){
        Enemyship ship = null;
        if(str.equals("u"))
            return  new UFO();
        else if(str.equals("b"))
            return new BigUFO();
        else if(str.equals("r"))
            return new Rocket();
        return ship;
    }
    
}
