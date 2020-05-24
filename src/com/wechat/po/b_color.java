 package com.wechat.po;
 
 public class b_color
 {
   private String color_id;
   private String color_name;
   private String short_color_id;
   
   public String getColor_id()
   {
     return this.color_id;
   }
   
   public void setColor_id(String color_id)
   {
     this.color_id = color_id;
   }
   
   public String getColor_name()
   {
     return this.color_name;
   }
   
   public void setColor_name(String color_name)
   {
     this.color_name = color_name;
   }
   
   public String getShort_color_id()
   {
     return this.short_color_id;
   }
   
   public void setShort_color_id(String short_color_id)
   {
     this.short_color_id = short_color_id;
   }
   
   public String toString()
   {
     return 
       "b_color [color_id=" + this.color_id + ", color_name=" + this.color_name + ", short_color_id=" + this.short_color_id + "]";
   }
 }


