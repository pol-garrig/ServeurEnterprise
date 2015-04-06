package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.CookieFinder;
import fr.unice.polytech.se.demo.domain.CreerCookie;
import fr.unice.polytech.se.demo.domain.impl.CreerCookieBean;
import fr.unice.polytech.se.demo.entities.Cookie;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;

import javax.ejb.EJB;

import static org.junit.Assert.assertEquals;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
public class CreerCookieTest {

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Cookie.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(CreerCookie.class.getPackage())
                .addPackage(CreerCookieBean.class.getPackage());
    }


    @EJB
    private CreerCookie cookie;

    @EJB
    private CookieFinder finder;

    @Test
    public void testCreation()  {
        String c = "Cho";
       Cookie cookie1 = cookie.creerCookie(c);
      //  Cookie cookie1 = new Cookie("Chocolat");
        assertEquals(cookie1.getName(), "Cho");
    }

   /* @Test
    public void testFinder(){
        Cookie cho = cookie.creerCookie("Chocolat");
        Cookie found = finder.findByName("Chocolat");
        assertEquals(found,cho );
    }*/
}
