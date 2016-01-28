package pixLab.classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  public void moreBlue()
  {
	  Pixel [][] bluePixels = this.getPixels2D();
	  for (int row = 750; row < bluePixels.length; row++)
	  {
		  for(int col = 0; col < bluePixels[100]. length; col++)
		  {
			  Pixel currentPixel = bluePixels[row][col];
			  currentPixel.setBlue(100);
			  
			  bluePixels[row][col].setBlue(100);
		  }
	  }
  }

  public void moreGreen()
  {
	  Pixel [][] greenPixels = this.getPixels2D();
	  for (int row = 500; row < greenPixels.length; row++)
	  {
		  for(int col = 0; col < greenPixels[100]. length; col++)
		  {
			  Pixel currentPixel = greenPixels[row][col];
			  currentPixel.setGreen(100);
			  
			  greenPixels[row][col].setGreen(100);
		  }
	  }
  }
  
  public void moreRed()
  {
	  Pixel[][] redPixels = this.getPixels2D();
	  for (int row = 0; row < redPixels.length; row++)
	  {
		  for(int col = 915; col < redPixels[100]. length; col++)
		  {
			  Pixel currentPixel = redPixels[row][col];
			  currentPixel.setRed(100);
			  
			  redPixels[row][col].setRed(100);
		  }
	  }
  }
  public void keepOnlyRed()
  {
	  Pixel[][] onlyredPixels = this.getPixels2D();
	  for (int row = 0; row < onlyredPixels.length; row++)
	  {
		  for(int col = 0; col < onlyredPixels[0]. length; col++)
		  {
			  Pixel currentPixel = onlyredPixels[row][col];
			  currentPixel.setGreen(0);
			  currentPixel.setBlue(0);
			  
			  onlyredPixels[row][col].setGreen(0);
			  onlyredPixels[row][col].setBlue(0);
			  }
		  }
	  }
  public void keepOnlyBlue()
  {
	  Pixel[][] onlybluePixels = this.getPixels2D();
	  for (int row = 0; row < onlybluePixels.length; row++)
	  {
		  for(int col = 0; col < onlybluePixels[0]. length; col++)
		  {
			  Pixel currentPixel = onlybluePixels[row][col];
			  currentPixel.setGreen(0);
			  currentPixel.setRed(0);
			  
			  onlybluePixels[row][col].setGreen(0);
			  onlybluePixels[row][col].setRed(0);
			  }
		  }
	  }
  public void keepOnlyGreen()
  {
	  Pixel[][] onlygreenPixels = this.getPixels2D();
	  for (int row = 0; row < onlygreenPixels.length; row++)
	  {
		  for(int col = 0; col < onlygreenPixels[0]. length; col++)
		  {
			  Pixel currentPixel = onlygreenPixels[row][col];
			  currentPixel.setBlue(0);
			  currentPixel.setRed(0);
			  
			  onlygreenPixels[row][col].setBlue(0);
			  onlygreenPixels[row][col].setRed(0);
			  }
		  }
	  }
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }

  public void mirrorVerticalRightToLeft()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels[0].length;
	  for(int row = 0 ; row < pixels.length; row++)
	  {
		  for (int col = pixels[0].length -1; col > width / 2; col--)
		  {
			  rightPixel = pixels[row][col];
			  leftPixel = pixels[row][ (width / 2) - (col - width/ 2 )];
			  leftPixel.setColor(rightPixel.getColor());
		  }
	  }
  }
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  public void mirrorHorizontalBottomToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  public void randomChange()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel current : row)
		  {
			  int randomScale = (int)(Math.random() * 5);
			  int plusOrMinus = (int)(Math.random() * 2);
			  if(plusOrMinus > 0)
			  {
				  current.setRed((current.getRed()+randomScale) % 256);
				  current.setGreen((current.getGreen()+randomScale) % 256);
				  current.setBlue((current.getBlue()+randomScale) % 256);
			  }
			  else
			  {
				  current.setRed((current.getRed() - randomScale) % 256);
				  current.setGreen((current.getGreen() - randomScale) % 256);
				  current.setBlue((current.getBlue() - randomScale) % 256);
			  }
		  }
	  }
  }
  public void randomColor()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel current : row)
		  {
			  int randomred = (int)(Math.random() * 256);
			  int randogreen = (int)(Math.random() * 256);
			  int randomBlue = (int)(Math.random() * 256);
		  }
	  }
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture vaultboy1 = new Picture("Vaultboy.jpg");
    Picture vaultboy2 = new Picture("VaultBoy.jpg");
    this.copy(vaultboy1,0,0);
    this.copy(vaultboy2,100,0);
    this.copy(vaultboy1,200,0);
    Picture flowerNoBlue = new Picture(vaultboy2);
    flowerNoBlue.moreBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(vaultboy1,400,0);
    this.copy(vaultboy2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture Bioshock = new Picture("bioshock.jpg");
    Bioshock.explore();
    //Bioshock.mirrorVertical();
    //Bioshock.keepOnlyRed();
    //Bioshock.keepOnlyGreen();
    //Bioshock.keepOnlyBlue();
    //Bioshock.mirrorVerticalRightToLeft();
    //Bioshock.mirrorHorizontal();
    //Bioshock.mirrorHorizontalBottomToTop();
    Bioshock.explore();
    

  }
  
} // this } is the end of class Picture, put all new methods before this
