class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    @Override
    public void kick(Character c){
        if (this.getPower() > c.getPower()){
            c.setHp(0);
        }
        else {
            c.setPower(getPower() - 1);
        }
    }
}
