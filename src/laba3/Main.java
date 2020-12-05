package laba3;

import laba2.Student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int l=0;
        StudentSort[] students = new StudentSort[8];
        students[0] = new StudentSort("Дима", "Пупа", 342);
        students[1] = new StudentSort("Настя", "Лупа", 114);
        students[2] = new StudentSort("Иван", "Папупа", 241);
        students[3] = new StudentSort("Валя", "Лупупа", 108);
        students[4] = new StudentSort("Полина", "Туруру", 404);
        students[5] = new StudentSort("Василий", "Лилионов",  328);
        students[6] = new StudentSort("Вика", "Сиси",  113);
        students[7] = new StudentSort("Кеша", "Несиси",  201);

        StudentSort[] studentsTwo = new StudentSort[8];
        studentsTwo[0] = new StudentSort("Дима", "Пупа", 123);
        studentsTwo[1] = new StudentSort("Настя", "Лупа", 1321);
        studentsTwo[2] = new StudentSort("Иван", "Папупа", 240);
        studentsTwo[3] = new StudentSort("Валя", "Лупупа", 102);
        studentsTwo[4] = new StudentSort("Полина", "Туруру", 400);
        studentsTwo[5] = new StudentSort("Василий", "Лилионов",  228);
        studentsTwo[6] = new StudentSort("Вика", "Сиси",  13);
        studentsTwo[7] = new StudentSort("Кеша", "Несиси",  251);

        StudentSort[] studentsTree = new StudentSort[16];
        studentsTree[0] = new StudentSort("", "",1);
        studentsTree[1] = new StudentSort("", "",1);
        studentsTree[2] = new StudentSort("", "",1);
        studentsTree[3] = new StudentSort("", "",1);
        studentsTree[4] = new StudentSort("", "",1);
        studentsTree[5] = new StudentSort("","", 1);
        studentsTree[6] = new StudentSort("","", 1);
        studentsTree[7] = new StudentSort("","", 1);
        studentsTree[8] = new StudentSort("","", 1);
        studentsTree[9] = new StudentSort("","", 1);
        studentsTree[10] = new StudentSort("", "",1);
        studentsTree[11] = new StudentSort("", "",1);
        studentsTree[12] = new StudentSort("", "",1);
        studentsTree[13] = new StudentSort("", "", 1);
        studentsTree[14] = new StudentSort("", "", 1);
        studentsTree[15] = new StudentSort("", "", 1);

        for (int i=0; i<studentsTree.length;i++){
            if(i<8){
            studentsTree[i]= students[i];
        }else {
                studentsTree[i]=studentsTwo[l];
                l=l+1;
            }
        }
        int[] x= new int[16];
        for (int s=0; s<studentsTree.length;s++){
            x[s]=studentsTree[s].getRecordsBook();
        }

        MergeSort tree= new MergeSort();
        tree.sort(x);

        for ( int i = 1; i < studentsTree.length; ++i ) {
            for ( int j = 0; j < i; ++j ) {
                if ( studentsTree[i].getRecordsBook() < studentsTree[j].getRecordsBook() ) {
                    StudentSort tmp = studentsTree[i];
                    for ( int k = i - 1; k >= j; --k )
                        studentsTree[k + 1] = studentsTree[k];
                    studentsTree[j] = tmp;
                }
            }
        }

        for ( int i = 0; i < studentsTree.length; ++i )
            System.out.printf("%-32s ======> %7d\n", studentsTree[i].getFullName(), studentsTree[i].getRecordsBook());


















    }

}
