package Ordinateur;

public class Portable {

    //Parametre par defaut d'un PC portable, un PC possede :
    String ecran;
    String clavier;
    String souris;
    String marque;
    int nbRam;
    

    /*
    On definis precisement le contenu du parametre par defaut
    Comme on peu pas appeler de la meme maniere que dans la class
    On donne alors pour le constructeur des noms differents
    */
    public Portable(String e, String c, String s, String m, int nr) {
        ecran = e;
        clavier = c;
        souris = s;
        marque = m;
        nbRam = nr;

    }
}
