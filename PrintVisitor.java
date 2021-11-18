public class PrintVisitor implements Visitor{
    public PrintVisitor()
    {

    }

    @Override
    public void visitAn(An an) {
        System.out.println(an.getName());

        for (Element element : an.getGrupe())
        {
            element.accept(this);
        }
    }

    @Override
    public void visitGrupa(Grupa grupa) {
        System.out.println("\t" + grupa.getName());

        for (Element element : grupa.getSemigrupe())
        {
            element.accept(this);
        }
    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        System.out.println("\t\t" + semigrupa.getName());

        for (Element element : semigrupa.getStudents())
        {
            element.accept(this);
        }
    }

    @Override
    public void visitStudent(Student student) {
        System.out.println("\t\t\t" + student.getName() + ", " + student.getEmail());
    }
}
