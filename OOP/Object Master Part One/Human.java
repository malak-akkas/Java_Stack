// public Class Human {
//     public int strength = 3;
//     public int stealth = 3;
//     public int intelligence = 3;
//     public int health = 100;

// public int attack(Human x ) 
//     x.health = human.health - this.strength;
//     return x.health;
// }  



public class Human{
    public int strength = 3;
    public int stealth = 3;
    public int intelligence = 3;
    public int health = 100;

    public int attack(Human x){
        x.health = x.health - this.strength;
        return x.health;
    }
}