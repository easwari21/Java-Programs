import java.util.ArrayList;
public  class ip {
    public static void main(String[] args) {
        String input = "1010230";
        ArrayList<String> list = new ArrayList<>();
        String addr="";
        int segments = 0;
        int start = 0;
        restore(list, input, addr, segments, start);
        list.stream().forEach(s-> System.out.println(s));
        

    }
    private static void restore(ArrayList<String> list,String input,String addr,int segments,int start){
        if (segments>3) {
            if(start==input.length()){
                addr=addr.substring(0, addr.length() - 1);
                list.add(addr);
            }
            return;
        }
          for(int i=start;i<input.length() && i<start+3;i++){
            String currrent=input.substring(start,i+1);
            if(isValid(currrent)){
                restore(list,input,addr + currrent + ".",segments+1,i+1);
            }
          } 
    }
        private static boolean isValid(String current) {
            if (current.isEmpty()||
                  current.length()>3 ||
                  Integer.parseInt(current)>255 ||
                  (current.startsWith("0") && 
                  current.length() > 1)){
                return false;
            }
            return true;
          } 
         
        }
    