package SOLID.LeskovsSubstitutionPrincipal.Solution;

public class Instagram implements SocialMedia,PostMediaManager{
    @Override
    public void publishPost(Object post) {
    System.out.println("Publish Post");
    }

    @Override
    public void chatWithFriend() {
    System.out.println("Chating on insta with Friend");
    }

    @Override
    public void sendPhotosAndVideos() {
    System.out.println("Exchanging Photos");
    }
}
