package Lesson2Dz;

public class MainDzSwitch {
    public static void main(String[] args) {
        int score = 1;
        String text = "" ;
        switch (score){
            case 1:
                text = "Terribly";
                break;
            case 2:
                text = "Badly";
                break;
            case 3:
                text = "Average";
                break;
            case 4:
                text = "Perfectly";
                break;
            case 5:
                text = "Masterpiece";
                break;
            default:
                text = "This value is not allowed.";
        }
        System.out.println(text);
    }
}
