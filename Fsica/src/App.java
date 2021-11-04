public class App {
    public static void main(String[] args) {
       Calculos calculos = new Calculos();

       //Força Peso
       float valorGravidade = 9.81f;
       float valorMassa = 2f;

       float resultado = calculos.forcaPeco(valorGravidade, valorMassa);

       System.out.println("O valor do peso é " + resultado);
    


      //Força centrípeta
      float massaDoCorpo = 800f;
      float velocidadeDoCorpo = 20f;
      float  raioDaTrajetóriaCircular = 100f;

      float resultado1 = calculos.forcaCentripeta(massaDoCorpo, velocidadeDoCorpo, raioDaTrajetóriaCircular);

      System.out.println("A Força centrípeta é " + resultado1);



      //Impulso
      float  forcaMedia = 37f;
      float intervaloDeTempo = 12f;

      float resultado2 = calculos.impulso(forcaMedia, intervaloDeTempo);

      System.out.println("O valor do impulso é " + resultado2);



      //Força Elástica
      float  constanteElasticaDaMola =500f;
      float deformação = 8f;

      float resultado3 = calculos.impulso(constanteElasticaDaMola, deformação);

      System.out.println("A intensidade da força aplicada é " + resultado3);
     



     //Velocidade média
      float  intervaloDoDeslocamentoPosicaoFinal = 200f;
      float intervaloDoDeslocamentoPosicaoInicial = 900f;
      float intervaloDeTempoFinal = 2f;
      float intervaloDeTempoInicial = 6f;

      float resultado4 = calculos.velocidadeMedia(intervaloDoDeslocamentoPosicaoFinal, intervaloDoDeslocamentoPosicaoInicial, intervaloDeTempoFinal,intervaloDeTempoInicial);

      System.out.println("A velocidade Média é " + resultado4);



      //Movimento Retilíneo Uniformemente(MRU)
      float variacaoDoEspaco = 800f;
      float intervaloDoTempo = 8f;

      float resultado5 = calculos.mru(variacaoDoEspaco, intervaloDoTempo);

      System.out.println("O MRU aplicado é " + resultado5);



      //Movimento Retilíneo Uniformemente Variado(MRUV)
      float velocidadeInicial = 344f;
      float aceleracao  = 6f;
      float tempo   = 360f;


      float resultado6 = calculos.mruv(velocidadeInicial, aceleracao, tempo);

      System.out.println("O MRUV aplicado é " + resultado6);
    }
}
