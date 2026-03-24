public class Book {

    private String title;
    private String author;
    private String category;
    private double rating;

    private String status;
    private String startDate;
    private String finishDate;
    private String review;

    public Book(String title, String author, String category, double rating) {

        this.title = title;
        this.author = author;
        this.category = category;
        this.rating = rating;

        this.status = "Not Started";
        this.startDate = "-";
        this.finishDate = "-";
        this.review = "-";
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void startReading(String date) {
        status = "Reading";
        startDate = date;
    }

    public void finishReading(String date) {
        status = "Finished";
        finishDate = date;
    }

    public void addReviews(String review) {
        this.review = review;
    }

    public void display() {

        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Category: " + category);
        System.out.println("Rating  : " + rating);
        System.out.println("Status  : " + status);
        System.out.println("Start   : " + startDate);
        System.out.println("Finish  : " + finishDate);
        System.out.println("Review  : " + review);
        System.out.println("-------------------------");
    }
}
