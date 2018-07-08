public class StringManipulator 
{
    
    public String trimAndConcat(String a, String b)
    {
        String newA = a.trim();
        String newB = b.trim();
        return newA.concat(newB);
    }

    public Integer getIndexOrNull(String queried, char query)
    {
        int result = queried.indexOf(query);
        return result == -1 ? null : result;
    }

    public Integer getIndexOrNull(String queried, String query)
    {
        int result = queried.indexOf(query);
        return result == -1 ? null : result;
    }   

    public String concatSubstring(String a, int start, int fin, String b)
    {
        String sliced = a.substring(start,fin);
        return sliced.concat(b);
    }

}