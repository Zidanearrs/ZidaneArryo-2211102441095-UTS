import greenfoot.*;  

public class Food extends Actor
{
    public void addedToWorld(World Latar)
    {
        setImage(10);
    }
    
    private void setImage(int d)
    {
        GreenfootImage img = this.getImage();
        img.scale(20,25);
        this.setImage(img);
    }
    
    public void act() 
    {
        // Add your action code her.
    }    
}
