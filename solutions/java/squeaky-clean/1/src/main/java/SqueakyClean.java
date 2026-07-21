class SqueakyClean {
    static String clean(String identifier) {
        
        char[] c=identifier.replace(" ","_").toCharArray();
        StringBuilder s=new StringBuilder();
        for (int i=0;i<c.length;i++){
            if(Character.isDigit(c[i]) || Character.isLetter(c[i]) || c[i]=='_' ||c[i]=='-')
            {
                
                if(Character.isDigit(c[i]))
                {switch(c[i]){
                    case '4': s.append('a');break;
                    case '3': s.append('e');break;
                    case '0': s.append('o');break;
                    case '1': s.append('l');break;
                    case '7': s.append('t');break;
                }}
                else if(c[i]=='-'){
                    s.append(Character.toUpperCase(c[i+1]));i++;
                }
                else s.append(c[i]);
            }
        }
        return s.toString();
    }
}
