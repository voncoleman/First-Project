/**
 * The class for apple model
 * @author Von Coleman
 */
public class AppleModel {
    private String color;
    private String type;
    private int weight;
    private boolean ripe;
    private int juice = 10;
    private boolean rotten = false;

public AppleModel(){
    this.color="green";
    this.type="granny";

}

public AppleModel(String color, String type, int weight, boolean ripe){
    this.color=color;
    this.type = type;
    this.weight = weight;
    this.ripe = ripe;

}
    public void setColor(String color){
        if(color.toLowerCase() =="red"|| color.equalsIgnoreCase("green")){
            this.color = color;
        }
    }

    public String getColor(){
        return this.color;
    }

    public void setRipe(boolean ripe){
        this.ripe = ripe;
    }

    public boolean isRipe(){
        return this.ripe;
    }

    public int getWeight(){
        setWeight(1990);
        return weight;
    }

    /**
     * Set the given weight 0++ to 3
     * @param weight
     */
    public void setWeight(int weight){
        if(weight >=0 && weight <=3){
        this.weight = weight;
        }
    }

    /**
     * Decrement juice by 1 if juice > 0
     * @return juice left in apple
     */
    /**
     * Juices the apple until out of juice
     * @param slice does nothing
     * @return remaining juice
    */

    public int juiceApple(int slice){
        if(this.juice>0){
        this.juice--;
        }
        return this.juice;
    }
}

