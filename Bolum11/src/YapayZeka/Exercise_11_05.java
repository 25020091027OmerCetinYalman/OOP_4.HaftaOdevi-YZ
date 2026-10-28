package YapayZeka;

import java.util.ArrayList;

public class Exercise_11_05 {
    public static void main(String[] args) {
        Course course = new Course("Nesne Yonelimli Programlama");
        
        course.addStudent("Ahmet Yilmaz");
        course.addStudent("Ayse Demir");
        course.addStudent("");

        System.out.println("Ders Adi: " + course.getCourseName());
        System.out.println("Toplam Ogrenci Sayisi: " + course.getNumberOfStudents());
        System.out.println("Ogrenciler Listesi: " + course.getStudents());
    }
}

