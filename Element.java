public abstract class Element {
    private boolean hasParent_ = false;

    Element add(Element element) { return null; };
    Element remove(Element element) { return null; };
    public void accept(Visitor visitor) {};
    public void setParent(boolean hasParent)
    {
        hasParent_ = hasParent;
    }
    public boolean getParent()
    {
        return hasParent_;
    }
}
