// 71. Simplify Path
// https://leetcode.com/problems/simplify-path/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-09-22 20:21:08
// Runtime:    4 ms (beats 95.26%)
// Memory:     45.1 MB (beats 36.74%)
// Topics:     String, Stack

class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String[] p = path.split("/");

        for(String part : p){
            if(part.equals("") || part.equals(".")){
                continue;
            }

            if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(part);
            }
        }

        StringBuilder result = new StringBuilder();

        for(String f:st){
            result.append("/");
            result.append(f);
        }

        if(result.length() == 0){
            return "/";
        }

        return result.toString();
        
    }
}
