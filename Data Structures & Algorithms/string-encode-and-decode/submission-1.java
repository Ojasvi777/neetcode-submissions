class Solution {
    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }        
        List<Integer> sizes = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        
        for(String str: strs){
            sb.append(str.length());
            sb.append(',');
        }
        sb.append('#');
        for(String str: strs){
            sb.append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        if(str == ""){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;

        while(str.charAt(i) != '#'){
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i)!= ','){
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;

        for(int size: sizes){
            res.add(str.substring(i,i+size));
            i+=size;
        }
        return res;
    }
}
