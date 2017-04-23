/**
 * Created by kalisiaczki on 19.04.2017.
 */
public interface ITaskView  {
    IComponentNode findComponent(String code);

    IComponentNode findComponentByRenderer(String renderer);

    int countComponents();
}
