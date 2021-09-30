import java.util.LinkedList;
import java.util.ListIterator;
public class list
{

  public static void main(String[] args)
  {
    LinkedList<String> words = new LinkedList<String>();
    words.addFirst("ABCDE");
    words.addFirst("ABC");
    words.addFirst("EDIFGGH");
    words.addFirst("CD");
    words.addFirst("PQWR");

   printEveryOtherWord(words);

   /* ListIterator<String> it= words.listIterator();

    while(it.hasNext())
    {
		if(it.next().length() < 4)
		{
		  it.previous();
		  it.remove();
		}

     }

     System.out.println(words); */

 }

 public static void printEveryOtherWord(LinkedList s)
 {
	 ListIterator<String> st= s.listIterator();
	 while(st.hasNext())
	     {
	 		 System.out.println(st.next());
	 		 if(st.hasNext())
	 		 st.next();

         }

 }

}