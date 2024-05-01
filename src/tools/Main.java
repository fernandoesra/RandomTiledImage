package tools;

/**
 * This is the class that controls the input arguments. From here the
 * ImagesFromTiles class will be launched to create the output image.
 * 
 * @author Fernando Tarrino del Pozo (FernandoEsra)
 * @see ImagesFromTiles
 */

public class Main {

	/**
	 * 
	 * The program accepts up to 4 input variables, configured in 4 different ways:
	 * <p>
	 * <b>Values:</b>
	 * <p>
	 * <b>Preview:</b> True/False - Determines if the system will automatically open
	 * the generated image once the program has finished.<br>
	 * <b>Width:</b> Value in pixels for the width of the generated image.<br>
	 * <b>Height:</b> Value in pixels for the height of the generated image.<br>
	 * <b>Name:</b> Name for the output file (without adding extension)
	 * <p>
	 * <b>Examples of input parameters:</b>
	 * 
	 * <pre>
	 * +---------------------------+----------------------------------------------+
	 * |          <b>INPUTS</b>           |                   <b>EXAMPLE</b>                    |
	 * +---------------------------+----------------------------------------------+
	 * | preview                   | java -jar run.jar true                       |
	 * +---------------------------+----------------------------------------------+
	 * | preview name              | java -jar run.jar true testImage             |
	 * +---------------------------+----------------------------------------------+
	 * | preview width height      | java -jar run.jar true 800 600               |
	 * +---------------------------+----------------------------------------------+
	 * | preview width height name | java -jar run.jar true 3840 2160 4kTestImage |
	 * +---------------------------+----------------------------------------------+
	 * </pre>
	 * 
	 * @param args The input array with the config parameters
	 */
	public static void main(String[] args) {

		int width = 1920;
		int height = 1080;
		String outputName = null;
		boolean win;

		if (args.length == 0) {
			win = false;
			width = 1920;
			height = 1080;
		} else {
			win = Boolean.valueOf(args[0]);
		}

		if (args.length == 2) {
			outputName = args[1];
		}

		if (args.length > 2) {
			width = Integer.valueOf(args[1]);
			height = Integer.valueOf(args[2]);
		}

		if (args.length == 4) {
			outputName = args[3];
		}

		ImagesFromTiles ift = new ImagesFromTiles(height, width, win, outputName);
		ift.FillArray();
		ift.DrawTiles();
	}

}
