public class ButtonPhone extends LandPhone {
    public ButtonPhone(String name, int number){
        super(name,number);
    }
    void message(){
        System.out.println(name + " can send sms");
    }

}
