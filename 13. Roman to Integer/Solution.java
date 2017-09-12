class Solution {
    public int romanToInt(String s) {
       
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
        
       
        
        char[] roman = s.toCharArray();
        int length = roman.length;
        
        
        if(length==1)
        {
            return map.get(roman[0]);
        }
        
        int num = 0;
        
        for(int i = 1 ;i < length ; i++ )
        {
           if( map.get(roman[i-1])<map.get(roman[i]) )
           {
               num -=map.get(roman[i-1]);
           }
            else
            {
               num +=map.get(roman[i-1]);
            }
        }
        
        
        return num+map.get(roman[length-1]);
        
        
        
    }
}