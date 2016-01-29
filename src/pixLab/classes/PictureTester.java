package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture bioshock = new Picture("bioshock.jpg");
    bioshock.explore();
    bioshock.mirrorVertical();
    bioshock.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture bioshock = new Picture("bioshock.jpg");
    bioshock.explore();
    bioshock.mirrorHorizontal();
    bioshock.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
    Picture bioshock = new Picture("bioshock.jpg");
    bioshock.explore();
    bioshock.mirrorHorizontalBottomToTop();
    bioshock.explore();
  }
  public static void testRandomColor()
  {
	  Picture randomBio = new Picture("caterpillar.jpg");
	  randomBio.explore();
	  randomBio.randomColor();
	  randomBio.explore();
	  
  }
  
  public static void testmirrorVerticalRightToLeft()
  {
	  Picture bioshock = new Picture("bioshock.jpg");
	  bioshock.explore();
	  bioshock.mirrorVerticalRightToLeft();
	  bioshock.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testRandomColor();
    //testMirrorVertical();
	//testmirrorVerticalRightToLeft();
	  testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}