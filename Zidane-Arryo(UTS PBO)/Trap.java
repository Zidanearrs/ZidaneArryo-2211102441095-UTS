import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trap extends Actor
{
    /**
     * Act - do whatever the Trap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World Latar) {
        setGambar(10);
    }
    private void setGambar(int d) {
        GreenfootImage img = this.getImage();
        img.scale(32,32);
        this.setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
