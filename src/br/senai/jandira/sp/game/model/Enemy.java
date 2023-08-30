package br.senai.jandira.sp.game.model;

public class Enemy {
    public String nome;
    public String skin;

    private int life;

    public  Enemy(){
         life = 100;
    }
    public int getLife(){
        return life;
    }

    public void SubtraiVida(int danoPlayer){
        life -= danoPlayer;
        if (life < 0){
            life = 0;
        }
    }

}
