import java.util.jar.*;
import java.io.*;
import java.util.*;
public class ListJar {
   

    public static void main(String arg[]) throws IOException {
		int a=0,b=0;
        JarFile jarFile = new JarFile("beta.jar");
		JarFile jarFile1 = new JarFile("beta1.jar");
         ArrayList<String>jar1=new ArrayList<String>();
		 ArrayList<String>jar2=new ArrayList<String>();

        final Enumeration<JarEntry> entries = jarFile.entries();
		final Enumeration<JarEntry> entries1 = jarFile1.entries();
        while (entries.hasMoreElements()) {
            final JarEntry entry = entries.nextElement();
            if (entry.getName().contains(".")) 
				{
                 jar1.add(entry.getName());
                
            }
        }
		System.out.println("Second Jar file\n");
		  while (entries1.hasMoreElements()) 
			  {
              final JarEntry entry1 = entries1.nextElement();
              if (entry1.getName().contains("."))
				{
				 jar2.add(entry1.getName());
                }
            }
		for(String str: jar1)
			jar2.remove(str);
		System.out.println(jar2);
    }
}