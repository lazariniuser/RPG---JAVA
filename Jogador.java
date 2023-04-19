import java.util.*;

public class Jogador {

    public void partida() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vida = random.nextInt(0, 10000);
        int vidaoponente = random.nextInt(0, 10000);
        int ataque = random.nextInt(0, 10000);
        int defesa = random.nextInt(0, 10000);

        System.out.println("Olá! Qual será o nome do jogador?");
        String nome = scanner.nextLine();
        System.out.println("Ok," + nome + "! a sua partida já vai  começar. Seus atributos são: ");
        System.out.println("Vida: " + vida + "./n Ataque: " + ataque + "./n Defesa:" + defesa + "./n");

        System.out.println("A Partida começou! Ei, " + nome
                + ", Fique atento aos movimentos do inimigo! Ele pode ser ardiloso... ");

        while (vida > 1 && vidaoponente > 1) {
            System.out.println("Qual será a ação tomada? /n Atacar - 1; /n Aguardar - 2.");
            System.out.println("===============================================================");
            int decisao = scanner.nextInt();

            if (decisao == 1) {
                System.out.println("Preparaando armas, apontando, e...");
                System.out.println("===============================================================");
                int sucesso = random.nextInt(0, 1000);

                if (sucesso < 100) {
                    System.out.println(
                            "Erm... Parece que você pegou de mau jeito esse golpe... Que tal tentar numa próxima?");
                    System.out.println("Seu dano foi de " + sucesso + ".");
                    System.out.println("===============================================================");
                    vidaoponente = vidaoponente - sucesso;
                }

                else if (sucesso > 101 && sucesso < 5000) {
                    System.out.println("Ótimo golpe! Essa pegou em cheio.");
                    System.out.println("Seu dano foi de " + sucesso + ".");
                    System.out.println("===============================================================");
                    vidaoponente = vidaoponente - sucesso;
                }

                else if (sucesso > 5000) {
                    System.out
                            .println("CARACAAAA!!! QUE PORRADÃO FOI ESSE?? SEU GOLPE MANDOU O ADVERSÁRIO PARA LONGE.");
                    System.out.println("Seu dano foi de " + sucesso + ".");
                    System.out.println("===============================================================");
                    vidaoponente = vidaoponente - sucesso;
                }

            } else {
                System.out.println("Nenhuma ação foi feita. O oponente seguirá com sua vez.");
                System.out.println("===============================================================");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Vez do oponente!");
            System.out.println("===============================================================");
            System.out.println("===============================================================");
            System.out.println("Ele se prepara. Parece focado em seu próximo movimento...");
            System.out.println("===============================================================");
            System.out.println("===============================================================");
            try {
                Thread.sleep(5000); //
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int chance = random.nextInt(0, 1000);
            if (chance > 5000) {
                System.out.println("UAU! QUE GOLPE ABSURDO! É PRA APLAUDIR DE PÉ!!");
                System.out.println("Você recebeu um dano de " + chance + ".");
                System.out.println("===============================================================");
                vida = vida - chance;

            } else if (chance > 10 && chance < 5000) {
                System.out.println("Que boa jogada. Foi um golpe certeiro!");
                System.out.println("Você recebeu um dano de " + chance + ".");
                System.out.println("===============================================================");
                vida = vida - chance;
            } else if (chance < 5) {
                System.out.println("Puts... Pegou mal esse golpe. Precisa treinar mais!");
                System.out.println("Você recebeu um dano de " + chance + ".");
                System.out.println("===============================================================");
                vida = vida - chance;
            } else {
                System.out.println("O oponente não fez nenhuma ação. Você não recebeu nenhum dano.");
                vida = vida - chance;
            }

        }
        System.out.println("===============================================================");
        System.out.println("A partida acabou! E o vencedor foi...");
        try {
            Thread.sleep(8000); // pausa de 100 milissegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (vida > vidaoponente) {
            System.out.println("PARABÉNS!! " + nome + " venceu!!!");
        } else {
            System.out.println("É... Não foi dessa vez! O oponente derrotou você. Você PERDEU!");
        }

        int[] listaHabilidades = { ataque, vida, defesa };

        for (int i = 0; i < listaHabilidades.length; i++) {
            ataque += 2;
            defesa += 1;
            vida = (ataque + defesa) * 10;
        }

        System.out
                .println("Parabéns! Seu jogador evoluiu. Seus novos atributos são: /n Vida = " + vida + "; /n Ataque = "
                        + ataque + "; /n Defesa = " + defesa + ".");
    }
}
