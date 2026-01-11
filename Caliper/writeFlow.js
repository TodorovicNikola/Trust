'use strict';

const { WorkloadModuleBase } = require('@hyperledger/caliper-core');


class MyWorkload extends WorkloadModuleBase {
    constructor() {
        super();
    }

    async initializeWorkloadModule(workerIndex, totalWorkers, roundIndex, roundArguments, sutAdapter, sutContext) {
        await super.initializeWorkloadModule(workerIndex, totalWorkers, roundIndex, roundArguments, sutAdapter, sutContext);

        for (let i=0; i<this.roundArguments.processes; i++) {
            const flowID = `${this.workerIndex}_${i}`;
            console.log(`Worker ${this.workerIndex}: Creating ${this.roundArguments.contractId} flow ${flowID}`);
            const request = {
                contractId: this.roundArguments.contractId,
                contractFunction: 'InitFlowExecution',
                invokerIdentity: 'TrustCAAdmin',
                contractArguments: ['0_0', flowID],
                readOnly: false
            };

            await this.sutAdapter.sendRequests(request);
        }
    }

    async submitTransaction() {
        function generateValue(errorRate, threshold) {
            const probabilityOfError = errorRate / 100;
            const shouldSucceed = Math.random() > probabilityOfError;

            let generatedValue;

            if (shouldSucceed) {
                const min = 1;
                const max = threshold;
                generatedValue = Math.floor(Math.random()*max);
            } else {
                const min = threshold;
                const max = 10;
                generatedValue = Math.floor(Math.random() * (max - min) + min);
            }
            return generatedValue;
        }

        const randomProcessId = Math.floor(Math.random()*this.roundArguments.processes);
        const ccId = `${this.workerIndex}_${randomProcessId}`;

        const errorRateStateTransition = this.roundArguments.errorRateStateTransition;
        const errorRateValueError = this.roundArguments.errorRateValueError;

        let payload = {
            CBP_ID: '0_0',
            IP_ID: ccId,
            Action: 'El_BI01_BoxInspection___6ee4',
            ActionArgs: {
                "El_BI01_BoxInspection___6ee4Active": Math.random() > (1.0* errorRateStateTransition / 100),
                "C_WidthDev": generateValue(errorRateValueError, 5),
                "C_HeightDev": generateValue(errorRateValueError, 3),
                "C_DeptDev": generateValue(errorRateValueError, 3),
                "IP_Box_decd_ID": "id_" + Date.now()
            }
        };
        const myArgs = {
            contractId: this.roundArguments.contractId,
            contractFunction: 'ExecuteActionOnFlow',
            invokerIdentity: 'TrustCAAdmin',
            contractArguments: [JSON.stringify(payload)],
            readOnly: true
        };

        await this.sutAdapter.sendRequests(myArgs);
    }

    async cleanupWorkloadModule() { }
}

function createWorkloadModule() {
    return new MyWorkload();
}

module.exports.createWorkloadModule = createWorkloadModule;