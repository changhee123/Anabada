package springboot.juseong.anabada.retrofitModel;


public class Comment {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private Long postid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public long getPostid() {
        return postid;
    }

    public void setPostid(long postid) {
        this.postid = postid;
    }

    public Comment(String title, String content, String writer, Long postid) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.postid = postid;
    }
}
