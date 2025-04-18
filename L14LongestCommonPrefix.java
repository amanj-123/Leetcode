 package String;

class L14LongestCommonPrefix {
//TC=O(n*m) SC=O(1)
public String longestCommonPrefix(String[] strs) {
    if(strs.length==0 || strs==null) return "";
    String pre= strs[0];
    for(int i=1; i<strs.length; i++){
        while(strs[i].indexOf(pre)!=0){
            pre= pre.substring(0, pre.length()-1);
            while(pre.isEmpty()) return "";
        }
    }
    return pre;
}
    
}