package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프!";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타입";
        aboutTime.review = "인생 시간 영화!";

        // 중복된 코드는 배열 + 반복문으로 해결해야 함!
        MovieReview[] movieReviews = {inception, aboutTime};
        for (MovieReview movieReview : movieReviews) {
            System.out.println("movieTitle : " + movieReview.title + ", movieReview : " + movieReview.review);
        }
    }
}
