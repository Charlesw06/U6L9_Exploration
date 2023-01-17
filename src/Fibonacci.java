public class Fibonacci
{
    // instance variable
    private int[] sequence;

    public Fibonacci(int sequenceLen)
    {
        sequence = new int[sequenceLen];
        sequence[0] = 0;
        sequence[1] = 1;
        for (int i = 2; i < sequence.length; i++) {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
    }

    public int[] getSequence()
    {
        return sequence;
    }

    public int getIndexOf(int searchVal)
    {
        for (int i = 0; i < sequence.length; i++) {
            if (searchVal == sequence[i]) {return i;}
        }
        return -1;
    }

    public void extendBy(int howManyMore)
    {
        int[] tempArray = new int[sequence.length + howManyMore];
        for (int i = 0; i < sequence.length; i++) {
            tempArray[i] = sequence[i];
        }
        for (int i = sequence.length; i < tempArray.length; i++) {
            tempArray[i] = tempArray[i-1] + tempArray[i-2];
        }
        sequence = tempArray;
    }
}
