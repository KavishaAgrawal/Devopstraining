package jndi;

import java.util.Hashtable;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

public class TestJNDI {
  public static void main(String[] rgstring) {
	
	  	  try {
	  	  Hashtable hashtableEnvironment = new Hashtable();
	  	  hashtableEnvironment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fs.RefFSContextFactory");
	  	  hashtableEnvironment.put(Context.PROVIDER_URL, rgstring[0]);
	  	  Context context = new InitialContext(hashtableEnvironment);
	  	  if(rgstring.length ==1 ) {
	  		  NamingEnumeration namingenumeration = context.listBindings("");
	  		  while(namingenumeration.hasMoreElements()) {
	  			  Binding binding = (Binding) namingenumeration.next();
	  			  System.out.println(binding.getName()+" "+binding.getObject());
	  		  }
	  	  }
	  	  context.close();
	} catch (NamingException namingexception) {
		// TODO Auto-generated catch block
		namingexception.printStackTrace();
	}
}
}
