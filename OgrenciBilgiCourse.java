public class OgrenciBilgiCourse {
    String name, prefix, code;
    int note;
    OgrenciBilgiTeacher teacher;

    OgrenciBilgiCourse(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }

    void addTeacher(OgrenciBilgiTeacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            // this.teacher.print();
        } else {
            System.out.println("Öğretmen ve ders uyuşmadı.---");
        }
    }
}
