package br.senai.jandira.sp.game.model;

import java.util.Scanner;

public class Battle {

    /**Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);

    String scenarioBattle;

    /**Instancia Scenario
     *
     */
    Scenario scenario = new Scenario();

    public void Battle(Player player , Enemy enemy){

        System.out.println(player.nome);
        System.out.println(enemy.nome);
    }

    public void ChoiceScenario(){
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Escolha um cenario:");
        System.out.println("[1 - Torre Eiffel   2- Arábia   3- Turquia ] : ");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        int choiceScenario = teclado.nextInt();

        scenario.Scenario(choiceScenario);
    }
}
