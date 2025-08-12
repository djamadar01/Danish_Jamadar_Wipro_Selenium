package Assingment9;

import java.util.*; 

class Produc{ 
    String name; 
    double price; 

    Produc(String name,double price){ 
        this.name=name; 
       this.price=price; 
    } 

    public String toString(){ 
        return name+" "+price; 
    } 

} 

class PriceAscComparator implements Comparator<Produc>{ 
    public int compare(Produc p1,Produc p2){ 
        return Double.compare(p1.price,p2.price); 
    } 

} 

class PriceDescComparator implements Comparator<Produc>{ 
    public int compare(Produc p1,Produc p2){ 
        return Double.compare(p2.price,p1.price); 
    } 

} 

class NameComparator implements Comparator<Produc>{ 
    public int compare(Produc p1,Produc p2){ 
        return p1.name.compareTo(p2.name); 
    } 

} 

public class Q7{ 
    public static void main(String[] args){ 
        List<Produc> products=new ArrayList<>(); 
        products.add(new Produc("Pen",10.5)); 
        products.add(new Produc("Book",55.0)); 
        products.add(new Produc("Laptop",35000.0)); 
        Collections.sort(products,new PriceAscComparator()); 
        System.out.println("Price Ascending:"); 
        products.forEach(System.out::println); 
        Collections.sort(products,new PriceDescComparator()); 
        System.out.println("Price Descending:"); 
        products.forEach(System.out::println); 
        Collections.sort(products,new NameComparator()); 
        System.out.println("Name Alphabetical:"); 
        products.forEach(System.out::println); 
    } 

} 