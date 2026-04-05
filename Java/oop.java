class studentTotal{
    int student;
    int Tamil;
    int Eng;
    int Maths;   
    int Science;
    int SS;
    void totalmarks (){
        System.out.println(Tamil+Eng+Maths+Science+SS);
    }
}
public class oop {
    public static void main (String[] args){
        studentTotal s1 = new studentTotal();
        s1.Tamil = 80;
        s1.Eng=77;
        s1.Maths = 66;
        s1.Science=88;
        s1.SS=97;
        s1.totalmarks();

        studentTotal s2 = new studentTotal();
        s2.Tamil = 90;
        s2.Eng=67;
        s2.Maths = 54;
        s2.Science=78;
        s2.SS=45;
        s2.totalmarks();

        s1.totalmarks();

    }
}
