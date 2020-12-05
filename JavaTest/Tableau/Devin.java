package Tableau;

import java.io.*;
import java.util.*;

public class Devin{
	public static void main(String [] args) throws IOException
	{
		int nb_a_trouver = EntierAleatoire();
		int proposition = -1;
		int nb_coups = 0;
		
		System.out.println("LE NOMBRE A TROUVER EST COMPRIS ENTRE 0 ET 1000.");
        
        // ICI on dit que tant que le nombre de coup est inferieur a 10 alors le joueur peu continuer
		while(nb_a_trouver != proposition && nb_coups < 10)
		{
		    System.out.print("NOMBRE : ");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			proposition = Integer.parseInt(br.readLine());			
			
			if(proposition < nb_a_trouver)
				System.out.println("LE NOMBRE A TROUVER EST PLUS GRAND!");
			if(proposition > nb_a_trouver)
				System.out.println("LE NOMBRE A TROUVER EST PLUS PETIT!");
            
            //Ici on indique que le nombre de coup est +1 
			nb_coups++;
		}
		
		Bilan(nb_a_trouver,proposition, nb_coups);
		
	}
	
	//Renvoie un entier compris entre 0 et 1000
	public static int EntierAleatoire()
	{
		Random rand = new Random();
		return rand.nextInt(1000);
	}
	
	//Affiche le bilan de la partie
	public static void Bilan(int nb_a_trouver, int proposition, int nb_coups)
	{
        //ici on determine l'affichage de la parti si gagné ou perdu 
		if(nb_a_trouver == proposition)
		{
			System.out.println("GAGNE EN " + nb_coups + " COUPS");
		}
		else
		{
			System.out.println("PERDU, LE NOMBRE A TROUVER ETAIT " + nb_a_trouver);
		}
	}
	
}