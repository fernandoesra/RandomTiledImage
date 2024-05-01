# RandomTiledImage
### *Tile composition generator using java 11 for 16x16 based tiles*

# Resume
Tool to generate images of any size based on random compositions of tiles of different sizes, all based on 16 pixel x 16 pixel tiles.

# Requirements
- Java-11
- Images in the supported dimensions that must be placed in the <b>Tiles folder</b> next to the program

# How to use
- Place all the tiles that you want to use for generation (separately, not a tileset) inside the Tiles folder
  
![](https://i.imgur.com/Kjh92GZ.png)

- Run the run.jar file
- Enjoy the result

![](https://i.imgur.com/k4BECwZ.png)
> *Example result without modifying input parameters (The generated image will be 1920 x 1080 pixels)*

# Input parameters
You can modify the behavior of the tool with 4 different input parameters. These parameters can be combined in different ways.

<b>The 4 values that can be modified are:</b>

- Preview (true/false): Upon completion of the tool the system image manager will open and we will see the generated image.
- Width (int): The width in pixels of the generated image can be modified with this parameter.
- Height (int): The height in pixels of the generated image can be modified with this parameter.
- Name (text): By default the generated name will be given by the code using a timestamp. If we want a custom name we can pass it as a parameter.

<b>Possible uses of input parameters:</b>

|          <b>INPUTS</b>           |                   <b>EXAMPLE</b>                    |
|---------------------------|----------------------------------------------|
| preview                   | java -jar run.jar true                       |
| preview name              | java -jar run.jar true testImage             |
| preview width height      | java -jar run.jar true 800 600               |
| preview width height name | java -jar run.jar true 3840 2160 4kTestImage |

# Rules:

- There must always be at least <b>one 16x16 tile</b> for the program to work correctly
- It is recommended that all image formats be in the same format (.png recommended)
- There is no limit to the number of variations a tile can have. There can be, for example, a single 16x16 tile and two hundred 32x32 tiles

# Images generated with the example tileset:

This tileset is only to show the tiles used, the tiles must be included separately in the Tiles folder.

![](https://i.imgur.com/zwprTLm.png)

<b>Examples</b>

> ![](https://i.imgur.com/BMFgNEW.png)
> *160 x 160*

> ![](https://i.imgur.com/uFHw6SP.png)
> *1920 x 1080 (HD)*

> ![](https://i.imgur.com/ZVcgFMB.png)
> *3840 x 2160 (4K)*

> ![](https://i.imgur.com/42bDKDY.png)
> *Image generated using only one 16x16 tile and another 32x32 tile*

> ![](https://i.imgur.com/PeUMkOQ.png)
> *Image generated using two 16x16 tiles and one 16x48 tile*

> ![](https://i.imgur.com/ejWFX1Z.png)
> *Image generated using a 16x16 tile, another 32x16 tile and another 16x32 tile*
