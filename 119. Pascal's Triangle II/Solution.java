class Solution {
 public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex+1];
     
        int[] temp = new int[rowIndex];



        for(int i=0 ; i < rowIndex+1 ; i++)
        {

            for(int j = 0 ; j <= i ; j++ )
        {
            if(j == 0 || j == i)
            {
                result[j] = 1;

            }
            else
            {

                result[j]=temp[j-1]+temp[j];

            }

        }

            if(i != rowIndex)
                
                for(int j = 0 ; j <= i ; j++ )
                    
                    temp[j]=result[j].intValue();


        }

        return Arrays.asList(result);

    }

  
}