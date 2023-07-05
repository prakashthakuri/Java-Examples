class phone {
    void call(){
        System.out.println("this is a call");
    }

    void sms(){
        System.out.println("SMS");
    }
}

interface Iiphone{
    void faceTime();
    void iMessage();
}

interface IAndroidPhone {
    void googlePlay();
    void gmail();
}

class SmartPhone extends phone implements Iiphone, IAndroidPhone {

    @Override
    public void faceTime() {
        System.out.println("FaceTime");
    }

    @Override
    public void iMessage() {
        System.out.println("IMessage");

    }

    @Override
    public void googlePlay() {
        System.out.println("Google Play");

    }

    @Override
    public void gmail() {
        System.out.println("gmail");

    }

}
public class InterfaceExamplePlayer {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
                sp.faceTime();
                sp.sms();
                sp.googlePlay();
        Iiphone iphone = new SmartPhone();
        iphone.faceTime();
        iphone.iMessage();

    }
}


