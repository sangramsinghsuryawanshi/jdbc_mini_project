package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstOccurrenceOfList 
{
	public static Optional<String> findFirstRepeating(List<String> list)
	{
        Set<String> seen = new LinkedHashSet<>();
        
        return list.stream()
                   .filter(s -> !seen.add(s))
                   .findFirst(); 
    }
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>(Arrays.asList("java", "c", "c", "c#", "java"));
        System.out.println("Given list is: " + list);

        Optional<String> firstRepeating = findFirstRepeating(list);

        if (firstRepeating.isPresent()) 
        {
            System.out.println("First repeating string is: " + firstRepeating.get());
        } 
        else 
        {
            System.out.println("No repeating string found.");
        }
    }
}