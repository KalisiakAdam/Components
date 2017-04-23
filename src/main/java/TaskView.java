import java.util.*;
import java.util.stream.Collectors;


public class TaskView implements ITaskView, ICompositeComponentNode {

    private String code;
    private String renderer;
    private List<ComponentNode> components;

    public String getCode() { return code; }
    public String getRenderer() { return renderer; }


    public TaskView(String code, String renderer, List<ComponentNode> components) {
        this.code = code;
        this.renderer = renderer;
        this.components = components;
    }

    public List<IComponentNode> getComponents() {

        Stack<IComponentNode> stack = new Stack<>();
        if(!components.isEmpty()) {

                for (ComponentNode componentNode : components){
                    for (ComponentNode componentNode1: componentNode.getComponents() ){
                        stack.push(componentNode1);
                    }
                    stack.push(componentNode);
                }

        }else{
            System.out.println("empty");
        }
        return stack.stream().collect(Collectors.toList());
    }

    public IComponentNode findComponent(String code) {
        IComponentNode result = getComponents().stream().filter(ifCode ->ifCode.getCode().contains(code))
                .findFirst().orElse(null);

        return result;
    }

    public IComponentNode findComponentByRenderer(String renderer) {
        IComponentNode result = getComponents().stream().filter(ifCode ->ifCode.getRenderer().contains(renderer))
              .findFirst().orElse(null);

        return result;
    }

    public int countComponents() {
        if(!components.isEmpty()) {
            return (int) getComponents().stream().count();
        }else {
            return 0;
        }
    }
}
