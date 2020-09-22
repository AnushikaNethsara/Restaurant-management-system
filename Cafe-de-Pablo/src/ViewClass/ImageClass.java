/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import java.io.FileInputStream;

/**
 *
 * @author Acer
 */
public class ImageClass {

    private FileInputStream image;
    private  byte[] image1;
    private String id;
    
    public ImageClass(){
    }
        
    
    public ImageClass(String id,FileInputStream image){
        this.image=image;
        this.id=id;
        this.image1=image1;
    }
    public ImageClass(String id){
        this.id=id;
    }
    
    /**
     * @return the image
     */
    public FileInputStream getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(FileInputStream image) {
        this.image = image;
    }

    /**
     * @return the image1
     */
    public byte[] getImage1() {
        return image1;
    }

    /**
     * @param image1 the image1 to set
     */
    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
