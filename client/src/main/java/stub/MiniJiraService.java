
package stub;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MiniJiraService", targetNamespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MiniJiraService {


    /**
     * 
     * @param developerId
     * @param contents
     * @param projectId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "pushed", targetNamespace = "")
    @RequestWrapper(localName = "pushTasks", targetNamespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", className = "stub.PushTasks")
    @ResponseWrapper(localName = "pushTasksResponse", targetNamespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", className = "stub.PushTasksResponse")
    public boolean pushTasks(
        @WebParam(name = "project_id", targetNamespace = "")
        String projectId,
        @WebParam(name = "contents", targetNamespace = "")
        String contents,
        @WebParam(name = "developer_id", targetNamespace = "")
        String developerId);

    /**
     * 
     * @param projectId
     * @return
     *     returns java.util.List<stub.Task>
     */
    @WebMethod
    @WebResult(name = "task_list", targetNamespace = "")
    @RequestWrapper(localName = "listTasks", targetNamespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", className = "stub.ListTasks")
    @ResponseWrapper(localName = "listTasksResponse", targetNamespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", className = "stub.ListTasksResponse")
    public List<Task> listTasks(
        @WebParam(name = "project_id", targetNamespace = "")
        String projectId);

    /**
     * 
     * @param projectId
     * @param developers
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "created", targetNamespace = "")
    @RequestWrapper(localName = "createNewProject", targetNamespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", className = "stub.CreateNewProject")
    @ResponseWrapper(localName = "createNewProjectResponse", targetNamespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", className = "stub.CreateNewProjectResponse")
    public boolean createNewProject(
        @WebParam(name = "project_id", targetNamespace = "")
        String projectId,
        @WebParam(name = "developers", targetNamespace = "")
        List<String> developers);

}
