package lotr;
import java.util.Random;

public abstract class Noble extends Character{
    public Noble(int min, int max){
        super(new Random().nextInt(min, max), new Random().nextInt(min, max));
    }

    @Override
    public void kick(Character c){
        c.setHp(getHp() - (int)Math.random() * getPower());
    }
}
