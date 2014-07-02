ResourceRetriever
=================

A Simple Project that Allows Access to Internal Text Files Within a Jar.


###Usage
========

```
public static void main(String[] args)
{
  string filename = "exampleFile.txt";
  location = "this/is/my/package/name; //for example the package com.files.text would be "com/files/text"
  
  //usage
  BufferedReader reader = ResourceRetrieverImpl.GetResource(filename, location).getReader();
  
  //code here to do something with the bufferedReader
  //...
}
```
