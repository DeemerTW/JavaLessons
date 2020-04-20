package Lesson2Dz;

public class star {
    public static void main(String[] args) {
        double x1 = 20;
        double x2 = 30;
        double y1 = -10;
        double y2 = 20;
        int type = 0;
        String text = "";
        if ((x1 <= y1) & (x2 <= y2)&(y1 >= x2)){
                type = 2;
        }else if((x1 >= y1) & (x2 >= y2) & (x1 >= y2)){
                type = 2;
        }else if((x1 <= y1) & (y2 <= x2)){
            type = 1;
        }else if((x1 >= y1) & (y2 >= x2)) {
            type = 1;
        }
        switch (type){
            case 0:
                text = "Пересекаются.";
                break;
            case 1:
                text = "Один содержит другой.";
                break;
            default:
                text = "Не пересекаются.";
        }
        System.out.println(text);
    }
}
