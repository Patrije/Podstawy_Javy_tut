package tablice;

public class TabliceWielowymiaroweExample2 {

    public static void main(String[] args) {
        int[][] tab = new int[][]{
                {1, 1, 1, 1,1},
                {2, 2, 2, 2,2},
                {3, 3, 3, 3,3},
                {4,4},
                {5,5,5,5}};

        for(int i = 0; i< tab.length; i++){
            //iteracja dla wiersza o numerze i
            for(int j = 0; j<tab[i].length; j++){
                //iteracja dla kolumny o numerze j w wierszu numerze i
                System.out.print(tab[i][j]);
            }
            System.out.println("");
        }

//        int max = tab[0][0];
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab[i].length; j++) {
//                if(tab[i][j]> max) {
//                    max = tab[i][j];
//                }
////                if ((i == j) || (i+j)==tab.length-1)
////                    System.out.print(" | " + tab[i][j]+ " | ");
////                else
////                    System.out.print(" | * | ");
//            }
////            System.out.println();
//        }
//        System.out.println(max);
    }
}
