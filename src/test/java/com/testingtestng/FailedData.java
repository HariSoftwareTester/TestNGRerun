package com.testingtestng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedData implements IAnnotationTransformer{

	
public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	
	
	  Class<? extends IRetryAnalyzer> retryAnalyzerClass = annotation.getRetryAnalyzerClass();

	 if(retryAnalyzerClass == null) {
		 
	 annotation.setRetryAnalyzer(Failedtc.class);
	 
	
}
   
   
		
	}

}
