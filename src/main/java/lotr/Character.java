package lotr;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor @Setter @Getter
public abstract class Character{
    private int hp;
    private int power;

    public abstract void kick(Character c);

    public boolean isAlive(){
        return hp > 0;
    }

    public void setHp(int hp){
        this.hp = Math.max(0, hp);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

    
}


// class CharacterFactory 
//    - methods: Character createCharacter() { 
//                 returns random instance of any existing character 
//               }
// class GameManager
//    - methods: void fight(Character c1, Character c2) { 
//                 to provide fight between to characters and explain via command 
//                 line what happens during fight, till both of 
//                 the characters are alive 
//               }