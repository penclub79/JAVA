package abstractTemplate2;

public abstract class Player {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    private String level;

    public String getLevel() {
        return level;
    }

    public Player(String level)
    {
        this.level = level;
    }

    final public void go(int count) {
        run();
        for (int i = 0; i < count; i++){
            jump();
        }
        turn();
    }
}
