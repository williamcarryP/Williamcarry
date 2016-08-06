public String longestCommonPrefix(ArrayList<String> a) {
    String str="";
 if(a.size()==0)
 {
     return " ";
 }
 if(a.size()==1)
 {
     return a.get(0);
 }
  
 int result=a.get(0).length();
 int n=a.size();
  
 for(int i=0;i<result ;i++)
 {
     int j;
     for(j=1;j<n;j++)
     {
         if(a.get(0).charAt(i)==a.get(j).charAt(i))
         {
             if(j==n-1)
             {
                 str+=a.get(0).charAt(i);
             }
         }
         else
         {
             i=result;
             break;
              
             
         }
          
          if(result>a.get(j).length())
     {
         result=a.get(j).length();
     } 
          
     }
     
 }
 return str;
// return Integer.toString(a.get(0).length());
  
 //   return Character.toString(a.get(0).charAt(0));
}


         {
             result=a.get(j).length();
         } 
             
         }
        
     }
     return str;

    }