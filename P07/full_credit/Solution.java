public class Solution implements Comparable<Solution>{ 
    public Solution(String name, String word, int x, int y, Direction direction) {
        this.name = name;
        this.word = word;
        this.x = x;
        this.y = y;;
        this.direction = direction;
    }
    
    
    @Override
    public int compareTo(Solution new_solution)
    {
    	if(name.compareTo(new_solution.name) == 0)
    	{
    		return(word.compareTo(new_solution.word));
    	}
    	else
    	{
    		return name.compareTo(new_solution.name);
    	}
    }
    
    @Override
    public String toString() {
        return String.format("In %s: %s found at (%d,%d,%s)", name, word, x, y, direction);
    }

    private String name;
    private String word;
    private int x;
    private int y;
    private Direction direction;
}
