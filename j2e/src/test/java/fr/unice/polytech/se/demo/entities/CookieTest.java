package fr.unice.polytech.se.demo.entities;

import fr.unice.polytech.se.demo.domain.CreerUnMagasin;
import fr.unice.polytech.se.demo.domain.impl.CreerUnMagasinBean;
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

public class CookieTest {

        @Deployment
        public static Archive<?> createDeployment() {
            return ShrinkWrap.create(WebArchive.class, "test.war")
                    .addPackage(Cookie.class.getPackage())
                    .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                    .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                    .addPackage(CreerUnMagasin.class.getPackage())
                    .addPackage(CreerUnMagasinBean.class.getPackage());
        }

        @EJB
        private CreerUnMagasin creerUnMagasin;

        @Test
        public void testMagasin() {
            assertTrue(creerUnMagasin.getContents().isEmpty());
        }
        @Test
        public void testCreerMagasin(){
            creerUnMagasin.CreerUnMagasin(new Magasin("Coo", new Cookie(), null, 21));
            assertEquals(creerUnMagasin.getContents().size(), 1);
        }
}
