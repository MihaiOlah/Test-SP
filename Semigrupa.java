import java.util.ArrayList;
import java.util.List;

public class Semigrupa extends Element{
    private String name_;
    private List<Element> students_;

    public Semigrupa(String name)
    {
        name_ = name;
        students_ = new ArrayList<>();
    }

    public String getName() {
        return name_;
    }

    public List<Element> getStudents() {
        return students_;
    }

    @Override
    public Element add(Element element) {
        if (element != null && !element.getParent() && students_.size() < 15)
        {
            students_.add(element);
            element.setParent(true);
        }

        return this;
    }

    @Override
    public Element remove(Element element) {
        if (element != null && students_.remove(element))
        {
            element.setParent(false);
        }

        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSemigrupa(this);
    }
}
