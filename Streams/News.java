package Streams;

public class News {
    private String postedByUser, commentByUser;
    private int newsId, comments;

    public News(String postedByUser, String commentByUser, int comments, int newsId) {
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comments = comments;
        this.newsId = newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String toString(){
        return this.postedByUser + " " + Integer.toString(this.comments) + " " + Integer.toString(newsId);
    }
}
