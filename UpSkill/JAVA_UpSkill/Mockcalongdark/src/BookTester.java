//**** DO NOT MODIFY THIS FILE ****//
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTester {
public static void testEBook()
{
System.out.println("********* Test EBook *********");
List<EBook> ebooks = new ArrayList<EBook>(); 
ebooks.add(new EBook(97805, "How to Avoid a Climate Disaster : The Solutions We Have and the Breakthroughs We Need", 272, 2022, 495));
ebooks.add(new EBook(97800, "Sapiens: A Brief History of Humankind", 512, 2015, 570));
ebooks.add(new EBook(97817, "21 Lessons for the 21st Century", 432, 2019, 483));

for(int i = 0; i < ebooks.size(); i++)
{
System.out.println("E-Book #"+(i+1)+" "+ebooks.get(i));
System.out.printf("\tCurrent Value (Baht): %.2f, File Size (MB): %.2f\n", ebooks.get(i).getCurrentPrice(2023), ebooks.get(i).getFileSize());
}
}

public static void testPhysicalBook()
{
System.out.println("\n********* Test PhysicalBook *********");
List<PhysicalBook> pbooks = new ArrayList<PhysicalBook>(); 
pbooks.add(new PhysicalBook(978616, "The Kings of Ayutthaya : A Creative Retelling of Siamese History", 370, 2017, 595));
pbooks.add(new PhysicalBook(978019, "The Oxford History of Ancient Egypt", 544, 2003, 560));
pbooks.add(new PhysicalBook(978616, "Very Bangkok : In the City of the Senses", 360, 2020, 995));

for(int i = 0; i < pbooks.size(); i++)
{
System.out.println("Physical-Book #"+(i+1)+" "+pbooks.get(i));
System.out.printf("\tCurrent Value (Baht): %.2f, Weight (KG): %.2f\n", pbooks.get(i).getCurrentPrice(2023), pbooks.get(i).getWeight());
}
}

public static void testTextBook()
{
System.out.println("\n********* Test PhysicalBook *********");
List<TextBook> tbooks = new ArrayList<TextBook>(); 
tbooks.add(new TextBook(9781107, "The Official Cambridge Guide to IELTS Student's Book", 402, 2014, 629));
tbooks.add(new TextBook(9781514, "Everything You Need to Ace Biology", 519, 2015, 643));
tbooks.add(new TextBook(9781941, "Math Boosters: Problem Solving with Ratios & Proportions", 144, 2022, 571));
tbooks.add(new TextBook(9781524, "Everything You Need to Ace Biology", 528, 2020, 643));
tbooks.add(new TextBook(9781528, "Everything You Need to Ace Pre-Algebra and Algebra", 640, 2021, 561));
tbooks.add(new TextBook(9781527, "Everything You Need to Ace Biology", 530, 2021, 643));
tbooks.add(new TextBook(9781529, "Everything You Need to Ace World History", 576, 2021, 615));

System.out.println("@@ Before Sorting");
for(int i = 0; i < tbooks.size(); i++)
{
System.out.println("TextBook #"+(i+1)+" "+tbooks.get(i));
System.out.printf("\tCurrent Value (Baht): %.2f, Weight (KG): %.2f\n", tbooks.get(i).getCurrentPrice(2023), tbooks.get(i).getWeight());
}

System.out.println("\n@@ After Sorting");
Collections.sort(tbooks);
for(int i = 0; i < tbooks.size(); i++)
{
System.out.println("TextBook #"+(i+1)+" "+tbooks.get(i));
System.out.printf("\tCurrent Value (Baht): %.2f, Weight (KG): %.2f\n", tbooks.get(i).getCurrentPrice(2023), tbooks.get(i).getWeight());
}
}

public static void main(String[] args) {
//testEBook();
//testPhysicalBook();
testTextBook();
}

}