class Solution {
    public int[] twoSum(int[] numbers, int target) {
                
        
        Map map = new HashMap();
        for(int i = 0 ; i < numbers.length ; i++)
            if(map.containsKey(target - numbers[i]))
               return new int[]{ (int)map.get(target - numbers[i])+1,i+1};
            else
                map.put(numbers[i],i);
        
        
        return null;
        
    }
}