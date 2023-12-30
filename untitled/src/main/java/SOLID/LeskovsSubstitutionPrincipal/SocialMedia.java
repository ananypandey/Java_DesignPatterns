package SOLID.LeskovsSubstitutionPrincipal;

public abstract class SocialMedia
{
    //@Support WhatsApp,Facebook and Instagram
    public abstract void chatWithFriend();

    //@Support Facebook, Instagram
    public abstract void publishPost();

    //@Support whatsapp, facebook, Instagram
    public abstract void sendPhotosAndVideos();

    //@Support Whatsapp, Facebook
    public abstract void groupVideoCall(String... users);
}
