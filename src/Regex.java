
import java.util.*;
public class Regex {


        public boolean isValid(){

            return false;
        }


        public ArrayList<String> findWildCard(String pattern, ArrayList<String> list){
            ArrayList<String> result = new ArrayList();
            for(int i=0;i<list.size();i++){
                if(doesPatternExistInString(pattern, list.get(i))){
                    result.add(list.get(i));
                }
            }
            return result;

        }


        public boolean doesPatternExistInString(String pattern, String s ){
            int j=0;
            for(int i=0;i<s.length();i++){
                for(j=0;j<pattern.length();j++) {
                    if (s.charAt(i) != pattern.charAt(j)) {
                        j=0;
                        break;
                    }else{
                        i++;
                    }
                }
                if(j==pattern.length()){
                    return true;
                }
            }


            return false;
        }
        public static void main(String[] args){
            Regex regex= new Regex();
            ArrayList<String> list = new ArrayList();
            list.add("hello");
            list.add("catty");
            list.add("catfish");
            String pattern = "cat";
            String s = " catty";
            System.out.println(regex.doesPatternExistInString(pattern,s));
            list = regex.findWildCard(pattern, list);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }


        }
    }



