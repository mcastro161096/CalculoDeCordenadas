package br.com.CalculoDeCordenadas.aplicacao;
import java.util.Scanner;
import br.com.CalculoDeCordenadas.dominio.Ponto;
    public class Programa
    {
        public static void main(String [] args)
        {
            Scanner ler = new Scanner(System.in);
                Ponto pontoA = new Ponto();

                 Ponto pontoB = new Ponto();

                 System.out.println("Informe a cordenada X  para o ponto A");
                    pontoA.setX(ler.nextDouble());

                    System.out.println("Informe a cordenada y  para o ponto A");
                        pontoA.setY(ler.nextDouble());

            System.out.println("Agora vamos informar o ponto B");

                            System.out.println("Informe a cordenada X  para o ponto B");
                                            pontoB.setX(ler.nextDouble());

                                                System.out.println("Informe a cordenada y  para o ponto B");
                                                     pontoB.setY(ler.nextDouble());


                System.out.println("A distancia entre os pontos A e B é: "+ pontoA.CalcularDistanciaEntreDoisPontos(pontoA,pontoB));

                     System.out.println("O ponto A está:" + pontoA.IndicarLocalizacaoNoPlanoCartesiano(pontoA));

                        System.out.println("O ponto B está:" + pontoA.IndicarLocalizacaoNoPlanoCartesiano(pontoB));
        }
    }
