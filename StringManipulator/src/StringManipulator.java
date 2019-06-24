public class StringManipulator {
         public String trimAndConcat(String a, String b) {
        return a.trim()+b.trim();
    }

         public int getIndexOrNull(String fullstring, char findchar){
        return fullstring.indexOf(findchar);
    }
          public int getIndexOrNull(String fullstring, String findstring){
        return fullstring.indexOf(findstring);
    }
         String concatSubstring(String stringone, int start, int end, String stringtwo) {
        return stringone.substring(start,end)+stringtwo;

        }
    }