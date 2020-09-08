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

    }
