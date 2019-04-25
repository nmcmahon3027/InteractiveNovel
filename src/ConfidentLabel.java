

public class ConfidentLabel implements CharacterInfo{
    @Override
    public void label() {
        System.out.println("Label: Confident");

    }

    @Override
    public void title() {
        System.out.println("Title: Disruptive");

    }

    @Override
    public void getAllCharacterInfo() {
        label();
        title();

    }
}
