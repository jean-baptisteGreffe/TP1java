//Q1.b création du programme de test de la classe Rational
public class TestRational
{
    public static void main(String[] args)
    {
        Rational testfraction = new Rational(3,2);
        testfraction.afficherDenom();
        testfraction.afficherNum();
        testfraction.fraction();

        // Q2.b modification du programme de test pour utiliser la méthode toString
        System.out.println(testfraction.toString());

        // Q3 Oui on peut créer un rationel de dénominateur zéro, mais cela pose un problème car la division par 0 est impossible
        Rational testFractionImpossible = new Rational(523,0);
        testFractionImpossible.afficherDenom();
        testFractionImpossible.afficherNum();
        testFractionImpossible.fraction();

        // Q4 Pour remedier à ce problème on va ajouter des contraintes dans la classe Rational sur le type de valeur que prendre le dénominateur.
        
        // Q5.b test de la fonction multiplier pour que cela fonctionne il faut changer la valeur 0 de la question 3 car cela nous fait sortir du programme
        Rational testfraction2 = new Rational(1,3);

        testfraction.mult(testfraction,testfraction2);

        // Q6 test de l'addition mais il faut aussi changer la valeur 0 de la question 3 pour la même raison qu'a la question 5.b
        testfraction.addition(testfraction,testfraction2);

        // Q7 test du PGCD 
        System.out.println(testfraction.pGCD(testfraction.getNum(), testfraction.getDenom()));



    }
}