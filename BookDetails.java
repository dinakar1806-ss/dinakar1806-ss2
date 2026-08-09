import java.util.Scanner;
public class BookDetails
{
String bookname;
String authorname;
double bookprice;

void displaybook()
{
System.out.println("======Book Details======");
System.out.println("Name of the Book: " + bookname);
System.out.println("\nName of the Author: " + authorname);
System.out.println("\nPrice of the book:" + bookprice );
System.out.println("\n======Thank You======\n");
}

public static void main(String args[])
{

BookDetails b = new BookDetails();
b.bookname   = "Light from many Lamps";
b.authorname = "Dinakar SS";
b.bookprice  = 2100;

b.displaybook();

}

}
