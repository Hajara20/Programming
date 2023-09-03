public class Main {
    public static void main(String[] args) {
        LandPhone phone1 = new LandPhone("Panasonic", 1235659 );
        phone1.calll();

        ButtonPhone phone2 = new ButtonPhone("Nokia", 125464);
        phone2.calll();
        phone2.message();

        SmartPhone phone3 = new SmartPhone("Iphone", 2454628);
        phone3.calll();
        phone3.message();
        phone3.Browseinternet();

    }
}