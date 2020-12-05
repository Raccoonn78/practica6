package laba2;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Sort two= new Sort();
        Student[] students = new Student[8];
        students[0] = new Student("Дима", "Пупа", 342);
        students[1] = new Student("Настя", "Лупа", 114);
        students[2] = new Student("Иван", "Папупа", 241);
        students[3] = new Student("Валя", "Лупупа", 108);
        students[4] = new Student("Полина", "Туруру", 404);
        students[5] = new Student("Василий", "Лилионов",  328);
        students[6] = new Student("Вика", "Сиси",  113);
        students[7] = new Student("Кеша", "Несиси",  201);
        int[] x= new int[8];
        for (int l=0; l<students.length;l++){
            x[l]=students[l].getRecordsBook();
        }
        int low=0;
        int high = x.length - 1;
        two.quickSort(x,low,high);

        for( int p = 0; p < x.length; p++) {
            System.out.println(x[p]);
        }
        for ( int i = 1; i < students.length; ++i ) {
            for ( int j = 0; j < i; ++j ) {
                if ( students[i].getRecordsBook() < students[j].getRecordsBook() ) {
                    Student tmp = students[i];
                    for ( int k = i - 1; k >= j; --k )
                        students[k + 1] = students[k];
                    students[j] = tmp;
                }
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-32s  %s\n", "Имя",  "Баллы");
        System.out.println("------------------------------------------------------------");
        for ( int i = 0; i < students.length; ++i )
            System.out.printf("%-32s  %7d\n", students[i].getFullName(), students[i].getRecordsBook());
        System.out.println("------------------------------------------------------------");
    }
}
