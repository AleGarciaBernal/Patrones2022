package ejerciciosP3.composite.tarea;

import java.util.ArrayList;
import java.util.List;

public class CompositeComputadora extends Component{

    private List<Component> componentList= new ArrayList<>();

    public CompositeComputadora(String type) {
        super(type);
    }

    @Override
    public void operation() {
        int temp=0;
        for (Component c: componentList) {
            c.operation();
            temp=temp+c.getPrecio();
        }
        this.setPrecio(temp);
        this.showInfo();
    }

    @Override
    public void add(Component component) {
        componentList.add(component);

    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int position) {
        return componentList.get(position);
    }
}
