package br.senai.jandira.sp.game.model;

import java.util.Scanner;

public class Menu {

    public void Menu() {

        Scanner teclado = new Scanner(System.in);

        Register register = new Register();
        Battle battle = new Battle();

        Player player = new Player();
        Enemy enemy = new Enemy();

        boolean continuar = true;

        while (continuar){

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-//-");

            System.out.println("-------------------- BEM VINDO --------------------");
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Register");
            System.out.println("2 - Battle");
            System.out.println("3 - Exit");

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-//-");

            int userOption = teclado.nextInt();

            switch (userOption) {

                case 1:
                    register.DecisionRegister();
                    break;

                case 2:
                    battle.ChoiceScenario();
                    battle.Battle(register.player, register.enemy);
                    break;

                case 3:
                    continuar = false;
                    break;



            }
        }
    }
}
