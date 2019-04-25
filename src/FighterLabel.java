


public class FighterLabel implements CharacterInfo{


    @Override
    public void label() {
        System.out.println("Label: Fighter");

    }

    @Override
    public void title() {
        System.out.println("Title: Leader ");

    }

    @Override
    public void getAllCharacterInfo() {
        label();
        title();

    }
}
