# metacontrol_tooling
T6 MROS tooling (TUD, ITU)


In this repo, we present the implementation of the MROS Language grammar. To specify a mission, you need to download the Eclipse project. The five subprojects can be imported in Eclipse Version: 2019-12 (4.14.0) with Xtext 2.21.0. An Eclipse plug-in of the MROS Language Grammar can be built by right-clicking the project called "org.xtext.mros.mros", selecting "Run as", "Eclipse Application". This will spawn a new instance of Eclipse, with the plug-in loaded. In the new instance, create a new Java project, and create a file with extension ".mros", i.e., the extension of Mission Specification files. In the text editor, the Mission Specification Language can be used (including parse error visualisation, ctrl-tab, hierarchy, etc.).

When a mission specification in the editor is saved, the code generation process starts and generates the corresponding artifacts that can be directly deployed to a running system: the Knowledge Base used by the reasoner (.owl), the system modes file (.yaml) used by the Mode Manager and the status of the components (.yaml) used by mors_mode_observer. 

The folder Test Scenarios contains two demonstrations for two different systems. 
The first subfolder Bosch_Project contains all the design artifacts of the Bosch Demo. 
The second subfolder IRCJ_Demo contains all the design artifacts of the URJC Demo.


