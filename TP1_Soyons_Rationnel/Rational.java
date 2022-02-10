//Q1.a création de la classe Rational

public class Rational
{
    int num;
    int denom;

    //Q2.a création de la méthode toString
    public String toString()
    {
        return   num +"/"+ denom;
    }

    public  Rational(int a, int b)
    {
        // Q4) Ajout d'une condition pour ne pas diviser par zéro
        if (b==0)
        { 
            throw new IllegalArgumentException("Le dénominateur ne peut pas être nul");
        }
        this.num = a;
        this.denom = b;
    } 

    public int getNum()
    {
        return num;
    }

    public int getDenom()
    {
        return denom;
    }

    public void setNum(int a)
    {
        this.num=a;
    }

    public void setDenom(int b)
    {
        this.denom=b;
    }

    public void fraction()
    {
        System.out.println(num+"/"+denom);
    }

    public void afficherDenom()
    {
        System.out.println("le denominateur est " + denom);
    }

    public void afficherNum()
    {
        System.out.println("le numerateur est " + num);
    }

    //Q5.a création de la méthode multiplier
    public void mult(Rational x, Rational y)
    {
        int numf= x.getNum()*y.getNum();
        int denumf= x.getDenom()*y.getDenom();
        System.out.println(numf+"/"+denumf);
    }

    //Q6
    public void addition(Rational x, Rational y)
    {
        int numf= x.getNum()*y.getDenom() + x.getDenom()*y.getNum();
        int denumf= x.getDenom()*y.getDenom();
        System.out.println(numf+"/"+denumf);
    }

    //Q7 méthode du PGCD 
    public static int pGCD(int a, int b)
    {
        if (a<0) a=-a;
        else
            if (a==0) return b;
        if (b<0) b=-b;
        else
            if (b==0) return a;
        if(a==b)
            return a;
        if (a<b)
            return pGCD(a, b-a);
        return pGCD(a-b,b);
    }
}

