class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character , Character>map = new HashMap();

        for(int i = 0;i<s.length();i++){
        char orignal = s.charAt(i);
        char replacement = t.charAt(i);

            if(!map.containsKey(orignal)){
                if(!map.containsValue(replacement)){
                    map.put(orignal , replacement);
                 }else{
                return false;
                }
            }else{
                char mappedchar = map.get(orignal);
                if(mappedchar != replacement){
                return false;
                }
            }
        }
        return true;
    } 
}