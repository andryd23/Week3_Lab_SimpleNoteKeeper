/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author 832465
 */
public class Note implements Serializable {
    
  public String title;
  public String content;
  
  public Note() {
      
  }
  
  public void setTitle(String title) {
      this.title = title;
  }
  public String getTitle() {
      return title;
  }
  
  public void setContent(String content) {
      this.content = content;
  }
  
  public String getContent() {
      return content;
  }
  
    
}
