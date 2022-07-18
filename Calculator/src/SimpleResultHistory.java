public class SimpleResultHistory implements ResultOperationHistory {
    int[] array = new int[3];
    int freeIndex = 0;

    @Override
    public void printHistory() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Override
    public void addToHistory(int number) {
        array[freeIndex] = number;
        freeIndex++;
        if(freeIndex >= array.length){
            freeIndex=0;
        }
    }
}

