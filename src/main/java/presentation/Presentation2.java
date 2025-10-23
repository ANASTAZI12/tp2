package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Classe principale qui démarre l'application Spring
 * et récupère les beans définis par annotations (@Component, @Autowired, etc.)
 */
@Configuration
@ComponentScan(basePackages = {"dao", "metier"})  // Scan les bons packages
public class Presentation2 {

    public static void main(String[] args) {
        // Création du contexte Spring à partir de la configuration par annotations
        ApplicationContext context = new AnnotationConfigApplicationContext(Presentation2.class);

        // Récupération du bean de type IMetier depuis le conteneur
        IMetier metier = context.getBean(IMetier.class);

        // Exécution de la méthode et affichage du résultat
        System.out.println("Résultat = " + metier.calcul());
    }
}
