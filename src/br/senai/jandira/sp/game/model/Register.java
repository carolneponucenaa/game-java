package br.senai.jandira.sp.game.model;

import java.util.Scanner;

public class Register { /** Instancia Scanner*/
Scanner teclado = new Scanner(System.in);

    /** Instancia Player*/
    Player player = new Player();

    /** Instancia Enemy*/
    Enemy enemy = new Enemy();

    public void BothRegister(){
        PlayerRegister();
        EnemyRegister();
        DecisionRegister();

    }

    public void PlayerRegister(){
        /**Coleta de dados Player-1*/
        System.out.println("-------------- Cadastro Player ---------------- ");
        System.out.println("Qual o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("--------------- Player Cadastrado com Sucesso -----------------");

    }
    public void EnemyRegister(){
        /**Coleta de dados Enemy-1*/
        System.out.println("-------------- Cadastro Enemy ---------------- ");
        System.out.println("Qual o seu nome: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        enemy.skin = teclado.nextLine();
        System.out.println("--------------- Enemy Cadastrado com Sucesso -----------------");


        }
        public void DecisionRegister(){

        String decision;

            System.out.println("Olá, seja bem-vindo ao jogo!");
            System.out.println("Qual opção você deseja cadastrar [ PLAYER - ENEMY - AMBOS: ]");
            decision = teclado.nextLine();

            switch (decision){
                case "PLAYER":
                    PlayerRegister();
                    break;

                case "ENEMY":
                    EnemyRegister();
                    break;

                case "AMBOS":
                    BothRegister();

                default:
                    System.out.println("Digite uma opção válida: [ PLAYER - ENEMY - AMBOS: ] ");

            }

    }

}
