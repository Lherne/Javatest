package Ordinateur;

public class Fixe {

    //Parametre par defaut d'un PC fixe, un PC possede :
    int ecran;
    String clavier;
    String souris;
    String marque;
    int nbRam;
    Boolean cam;
    Boolean tour;
    

    /*
    On definis precisement le contenu du parametre par defaut
    Comme on peu pas appeler de la meme maniere que dans la class
    On donne alors pour le constructeur des noms differents
    */
    public Fixe(int e, String c, String s, String m, int nr, Boolean cm, Boolean t) {
        ecran = e;
        clavier = c;
        souris = s;
        marque = m;
        nbRam = nr;
        cam = cm;
        tour = t;
    }       
}
