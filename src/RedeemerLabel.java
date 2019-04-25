


public class RedeemerLabel implements CharacterInfo {

    @Override
    public void label() {
        System.out.println("Label: Redeemer");

    }

    @Override
    public void title() {
        System.out.println("Title: Runner");

    }
    @Override
    public void getAllCharacterInfo(){
        label();
        title();
    }
}
