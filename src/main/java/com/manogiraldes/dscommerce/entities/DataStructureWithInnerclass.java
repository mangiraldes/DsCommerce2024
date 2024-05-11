package com.manogiraldes.dscommerce.entities;

public class DataStructureWithInnerclass{
    private static final int NUMBEROFELEMENTS = 15;
    private int[] arrayNumbers = new int[NUMBEROFELEMENTS];
    {
        for (int i = 0;i<NUMBEROFELEMENTS;i++){

            arrayNumbers[i] = i;
        }

    }

    private void retEven(){

        DataStructureWithInnerclass.retEvenElementos iterator = this.new retEvenElementos();
        while(iterator.hasNext()){

            System.out.println(iterator.getNext());

        }


    }

    private class  retEvenElementos{
        private int next = 0;
        public boolean hasNext() {
            return next < NUMBEROFELEMENTS;

        }

        public int getNext(){
            int num = arrayNumbers[next];
            next = next + 2;
            return num;
        }





    }



    public static void main(String[] args) {

       DataStructureWithInnerclass dtw = new DataStructureWithInnerclass();

       dtw.retEven();

    }

}
