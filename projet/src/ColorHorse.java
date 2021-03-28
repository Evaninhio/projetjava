public class ColorHorse {
    private int startposition;

    private int finalposition;

    final private int  all = 52;
    final private int  between = 52/4;
  //  String color;

    ColorHorse(char color){
        switch (color) {
            case 'b':
                startposition = 1;
                finalposition = 52;
                break;
            case 'r' :
                startposition = 4;
                finalposition = 4;
                break;
            case 'g':
                startposition = 4;
                finalposition = 9;
                break;
            case 'y':
                startposition = 6;
                finalposition = 8;
                break;
        }

    }

    public int getFinalposition() {
        return finalposition;
    }

    public int getStartposition() {
        return startposition;
    }
}
