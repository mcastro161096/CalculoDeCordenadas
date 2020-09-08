package br.com.CalculoDeCordenadas.dominio;

    public class Ponto
    {

            private double x;
            private double y;

            public Ponto(double x,double y)
            {
                this.x = x;
                this.y = y;
            }

            public Ponto()
            {
                x=0;
                y=0;
            }

            public void setX(double x)
            {
                this.x=x;
            }
            public void setY(double y)
            {
                this.y=y;
            }

            public double getX()
            {
                return x;
            }
            public double getY()
            {
                return y;
            }
            public String toString()
            {
                return "(" + x + "," + y + ")";
            }

            public double CalcularDistanciaEntreDoisPontos(Ponto pontoA, Ponto pontoB)
                    //https://brasilescola.uol.com.br/matematica/distancia-entre-dois-pontos.htm
            {
                var distancia = Math.sqrt(Math.pow(((pontoB.x) - (pontoA.x)), 2) + Math.pow(((pontoB.y) - (pontoA.y)), 2));

                return distancia;
            }

    }
