import java.util.Scanner;

public class TP1_BasesDeJava {
    public static void main(String[] args) {
 //Étape 1 – Affichage du menu principal
 System.out.println("=== MENU PRINCIPAL des applications mathematiques ===");
        System.out.println("1. ADDITION");
        System.out.println("2. MULTIPLICATION");
        System.out.println("3. MOYENNE");
        System.out.println("4. MAXIMUM ");
        System.out.println("5. DIVISION");
        System.out.println("0. QUITTER");


//Étape 2 – Lecture du choix de l'utilisateur

   Scanner sc = new Scanner(System.in);
   int choix;
    do {
    System.out.print("Choisissez une option : ");
     choix = sc.nextInt();
     System.out.println("Vous avez Choisissez "+choix );
//Étape 4 – Intégration dans le menu (dans le main)
       switch (choix) {
                case 1:
                    System.out.print("Entrez deux entiers : ");
                    int nombre1 = sc.nextInt();
                    int nombre2 = sc.nextInt();
                    System.out.println("Résultat : " + addition(nombre1, nombre2));
                    break;
                
                case 2:
                    System.out.print("Entrez deux entiers : ");
                    int nombre3 = sc.nextInt();
                    int nombre4 = sc.nextInt();
                    System.out.println("Résultat : " + multiplication(nombre3, nombre4));
                    break;
                
                case 3:
                    System.out.print("Combien de valeurs  on a ? ");
                    int n = sc.nextInt();
                    int[] valeurs = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Valeur " + (i + 1) + " : ");
                        valeurs[i] = sc.nextInt();
                    }
                    System.out.println("Moyenne : " + moyenne(valeurs));
                    break;
                
                case 4:
                    System.out.print("Combien de nombres on a ? ");
                    int m = sc.nextInt();
                    int[] entiers = new int[m];
                    for (int i = 0; i < m; i++) {
                        System.out.print("Nombre " + (i + 1) + " : ");
                        entiers[i] = sc.nextInt();
                    }
                    System.out.println("Maximum : " + maximum(entiers));
                    break;
                case 5:
                    System.out.print("Entrez deux entiers : ");
                    int nombre5 = sc.nextInt();
                    int nombre6 = sc.nextInt();
                    if (nombre6 == 0) {
                    System.out.println("Erreur : division par zéro impossible !");
                } else {
                   System.out.println("Résultat : " + division(nombre5, nombre6));
                }
                   break;
                   
                case 0:
                    System.out.println("Arrêt du programme.");
                    break;
                
                default:
                    System.out.println("Option invalide !");
            }
            
        } while (choix != 0);
        
        sc.close();
    }
   

 //Étape 3 – Implémentation des fonctionnalités avec méthodes
    //a. Méthode pour l’addition (2 entiers)
    public static int addition(int a, int b) {
    return a + b;
}
    //b. Méthode pour la multiplication (2 entiers)
public static int multiplication(int a, int b) {
    return a * b;
} 

    //c. Méthode moyenne avec varargs
public static double moyenne(int... valeurs) {
    int total = 0;
    for (int v : valeurs) {
        total += v;
    }
    return (double) total / valeurs.length;
}

    //d. Méthode pour trouver le plus grand nombre (varargs)
public static int maximum(int... valeurs) {
    int max = valeurs[0];
    for (int v : valeurs) {
        if (v > max) {
            max = v;
        }
    }
    return max;
}
    //e. Méthode pour la division (2 entiers)
public static double division(int a, int b) {
    return (double) a / b;
}

}
