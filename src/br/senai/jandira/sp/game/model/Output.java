package br.senai.jandira.sp.game.model;

public class Output {

    public void Print(Player player) {
        /**Printar informações*/

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("------------------- PLAYER --------------------------");
        System.out.println("O nome do PLayer é: " + player.nome);
        System.out.println("A skin do seu player: " + player.skin);
        System.out.println("A vida do seu player é: " + player.getLife());
        System.out.println("-----------------------------------------------------");

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

    public void Print1(Enemy enemy) {
        /**Printar informações*/

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("------------------- Enemy --------------------------");
        System.out.println("O nome do Enemy é: " + enemy.nome);
        System.out.println("A skin do seu Enemy: " + enemy.skin);
        System.out.println("A vida do seu player é: " + enemy.getLife());
        System.out.println("-----------------------------------------------------");

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }
}