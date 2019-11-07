public class Player
{
    private String name;
    private String pos;
    private String team;
    private int rank;
    
    public Player(String n, String p, String t, int r) 
    {
        name = n;
        pos = p;
        team = t;
        rank =  r;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getPos()
    {
        return pos;
    }
    
    public String getTeam()
    {
        return team;
    }
    
    public int getRank()
    {
        return rank;
    }
    
    public String toString()
    {
        return "Name: "+ name + "\nPosition: " + pos + "\nTeam: " + team + "\nRank: "+rank;
    }
}
