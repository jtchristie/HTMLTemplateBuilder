package lab4;

import java.io.IOException;

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

    public String getHTML() throws IOException {
        String imgString = "<img src= " + img + "\" >";
        Save.save(imgString);
        return imgString;

    }

}
