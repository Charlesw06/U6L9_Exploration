public class HorseBarn
{
    private Horse[] spaces;

    public HorseBarn(int numStalls)
    {
        spaces = new Horse[numStalls];
    }

    public void placeHorse(Horse horse, int space)
    {
        spaces[space] = horse;
    }

    public int findHorseSpace(String name)
    {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /** Consolidates the barn by moving horses so that the horses are in adjacent
     *  spaces, starting at index 0, with no empty space between any two horses.
     *
     *  Postcondition: The order of the horses is the same as before the consolidation.
     */
    public void consolidate()
    {
        /* IMPLEMENT ME! */
    }

    public String toString()
    {
        String result = "";
        Horse h = null;
        for (int i = 0; i < spaces.length; i++)
        {
            h = spaces[i];
            result = result + "space " + i + " has ";
            if (h == null)
            {
                result = result + " null \n";
            }
            else
            {
                result = result + h.toString() + "\n";
            }
        }
        return result;
    }
}