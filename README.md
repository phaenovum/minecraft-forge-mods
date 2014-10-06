[deutsche Version](LIESMICH.md)

Minecraft Mods
==============

These mods are based on
forge-1.7.10-10.13.0.1180-src.zip
downloaded from:
http://adf.ly/673885/http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.7.10-10.13.0.1180/forge-1.7.10-10.13.0.1180-src.zip
If the link is not valid any more try to find the most recent link here:
http://www.minecraftforge.net/forum/index.php/board,3.0.html

Directory structure
-------------------

The pre-built workspace for Eclipse IDE users. This is not the one in the forge
sources, but it serves the same purpose.

    ./eclipse/

Where all forge related files are found. The folder created during extraction.

    ./forge/

The location of the source files

    ./source/

I am using my own ./eclipse and ./source directories to ease the use of version
controll (git).


Installation
------------

After cloning this repository:

- download recommended minecraft forge source zip

- unzip forge-1.7.10-10.13.0.1180-src.zip within your repo clone.

      unzip forge-1.7.10-10.13.0.1180-src.zip

- change into forge directory

      cd forge/

- follow the forge installation instructions here: http://www.minecraftforge.net/wiki/Installation/Source

- Open eclipse and choose the ./eclipse directory as workspace
( *not* forge/eclipse).

- In eclipse:

  - close the welcome screen

  - navigate to 'File > Import...' then select
  'General > Existing Projects into Workspace'

  - 'Select root directory' and choose the current eclipse workspace directory

  - make sure that both projects are selected and 'Finish' the dialogue

  - navigate to 'File > Import...' again then select 'General > Preferences'

  - 'Browse' to `eclipse_cfg` and select the 'forge-preferences.epf'
  file and 'Finish' the dialogue

  - navigate to 'File > Import...' for a last time then select
  'Run/Debug > Launch Configurations '

  - 'Browse' to `eclipse_cfg/forge-launchers` and select
  all launch configurations contained therein and 'Finish' the dialogue

- aeir_mod is our project, its launchers are called Client/Server aeir_mod.

- The forge project is the original forge project. It is added as "required
  Project on the build path" of aeir_mod. It is configured to export all
  forge/mc libraries which are thus imported by aeir_mod. You can create your
  own projects like this, but do not forget to edit the launchers to launch
  *your* project.
