package laba;
 class Student1 {
    int [] mass;
    void MassRed(){
        for( int p = 0; p < mass.length; p++) {
            System.out.println(mass[p]);
        }

            for (int left = 0; left < mass.length; left++) {
                int value = mass[left];
                int i = left - 1;
                for (; i >= 0; i--) {
                    if (value < mass[i]) {
                        mass[i + 1] = mass[i];
                    } else { break; }
                }
                mass[i + 1] = value;
            }

        for( int j = 0; j < mass.length; j++){
            System.out.println(mass[j]);
        }



     }
}