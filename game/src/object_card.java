/*
    In the name ALLAH
*/

import java.awt.image.BufferedImage;

public class object_card {
    String name , suit; 
    int value , point; 
    BufferedImage bufferedimage;
    
    object_card (String name_ , String suit_ , int value_ , int point_ , BufferedImage bimage) {
        this.name = name_; 
        this.suit = suit_;
        this.value = value_; 
        this.point = point_;
        this.bufferedimage = bimage;
    }
}