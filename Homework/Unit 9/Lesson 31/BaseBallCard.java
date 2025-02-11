public class BaseBallCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseBallCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    public String toString(){
        return this.getClass().getName()+"["+getName()+", "+getYear()+"]";
    }
    public boolean equals(Object obj){
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        BaseBallCard otherB=(BaseBallCard)obj;
        if((otherB.getName().equals(this.getName()))&&(otherB.getYear()==this.getYear())){
            return true;
        }else{
            return false;
        }
    }
}