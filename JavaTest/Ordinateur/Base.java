package Ordinateur;

public class Base {

    /*
    Dans la main qui est en dessous on va definir chaque composant de l'ordinateur
    Donc definir l'ecran, le clavier, la souris .... 
    On creer une nouvelle instance : alienware et on informe qu'il appartient a Portable donc il va recup les infos inscri dans le fichier Portable
    On creer une nouvelle instance : HP et on informe qu'il appartient a Fixe donc il va recup les infos inscri dans Fixe
    */
    public static void main(String[] args) {
        Portable alienware = new Portable("Full THD de haute qualite avec 1M de pixels 3D", "Magnifique clavier AZERTY retroeclaire", "Touchpad", "Alienware", 64);
        Fixe HP = new Fixe(4, "Clavier hp de merde", "HP encore plus pourris", "HP", 1, true, true);

        // ici on inscris la parti affiché lors du : java base 
        System.out.println("Fiche technique de l'alienware :" );
        System.out.println("Clavier : "+alienware.clavier);
        System.out.println("Ecran : "+alienware.ecran);
        System.out.println("Marque : "+alienware.marque);
        System.out.println("Nombre de RAM : "+alienware.nbRam);
        System.out.println("Souris : "+alienware.souris);
        
        //Ce print sert uniquement pour faire un espace entre les 2 Ordi
        System.out.println(" ");

        System.out.println("Fiche technique de l'HP :" );
        System.out.println("Clavier : "+HP.clavier);
        System.out.println("Ecran : "+HP.ecran);
        System.out.println("Marque : "+HP.marque);
        System.out.println("Nombre de RAM : "+HP.nbRam);
        System.out.println("Souris : "+HP.souris);
        System.out.println("Possede une cam : "+HP.cam);
        System.out.println("Possede une Tour : "+HP.tour);

    }
    
}
