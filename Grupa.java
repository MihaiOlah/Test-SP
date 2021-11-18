import java.util.ArrayList;
import java.util.List;

public class Grupa extends Element{
    private String name_;
    private List<Element> semigrupe_;

    public Grupa(String name)
    {
        name_ = name;
        semigrupe_ = new ArrayList<>();
    }

    public String getName() {
        return name_;
    }

    public List<Element> getSemigrupe() {
        return semigrupe_;
    }

    @Override
    public Element add(Element element) {
        if (element != null && !element.getParent() && semigrupe_.size() < 2)
        {
            semigrupe_.add(element);
            element.setParent(true);
        }

        return this;
    }

    @Override
    public Element remove(Element element) {
        if (element != null && semigrupe_.remove(element)) {
            element.setParent(false);
        }
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }
}
