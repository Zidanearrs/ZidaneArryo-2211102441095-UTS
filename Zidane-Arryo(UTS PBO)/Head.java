import greenfoot.*;

public class Head extends Snake
{    
    public void addSnake()
    {
        
    }
    
    public void act() 
    {
        Actor actor=getOneIntersectingObject(Snake.class);
        if(actor!=null){
            getWorld().addObject(new GameOver(),(int)(0.5*getWorld().getWidth()),(int)(0.5*getWorld().getHeight()));
            ((MyWorld)getWorld()).GAMEOVER=true;
            return;
        }
        
        actor=getOneIntersectingObject(Food.class);
        if(actor!=null){
            getWorld().removeObject(actor);
            ((MyWorld)getWorld()).setScore(1);
            Snake.ADDEKOR=true;
            ((MyWorld)getWorld()).addFood();
        }
        actor=getOneIntersectingObject(Trap.class);
        if(actor!=null){
            getWorld().removeObject(actor);
            ((MyWorld)getWorld()).setScore(-1);
            Snake.ADDEKOR=true;
            ((MyWorld)getWorld()).addTrap();
        }
        
        if(Greenfoot.isKeyDown("up") && arahy!=1){
            arahx=0;
            arahy=-1;
        }else if(Greenfoot.isKeyDown("down") && arahy!=-1){
            arahx=0;
            arahy=1;
        }else if(Greenfoot.isKeyDown("right") && arahx!=-1){
            arahx=1;
            arahy=0;
        }else if(Greenfoot.isKeyDown("left") && arahx!=1){
            arahx=-1;
            arahy=0;
        }
        if(isAtEdge()){
            getWorld().addObject(new GameOver(),(int)(0.5*getWorld().getWidth()),(int)(0.5*getWorld().getHeight()));
            ((MyWorld)getWorld()).GAMEOVER=true;
            return;
        }
        super.act();
    }    
}
