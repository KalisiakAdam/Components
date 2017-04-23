import java.util.List;

/**
 * Created by kalisiaczki on 19.04.2017.
 */
public interface ICompositeComponentNode extends IComponentNode {
    List<IComponentNode> getComponents();
}
