package br.com.barbara.tema05;

import java.util.List;

public class Main {
    static void main() {
        PersonagemDAO personagemDAO = new PersonagemDAO();
        Mago mago = new Mago(2, "joao", 23, 54, 34);
        Guerreiro guerreiro = new Guerreiro(1, "kla", 34, 23, 65);

        personagemDAO.salvar(mago);
        personagemDAO.salvar(guerreiro);

        List<Personagem> personagems = personagemDAO.buscarTodos();
        for (Personagem p : personagems) {
            double dano = p.atacar();
            System.out.println("O " + p.getNome() + " Causou " + dano + " de dano!");
        }
    }
}
