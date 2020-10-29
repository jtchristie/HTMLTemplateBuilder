package lab4;

public class Image extends HTML {
    private String img;

    public void Link() {

    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public String getHTML() {
        return "<img src= " + img + "\" >";

    }

}
