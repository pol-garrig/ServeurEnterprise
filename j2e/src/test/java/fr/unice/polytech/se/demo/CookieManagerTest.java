package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.cookie.CookieManager;
import fr.unice.polytech.se.demo.entities.cookie.CookieManagerBean;
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
 * Created by Garrigos Fernando on 07/04/15.
 */
@RunWith(Arquillian.class)
public class CookieManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Cookie.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(CookieManager.class.getPackage())
                .addPackage(CookieManagerBean.class.getPackage());
    }

    @EJB
    private CookieManager cookieManager;

    @Test
    public void testCreerCookie() {
        assertTrue(cookieManager.getContents().isEmpty());
    }

    @Test
    public void testCreerCookie1(){
        cookieManager.creerUnCookie("",0.0,0);
        assertEquals(cookieManager.getContents().size(), 1);
    }

    @Test
    public void testCreerCookie2(){
        Cookie c = new Cookie();
        cookieManager.creerUnCookie(c);
        assertEquals(cookieManager.getContents().size(), 1);
    }

    @Test
    public void testCreerCookie3(){
        Cookie cookie = new Cookie();
        Cookie cookie1 = cookieManager.creerUnCookie("",0.0,0);
        assertEquals(cookie,cookie1);
    }

    @Test
    public void testCreerCookie4(){
        Cookie cookie = new Cookie("Chocolat",1.2,21);
        Cookie c1 = cookieManager.creerUnCookie("Chocolat",1.2,21);
        System.out.print(c1);
        assertEquals(cookie,c1);
    }
}
