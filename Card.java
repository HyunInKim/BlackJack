public class Card{
    private String Shape;
    private String number;

    public String getShape() {
        return this.Shape;
    }

    public void setShape(String Shape) {
        this.Shape = Shape;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" +
            " Shape='" + getShape() + "'" +
            ", number='" + getNumber() + "'" +
            "}";
    }

}