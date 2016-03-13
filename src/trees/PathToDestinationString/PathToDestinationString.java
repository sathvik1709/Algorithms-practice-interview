package trees.PathToDestinationString;

import java.util.*;

/**
 * Created by Sathvik on 21/01/16.
 */
public class PathToDestinationString {

    public static void main(String[] args){

        Set<String> dictionary = new HashSet<String>();
        dictionary.add("CAT");
        dictionary.add("COT");
        dictionary.add("COG");
        dictionary.add("DOT");
        dictionary.add("DOG");
        dictionary.add("DAT");
        dictionary.add("DAG");

        System.out.println(getSequence(dictionary,"CAT","DOG"));
    }

    public static List<String> getSequence(Set<String> dictionary, String start, String end)	{
        Map<String, String> parent = new HashMap<String, String>();
        LinkedList<String> queue = new LinkedList<String>();
        queue.add(start);
        while(!queue.isEmpty())	{
            String curr = queue.removeFirst();
            for(int i = 0; i < curr.length(); i++)	{
                for(char ch = 'a'; ch <= 'z'; ch++)	{
                    String next = curr.substring(0,i) + ch + curr.substring(i+1);
                    if(!parent.containsKey(next) && dictionary.contains(next))	{
                        parent.put(next, curr);
                        queue.addLast(next);
                    }
                }
            }
        }
        if(!parent.containsKey(end))
            return null;
        LinkedList<String> sequence = new LinkedList<String>();
        sequence.addLast(end);
        String curr = end;
        while(!curr.equals(start))	{
            curr = parent.get(curr);
            sequence.addFirst(curr);
        }
        return sequence;
    }
}
