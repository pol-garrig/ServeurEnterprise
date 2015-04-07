package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.MagasinManager;
import fr.unice.polytech.se.demo.domain.impl.MagasinManagerBean;
import fr.unice.polytech.se.demo.entities.*;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */

@RunWith(Arquillian.class)
public class MagasinManagerTest {

        @Deployment
        public static Archive<?> createDeployment() {
            return ShrinkWrap.create(WebArchive.class, "test.war")
                    .addPackage(Magasin.class.getPackage())
                    .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                    .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                    .addPackage(MagasinManager.class.getPackage())
                    .addPackage(MagasinManagerBean.class.getPackage());
        }

        @EJB
        private MagasinManager magasinManager;

        @Test
        public void testMagasin() {
           assertTrue(magasinManager.getContents().isEmpty());
       }

        @Test
        public void testCreerMagasin(){
            magasinManager.creerUnMagasin("Coo", null, null, 21);
           assertEquals(magasinManager.getContents().size(), 1);
        }


        @Test
        public void testCreerMagasin2(){
            Magasin m = new Magasin();
            magasinManager.creerUnMagasin(m);
            assertEquals(magasinManager.getContents().size(), 1);
        }

        @Test
        public void testCreerMagasin3(){
            Magasin m = new Magasin();
            Magasin m1 = magasinManager.creerUnMagasin("",null,null,0);
            assertEquals(m,m1);
        }


}
