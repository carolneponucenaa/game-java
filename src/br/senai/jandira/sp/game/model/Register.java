package br.senai.jandira.sp.game.model;

import java.util.Locale;
import java.util.Scanner;

public class Register { /** Instancia Scanner*/
Scanner teclado = new Scanner(System.in);


int validaPrint = 0;

    /** Instancia Player*/
    Player player = new Player();

    /** Instancia Enemy*/
    Enemy enemy = new Enemy();

    /** Instancia Output*/

    Output output = new Output();

    public void BothRegister(){
        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.Print(player);
        output.Print1(enemy);

    }

    public Player PlayerRegister(){
        /**Coleta de dados Player-1*/
        System.out.println("-------------- Cadastro Player ---------------- ");
        System.out.println("Qual o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("--------------- Player Cadastrado com Sucesso -----------------");

        /**Printa as informaçoes cadastradas*/
        if (validaPrint != 1) {
            output.Print(player);
        }
        return player;
    }
    public Enemy EnemyRegister(){
        /**Coleta de dados Enemy-1*/
        System.out.println("-------------- Cadastro Enemy ---------------- ");
        System.out.println("Qual o seu nome: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        enemy.skin = teclado.nextLine();
        System.out.println("--------------- Enemy Cadastrado com Sucesso -----------------");

        if (validaPrint != 1) {
            output.Print1(enemy);
        }
        return enemy;
        }
        public void DecisionRegister(){

        String decision;

            System.out.println("Olá, seja bem-vindo ao jogo!");
            System.out.println("Qual opção você deseja cadastrar [ PLAYER - ENEMY - AMBOS: ]");
            decision = teclado.nextLine();

            switch (decision.toUpperCase()){
                case "PLAYER":
                    PlayerRegister();
                    break;

                case "ENEMY":
                    EnemyRegister();
                    break;

                case "AMBOS":
                    BothRegister();


            }
            System.out.println("Deseja Retornar ao Cadastro novamente? [1- Sim  2-Não]:");
            int continuar = teclado.nextInt();

            if (continuar==1){

                DecisionRegister();

                }
            }

    }

