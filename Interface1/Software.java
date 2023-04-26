package Interface1;

public class Software extends FrontEnd implements BackEnd,Database{
    @Override
    public void DevelopServerProgram(String language)
    {
        System.out.println("Developing server program with"+language);
    }
    @Override
    public void CreateDatabase(String vendor)
    {
        System.out.println("Creating data base with"+vendor);
    }
}
