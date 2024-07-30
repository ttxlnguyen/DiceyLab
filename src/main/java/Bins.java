import java.util.HashMap;

public class Bins {

    int low;
    int high;

    static HashMap<Integer, Integer> binMap = new HashMap<>();

    public Bins(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public void createBins() {
        for (int i = low; i <= high; i++) {
            int temp = low++;
            binMap.put(temp,0);
        }
    }

    public int getBin(int key){
        return binMap.get(key);
    }

    public void incrementBin(int key){
        binMap.get(key);
        binMap.put(key, binMap.get(key) + 1);
    }
}