public class Player {

    /*****
     * id of the player
     */
    private int id;

    /*****
     * name of th player
     */
    private String name;

    /****
     * Horses of the player
     */
    private Horse[] horses;

    /*******
     * first letter of the color of the player
     */
    private ColorHorse color;
    /*******
     * position in the classement
     * 0 -> not finish the game
     */
    private int ranking;

    public Player(int id, String name, char color){
        this.id =id;
        this.color=new ColorHorse(color);
        this.name=name;
        this.ranking=0;

        horses = new Horse[4];

        for(int i = 0; i < 4; i++){
            horses[i] = new Horse(id,i+1,0);
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRanking() {
        return ranking;
    }

    public ColorHorse getColor() {
        return color;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean hasWin(int numcase) {

        boolean rep = true;
        int i = 0;
        while (i < 4 && rep) {
            if (!(this.horses[i].getPosition() == 100)) {
                rep = false;
            }
            i++;
        }
        return rep;
    }

    public boolean move(int n, int c) {
        if (horses[n].getPosition() == color.getFinalposition() || horses[n].getPosition() > 52) {
            return false;
        } else {
            if (((horses[n].getPosition() + c) % 52) >= (color.getFinalposition() % 52) && horses[n].getPosition() < color.getFinalposition()) {
                horses[n].setPosition(color.getFinalposition() - (horses[n].getPosition() - color.getFinalposition() + c));
                return true;
            } else {
                horses[n].setPosition((horses[n].getPosition() + c) % 52);
                return true;
            }
        }

    }
}
