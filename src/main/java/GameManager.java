public class GameManager {
    public void fight(Character c1, Character c2){
        String name1 = c1.getClass().getSimpleName();
        String name2 = c2.getClass().getSimpleName();
        String out1 = name1 + " hp = " + c1.getHp() +  " power = " + c1.getPower();
        String out2 = name2 + " hp = " + c2.getHp() +  " power = " + c2.getPower();
        System.out.println(out1 + " vs " + out2);
        System.out.println("Fight");
        int turn = 0;
        while (c1.isAlive() && c2.isAlive()){
            if (turn == 0){
                System.out.println(name1 + "kicks");
                c1.kick(c2);
                System.out.println(out1 + " ; " + out2);
            }
            else{
                System.out.println(name2 + "kicks");
                c2.kick(c1);
                System.out.println(out1 + " ; " + out2);
            }
        }
        if (c1.isAlive()){
            System.out.println(name1 + " WINS!!!!!!!!!");
        }
        else{
            System.out.println(name2 + " WINS!!!!!!!!!");
        }
    }
}
