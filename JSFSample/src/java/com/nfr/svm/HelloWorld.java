/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfr.svm;

/**
 *
 * @author paulpandi.j
 */

import java.io.File;
import javax.faces.bean.ManagedBean;
import org.primefaces.event.FileUploadEvent;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
    
    File file = null;
   
   public HelloWorld() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return "Hello World!";
   }
   
   public void callFileUpload(FileUploadEvent evt){
       System.out.println("Listener callingggg");
   }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
   
   
}
