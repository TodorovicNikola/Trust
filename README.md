# ColProLan
A repository for storing ColProLan research-related artifacts


## ColProLan Component

ColProLan was designed to alleviate the need for excessive technical expertise when introducing a blockchain-based monitoring platform that supports the operations of collaborative networks, while also promoting trust and ensuring transparency within the network. It allows partners to clearly define which data should be shared between them during production execution and which checks should be performed on the shared data, while also ensuring that the confidentiality of their manufacturing processes will not be compromised.

Artefacts related to ColProLan, as well as the instructions for setting up this component are available in the ColProLan directory.

## Code Generator Component

The Code Generator component implemented in plain Java programming language to enable the generation of Golang smart contracts used for performing process monitoring of collaborative production. The component implements an algorithm that interpret elements contained within IPMs and CBPMs and translates them into executable Golang smart contract code suitable for execution by the Hyperledger Fabric. 

For smart contract code generation to be possible, a Model-to-Text (M2T) algorithm is used. It represents a modified version of the algorithm introduced by authors in the following research paper [Untrusted Business Process Monitoring and Execution Using Blockchain](https://link.springer.com/chapter/10.1007/978-3-319-45348-4_19). The generated smart contracts implement the state machine behavioural pattern, where a state transition is possible only if certain requirements have been met.

Artefacts related to the Code Generator component, as well as the instructions for setting up this component are available in the CodeGenerator directory.

## Monitoring Platform Component

A monitoring platform based on Blockchain that facilitates trust and objectiveness within a collaborative production network. The platform represents an opinionated implementation of the reference architecture for a collaborative production monitoring system that comprises the necessary components for it to support the realisation of our approach.

Artefacts related to the Monitoring Platform component, as well as the instructions for setting up this component are available in the trust-dlt directory.

## Examples

The Examples directory contains the following:
* Models created using ColProLan (as images and as Sirius model files)
* Sample smart contract code generated based on those models (for CPM and IPM models)

