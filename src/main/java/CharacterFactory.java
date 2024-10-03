import java.util.Random;

public class CharacterFactory{
    public Character createCharacter(){
        Random random = new Random();
        int randomCharacter = random.nextInt(4);
        switch(randomCharacter) {
            case 0:
                return new King();
            case 1:
                return new Knight();
            case 2:
                return new Hobbit();
            default:
                return new Elf();
        }
    }
}
