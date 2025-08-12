package Assingment9;

import java.util.*; 

class Books implements Comparable<Books>{ 
    int id; 
   String title, author; 

    Books(int id,String title,String author){ 
      this.id=id; 
        this.title=title; 
        this.author=author; 

    } 

    public int compareTo(Books b){ 
       return this.id - b.id; 
    } 

    public String toString(){ 
        return id+" "+title+" "+author; 

    } 

} 

class TitleAuthorComparator implements Comparator<Books>{ 
    public int compare(Books b1, Books b2){ 
        int res = b1.title.compareTo(b2.title); 
        if(res == 0) 
            return b1.author.compareTo(b2.author); 
        else 
           return res; 
    } 
} 

public class Q12{ 
    public static void main(String[] args){ 

        List<Books> books = new ArrayList<>(); 

        books.add(new Books(3,"Java","Alice")); 
        books.add(new Books(1,"Python","Bob")); 
        books.add(new Books(2,"Java","Charlie")); 

        System.out.println("Sort by ID (Comparable):"); 
        Collections.sort(books); 

        for(Books b : books) 
            System.out.println(b); 
        System.out.println("Sort by Title then Author (Comparator):"); 
        Collections.sort(books, new TitleAuthorComparator()); 

        for(Books b : books) 
            System.out.println(b); 

    } 

} 
