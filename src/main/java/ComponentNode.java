import java.util.Collections;
import java.util.List;

/**
 * Created by kalisiaczki on 21.04.2017.
 */
public class ComponentNode implements IComponentNode  {

    private String code;
    private String renderer;
    private List<ComponentNode> components;

    public ComponentNode(String code, String renderer, List<ComponentNode> components) {
        this.code = code;
        this.renderer = renderer;
        this.components = components;
    }

    public ComponentNode(String code, String renderer) {
        this.code = code;
        this.renderer = renderer;
    }

    public String getCode() {
        return code;
    }

    public String getRenderer() {
        return renderer;
    }

    public List<ComponentNode> getComponents() {
        return Collections.unmodifiableList(components);
    }
}
