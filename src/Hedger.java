

public class Hedger implements CharacterInfo {
    @Override
    public void label() {
        System.out.println("Label: Hedger");

    }

    @Override
    public void title() {
        System.out.println("Title:Indecisive");

    }

    @Override
    public void getAllCharacterInfo() {
        label();
        title();

    }
}
