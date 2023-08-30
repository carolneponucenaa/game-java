package br.senai.jandira.sp.game.model;

import java.util.Scanner;

public class Battle {

    /**
     * Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);

    String scenarioBattle;

    /**
     * Instancia Scenario
     */
    Scenario scenario = new Scenario();

    public void Battle(Player player, Enemy enemy) {

        while (true) {

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();


            if (lifeEnemy == 0) {
                System.out.println("O player " + player.nome + " é o vencedor !!!");
                break;

            } else if (lifePlayer == 0) {
                System.out.println("O enemy " + enemy.nome + " é o vencedor !!!");
                break;
            }

            System.out.println("---------------------------- BATTLE -------------------------");
            System.out.println(" Ataque Player [ C ] " + player.nome + lifePlayer);
            System.out.println(" Ataque Enemy [ X ]" + enemy.nome + lifeEnemy);
            System.out.println("--------------------------------------------------------------");

            String attack = teclado.next();

            if (attack.equalsIgnoreCase("C")) {
                System.out.println("------------------");
                System.out.println("- Player Atacou -");
                System.out.println("------------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;
                int defesaEnemy = (int) (Math.random() * 20) + 1;
                int danoReal = danoPlayer - defesaEnemy;
                if (danoReal < 0 ){
                    danoReal = 0;
                }
                enemy.SubtraiVida(danoReal);
                System.out.println(" O ataque foi de : " + danoPlayer);

            } else if (attack.equalsIgnoreCase("X")) {
                System.out.println("------------------");
                System.out.println("- Enemy Atacou -");
                System.out.println("------------------");

                int danoEnemy = (int) (Math.random() * 20) + 1;
                int defesaPlayer = (int) (Math.random() * 20) + 1;
                int danoReal = danoEnemy - defesaPlayer;

                if (danoReal < 0 ){
                    danoReal = 0;
                }
                player.SubtraiVida(danoReal);
                System.out.println(" O ataque foi de : " + danoEnemy);
                System.out.println(" A defesa foi de: " + defesaPlayer);


            } else {
                System.out.println("Tecla Invalida !!!!!");
            }
        }
    }


    public void ChoiceScenario () {
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("Escolha um cenario:");
            System.out.println("[1 - Torre Eiffel   2- Arábia   3- Turquia - Default: Senai Jandira] : ");
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int choiceScenario = teclado.nextInt();

            scenario.Scenario(choiceScenario);
        }
}