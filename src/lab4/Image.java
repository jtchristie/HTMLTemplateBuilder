package lab4;

import java.io.IOException;

public class Image extends HTML {
    private String img;
    private String alt;

    public void Link() {

    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setAlt(String alt){
        this.alt = alt;
    }
    public String getAlt(String alt){
        return alt;
    }

    public String getHTML() throws IOException {
        String imgString = "<img src= \"" + img + "\"" + " alt= \"" + alt + "\"" + ">";
        Save.save(imgString);
        return imgString;

    }

}
