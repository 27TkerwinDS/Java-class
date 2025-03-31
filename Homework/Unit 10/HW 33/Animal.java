import java.util.ArrayList;


public class Animal implements Comparable {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        String s = this.getClass().getName() +
                String.format(" [name = %s, weight (lbs) = %.2f]", name, weight);
        return s;
    }

    public static double calcAvg(ArrayList<Animal> list) {
        double sum = 0;
        if (list.size() == 0) {
            return 0;
        }
        for (Animal animal : list) {
            sum = sum + animal.getWeight();
        }
        return sum / list.size();
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        double p=getWeight();
        if ((((Animal)o).getWeight()-p<.00001)&&(((Animal)o).getWeight()-p>-.00001)){
            return 0;
        }else if(((Animal)o).getWeight()<p){
            return -1;
        }else{
            return 1;
        }
    }
}