public class Rank implements Comparable<Rank> {
    int rollNo;
    String name;
    int mark1, mark2, mark3, total;

    public Rank(int rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.total = mark1 + mark2 + mark3;
    }

    @Override
    public int compareTo(Rank other) {
        return Integer.compare(other.total, this.total); 
    }
}
