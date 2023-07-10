# CE-MultiProLan

A Modeling Tool component and a Domain-Specific Modelling Language called CE-MultiProLan that can be used for describing cross-organisational production processes in a non-technical way with sufficient details to enable collaborative production planning, execution and monitoring. CE-MultiProLan was created as a collaborative extension of the [Multi-level production process modeling language - MultiProLan](https://www.sciencedirect.com/science/article/abs/pii/S2590118421000320) DSML. The original meta-model, created using the [Ecore](https://wiki.eclipse.org/Ecore) meta-meta-model, was expanded to support concepts required for modelling shared models, IPMs and CPMs. The [Sirius](https://www.eclipse.org/sirius/)-based modelling tool was also expanded to create the Modeling Tool component that supports CE-MultiProLan. The expansion resulted in the creation of additional Sirius viewpoints to support the creation of Interface Process Models (IPMs) and Cross-organisational Process Models (CPMs).

## Setting up the project

### Pre-requisites
As a main pre-requisite, an Eclipse IDE environment is needed, with all the necessary plug-ins for using Ecore and Sirius projects.

Additionally, Java 8 or higher is needed.

### Ecore Meta Model
1. File > New > Other > Eclipse Modeling Framework > Empty EMF Project
1. Copy ‘process_modeling.ecore’ to the model folder
1. (Optional) Change Eclipse Perspective - Modeling
1. Right click on ‘process_modeling.ecore’ > New > Other > Eclipse Modeling Framework > EMF Generator Model > model > Ecore model > Load (process_modeling.ecore)
1. Generate the Meta-Modeling Tool – in genmodel > right click on the root of the tree (Process_modeling) > Generate All:
1. Graphical View of model: right click on process_modeling.ecore > new > Representations File > Finish > Design > Open process_modeling.aird > select Design > New > Entities in a Class Diagram > Next > Finish  (This can be used to create different views of a model)
1. Here you can see different enumerations, classes etc.
1. You can hide elements that are irrelevant for a view / use-case (Marko created different views for Master Level, Detailed Level, Error handling)
1. On the right side, in the Palette, you can see elements that can be added to the model – Classes, Enumerations, Constants, Relation... 
1. To generate a tool based on the Meta-Model: Right click on the project > Run As > Eclipse Application 
### Sirius Runtime Eclipse Application
1. Create a Viewpoint Specification Project: Create a project... > Sirius > Viewpoint Specification Project (name it process_modelling_design to be able to import icons later)
1. Open Perspective > Sirius
1. Import the project located at *CE-MultiProLan/Sirius*
1. When you open the *CE-MultiProLan/Sirius/description/project.odesign* file, you can see viewpoints for different language levels/process types
1. For creating the modeling project (within which the created models will be stored) Right click on the .odesign > New > Other > Sirius > Modeling Project
1. To create a new model: Right click on Project > New > Other > Example EMF Model Creation Wizards > something.process_modeling > Select root element – Process
1. Right Click on Process (within something.process_modeling) > New Representation > Process (ML) Matched Process (DL) Model, CBP Model or IP Model > Diagram Name


### Useful Links
* [https://www.eclipse.org/sirius/doc/](https://www.eclipse.org/sirius/doc/)
* [https://wiki.eclipse.org/Sirius/Tutorials](https://wiki.eclipse.org/Sirius/Tutorials)
* [https://wiki.eclipse.org/Sirius/Tutorials/StarterTutorial](https://wiki.eclipse.org/Sirius/Tutorials/StarterTutorial)
* [https://wiki.eclipse.org/Sirius/Tutorials/AdvancedTutorial] (https://wiki.eclipse.org/Sirius/Tutorials/AdvancedTutorial)
* [https://wiki.eclipse.org/Sirius/Tutorials/CompartmentsTutorial] (https://wiki.eclipse.org/Sirius/Tutorials/CompartmentsTutorial)
* [https://www.eclipse.org/sirius/doc/specifier/general/Writing_Queries.html](https://www.eclipse.org/sirius/doc/specifier/general/Writing_Queries.html)