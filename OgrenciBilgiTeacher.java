public class OgrenciBilgiTeacher {
    String name, branch, mpno;

    OgrenciBilgiTeacher(String name, String branch, String mpno) {
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;

    }

    void print(){
        System.out.println("Adı:"+this.name);
        System.out.println("Tel:"+this.mpno);
        System.out.println("Bölümü:"+this.branch);
    }

}
