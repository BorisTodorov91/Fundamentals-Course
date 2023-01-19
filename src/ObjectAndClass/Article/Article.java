package ObjectAndClass.Article;

public class Article {

    private String name;
    private String content;
    private String author;

    public Article(String name, String content, String author) {
        this.name = name;
        this.content = content;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.name,this.content,this.author);
    }
}
