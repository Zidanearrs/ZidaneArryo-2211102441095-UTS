import greenfoot.*; 

public class MyWorld extends World
{
    public boolean GAMEOVER=false;
    private int mscore=0;
    private Score score;
    public MyWorld()
    {    
        super(600, 400, 1,false); 

        Head head=new Head();
        addObject(head,100,200);

        Snake snake=new Snake();
        addObject(snake,head.getX()-Snake.delta,head.getY());
        snake.snake = head;

        addFood();

        score=new Score();
        score.setScore(mscore);
        addObject(score,getWidth()-50,25);
        prepare();
    }

    public void addFood()
    {
        addObject(new Food(),Greenfoot.getRandomNumber(getWidth()/Snake.delta)*Snake.delta,Greenfoot.getRandomNumber(getHeight()/Snake.delta)*Snake.delta);
    }

    public void addTrap()
    {
        addObject(new Trap(),Greenfoot.getRandomNumber(getWidth()/Snake.delta)*Snake.delta,Greenfoot.getRandomNumber(getHeight()/Snake.delta)*Snake.delta);
    }

    public void setScore(int a)
    {
        mscore+=a;
        score.setScore(mscore);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Trap trap = new Trap();
        addObject(trap,404,198);
    }
    public void act() {
        checkGameOver();
    }
    private void checkGameOver() {
        Head head = getObjects(Head.class).get(0);
        if (Greenfoot.isKeyDown("space")) {
            removeObjects(getObjects(GameOver.class));
            
            GAMEOVER = false;
            mscore = 0;
            score.setScore(mscore);
            
            removeObjects(getObjects(Snake.class));
            removeObjects(getObjects(Food.class));
            removeObjects(getObjects(Trap.class));
            
            Head newHead = new Head();
            addObject(newHead, 100,200);
            Snake newSnake = new Snake();
            addObject(newSnake, newHead.getX() - Snake.delta, newHead.getY());
            newSnake.snake = newHead;
            addFood();
            addTrap();
        }
    }
}
