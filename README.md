# CE-MultiProLan
A repository for storing CE-MultiProLan research-related artifacts


## CE-MultiProLan Component

A Modeling Tool component and a Domain-Specific Modelling Language called CE-MultiProLan that can be used for describing cross-organisational production processes in a non-technical way with sufficient details to enable collaborative production planning, execution and monitoring. CE-MultiProLan was created as a collaborative extension of the [Multi-level production process modeling language - MultiProLan](https://www.sciencedirect.com/science/article/abs/pii/S2590118421000320) DSML. The original meta-model, created using the [Ecore](https://wiki.eclipse.org/Ecore) meta-meta-model, was expanded to support concepts required for modelling shared models, IPMs and CPMs. The [Sirius](https://www.eclipse.org/sirius/)-based modelling tool was also expanded to create the Modeling Tool component that supports CE-MultiProLan. The expansion resulted in the creation of additional Sirius viewpoints to support the creation of Interface Process Models (IPMs) and Cross-organisational Process Models (CPMs).

Artefacts related to CE-MultiProLan, as well as the instructions for setting up this component are available in the CE-MultiProLan directory.

## Code Generator Component

The Code Generator component implemented in plain Java programming language to enable the generation of Golang smart contracts used for performing process monitoring of collaborative production. The component implements an algorithm that interpret elements contained within IPMs and CPMs and translates them into executable Golang smart contract code suitable for execution by the Hyperledger Fabric. 

For smart contract code generation to be possible, a Model-to-Text (M2T) algorithm is used. It represents a modified version of the algorithm introduced by authors in the following research paper [Untrusted Business Process Monitoring and Execution Using Blockchain](https://link.springer.com/chapter/10.1007/978-3-319-45348-4_19). The generated smart contracts implement the state machine behavioural pattern, where a state transition is possible only if certain requirements have been met.

Artefacts related to the Code Generator component, as well as the instructions for setting up this component are available in the CodeGenerator directory.

## Monitoring Platform Component

A monitoring platform based on Distributed Ledger Technology (DLT) that facilitates trust and objectiveness within a collaborative production network. The platform represents an opinionated implementation of the reference architecture for a collaborative production monitoring system that comprises the necessary components for it to support the realisation of our approach.

Artefacts related to the Monitoring Platform component, as well as the instructions for setting up this component are available in the trust-dlt directory.

## Examples

The Examples directory contains the following:
* Models created using CE-MultiProLan (as images an as Sirius model files)
* Sample smart contract code generated based on those models (for CPM and IPM models)

