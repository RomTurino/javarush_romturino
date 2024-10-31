package level26;

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Beach o) {
        int current = 0;
        int other = 0;
        float distanceCompare = distance - o.getDistance();
        if (distanceCompare > 0) {
            other++;
        } else if (distanceCompare < 0) {
            current++;
        }
        int qualityCompare = quality - o.getQuality();
        if (qualityCompare < 0){
            other++;
        } else if (qualityCompare > 0){
            current++;
        }

        return current - other;
    }
}
