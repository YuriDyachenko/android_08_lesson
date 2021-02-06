package kurs;

public class CatWithSex extends Cat{
    private final String sexName;

    public CatWithSex(String name, String sexName) {
        super(name);
        this.sexName = sexName;
    }

    @Override
    public String getName() {
        return sexName + ' ' + super.getName();
    }
}
