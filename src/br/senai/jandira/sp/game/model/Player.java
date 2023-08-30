package br.senai.jandira.sp.game.model;

public class Player {
    public String nome;
    public String skin;

    private int life;

    public Player(){
        life = 100;
    }
    public int getLife(){
        return life;
    }

    public void SubtraiVida(int danoEnemy) {
        life -= danoEnemy;
        if (life < 0) {
            life = 0;
        }
    }

}
