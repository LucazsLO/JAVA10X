package NivelIntermediario4;

import NivelIntermediario4.Ninja;

public class Uchiha extends Ninja {
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Sharingan ativou, eu sou do clã Uchiha!");
    }
    @Override
    public void HablidadeEspecial(){
        System.out.println("Meu nome é " + nome +" e esse é meu ataque Uchiha, jutsu bola de fogo! ");
    }
}
