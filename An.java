import java.util.ArrayList;
import java.util.List;

public class An extends Element{
    private String name_;
    private List<Element> grupe_;

    public An(String name)
    {
        name_ = name;
        grupe_ = new ArrayList<>();
    }

    public String getName() {
        return name_;
    }

    public List<Element> getGrupe() {
        return grupe_;
    }

    @Override
    public Element add(Element element) {
        if (element != null && !element.getParent()) {
            grupe_.add(element);
            element.setParent(true);
        }

        return this;
    }

    @Override
    public Element remove(Element element) {
        if (element != null && grupe_.remove(element))
        {
            element.setParent(false);
        }

        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAn(this);
    }
}
