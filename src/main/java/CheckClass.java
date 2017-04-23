import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kalisiaczki on 21.04.2017.
 */
public class CheckClass {
    public static void main(String[] args) {

        List<ComponentNode> componentNodeList = new LinkedList<>();
        List<ComponentNode> componentNodeList2 = new LinkedList<>();
        List<ComponentNode> componentNodeList3 = new LinkedList<>();

        List<ComponentNode> list = new LinkedList<>();

        TaskView taskView = new TaskView("codeTask","rendererTask", list);

        ComponentNode componentNode = new ComponentNode("code","rend",componentNodeList);
        ComponentNode componentNode2 = new ComponentNode("code1","rend1",componentNodeList2);
        ComponentNode componentNode3 = new ComponentNode("code1","rend1",componentNodeList3);

        ComponentNode componentNodeInComponentNodeList = new ComponentNode("codeListInList","renderListInList");
        ComponentNode componentNodeInComponentNodeList2 = new ComponentNode("codeListInList","renderListInList");


        componentNodeList.add(componentNodeInComponentNodeList);
        componentNodeList.add(componentNodeInComponentNodeList2);
        componentNodeList.add(componentNode2);
        componentNodeList2.add(componentNode3);

        list.add(componentNode);
        list.add(componentNode2);


        System.out.println(taskView.countComponents());













    }
}
