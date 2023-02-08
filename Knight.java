/**
 * Villafranca, Rikki Lee
 * COP-3252
 * Assignment 3
 * 1/26/23
 */

 
// *******************************************************
// * Public Class Knight: Includes the set and get       *
// * functions for the Knight's five attribute.          *
// *******************************************************

public class Knight {

    private String Name;
    private int Health, Battles, Age, Gold;

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() { return Name; }

    public void setHealth(int Health) {
        this.Health = Health;
    }
    public int getHealth() { return Health; }

    public void setBattles(int Battles) {
        this.Battles = Battles;
    }
    public int getBattles() { return Battles; }

    public void setAge(int Age) {
        this.Age = Age;
    }
    public int getAge() { return Age; }

    public void setGold(int Gold) {
        this.Gold = Gold;
    }
    public int getGold() { return Gold; }

}
