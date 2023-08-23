package br.senai.jandira.sp.game.model;

public class Scenario {
    public String Scenario(int optionScenario) {

        String scenario = "Senai Jandira";

        switch (optionScenario) {
            case 1:
                scenario = "Torre Eilffel";
            break;

            case 2:
                scenario = "Arabia - [Junto com o Ney]";
            break;

            case 3:
                scenario = "Turquia";

            break;
        }
        return scenario;
    }
}
