package ch10_oop.extends_.ex03;

public class FireSlime extends Slime {
    private int fireAttack = 4;

    @Override
    public void attack (Slime enemy) {
        enemy.hp -= (attack + fireAttack) * (1 - enemy.defense);
    }
}