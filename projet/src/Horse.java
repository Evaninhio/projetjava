public class Horse {

  private   int number;

    private int position;

    private int idplayer;

    public Horse(int idplayer, int position, int number){
      this.number = number;
      this.position=position;
      this.idplayer=idplayer;

    }

    public int getIdplayer() {
        return idplayer;
    }

    public int getNumber() {
        return number;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
