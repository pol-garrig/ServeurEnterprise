package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.entities.commande.CommandeManager;
import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.commande.CommandeManagerBean;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.cookie.CookieManager;
import fr.unice.polytech.se.demo.entities.cookie.CookieManagerBean;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.magasin.MagasinManager;
import fr.unice.polytech.se.demo.entities.magasin.MagasinManagerBean;
import org.apache.activemq.command.Command;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@RunWith(Arquillian.class)
public class CommandeManagerTest {

       @Deployment
        public static Archive<?> createDeployment() {
            return ShrinkWrap.create(WebArchive.class, "test.war")
                    .addPackage(Commande.class.getPackage())
                    .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                    .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                    .addPackage(CommandeManager.class.getPackage())
                    .addPackage(CommandeManagerBean.class.getPackage())
                    .addPackage(Cookie.class.getPackage())
                    .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                    .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                    .addPackage(CookieManager.class.getPackage())
                    .addPackage(CookieManagerBean.class.getPackage())
                    .addPackage(Magasin.class.getPackage())
                    .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                    .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                    .addPackage(MagasinManager.class.getPackage())
                    .addPackage(MagasinManagerBean.class.getPackage());
        }

        @EJB
        private CommandeManager commandeManager;
        @EJB
        private MagasinManager magasinManager;
        @EJB
        private CookieManager cookieManager;

        @Test
        public void testCreerCommande() {
            assertTrue(commandeManager.getContents().isEmpty());
        }


        @Test
        public void testCreerCommande1(){
            commandeManager.creerUneCommande(0.0, null, null);
            assertEquals(commandeManager.getContents().size(), 1);
        }

        @Test
        public void testCreerCommande2(){
            Commande c = new Commande();
            commandeManager.creerUneCommande(c);
            assertEquals(commandeManager.getContents().size(), 1);
        }

        @Test
        public void testCreerCommande3(){
            Commande commande = new Commande();
            Commande commande1 = commandeManager.creerUneCommande(0.0, null, null);
            //Deux commande avec deux id differentes
            assertNotEquals(commande, commande1);
        }

       /* @Test
        public void testCreerCommande4(){

            Cookie c = new Cookie("Chocolat",1.2,21);
           // Cookie c = cookieManager.creerUnCookie("C",1.2,21);

            Set<Cookie> cookies = new HashSet<Cookie>();

            cookies.add(c);

            Magasin m = new Magasin("MagCho",c,null,21);

            //Magasin m = magasinManager.creerUnMagasin("Mag",c,null,21);

            Commande commande = new Commande(12.21, m, cookies);

            Commande c1 = commandeManager.creerUneCommande(12.21, m, cookies);
            assertEquals(commande, c1);
        }*/



}
