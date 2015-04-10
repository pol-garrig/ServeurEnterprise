package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.commande.CommandeManager;
import fr.unice.polytech.se.demo.entities.commande.CommandeManagerBean;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.cookie.CookieManager;
import fr.unice.polytech.se.demo.entities.cookie.CookieManagerBean;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.magasin.MagasinManager;
import fr.unice.polytech.se.demo.entities.magasin.MagasinManagerBean;
import fr.unice.polytech.se.demo.webservice.ServiceManageFranchiseImplements;
import fr.unice.polytech.se.demo.webservice.ServicePrendreRendezvous;
import fr.unice.polytech.se.demo.webservice.ServicePrendreRendezvousBean;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@RunWith(Arquillian.class)
public class ServicePredreRendezvousTest {

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(ServicePrendreRendezvous.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(ServicePrendreRendezvousBean.class.getPackage());
    }


    @Test
    public void test(){
    //    ServiceManageFranchiseImplements sf = new ServiceManageFranchiseImplements();

    //   sf.creerBoutique2("fer");

    //    ServicePrendreRendezvousBean srv = new ServicePrendreRendezvousBean();
    //   System.out.print(sf.getListeMagasin());

    //   System.out.print(srv.getListeMagasin());

    //    assertEquals(srv.getListeMagasin().size(), 1);
    }
}
