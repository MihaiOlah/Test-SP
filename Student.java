public class Student extends Element{
    private String name_;
    private String email_;

    public Student(String name, String email)
    {
        name_ = name;
        email_ = email;
    }

    public String getName() {
        return name_;
    }

    public String getEmail() {
        return email_;
    }

    @Override
    public Element add(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element remove(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}
