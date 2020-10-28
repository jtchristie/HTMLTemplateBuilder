package lab4;

public class Link extends HTML {
    private String link;
    private String desc;
    public Link(){

    }

    public void setLink(String link){
        this.link = link;
    }
    public String getLink(){
        return link;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return desc;
    }

    public String getHTML(){
        return "<a href= " + link +"\" > " + desc + "</a>";
    }
}
