Minecraft Mods
==============

These mods are based on
minecraftforge-src-1.6.4-9.11.0.884
downloaded from:
http://adf.ly/673885/http://files.minecraftforge.net/minecraftforge/minecraftforge-src-1.6.4-9.11.0.884.zip

Directory structure
-------------------

The pre-built workspace for Eclipse IDE users.

    ./eclipse/

Where all forge related files are found. The folder created during extraction. Contains all the readmes and

    ./forge/

The installation script for installing Forge.

    ./forge/install.sh or /forge/install.cmd

The location of the Minecraft Coder Pack tools.

    ./forge/mcp/

Scripts that get your mod from source code into a releaseable state.

    ./forge/mcp/recompile.sh /forge/mcp/reobfuscate.sh (.bat for Windows)

The location of your class files after running reobfuscate.sh (.bat for Windows)

    ./forge/mcp/reobf/

The location of your source files

    ./source/


Installation
------------

After cloning this repository:

- download latest minecraft forge source zip
- unzip minecraftforge-src-1.6.4-9.11.0.884.zip within your repo clone.

      unzip minecraftforge-src-1.6.4-9.11.0.884.zip

- change into forge directory

      cd forge/

- on Linux/Mac make install script executable

      chmod u+x install.sh

- execute the install script (on Windows doubl-click install.cmd)

      ./install.sh

- Open eclipse and choose the ./eclipse directory as workspace.

