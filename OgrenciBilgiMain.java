public class OgrenciBilgiMain {
    public static void main(String[] args) {
        OgrenciBilgiTeacher teacher1 = new OgrenciBilgiTeacher("Mahmut Hoca", "TRH", "532");
        OgrenciBilgiTeacher teacher2 = new OgrenciBilgiTeacher("Graham Bell", "FZK", "555");
        OgrenciBilgiTeacher teacher3 = new OgrenciBilgiTeacher("Külyutmaz", "BIO", "355");

        OgrenciBilgiCourse tarih = new OgrenciBilgiCourse("Tarih", "101", "TRH");
        tarih.addTeacher(teacher1);
        OgrenciBilgiCourse fizik = new OgrenciBilgiCourse("Fizik", "101", "FZK");
        fizik.addTeacher(teacher2);
        OgrenciBilgiCourse biyo = new OgrenciBilgiCourse("Biyoloji", "101", "BIO");
        biyo.addTeacher(teacher3);

        OgrenciBilgiStudent s1= new OgrenciBilgiStudent("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(45, 50, 50);
        OgrenciBilgiStudent s2= new OgrenciBilgiStudent("Güdük Necbi", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(45, 50, 50);
        OgrenciBilgiStudent s3= new OgrenciBilgiStudent("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(45, 50, 50);
        
    }

}