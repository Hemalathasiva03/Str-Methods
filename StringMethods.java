import java.util.Scanner;

  public class StringMethods
  {
      String string;
      int strlen ;
      int index;
      char[] strArray ;
      StringMethods(String string){
      this.string=string;
      this.strArray=string.toCharArray();
      int strArray_len =strArray.length;
      this.strlen=strArray_len;
  }
  //1.String Character return index value 
  public char CharAt(int index) {
  
      for(int i=0;i<this.strlen;i++) {
      if(i==index)
        {
          return strArray[i];
        }
      }
      if(index>strArray.length) {
        return '\0';
      }
        return '\0';
  }

  //2.String CodePoint return unicode of the Character at the specified index
  public int CodePointAt(int index) {
   
      for(int i=0;i<this.strlen;i++) {
      if(i==index)
      {
        int Ascii_value=strArray[i];
        return Ascii_value;
      }
      }
      if(index>strArray.length) {
        return '\0';
      }
        return -1;
  }
 
 //3.String CodePointBefore return unicode of the Character at the specified index
  public int CodePointBefore(int index) {
      index=index-1;
      for(int i=0;i<this.strlen;i++) {
        if(i==index)
        {
          int Ascii_value=strArray[i];
          return Ascii_value;
       }
      }
      if(index>strArray.length) {
      return '\0';
      }
      return -1;
  }

  //4.String CodePointBefore return the number of unicode values found
  public int CodePointCount(int startindex,int endindex) {
      int count=0;
      if(endindex>strArray.length) {
        return '\0';
       }
      for(int i=startindex;i<endindex;i++) {
        count++;
      }
      return count;
   }
   
  //5.String compareTo return true or false 
  public int compareTo(String str2) {
    
    char[] str2_Array=str2.toCharArray();
    int str2_length=str2_Array.length;
    for(int i=0;i<this.strlen;i++) {
      if(this.strArray[i] != str2_Array[i]){
        int Ascii_value_str=this.strArray[i];
        int Ascii_value_str2=str2_Array[i];
        return Ascii_value_str-Ascii_value_str2;
      }
      if(this.strlen!=str2_length) {
        return this.strlen-str2_length;
      }
    }
    return 0;
}

  //6.String compareToIgnorecase return true or false
  public int compareToIgnorecase(String str2) {
  
    char[] str2_Array=str2.toCharArray();
    int str2_length=str2_Array.length;
    for(int i=0;i<this.strlen;i++) {
      int Ascii_value_str=this.strArray[i];
      int Ascii_value_str2=str2_Array[i];
      if(Ascii_value_str-Ascii_value_str2==32||Ascii_value_str-Ascii_value_str2==-32) {
        continue;
      }
      if(this.strArray[i] != str2_Array[i]){
        return Ascii_value_str-Ascii_value_str2;
      }
      if(this.strlen!=str2_length) {
        return this.strlen-str2_length;
      }
    }
    return 0;
  }
   
  //7.String concat add or append two String
  public String concat(String str2) {
    return this.string+" "+str2;
  }
 
  //8.String contain
  public boolean contains(String str2) {
    boolean str=this.string.matches("(.*)"+str2+"(.*)");
    return str;
  }
 
  //9.String ContentEquals return true or false
  public boolean ContentEquals(String str2) {
    char[] str2_Array=str2.toCharArray();
    for (int i = 0; i < this.string.length(); i++){
      if (this.strArray[i] != str2_Array[i]) {
        return false;
      }
      }
    return true;
  }
  
  //10.String is equals return true 
  public boolean  equals(String str2) {
    char[] str2_Array=str2.toCharArray();
    for (int i = 0; i < this.string.length(); i++){
      if (this.strArray[i] != str2_Array[i]) {
        return false;
      }
    }
      return true;
   }

  //11.String is equals with Ignorecase return true
  public boolean equalsIgnorecase(String str2) {
  
    char[] str2_Array=str2.toCharArray();
    int str2_length=str2_Array.length;
    for(int i=0;i<this.strlen;i++) {
      int Ascii_value_str=this.strArray[i];
      int Ascii_value_str2=str2_Array[i];
      if(Ascii_value_str-Ascii_value_str2==32||Ascii_value_str-Ascii_value_str2==-32) {
        continue;
      }
      if(this.strArray[i] != str2_Array[i]){
        return false;
    }
    }
      return true;
  }

  //12.String Indexof return Index of the position
  public int Indexof(String str2) {
    char[] str2_Array=str2.toCharArray();
    for (int i = 0; i < this.string.length(); i++){
      if (this.strArray[i] == str2_Array[i]) {
        return i;
      }
    }
    return '\0';
  }
  
   //13.String is isEmpty return true
  public boolean isEmpty() {
    if(this.strlen==0) {
      return true;
    }
      return false;
  }

  //14.Lowercase covert to Uppercase
  public String toUppercase() {
    String str="";
    for(int i=0;i<this.strlen;i++) {
      int char_value=this.strArray[i];
      if(char_value>=97&&char_value<=122) {
        char_value=char_value-32;
        str+=(char)char_value;
         } 
         else
         {
         str+=strArray[i];
         }
    }
    return str;
  }

  //15.Uppercase covert to Lowercase
  public String toLowercase() {
    String str="";
    for(int i=0;i<this.strlen;i++) {
      int char_value=this.strArray[i];
      if(char_value>=65&&char_value<=90) {
        char_value=char_value+32;
        str+=(char)char_value;
         } 
         else {
          str+=strArray[i];
         }
    }
    return str;
  }
  
  //16.String covert to String
  public String toString() {
    String str="";
    for(int i=0;i<this.strlen;i++)
   {
      str+=this.strArray[i];
   }
      return str;
  }
  
  //17.Object To String
  public String ObjectToString()
  {
    StringMain a = new StringMain();  
    return ((a == null)? null : a.toString());
}
  //18.String replace return change the char of the String
  public String replace(char original_char,char replace_char) {
    String str="";
    for (int i = 0; i < this.string.length(); i++){
      if (this.strArray[i] == original_char) {
        this.strArray[i]=replace_char;
      }
        str+=strArray[i];
      }
    return str;
    }
  
  }
